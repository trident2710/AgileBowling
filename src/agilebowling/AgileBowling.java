
package agilebowling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 *
 * @author trident
 */
public class AgileBowling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       String login;
       String pwd;
       
//       System.out.println("Bonjour! Veuilllez créer un utilisateur");
//  
//       
//       
//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Login: ");
//        login = br.readLine();
//        System.out.print("Mot de passe: ");
//        pwd=br.readLine();
//        System.out.print("Bienvenu ! ");
        
        
        
        Map<String, String> users = DatabaseReader.getInstance().getUsers();
        for(Map.Entry<String,String> e: users.entrySet()){
            System.out.println("username: ");
            System.out.println(e.getKey());
            System.out.println("password: ");
            System.out.println(e.getValue());
        }
        
        DatabaseReader.getInstance().saveUser("test", "test");
    }
    
}
