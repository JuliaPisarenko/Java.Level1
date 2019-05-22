package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Controller {
    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    public void sendMsg(){

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

        if(!textField.getText().isEmpty()) {
            textArea.appendText(formatter.format(date) + " User:  " +  textField.getText() + "\n");
            textField.clear();
            textField.requestFocus();
        }
    }

}
