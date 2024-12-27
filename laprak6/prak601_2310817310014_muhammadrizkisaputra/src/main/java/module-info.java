module soal1 {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens soal1 to javafx.fxml;
    exports soal1;
}
