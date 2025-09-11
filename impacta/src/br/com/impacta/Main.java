package br.com.impacta;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Cadastro");
        primaryStage.setScene(new Scene(root, 800, 400));
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
