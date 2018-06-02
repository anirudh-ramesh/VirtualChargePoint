package ocpp_client_frontend;

import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class TestingAuthenticationWrapper implements Observer {
	private Stage stage = new Stage();
	
	@Override
	public void update(Observable arg0, Object arg1) {
		Platform.runLater( () -> {
				// TODO: Check what is in arg1 and decide based on that which window to open
				Parent root = null;
				Scene scene;
				try {
					root = FXMLLoader.load(getClass().getResource("Authentification.fxml"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				scene = new Scene(root,580,357);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				stage.setScene(scene);
				Image icon = new Image("file:icons/iconMini.png");
				stage.getIcons().add(icon);
				stage.show();
			}
		);
	}
}
