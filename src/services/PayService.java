package services;

public class PayService {
    private TaxService taxservice;
    private DeliveService deliveService;
    //construtor PayService
    public PayService (TaxService taxservice, DeliveService deliveService){
        this.taxservice = taxservice;
        this.deliveService = deliveService;
    }

    public double finalPrice (double cost, String state){
        return cost + deliveService.fee(state) + taxservice.tax(cost);
    }
    
}
