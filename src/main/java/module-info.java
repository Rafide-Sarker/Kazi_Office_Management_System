module com.example.kazi_office_and_marriage_register_office {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;


    opens com.example.kazi_office_and_marriage_register_office.Rafid to javafx.fxml;
    exports com.example.kazi_office_and_marriage_register_office.Rafid;


    opens com.example.kazi_office_and_marriage_register_office to javafx.fxml;
    exports com.example.kazi_office_and_marriage_register_office;

    opens com.example.kazi_office_and_marriage_register_office.yasin to javafx.fxml;
    exports com.example.kazi_office_and_marriage_register_office.yasin;

    opens com.example.kazi_office_and_marriage_register_office.sayed to javafx.fxml;
    exports com.example.kazi_office_and_marriage_register_office.sayed;

    opens com.example.kazi_office_and_marriage_register_office.Bushra to javafx.fxml;
    exports com.example.kazi_office_and_marriage_register_office.Bushra;
}