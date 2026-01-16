public class SavingsAccount extends Account{
    private  double tauxInteret ;
    public SavingsAccount(String numeroCompte,double solde,String type,double tauxInteret,Client client){
        super(numeroCompte, solde,type,client);
            this.tauxInteret=tauxInteret;

        }
        public double setTauxInteret(){
        return  this.tauxInteret;
    }
    public void setTauxInteret(double tauxInteret){
        this.tauxInteret=tauxInteret;

    }


    public double  calculerInterets(double solde){
        return solde*=tauxInteret;

    }
    public void appliquerInterets(){
        System.out.println("calculer Interets");
    }



}
