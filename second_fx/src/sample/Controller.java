package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {
    @FXML
    private TextField numberTexField;
    @FXML
    private Label resultLabel;
    @FXML
    private Label successResult;

    @FXML
    private Label countLabel;

    private int count = 0;

    public void speti(ActionEvent event) {
        try {
            count++;
            int number = Integer.parseInt(numberTexField.getText());
            Random random = new Random();
            int randomNumb = random.nextInt(10) + 1;
            if (randomNumb == number) {
                successResult.setText("Atspejote is " + count + " kartu");
                resultLabel.setText("");
                count = 0;
            } else {
                resultLabel.setText("Neatspejote " + randomNumb);
                countLabel.setText("Spejimas " + count);
            }
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Jusu ivestas skaicius neatitinka formato");
            alert.show();
        }
        numberTexField.setText("");

    }

    public void exit(ActionEvent event){
        System.exit(0);


    }
}
