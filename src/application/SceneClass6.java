package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SceneClass6 {
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
	private TextField textfield1;
	
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
	static void getKeyMatrix(String key, int keyMatrix[][])
	{
	    int k = 0;
	    for (int i = 0; i < 3; i++) 
	    {
	        for (int j = 0; j < 3; j++) 
	        {
	            keyMatrix[i][j] = (key.charAt(k)) % 65;
	            k++;
	        }
	    }
	}
	 
	// Following function encrypts the message
	static void encrypt(int cipherMatrix[][],
	            int keyMatrix[][], 
	            int messageVector[][])
	{
	    int x, i, j;
	    for (i = 0; i < 3; i++) 
	    {
	        for (j = 0; j < 1; j++)
	        {
	            cipherMatrix[i][j] = 0;
	         
	            for (x = 0; x < 3; x++)
	            {
	                cipherMatrix[i][j] += 
	                    keyMatrix[i][x] * messageVector[x][j];
	            }
	         
	            cipherMatrix[i][j] = cipherMatrix[i][j] % 26;
	        }
	    }
	}
	 
	// Function to implement Hill Cipher
	static String HillCipher(String message, String key)
	{
	    // Get key matrix from the key string
	    int [][]keyMatrix = new int[3][3];
	    getKeyMatrix(key, keyMatrix);
	 
	    int [][]messageVector = new int[3][1];
	 
	    // Generate vector for the message
	    for (int i = 0; i < 3; i++)
	        messageVector[i][0] = (message.charAt(i)) % 65;
	 
	    int [][]cipherMatrix = new int[3][1];
	 
	    // Following function generates
	    // the encrypted vector
	    encrypt(cipherMatrix, keyMatrix, messageVector);
	 
	    String CipherText="";
	 
	    // Generate the encrypted text from 
	    // the encrypted vector
	    for (int i = 0; i < 3; i++)
	        CipherText += (char)(cipherMatrix[i][0] + 65);
	 
	    // Finally print the ciphertext
	    return CipherText;
	}
    
    public void ENCRYPT() 
    {
    	textarea2.setText(HillCipher(textarea1.getText(), textfield1.getText() ));
    }
    public void DECRYPT() 
    {
    	textarea1.setText(HillCipher(textarea2.getText(), textfield1.getText() ));
    }
}
