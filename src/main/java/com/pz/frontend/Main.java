package com.pz.frontend;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    public static final int WIDTH = 420;
    public static final int HEIGHT = 300;

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println(getClass().getResource("").getPath());
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));

        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
