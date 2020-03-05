class Bulb2 implements BulbInterface {
//    needs to implement all the methods of BulbInterface.
    private boolean isOn = false;
    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public boolean isOnFun() {
        return isOn;
    }

    //Enums
    enum BulbSize{ SMALL, MEDIUM, LARGE }
    BulbSize size;
    //Other bulb class fields and methods.
}

public class BulbDemo {
    public static void main(String[] args) {
//        Bulb2 b = new Bulb2();
//        System.out.println("bulb is on return : " + b.isOnFun());
//        b.turnOn();
//        System.out.println("bulb is on return : " + b.isOnFun());

//        Enums restrict a variable to have one of the few predefined values.
        Bulb2 b = new Bulb2();
        b.size = Bulb2.BulbSize.MEDIUM;
        System.out.println("Bulb Size : " + b.size);
    }
}
