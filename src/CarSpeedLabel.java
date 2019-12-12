import javax.swing.*;

public class CarSpeedLabel extends JLabel {

    public CarSpeedLabel(String text){
        setText(text);
    }

    void update(String text){
        setText(text);
    }





/*
    public CarSpeedLabel(String text){
        carSpeed = new JLabel(text);
        this.add(carSpeed);
    }


    void updateCarSpeed(String text){ //kanske istället tar in CurrentSpeed och ModelName.
        carSpeed = new JLabel(text);

    }

 */
}
