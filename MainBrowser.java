package com.adil.uiview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainBrowser extends Application {

	public void start(Stage primaryStage) throws Exception {
		// FXMLLoader loader = new
		// FXMLLoader(Main.class.getResource("DocBrowser.fxml"));
		Parent root = FXMLLoader.load(getClass().getResource("/com/adil/uifxml/MainBrowser.fxml"));
		// Parent root = loader.load();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("DocBrowser");
		primaryStage.show();
	}

	public static void main(String[] args) {

		launch(args);
	}

}
