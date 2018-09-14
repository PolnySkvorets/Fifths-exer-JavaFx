package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


        Circle circle1 = new Circle(250.0f, 135.0f,100.f);
        circle1.setFill(Color.AZURE);
        Circle circle2 = new Circle();
        circle2.setCenterX(350.0f);
        circle2.setCenterY(135.0f);
        circle2.setRadius(100.0f);
        circle2.setFill(Color.DARKRED);
        Shape shape = Shape.subtract(circle1, circle2);
        Group root = new Group(shape);

        Scene scene = new Scene(root, 600, 300);

        primaryStage.setTitle("Subtraction of circles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
