import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import rcas.controller.PropertiesViewController;
import rcas.util.Variables;

public class RCASMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(RCASMain.class.getResource("view/Properties.fxml"));
		ResourceBundle resourceBundle = ResourceBundle.getBundle("RCASResources");
		fxmlLoader.setResources(resourceBundle);



		GridPane mainPane = fxmlLoader.load();
		Scene mainScene = new Scene(mainPane, 1500, 800);
		primaryStage.centerOnScreen();
		primaryStage.setTitle(resourceBundle.getString("applicationTitle"));
		primaryStage.setScene(mainScene);
		primaryStage.show();
		PropertiesViewController controller =fxmlLoader.getController();
		controller.setPrimaryStage(primaryStage);


		Variables.scene = mainScene;
	}

	public static void main(String[] args) {
		Application.launch(RCASMain.class, args);
	}
}
