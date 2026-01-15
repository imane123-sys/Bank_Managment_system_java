import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private int idBanque;
    private String nomBanque;
    private String addresseBanque;
    private ArrayList<Account> comptes = new ArrayList<>();
    private ArrayList<Client> clients= new ArrayList<>();
    private  int idClient=0;

    public void ajouterCompte(Account account){
         comptes.add(account);

    }
    public void ajouterClient(Client client){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom  du client que vous voulez ajouter:");
         String nom =scanner.nextLine();
        System.out.println("Entrez email  du client :");
        String email =scanner.nextLine();
        System.out.println("Entrez le numero   du client :");
        String numeroClient =scanner.nextLine();

        idClient++;
        Client c1 = new Client(idClient,nom,email,numeroClient);
        clients.add(c1);
        System.out.println("client est ajoute"+idClient);


    }
    public void creerCompte(){

    }
    public void supprimerCompte(){

    }
    public void afficherComptes(){

    }

}
