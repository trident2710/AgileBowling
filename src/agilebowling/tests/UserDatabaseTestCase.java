/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilebowling.tests;

import agilebowling.DatabaseReader;
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
        DatabaseReader.getInstance().saveUser("testuser123", "pwduser123");
        Assert.assertTrue(DatabaseReader.getInstance().findByName("testuser123").getKey().equals("testuser123"));
        DatabaseReader.getInstance().deleteUser("testuser123");
    }
    
    @Test
    void testDeleteUser(){
        DatabaseReader.getInstance().saveUser("testuser123", "pwduser123");
        DatabaseReader.getInstance().deleteUser("testuser123");
        Assert.assertTrue(DatabaseReader.getInstance().findByName("testuser123")==null);
    }
}
