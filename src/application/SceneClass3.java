package application;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

public class SceneClass3 {
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
	
	public SceneClass3() {
        setupMap();
    }
	
	Map<Character, String> morseToTextMapping = new HashMap<Character, String>();
    Map<String, Character> textToMorseMapping = new HashMap<String, Character>();

    char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4',
            '5', '6', '7', '8', '9', '0', ' ',
            
            'A', 'B', 'C', 'D', 'E', 'F',
            'G', 'H', 'I', 'J', 'K', 'L',
            'M', 'N', 'O', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z', '1', '2', '3', '4',
            '5', '6', '7', '8', '9', '0', ' ' 
    
    };

    String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "/",
            
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "/"
    };

    private void setupMap(){
        for (int i = 0; i < letter.length; i++) {
            morseToTextMapping.put(letter[i], morse[i]);
            textToMorseMapping.put(morse[i], letter[i]);
        }
    }

    public String translateToMorse(String text){
        char[] characters = text.toCharArray();
        StringBuilder morseString = new StringBuilder();

        for (char character : characters) {
            morseString.append(morseToTextMapping.get(character)).append(" ");
        }
        return String.valueOf(morseString);
    }

    public String translateToText(String morse){
        String[] morseArray = morse.split(" ");

        StringBuilder morseString = new StringBuilder();

        for (String morsePart : morseArray) {
            morseString.append(textToMorseMapping.get(morsePart));
        }
        return String.valueOf(morseString);
    }
	public void ENCRYPT(ActionEvent e) 
	{
		textarea2.setText(translateToMorse(textarea1.getText()));
	}
	public void DECRYPT(ActionEvent e) 
	{
		textarea1.setText(translateToText(textarea2.getText()));
	}
}
