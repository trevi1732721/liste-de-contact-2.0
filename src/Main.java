import java.util.HashMap;
import java.util.Map;

/**
 * Created by TreVi1732721 on 2018-02-26.
 */
public class Main {
    public static void main(String[] args) {
        //new liste
        Map<String, Contact> listeContact = new HashMap<String, Contact>();
        Contact nouveauContact = new Contact();
        // gerer
        nouveauContact.NewContact();
        listeContact.put("essaie 1",nouveauContact);
    }
}
