module javaModularTest{
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires  javafx.graphics;
    requires javafx.media;
    requires javafx.swing;
    requires  javafx.web;
    requires javafx.swt;

    opens org.openjfx to javafx.fxml;
    exports org.openjfx;
}