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
}
