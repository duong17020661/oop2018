package week5_6;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Shape1 circle1 = new Circle1(Color.BLUE,100,100,50);
        Shape1 rectangle1 = new Rectangle1(Color.YELLOW,50,100,50,100);
        Shape1 triangle1 = new Triangle1(Color.GREEN,200,150,100,150,50,50);
        Shape1 square1 = new Square1(Color.RED,300,300,50);
        Layer lay = new Layer();
        Diagram dia = new Diagram();
        lay.layer.add(circle1);
        lay.layer.add(rectangle1);
        lay.layer.add(triangle1);
        lay.layer.add(square1);
        dia.diagram.add(lay);
            Group group = new Group();
            for (int i = 0; i < lay.layer.size(); i++){
                group.getChildren().add(lay.layer.get(i).draw());
        }
            Polyline polyline = new Polyline();
            polyline.getPoints().addAll(new Double[]{
                    0.0,0.0,
                    100.0,100.0,
                    200.0,200.0,
            });
            Circle circle = new Circle();
            circle.setRadius(100);
            group.getChildren().add(circle);
            Scene scene = new Scene(group,640,480);
            primaryStage.setScene(scene);
            primaryStage.show();
            PathTransition pathTransition = new PathTransition();
            pathTransition.setNode(lay.layer.get(1).draw());
            pathTransition.setDuration(Duration.seconds(10));
            pathTransition.setPath(polyline);
            pathTransition.setCycleCount(PathTransition.INDEFINITE);
            pathTransition.play();
        }
}
