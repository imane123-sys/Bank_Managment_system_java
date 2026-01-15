import java.util.ArrayList;

public class Client extends Person {
    private String numeroClient;
    private ArrayList<Account> comptes =new ArrayList<>();
    public Client(int id,String nom,String email,String numeroClient){
        super( id, nom,email);
        this.numeroClient = numeroClient;




    }
    public
    public String toString(){
        return super.toString()+ "numéro de client :"+numeroClient;


    }

}
