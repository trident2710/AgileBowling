/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import agilebowling.data.DatabaseReader;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;


/**
 *
 * @author trident
 */
public class UserDatabaseTestCase extends TestCase{
    
    
    @Test
    void testSaveUser(){
        DatabaseReader.getInstance().addUser("testuser123", "pwduser123");
        Assert.assertTrue(DatabaseReader.getInstance().findByName("testuser123")!=null);
        DatabaseReader.getInstance().deleteUser("testuser123");
    }
    
    @Test
    void testDeleteUser(){
        DatabaseReader.getInstance().addUser("testuser123", "pwduser123");
        DatabaseReader.getInstance().deleteUser("testuser123");
        Assert.assertTrue(DatabaseReader.getInstance().findByName("testuser123")==null);
    }
}
