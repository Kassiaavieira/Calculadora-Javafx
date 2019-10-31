package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;



public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane telaTextField;
    @FXML
    private Label label;
    @FXML
    private Button seteButton;
    @FXML
    private Button oitoButton;
    @FXML
    private Color x1;
    @FXML
    private Button noveButton;
    @FXML
    private Button quatroButton;
    @FXML
    private Button cincoButton;
    @FXML
    private Button seisButton;
    @FXML
    private Button umButton;
    @FXML
    private Button doisButton;
    @FXML
    private Button tresButton;
    @FXML
    private Button zeroButton;
    @FXML
    private Button zerarButton;
    @FXML
    private Button igualButton;
    @FXML
    private Button somaButton;
    @FXML
    private Button subtrairButton;
    @FXML
    private Button multiplicarButton;
    @FXML
    private Button dividirButton;
    @FXML
    private TextField resultado;
 
    int valor1, valor2;
    String sinal;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void zero(ActionEvent event) {
        resultado.setText(resultado.getText() + "0");
    }

    @FXML
    private void resultado(ActionEvent event) {
        
    }

    @FXML
    private void sete(ActionEvent event) {
        resultado.setText(resultado.getText() + "7");
    }

    @FXML
    private void oito(ActionEvent event) {
        resultado.setText(resultado.getText() + "8");
    }

    @FXML
    private void nove(ActionEvent event) {
        resultado.setText(resultado.getText() + "9");
    }

    @FXML
    private void quatro(ActionEvent event) {
        resultado.setText(resultado.getText() + "4");
    }

    @FXML
    private void cinco(ActionEvent event) {
        resultado.setText(resultado.getText() + "5");
    }

    @FXML
    private void seis(ActionEvent event) {
        resultado.setText(resultado.getText() + "6");
    }

    @FXML
    private void um(ActionEvent event) {
        resultado.setText(resultado.getText() + "1");
    }

    @FXML
    private void dois(ActionEvent event) {
        resultado.setText(resultado.getText() + "2");
    }

    @FXML
    private void tres(ActionEvent event) {
        resultado.setText(resultado.getText() + "3");
    }

    @FXML
    private void zerar(ActionEvent event) {
        resultado.setText("");
    }

    @FXML
    private void igual(ActionEvent event) {
        valor2 = Integer.parseInt(resultado.getText());
        if(sinal == "soma"){
            resultado.setText(String.valueOf(valor1+valor2));
        }
        if(sinal == "subtrair"){
            resultado.setText(String.valueOf(valor1-valor2));
        }
        if(sinal == "multiplicar"){
            resultado.setText(String.valueOf(valor1*valor2));
        }
        if(sinal == "dividir"){
            resultado.setText(String.valueOf(valor1/valor2));
        }
    }

    @FXML
    private void soma(ActionEvent event) {
        valor1 = Integer.parseInt(resultado.getText());
        resultado.setText("");
        sinal = "soma" ;
    }

    @FXML
    private void subtrair(ActionEvent event) {
        valor1 = Integer.parseInt(resultado.getText());
        resultado.setText("");
        sinal = "subtrair" ;
    }

    @FXML
    private void multiplicar(ActionEvent event) {
        valor1 = Integer.parseInt(resultado.getText());
        resultado.setText("");
        sinal = "multiplicar" ;
    }

    @FXML
    private void dividir(ActionEvent event) {
        valor1 = Integer.parseInt(resultado.getText());
        resultado.setText("");
        sinal = "dividir" ;
    }

    
    
}
