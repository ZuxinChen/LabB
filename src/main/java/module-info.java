module com.mycompany.labb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.labb to javafx.fxml;
    exports com.mycompany.labb;
}
