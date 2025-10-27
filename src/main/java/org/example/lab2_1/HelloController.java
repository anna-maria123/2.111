package org.example.lab2_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Button bthAdd; // кнопка Добавити

    @FXML
    void showDialog(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("second-page.fxml"));
        try {
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Добавити");
//
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(bthAdd.getScene().getWindow());
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private Button bthEdit;

    @FXML
    void showDialod1(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("second-page.fxml"));
        try {
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Редагувати");
//
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(bthEdit.getScene().getWindow());
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    // Метод для переходу на другу сторінку
//    @FXML
//    private void openSecondPage(ActionEvent event) throws IOException {
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("second-page.fxml"));
//        Scene scene = new Scene(loader.load());
//
//        // Отримуємо Stage з кнопки
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        stage.setScene(scene);
//        stage.show();
//    }
//    @FXML
//    void showDialog(ActionEvent event) {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("second-page.fxml"));
//            if (fxmlLoader.getLocation() == null) {
//                System.out.println("FXML НЕ ЗНАЙДЕНО!");
//                return;
//            }
//
//            Stage stage = new Stage();
//            Scene scene = new Scene(fxmlLoader.load(), 600, 600);
//
//            stage.setTitle("Second Page");
//            stage.setScene(scene);
//            stage.show();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}
