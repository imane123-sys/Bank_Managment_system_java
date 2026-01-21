public class SavingsAccount extends Account{
    private  double tauxInteret;
    public SavingsAccount(String numeroCompte,double solde,String type,Client client){
        super(numeroCompte, solde,type,client);
            this.tauxInteret=5.0;

        }
        public double getTauxInteret(){
        return  this.tauxInteret;
    }
    public void setTauxInteret(double tauxInteret){
        this.tauxInteret=tauxInteret;

    }


    public double  calculerInterets(double solde){
        return  solde*tauxInteret;

    }
    public void appliquerInterets(){
       double interets =calculerInterets(getSolde());
       setSolde(getSolde()+interets);
        System.out.println("interets appliquées sont:"+interets);
        System.out.println("solde après interets "+getSolde());
        }
    }








