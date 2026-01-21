import java.util.ArrayList;

public class Client extends Person {
    private String numeroClient;
    private ArrayList<Account> comptes =new ArrayList<>();
    public Client(int id,String nom,String email,String numeroClient){
        super( id, nom,email);
        this.numeroClient = numeroClient;

    }

    public String getNumeroClient() {
        return numeroClient;
    }

    public void setNumeroClient(String numeroClient) {
        this.numeroClient = numeroClient;
    }

    public ArrayList<Account> getComptes() {
        return comptes;
    }
    // ajouter Clients
    public void setComptes(Account account) {
        this.comptes.add(account);
    }
//toString existe dans classe Object
    public String toString(){
        return super.toString()+ "numéro de client :"+numeroClient;


    }

}
