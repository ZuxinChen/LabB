module com.mycompany.labb {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.labb to javafx.fxml;
    exports com.mycompany.labb;
}
