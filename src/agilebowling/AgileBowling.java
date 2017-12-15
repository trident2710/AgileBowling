
package agilebowling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
       
       System.out.println("Bonjour! Veuilllez créer un utilisateur");
  
       
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Login: ");
        login = br.readLine();
        System.out.print("Mot de passe: ");
        pwd=br.readLine();
        System.out.print("Bienvenu ! ");
    }
    
}
