package services;

public class Prog {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        DeliveService deliveService = new DeliveService();

        PayService payservice = new PayService(taxService, deliveService);

        System.out.println("RESULT "+payservice.finalPrice(150,"sp"));
    }
    
}
