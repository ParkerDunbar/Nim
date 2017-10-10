package group.csc130.nim.view;

import java.awt.event.ActionEvent;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GameView extends Application {
	
	@FXML
	private MenuBar menubar;
	@FXML
	private Button heap1;
	@FXML
	private TextField enterplayerName;
	

	@Override
	public void start(Stage pStage) throws Exception {
		pStage.setTitle("The Game Of Nim");
		Pane myPane = (Pane) FXMLLoader.load(getClass().getResource("View.fxml"));
		Scene myScene = new Scene(myPane);
		
		
		pStage.setMaximized(true);
		pStage.setResizable(false);
		pStage.setScene(myScene);
		pStage.show();
	}

	@FXML
	protected void onClicked(ActionEvent e) {
		
	}

}
