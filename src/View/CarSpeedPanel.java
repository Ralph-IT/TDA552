package View;

import javax.swing.*;
import java.util.ArrayList;

public class CarSpeedPanel extends JPanel {


    ArrayList<JLabel> speedLabels = new ArrayList<>();


    void updateSpeedLabels(){
        //speedLabel.update(modelName + " : " + currentSpeed);
        this.removeAll();
        for (JLabel label : speedLabels){
            this.add(label);
        }
        speedLabels.clear();
        this.updateUI();

    }

    void addLabel(String modelName, double currentSpeed){
        JLabel car = new JLabel(  modelName + " : " + currentSpeed + "   | ");
        speedLabels.add(car);
    }
}
