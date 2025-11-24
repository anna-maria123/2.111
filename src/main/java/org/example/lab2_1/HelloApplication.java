package org.example.lab2_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("/org/example/lab2_1/hello-view.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load());
        HelloController mainController =fxmlLoader.getController();
        mainController.setNewStage(stage);
        stage.setScene(scene);
        stage.show();

    }



    public static void main(String[] args) {
        launch();
    }
}
//package org.example.lab2_1;
//
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//public class Main extends HelloApplication{
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//        primaryStage.setTitle("Адресна книга");
//        Scene scene = new Scene(root,600,600);
//        scene.getStylesheets().add("/org.example.lab2_1/style1.css");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//        primaryStage.setMinWidth(600);
//        primaryStage.setMinHeight(600);
//        primaryStage.show();
//        testData();
//    }
//    public static void main(String[] args) {
//        launch(args);
//    }
//    public void testData () {
//        CollectionAddressBook addressBook = new CollectionAddressBook();
//        addressBook.fillTestData();
//        addressBook.print();
//    }
//}
//
//
