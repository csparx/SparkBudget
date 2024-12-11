/**
 * 
 */
package com.sparks.budget.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 
 */
public class MainUI extends Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		Label label = new Label("Welcome to SparkBudget!");
		StackPane root = new StackPane();
		root.getChildren().add(label);
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setTitle("SparkBudget - Main UI");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
