module com.example.demo4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;
    requires jasperreports;


    opens com.example.demo4 to javafx.fxml;
    exports com.example.demo4;
}