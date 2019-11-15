import java.awt.*;
/**
*Abstract class that holds common variables and methods shared by subclasses Volvo240 and Saab95
 */
public abstract class Car implements IMovable{
    /**
     * Number of doors on the car
     */
    private int nrDoors; // Number of doors on the car
    /**
     * Engine power of the car
     */
    private double enginePower; // Engine power of the car
    /**
     * The current speed of the car
     */
    private double currentSpeed; // The current speed of the car
    /**
     * Color of the car
     */
    private Color color; // Color of the car
    /**
     * The car model name
     */
    private String modelName; // The car model name
    /**
     * The cars position on the x-axis
     */
    private double x = 0;
    /**
     * The cars position on the y-axis
     */
    private double y = 0;
    /**
     * The direction the car is facing
     */
    private int direction = 2;

    public Car(int nrDoors, double enginePower, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        stopEngine();
    }

    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed){ this.currentSpeed = currentSpeed; }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    /**
     * method that starts the car's engine by setting it's current speed to 1
     */
    public void startEngine(){
        currentSpeed = 1;
    }
    /**
     * method that stops the car's engine by setting it's current speed to 0
     */
    public void stopEngine(){
        currentSpeed = 0;
    }

    /**
    *Moves the car by changing its position according to speed and direction
     */
    @Override
    public void move() {
       if(direction == 0){
           y = y - currentSpeed;
       }else if(direction == 1 || direction == -3){
            x = x + currentSpeed;
       }else if(direction == 2 || direction == -2) {
           y = y + currentSpeed;
       }else if(direction == 3 || direction == -1) {
           x = x - currentSpeed;
       }
    }
/**
*Turns car left by changing the variable direction
 */
    @Override
    public void turnLeft() {
        direction --;
        direction = direction % 4;
    }
/**
*Turns the car right by changing the variable direction
 */
    @Override
    public void turnRight() {
        direction ++;
        direction = direction % 4;
    }

    /**
     * Method for increasing the car's current speed
     * @param amount
     */
    public void incrementSpeed(double amount){
        currentSpeed = Math.min(currentSpeed + speedFactor() * amount, enginePower);
    }

    /**
     * Method for decreasing the car's speed
     * @param amount
     */
    public void decrementSpeed(double amount) {
        currentSpeed = Math.max(currentSpeed - speedFactor() * amount, 0);
    }

    /**
     * Increases speed by calling the incrementSpeed method if amount is more than or equal to 0 and less than or equal to 1
     * @param amount the amount you want to gass on a scale 0-1.
     */
    public void gas(double amount){
        if(amount >= 0 && amount <= 1){
            incrementSpeed(amount);
        }
    }

    /**
     * Decreases speed by calling the decrementSpeed method if amount is more than or equal to 0 and less than or equal to 1
     * @param amount
     */
    public void brake(double amount){
        if(amount >= 0 && amount <= 1){
            decrementSpeed(amount);
        }
    }

    /**
     * An abstract method to be inherited by subclasses
     * @return
     */
    abstract double speedFactor();

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getDirection() {
        return direction;
    }
}
