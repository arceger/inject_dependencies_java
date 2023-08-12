package services;

public class Prog {
    public static void main(String[] args) {
        PayService payservice = new PayService();
        System.out.println("RESULT "+payservice.finalPrice(300.0,"sp"));
    }
    
}
