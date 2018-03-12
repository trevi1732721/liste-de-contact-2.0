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
        int choix = 0;
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
                       System.out.println("___________________________________");
                       System.out.println("Contact "+ i );
                       listeContact.get(i).PrintContact();
                       System.out.println("___________________________________");
                   }

                   break;
               case 3:
                   System.out.println("Que voulez vous faire?" +
                           "\n 1- modifier un contact" +
                           "\n 2- ajouter un numero");
                   choix = sc.nextInt();
                   if(choix==1){
                       System.out.println("Quel est le numero du contact à modifier?");
                       choix = sc.nextInt();
                       listeContact.get(choix).ModContact();
                   }else if(choix==2){
                       System.out.println("Ajouter un numero a quel contact?");
                       choix = sc.nextInt();
                       listeContact.get(choix).NewTelephone();
                   }
                   break;
               case 4:
                   break;
               case 5:
                   break;
               default:
                   break;
           }
           nouveauContact.NewContact();
       }//while run
    }
}
