public class Person {
    private int id;
    private String nom;
    private String email;
    public Person(int id,String nom,String email ){
        this.id = id ;
        this.nom = nom;
        this.email = email;

    }
    public int getId(){
        return this.id;
    }
    public String getNom(){
        return this.nom;

    }
    public String email(){
         return this.email;
    }

    public void setId(int id){
        this.id = id ;



    }
    public void setNom(String nom){
        this.nom = nom;


    }
    public void setEmail(String email){
        this.email = email;
    }

    public String toString() {
        return "Person{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
