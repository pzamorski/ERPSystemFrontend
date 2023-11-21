module com.pz.frontend {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires spring.web;


    opens com.pz.frontend to javafx.fxml;
    exports com.pz.frontend;
    exports com.pz.frontend.controller;
    exports com.pz.frontend.dto;
    exports com.pz.frontend.table;
    opens com.pz.frontend.controller to javafx.fxml;
}

