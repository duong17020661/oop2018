package week5_6;

import javafx.scene.paint.Color;
import week4.task2.Circle;

import java.awt.*;
import java.util.ArrayList;

public class Layer{
    
    ArrayList<Shape1> layer = new ArrayList<>();


    public void Remove(){
    for(int i=0;i<layer.size();i++){
        if(layer.get(i) instanceof Triangle1){
            layer.remove(i);
        }
    }
    }

}
