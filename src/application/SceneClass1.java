package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SceneClass1 implements Initializable {
	@FXML
	private Stage stage;
	@FXML
	private Scene scene;
	@FXML
	private Parent MainScecneHello;
	@FXML
	private MenuBar mymenubar;
	@FXML
	private TextArea textarea1;
	@FXML
	private TextArea textarea2;
	@FXML
	private Spinner<Integer> ssspinner1;
	
	public void SwitchToScene1(ActionEvent event) throws IOException{
		Scene newScene = mymenubar.getScene(); 
		Stage newStage = (Stage) newScene.getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        Scene viewScene = new Scene(root);
        newStage.setScene(viewScene);
        newStage.show();
        viewScene.getRoot().requestFocus();
		
	}
	public void SwitchToScene2(ActionEvent event) throws IOException{
		Scene newScene = mymenubar.getScene(); 
		Stage newStage = (Stage) newScene.getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        Scene viewScene = new Scene(root);
        newStage.setScene(viewScene);
        newStage.show();
        viewScene.getRoot().requestFocus();
		
	}
	
	public void SwitchToScene3(ActionEvent event) throws IOException{
		Scene newScene = mymenubar.getScene(); 
		Stage newStage = (Stage) newScene.getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("Scene3.fxml"));
        Scene viewScene = new Scene(root);
        newStage.setScene(viewScene);
        newStage.show();
        viewScene.getRoot().requestFocus();
		
	}
	
	public void SwitchToScene4(ActionEvent event) throws IOException{
		Scene newScene = mymenubar.getScene(); 
		Stage newStage = (Stage) newScene.getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("Scene4.fxml"));
        Scene viewScene = new Scene(root);
        newStage.setScene(viewScene);
        newStage.show();
        viewScene.getRoot().requestFocus();
		
	}
	
	public void SwitchToScene5(ActionEvent event) throws IOException{
		Scene newScene = mymenubar.getScene(); 
		Stage newStage = (Stage) newScene.getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("Scene5.fxml"));
        Scene viewScene = new Scene(root);
        newStage.setScene(viewScene);
        newStage.show();
        viewScene.getRoot().requestFocus();
		
	}
	
	public void SwitchToScene6(ActionEvent event) throws IOException{
		Scene newScene = mymenubar.getScene(); 
		Stage newStage = (Stage) newScene.getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("Scene6.fxml"));
        Scene viewScene = new Scene(root);
        newStage.setScene(viewScene);
        newStage.show();
        viewScene.getRoot().requestFocus();
		
	}

	public void SwitchToScene7(ActionEvent event) throws IOException{
		Scene newScene = mymenubar.getScene(); 
		Stage newStage = (Stage) newScene.getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("Scene7.fxml"));
        Scene viewScene = new Scene(root);
        newStage.setScene(viewScene);
        newStage.show();
        viewScene.getRoot().requestFocus();
		
	}
	
	public void AlertInfoCrypto(ActionEvent event) throws IOException {
        final Stage dialog = new Stage();
        dialog.initModality(Modality.NONE);
//		dialog.initOwner(primaryStage);
//        VBox dialogVbox = new VBox(20);
//        dialogVbox.getChildren().add(new Text("This is a Dialog"));
//        Scene dialogScene = new Scene(dialogVbox, 300, 200);
//        dialog.setScene(dialogScene);
//        dialog.show();
		Parent root = FXMLLoader.load(getClass().getResource("InfoScene1.fxml"));
        Scene viewScene = new Scene(root);
        dialog.setScene(viewScene);
        dialog.show();
		
	}
	
	public void InfoProgram(ActionEvent event) {
		Alert alert = new Alert(AlertType.INFORMATION, "default Dialog", ButtonType.OK);
		alert.setHeight(500);
		alert.setWidth(500);
		alert.setTitle("О приложении");
		alert.setHeaderText("О приложении");
		String s ="Данная программа служит как интрумент для ознакомления с тем как работают шифры и криптографические коды. Автор не несёт ответсвенность за действия пользователя, использующих программу в злых умыслах.";
		alert.setContentText(s);
		alert.show();
	}
	
	public void InfoAuthor(ActionEvent event) {
		Alert alert = new Alert(AlertType.NONE, "default Dialog", ButtonType.OK);
		alert.setTitle("Об авторе");
		alert.setHeaderText("Об авторе");
		String s ="Программу сделал студент группы 10702422, Лозичный Александр. ";
		alert.setContentText(s);
		alert.show();
	}
	
	// Caesar
	
		public static final String alpha = "abcdefghijklmnopqrstuvwxyz";
		
		public static String encrypt(String message, int shiftKey) {
		    message = message.toLowerCase();
		    String cipherText = "";
		    for (int ii = 0; ii < message.length(); ii++) {
		      int charPosition = alpha.indexOf(message.charAt(ii));
		      int keyVal = (shiftKey + charPosition) % 26;
		      char replaceVal = alpha.charAt(keyVal);
		      cipherText += replaceVal;
		    }
		    return cipherText;
		  }
		
		  public static String decrypt(String cipherText, int shiftKey) {
			    cipherText = cipherText.toLowerCase();
			    String message = "";
			    for (int ii = 0; ii < cipherText.length(); ii++) {
			      int charPosition = alpha.indexOf(cipherText.charAt(ii));
			      int keyVal = (charPosition - shiftKey) % 26;
			      if (keyVal < 0) {
			        keyVal = alpha.length() + keyVal;
			      }
			      char replaceVal = alpha.charAt(keyVal);
			      message += replaceVal;
			    }
			    return message;
			  }
		  
		  int currentvar;
		public void ENCRYPT(ActionEvent e) {
			int value = (Integer) ssspinner1.getValue();
			textarea2.setText(encrypt(textarea1.getText(), value));
		}
		
		public void DECRYPT(ActionEvent e) {
			int value = (Integer) ssspinner1.getValue();
			textarea1.setText(decrypt(textarea2.getText(), value));
		}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 26);
		
		valueFactory.setValue(1);
		ssspinner1.setValueFactory(valueFactory);

	}
}
