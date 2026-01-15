public class Account {
    private String numeroCompte;
    private double solde;
    private String type;
    private Client client;
    public Account( String numeroCompte,double solde,String type,Client client){
        this.numeroCompte =numeroCompte;
        this.solde =solde;
        this.type =type;
        this.client=client;


    }

    public String getNumeroCompte(){
        return this.numeroCompte;
    }
    public void setNumeroCompte(String numeroCompte){
        this.numeroCompte =numeroCompte;

    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double consulterSolde(double solde){

         return this.solde = solde;

    }
    public  double deposer(double montant){
        return  montant+=solde;
    }

    public double retirer(double montant){
        return montant -=solde;
    }
//    public void afficherComptes(){
//        for(){
//
//        }
    }







}
