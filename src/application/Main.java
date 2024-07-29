package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("SceneHello.fxml"));
			Scene scene = new Scene(root);
			//<a href="https://www.flaticon.com/free-icons/cryptography" title="cryptography icons">Cryptography icons created by Freepik - Flaticon</a>

			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//scene.getStylesheets().add(getClass().getResource("MenuBar.css").toExternalForm());
			String css = this.getClass().getResource("Background.css").toExternalForm();
			scene.getStylesheets().add(css);
			primaryStage.setTitle("Cryptography");
			
			Image icon = new Image("cryptography.png");
			primaryStage.getIcons().add(icon);
			
			primaryStage.setMinHeight(460);
			primaryStage.setMinWidth(730);
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
