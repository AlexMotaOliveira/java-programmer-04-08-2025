package br.com.impacta.controller;

import br.com.impacta.error.PessoaError;
import br.com.impacta.model.Pessoa;
import br.com.impacta.repository.PessoaRepository;
import br.com.impacta.repository.PessoaRepositoryImpl;
import br.com.impacta.service.PessoaService;
import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField textFieldDataNascimento;

    @FXML
    private Button buttonExcluir;

    @FXML
    private Button buttonLimpar;

    @FXML
    private Button buttonAdicionar;

    @FXML
    private TextField textFieldNome;

    @FXML
    private TextField textFieldCpf;

    @FXML
    private TableView<Pessoa> table;

    @FXML
    private TableColumn<Pessoa, String> tableId;

    @FXML
    private TableColumn<Pessoa, String> tableNome;

    @FXML
    private TableColumn<Pessoa, String> tableData;

    @FXML
    private TableColumn<Pessoa, String> tableCpf;

    private int idPessoa;

    @FXML
    void adicionar(ActionEvent event) {
        String nome = textFieldNome.getText();
        String dataNascimento = textFieldDataNascimento.getText();
        String cpf = textFieldCpf.getText();
        Pessoa pessoa = new Pessoa(nome, dataNascimento, cpf);
        System.out.println(pessoa);

        try {

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Cadastro");
            alert.setHeaderText("deseja salvar o cadastro");
            Optional<ButtonType> buttonType = alert.showAndWait();

            if (buttonType.isPresent() && buttonType.get() == ButtonType.OK) {
                PessoaService service = new PessoaService();
                service.salvar(pessoa);
                limpar(event);
                carregarTabela();
            }

        } catch (PessoaError e) {
            e.printStackTrace();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("falha");
            alert.setHeaderText("Erro ao cadastrar");
            alert.showAndWait();
        }

    }

    @FXML
    void excluir(ActionEvent event) {
        try {

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Cadastro");
            alert.setHeaderText("deseja excluir o cadastro");
            Optional<ButtonType> buttonType = alert.showAndWait();

            if (buttonType.isPresent() && buttonType.get() == ButtonType.OK) {
                PessoaService service = new PessoaService();
                service.excluirId(idPessoa);
                limpar(event);
                carregarTabela();
            }

        } catch (PessoaError e) {
            e.printStackTrace();

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("falha");
            alert.setHeaderText("Erro ao excluir um cadastro");
            alert.showAndWait();
        }
    }

    @FXML
    void limpar(ActionEvent event) {
        textFieldNome.clear();
        textFieldCpf.clear();
        textFieldDataNascimento.clear();
        System.out.println("limpou");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        carregarTabela();
        selecionarLinhatabela();
    }

    void carregarTabela() {
        try {
            PessoaService service = new PessoaService();
            List<Pessoa> pessoas = service.listar();
            pessoas.forEach(System.out::println);

            ObservableList observableList =
                    FXCollections.observableArrayList(pessoas);

            table.setItems(observableList);

            tableId.setCellValueFactory(pessoa -> {
                int id = pessoa.getValue().getId();
                SimpleStringProperty cellId = new SimpleStringProperty();
                cellId.set(String.valueOf(id));
                return cellId;
            });

            tableNome.setCellValueFactory(pessoa -> {
                return new SimpleStringProperty(pessoa.getValue().getNome());
            });

            tableData.setCellValueFactory(pessoa -> {
                return new SimpleStringProperty(pessoa.getValue().getDataNascimento());
            });

            tableCpf.setCellValueFactory(pessoa -> {
                return new SimpleStringProperty(pessoa.getValue().getCpf());
            });

        } catch (PessoaError e) {
            e.printStackTrace();

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("falha");
            alert.setHeaderText("Erro ao carregar os dados da tabela");
            alert.showAndWait();

        }
    }

    void selecionarLinhatabela() {
        table.setRowFactory(tablePessoa -> {
            TableRow<Pessoa> linha = new TableRow<>();
            linha.setOnMouseClicked(mouseEvent -> {
                if(mouseEvent.getClickCount() == 2){

                    int linhaSelecionada = table.getSelectionModel().getFocusedIndex();

                    this.idPessoa = table.getItems().get(linhaSelecionada).getId();
                    String nome = table.getItems().get(linhaSelecionada).getNome();
                    String data = table.getItems().get(linhaSelecionada).getDataNascimento();
                    String cpf = table.getItems().get(linhaSelecionada).getCpf();

                    textFieldNome.setText(nome);
                    textFieldDataNascimento.setText(data);
                    textFieldCpf.setText(cpf);
                }
            });
            return linha;
        });
    }

}

