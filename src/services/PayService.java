package services;

public class PayService {
    private TaxService taxservice = new TaxService();
    private DeliveService deliveService = new DeliveService();

    public double finalPrice (double cost, String state){
        return cost + deliveService.fee(state) + taxservice.tax(cost);
    }
    
}
