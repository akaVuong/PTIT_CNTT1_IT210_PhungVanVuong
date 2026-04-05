package bai1;

interface PaymentGateway {
    void pay(double amount);
}

class MomoGateway implements PaymentGateway {
    public void pay(double amount){
        System.out.println("Thanh toán Momo: " + amount);
    }
}

class RechargeService1 {
    private PaymentGateway gateway;

    public RechargeService1(PaymentGateway gateway){
        this.gateway = gateway;
    }
}