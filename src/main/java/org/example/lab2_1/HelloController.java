package org.example.lab2_1;

import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;

public class HelloController {

//    @FXML
//    private Button bthAdd;
//
//    @FXML
//    void showDialog(ActionEvent event) {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("second-page.fxml"));
//        try {
//            Parent root = fxmlLoader.load();
//            Stage stage = new Stage();
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            stage.setTitle("Добавити");
//
//            stage.initModality(Modality.WINDOW_MODAL);
//            stage.initOwner(bthAdd.getScene().getWindow());
//            stage.show();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    @FXML
//    private Button bthEdit;
//
//    @FXML
//    void showDialod1(ActionEvent event) {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("second-page.fxml"));
//        try {
//            Parent root = fxmlLoader.load();
//            Stage stage = new Stage();
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            stage.setTitle("Редагувати");
//
//            stage.initModality(Modality.WINDOW_MODAL);
//            stage.initOwner(bthEdit.getScene().getWindow());
//            stage.show();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    @FXML
//    private Button bthDelete;
//
//    @FXML
//    void showDialod3(ActionEvent event) {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("second-page.fxml"));
//        try {
//            Parent root = fxmlLoader.load();
//            Stage stage = new Stage();
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            stage.setTitle("Видалити");
//
//            stage.initModality(Modality.WINDOW_MODAL);
//            stage.initOwner(bthDelete.getScene().getWindow());
//            stage.show();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    @FXML
//    private Button search;
//
//    @FXML
//    void showDialod6(ActionEvent event) {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("second-page.fxml"));
//        try {
//            Parent root = fxmlLoader.load();
//            Stage stage = new Stage();
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            stage.setTitle("Пошук");
//
//            stage.initModality(Modality.WINDOW_MODAL);
//            stage.initOwner(search.getScene().getWindow());
//            stage.show();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    @FXML
//    private Button ok;
//
//    @FXML
//    void showDialod4(ActionEvent event) {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("hello-view.fxml"));
//        try {
//            Parent root = fxmlLoader.load();
//            Stage stage = new Stage();
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            stage.setTitle("Ок");
//
//            stage.initModality(Modality.WINDOW_MODAL);
//            stage.initOwner(ok.getScene().getWindow());
//            stage.show();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    @FXML
//    private Button cancel;
//
//    @FXML
//    void showDialod5(ActionEvent event) {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("hello-view.fxml"));
//        try {
//            Parent root = fxmlLoader.load();
//            Stage stage = new Stage();
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            stage.setTitle("Відміна");
//
//            stage.initModality(Modality.WINDOW_MODAL);
//            stage.initOwner(cancel.getScene().getWindow());
//            stage.show();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    private CollectionAddressBook addressBookImpl = new CollectionAddressBook();
    @FXML
    private TableColumn<Person,String> columnPIP;
    @FXML
    private TableView<Person> tableAddressBook;
    @FXML
    private TextField txtSearch;
    @FXML
    private Label labelCount;
     @FXML
    private TableColumn<Person,String> columnPhone;
    @FXML
    public void initialize() {
        columnPIP.setCellValueFactory(new PropertyValueFactory<>("pip"));
        columnPhone.setCellValueFactory(new PropertyValueFactory<>("phone"));

        addressBookImpl.getPersonObservableList().addListener(
                (ListChangeListener<Person>) change -> updateCountLabel()
        );

        addressBookImpl.fillTestData();
        tableAddressBook.setItems(addressBookImpl.getPersonObservableList());
    }

    private  void updateCountLabel(){
         labelCount.setText("Кількість записів: " + addressBookImpl.getPersonObservableList().size());
     }
//    public void showDialog(Person person) {
//        try {
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("second-page.fxml"));
//            Parent root = loader.load();
//            EditController controller = loader.getController();
//            controller.setPerson(person);
//
//            Stage editDialogStage = new Stage();
//            editDialogStage.setTitle("Вікно редагування");
//            editDialogStage.setScene(new Scene(root));
//            editDialogStage.initModality(Modality.WINDOW_MODAL);
//            editDialogStage.initOwner(newStage);
//            editDialogStage.setResizable(false);
//            editDialogStage.showAndWait();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
public void showDialog(Person person ,Stage owner) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("second-page.fxml"));
        Parent root = loader.load();
        EditController controller = loader.getController();
        controller.setPerson(person);

        Stage editDialogStage = new Stage();
        editDialogStage.setTitle("Вікно редагування");
        editDialogStage.setScene(new Scene(root));
        editDialogStage.initModality(Modality.WINDOW_MODAL);
//        editDialogStage.initOwner(owner.getScene().getWindow());
        editDialogStage.initOwner(owner);
        editDialogStage.setResizable(false);
        editDialogStage.showAndWait();
    } catch (IOException e) {
        e.printStackTrace();
    }}

     private Stage newStage;
     public void setNewStage(Stage newStage){
         this.newStage=newStage;
     }
     private FXMLLoader fxmlLoader = new FXMLLoader();

     private Stage editDialogStage;
     private Parent parent;
     private EditController editController;
    @FXML
    void openWindow(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        Stage stage =(Stage) clickedButton.getScene().getWindow();


        switch (clickedButton.getId()) {
            case "bthAdd":
                Person newPerson = new Person("", "");
                showDialog(newPerson,stage);
                addressBookImpl.add(newPerson);
                break;

            case "bthEdit":
                Person selected = tableAddressBook.getSelectionModel().getSelectedItem();
                if (selected != null) {
                    showDialog(selected, stage);
                    tableAddressBook.refresh();
                }else {
                    showAlert("Будь ласка, оберіть запис для редагування.");
                }
                break;

            case "bthDelete":
                Person toDelete = tableAddressBook.getSelectionModel().getSelectedItem();
                if (toDelete != null) addressBookImpl.delete(toDelete);
                else showAlert("Будь ласка, оберіть запис для видалення.");
                break;
            case "search":
                String query = txtSearch.getText().trim().toLowerCase();
                if (query.isEmpty()) {
                    tableAddressBook.setItems(addressBookImpl.getPersonObservableList());
                    showAlert("Введіть текст для пошуку.");
                } else {
                    ObservableList<Person> filtered =
                            addressBookImpl.getPersonObservableList().filtered(p ->
                                    p.getPip().toLowerCase().contains(query)
                                            || p.getPhone().toLowerCase().contains(query)
                            );
                    tableAddressBook.setItems(filtered);
                }
                break;
        }
    }
    private void showAlert(String message){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Інформація");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

