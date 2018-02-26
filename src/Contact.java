import java.util.Scanner;

/**
 * Created by TreVi1732721 on 2018-01-22.
 */
public class Contact {
    private String prenom;
    private String nom;
    private Adresse adresse = new Adresse();
    private Occupation occupation = new Occupation();
    private Telephone[] numeroTelephone = new Telephone[10];
    public Contact(){
        for(int i=0;i<10;i++){
            numeroTelephone[i] = new Telephone();
        }
    }


    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public Telephone[] getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(Telephone[] numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public void NewContact(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nouveau contact\n");
        System.out.print("  Quel est le prenom du contact?");
        prenom = sc.next();
        System.out.print("  Quel est le nom de famille du contact?");
        nom=sc.next();
        adresse.NewAdresse();
        occupation.NewOccupation();
    }
}
