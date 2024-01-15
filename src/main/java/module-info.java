module com.example.nomor1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nomor1 to javafx.fxml;
    exports com.example.nomor1;
}