public class Bulb {
    //Class Variables => There is exactly one copy
    // of these variables regardless of how many instances of the class are created
    private static int TotalBulbCount = 0;
    //Instance Variables
    private boolean isOn = false;
    //Constructor
    public Bulb(){
        TotalBulbCount++;
    }
    // Class Method
    public static int getBulbCount(){
        return TotalBulbCount;
    }
    // Instance Method
    public void turnOn() {
        isOn = true;
    }
    // Instance Method
    public void turnOff() {
        isOn = false;
    }
    // Instance Method
    public boolean isOnFun(){
        return isOn;
    }
}
