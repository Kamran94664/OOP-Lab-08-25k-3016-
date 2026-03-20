interface Payment {
    void processPayment();
}

class CreditCard implements Payment {
    public void processPayment() {
        System.out.println("Processing payment using Credit Card.");
    }
}

class PayPal implements Payment {
    public void processPayment() {
        System.out.println("Processing payment using PayPal.");
    }
}

class BankTransfer implements Payment {
    public void processPayment() {
        System.out.println("Processing payment using Bank Transfer.");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new PayPal();
        Payment p3 = new BankTransfer();

        p1.processPayment();
        p2.processPayment();
        p3.processPayment();
    }
}