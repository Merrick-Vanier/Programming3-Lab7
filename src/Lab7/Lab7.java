/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab7;

import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author 6237800
 */
public class Lab7 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(25, 25, 25, 25));
        
        Button start = new Button("Start");
        Button reset = new Button("Reset");
        Button exit = new Button("Exit");
        
        HBox buttons = new HBox(10, start, reset, exit);
        bp.setBottom(buttons);
        
        //object1
        Circle object1 = new Circle(0, 0, 10);
        object1.setFill(Color.RED);
        
        TranslateTransition path1 = new TranslateTransition(new Duration(3000), object1);
        path1.setToX(200);
        TranslateTransition path2 = new TranslateTransition(new Duration(3000), object1);
        path2.setToY(200);
        TranslateTransition path3 = new TranslateTransition(new Duration(3000), object1);
        path3.setToX(0);
        TranslateTransition path4 = new TranslateTransition(new Duration(3000), object1);
        path4.setToY(0);
        
        SequentialTransition sequence1 = new SequentialTransition(path1, path2, path3, path4);
        sequence1.setCycleCount(1);
        sequence1.play();
        
        
        //object2
        Circle object2 = new Circle(100, 100, 20);
        object2.setFill(Color.BLUE);
        
        
        
        Pane p = new Pane(object1, object2);
        bp.setTop(p);
        
        Scene scene = new Scene(bp, 600, 600);
        stage.setScene(scene);
        stage.show();
    }
    
}
