package com.mycompany.assignment1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class PrimaryController {
    @FXML
    private AnchorPane Windows;
    @FXML
    private AnchorPane Lesotho;
    @FXML 
    private AnchorPane France;
    @FXML
    private AnchorPane Netherlands;
    @FXML
    private AnchorPane Belgium;  
    @FXML
    private AnchorPane Yemen;
    @FXML
    public void showHome(){
        Windows.setVisible(true);
        Lesotho.setVisible(false);
        France.setVisible(false);
        Netherlands.setVisible(false);
        Belgium.setVisible(false);
        Yemen.setVisible(false);
    }
    @FXML
    public void showLesotho(){
        Lesotho.setVisible(true);
        France.setVisible(false);
        Netherlands.setVisible(false);
        Belgium.setVisible(false);
        Yemen.setVisible(false);
    }

    public void showFrance(){
        France.setVisible(true);
        Lesotho.setVisible(false);
        Netherlands.setVisible(false);
        Belgium.setVisible(false);
        Yemen.setVisible(false);
    }
    
    public void showNetherlands(){
        Netherlands.setVisible(true);
        Lesotho.setVisible(false);
        Belgium.setVisible(false);
        Yemen.setVisible(false);
    }
    
    public void showBelgium(){
        Belgium.setVisible(true);
        Yemen.setVisible(false);
    }
    public void showYemen(){
        Yemen.setVisible(true);
        Belgium.setVisible(false);
        Lesotho.setVisible(false);
        Netherlands.setVisible(false);
        Windows.setVisible(false);
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
