package week5_6;

import javafx.scene.paint.Color;
import week4.task2.Circle;

import java.awt.*;
import java.util.ArrayList;

public class Layer{
    boolean visible = true;
    ArrayList<Shape1> layer = new ArrayList<>();
    ArrayList<Shape1> layertriangle = new ArrayList<>();
    ArrayList<Shape1> layersquare = new ArrayList<>();
    ArrayList<Shape1> layerrectangle = new ArrayList<>();
    ArrayList<Shape1> layercircle = new ArrayList<>();


    public void Remove(){
    for(int i=0;i<layer.size();i++){
        if(layer.get(i) instanceof Triangle1){
            layer.remove(i);
        }
    }
    }
    public void Same(){
        for (int i=0;i<layer.size();i++){
            for(int j=i+1;j<layer.size();j++){
                if(layer.get(i) instanceof Circle1){
                    if(layer.get(j) instanceof Circle1 && ((Circle1) layer.get(j)).getR() == ((Circle1) layer.get(i)).getR()){
                        layer.remove(j);
                    }
                }
            }
        }
    }

}
