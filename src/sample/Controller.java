package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Controller {
    @FXML
    public Label inputset;
    @FXML
    public Label output;
    @FXML
    public Button button;
    @FXML
    public Button newSet;
    Set<Integer> mySet= new HashSet<Integer>();

    public static int newRam(){
        return ((int)(Math.random()*100+1));
    }
    public void makeNewSet(){
        mySet.clear();
        for(int i=0; i<7;i++){
            mySet.add(newRam());
        }
        inputset.setText(" set is : "+mySet.toString());
    }
    public void cal() {


        ArrayList<Integer> list = method.setToList(mySet);
        output.setText("Array is : "+ list.toString());


    }



}
