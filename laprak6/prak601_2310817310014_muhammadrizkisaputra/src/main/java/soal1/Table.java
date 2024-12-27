package soal1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Table extends Application {

    @Override
    public void start(Stage stage) {
        TableView<Mahasiswa> tableView = new TableView<>();
        
        TableColumn<Mahasiswa, String> Nim = new TableColumn<>("NIM");
        TableColumn<Mahasiswa, String> Nama = new TableColumn<>("Nama");

        Nama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        Nim.setCellValueFactory(new PropertyValueFactory<>("nim"));


        tableView.getColumns().add(Nama);
        tableView.getColumns().add(Nim);

        
        tableView.getItems().add(new Mahasiswa(0, "Charles Leclerc", "231081710023"));
        tableView.getItems().add(new Mahasiswa(1, "Carlos Sainz", "231081710013"));
        tableView.getItems().add(new Mahasiswa(2, "Lewis Hamilton", "231081710014"));
        tableView.getItems().add(new Mahasiswa(3, "George Russel", "231081710005"));
        tableView.getItems().add(new Mahasiswa(4, "Heihachi Mashima", "231081710016"));
        tableView.getItems().add(new Mahasiswa(5, "Alex Turner", "231081720020"));
        tableView.getItems().add(new Mahasiswa(6, "Bruno Major", "231081730011"));
        tableView.getItems().add(new Mahasiswa(7, "Daniel Caesar", "231081710009"));
        tableView.getItems().add(new Mahasiswa(8, "Frank Ocean", "231081720010"));
        tableView.getItems().add(new Mahasiswa(9, "Keshi", "231081730012"));

        Scene scene1 = new Scene(tableView, 300, 300);
        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}