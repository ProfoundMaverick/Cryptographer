package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Functions {
	
	@FXML
	private Stage stage;
	@FXML
	private Scene scene;
	@FXML
	private Parent InfoScene;
	@FXML
	private Button LButton;
	@FXML
	private Button RButton;
	@FXML
	ImageView myImage1;
	@FXML
	ImageView myImage2;
	@FXML
	ImageView myImage3;
	
	Node mynode;
	
	Image image1 = new Image(getClass().getResourceAsStream("1q-7pgQ_XeQ.jpg"));
	Image image2 = new Image(getClass().getResourceAsStream("azbuka-morze-russkij-alfavit-900x1273.jpg"));
	Image image3 = new Image(getClass().getResourceAsStream("Vigenere.jpg"));
	Image image4 = new Image(getClass().getResourceAsStream("polybia.jpg"));
	
	public void NextScene1(ActionEvent event) throws IOException{
		InfoScene = FXMLLoader.load(getClass().getResource("InfoScene2.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(InfoScene);
		stage.setScene(scene);
		stage.show();
	}

	public void NextScene2(ActionEvent event) throws IOException{
		InfoScene = FXMLLoader.load(getClass().getResource("InfoScene3.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(InfoScene);
		stage.setScene(scene);
		stage.show();
	}
	public void NextScene3(ActionEvent event) throws IOException{
		InfoScene = FXMLLoader.load(getClass().getResource("InfoScene4.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(InfoScene);
		stage.setScene(scene);
		stage.show();
	}
	public void NextScene4(ActionEvent event) throws IOException{
		InfoScene = FXMLLoader.load(getClass().getResource("InfoScene5.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(InfoScene);
		stage.setScene(scene);
		stage.show();
	}
	public void NextScene5(ActionEvent event) throws IOException{
		InfoScene = FXMLLoader.load(getClass().getResource("InfoScene6.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(InfoScene);
		stage.setScene(scene);
		stage.show();
	}
	public void NextScene6(ActionEvent event) throws IOException{
		InfoScene = FXMLLoader.load(getClass().getResource("InfoScene7.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(InfoScene);
		stage.setScene(scene);
		stage.show();
	}
	public void NextScene7(ActionEvent event) throws IOException{
		InfoScene = FXMLLoader.load(getClass().getResource("InfoScene1.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(InfoScene);
		stage.setScene(scene);
		stage.show();
	}
	
	
	public void PreviousScene1(ActionEvent event) throws IOException{
		InfoScene = FXMLLoader.load(getClass().getResource("InfoScene7.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(InfoScene);
		stage.setScene(scene);
		stage.show();
	}
	public void PreviousScene2(ActionEvent event) throws IOException{
		InfoScene = FXMLLoader.load(getClass().getResource("InfoScene1.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(InfoScene);
		stage.setScene(scene);
		stage.show();
	}
	
	public void PreviousScene3(ActionEvent event) throws IOException{
		InfoScene = FXMLLoader.load(getClass().getResource("InfoScene2.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(InfoScene);
		stage.setScene(scene);
		stage.show();
	}
	public void PreviousScene4(ActionEvent event) throws IOException{
		InfoScene = FXMLLoader.load(getClass().getResource("InfoScene3.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(InfoScene);
		stage.setScene(scene);
		stage.show();
	}
	public void PreviousScene5(ActionEvent event) throws IOException{
		InfoScene = FXMLLoader.load(getClass().getResource("InfoScene4.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(InfoScene);
		stage.setScene(scene);
		stage.show();
	}
	public void PreviousScene6(ActionEvent event) throws IOException{
		InfoScene = FXMLLoader.load(getClass().getResource("InfoScene5.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(InfoScene);
		stage.setScene(scene);
		stage.show();
	}
	public void PreviousScene7(ActionEvent event) throws IOException{
		InfoScene = FXMLLoader.load(getClass().getResource("InfoScene6.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(InfoScene);
		stage.setScene(scene);
		stage.show();
	}
	
}
