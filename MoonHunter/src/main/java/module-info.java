module com.example.moonhunter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.moonhunter to javafx.fxml;
    exports com.example.moonhunter;
}