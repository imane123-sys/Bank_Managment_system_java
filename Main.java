public class Main {
    public static void main(String args[]){
        Client client1 = new Client(1,"imaneRm","imane@gmail.com","2345678889");
        System.out.println(client1);
        Bank b1 = new Bank();
        b1.ajouterClient();
        b1.creerCompte();
//       b1.supprimerCompte();
        b1.afficherComptes();







    }
}
