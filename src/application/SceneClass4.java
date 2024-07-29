package application;

import java.io.IOException;
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
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SceneClass4 {
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
	/*
	private static final char polybiusSquare[][] = { 
		    { 'A', 'B', 'C', 'D', 'E', 'F' },
		    { 'G', 'H', 'I', 'K', 'L', 'M' },
		    { 'N', 'O', 'P', 'Q', 'R', 'S' },
		    { 'T', 'U', 'V', 'W', 'X', 'Y' },
		    { 'Z', 'E', 'T', 'A', 'O', 'N' },
		    { 'E', 'T', 'A', 'O', 'N', 'M' } 
		};

		public static String decrypt (String crypt) {
		    int len = crypt.length(); 
		    StringBuilder plain = new StringBuilder (len / 2);

		    for (int i = 0; i < len; i += 2) {
		        int rowIndex = crypt.charAt(i) - '0' - 1;
		        int colIndex = crypt.charAt(i + 1) - '0' - 1;
		        plain.append(polybiusSquare[rowIndex][colIndex]);
		    }

		    return plain.toString();
		}
		
		public void Encrypt() 
		{
			textarea2.getText();
			
		}*/
	static char[][] table = new char[5][5];
	public void createTable()
		{
		for(int i=0;i<2;i++)
			for(int j=0;j<5;j++) {
					if(i*5+j+65!=74)
						table[i][j]=(char)(i*5+j+65);
					}
					table[1][4]='K';
					for(int i=2;i<5;i++)
						for(int j=0;j<5;j++)
							table[i][j]=(char)(i*5+j+65+1);
		}
		public String encrypt(String pt) {
		String encpt = "";
		char[] encpt1 = pt.toCharArray();
		for(int i=0; i<pt.length(); i++) {
			for(int j=0; j<5; j++)
				for(int k=0; k<5; k++) {
					if(encpt1[i]=='J') {
						encpt=encpt+"24";
						break;
					}
					if(table[j][k]==encpt1[i]) {
						encpt=encpt+Integer.toString(j+1)+Integer.toString(k+1);
						break;
					}
				}
		}
		return encpt;
	}
	public String decrypt(String encpt) {
	String decpt="";
	char[] decpt1 = encpt.toCharArray();
		for(int i=0; i<encpt.length(); i=i+2) {
			int row = Integer.parseInt(String.valueOf(decpt1[i]));
			int col = 
					Integer.parseInt(String.valueOf(decpt1[i+1]));
			decpt=decpt+Character.toString(table[row-1][col-1]);
		}
	return decpt;
	}
	
	public void ENCRYPT() 
	{
		createTable();
		textarea2.setText(encrypt(textarea1.getText()));
	}
	
	public void DECRYPT() 
	{
		createTable();
		textarea1.setText(decrypt(textarea2.getText()));
	}


}
