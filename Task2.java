interface SmartDevice {
    void turnOn();
    void turnOff();
}

class SmartLight implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart Light is turned ON.");
    }

    public void turnOff() {
        System.out.println("Smart Light is turned OFF.");
    }
}

class SmartFan implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart Fan is turned ON.");
    }

    public void turnOff() {
        System.out.println("Smart Fan is turned OFF.");
    }
}
public class Task2 {
    public static void main(String[] args) {
        SmartDevice light = new SmartLight();
        SmartDevice fan = new SmartFan();

        light.turnOn();
        light.turnOff();

        fan.turnOn();
        fan.turnOff();
    }
}