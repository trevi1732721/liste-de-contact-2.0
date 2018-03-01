import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by TreVi1732721 on 2018-02-26.
 */
public class Main {
    public static void main(String[] args) {
        //new liste
        Map<Integer, Contact> listeContact = new HashMap<Integer, Contact>();
        Contact nouveauContact = new Contact();
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        int nbContact = 0;
       while(run){
           System.out.println("Que voulez vous faire?" +
                   "\n1- Nouveau contact" +
                   "\n2- Afficher un contact" +
                   "\n3- Modifier et ajouter un numero de téléphone" +
                   "\n4- Modifier un contact" +
                   "\n5- effacer un contact");
           switch(sc.nextInt()){
               case 1:
                   listeContact.put(1,nouveauContact);
                   break;
               case 2:
                   for (int i=0; i>=nbContact; i++) {
                       //Still have to fo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                   }

                   break;
               case 3:
                   break;
               case 4:
                   break;
               case 5:
                   break;
               default:
                   break;
           }
           nouveauContact.NewContact();
       }
    }
}
