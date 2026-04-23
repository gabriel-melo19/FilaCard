module com.cardgame.cardgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cardgame.cardgame to javafx.fxml;
    exports com.cardgame.cardgame;
}