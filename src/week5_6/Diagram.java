package week5_6;


import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Diagram {


    ArrayList<Layer> diagram = new ArrayList<Layer>();


    public void Remove(){
        for(int i=0;i<diagram.size();i++){
            for(int j=0;j<diagram.get(i).layer.size();j++) {
                if (diagram.get(i).layer.get(j) instanceof Circle1) {
                    diagram.remove(i);
                }
            }
        }
    }
    private void sameShape(){
        for(int i=0;i<diagram.size();i++){
            for(int j=0;j<diagram.get(i).layer.size();j++) {
                if (diagram.get(i).layer.get(j) instanceof Circle1) {
                    diagram.get(0).layercircle.add(diagram.get(i).layer.get(j));
                }
                if (diagram.get(i).layer.get(j) instanceof Rectangle1) {
                    diagram.get(1).layerrectangle.add(diagram.get(i).layer.get(j));
                }
                if (diagram.get(i).layer.get(j) instanceof Circle1) {
                    diagram.get(2).layersquare.add(diagram.get(i).layer.get(j));
                }
                if (diagram.get(i).layer.get(j) instanceof Circle1) {
                    diagram.get(3).layertriangle.add(diagram.get(i).layer.get(j));
                }
            }
        }
    }
}
