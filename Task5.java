abstract class Appliance {
    abstract void start();
}

interface RemoteControl {
    void controlRemotely();
    }

    class SmartWashingMachine extends Appliance implements RemoteControl {
        public void start() {
            System.out.println("Smart Washing Machine started.");
        }

    public void controlRemotely() {
        System.out.println("Smart Washing Machine is controlled remotely.");
        }
    }

        class SmartRefrigerator extends Appliance {
            public void start() {
                System.out.println("Smart Refrigerator started.");
                }
        }

public class Task5 {
                public static void main(String[] args) {
                    Appliance washingMachine = new SmartWashingMachine();
                         Appliance refrigerator = new SmartRefrigerator();
                     washingMachine.start();

                    refrigerator.start();
                RemoteControl remote = new SmartWashingMachine();
                    remote.controlRemotely();
    }
}