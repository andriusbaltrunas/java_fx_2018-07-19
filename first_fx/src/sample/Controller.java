package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label helloLabel;

    @FXML
    private TextField userNameTextField;

    public void changeText(ActionEvent event){
        helloLabel.setText("TEKSTAS PAKEISTAS");
    }

    public void changeUserName(ActionEvent event){
        String name = userNameTextField.getText();
        userNameTextField.setText("");
        helloLabel.setText(name);
    }
}
