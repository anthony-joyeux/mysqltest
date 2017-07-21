package zm.hashcode.repositories.jpa;

import org.testng.annotations.Test;

/**
 * Created by hashcode on 7/21/17.
 *

 create database feedback;
 use feedback;

 CREATE TABLE comments (
 id INT NOT NULL AUTO_INCREMENT,
 MYUSER VARCHAR(30) NOT NULL,
 EMAIL VARCHAR(30),
 WEBPAGE VARCHAR(100) NOT NULL,
 DATUM DATE NOT NULL,
 SUMMARY VARCHAR(40) NOT NULL,
 COMMENTS VARCHAR(400) NOT NULL,
 PRIMARY KEY (ID)
 );


 */
public class MySQLAccessTest {



    @Test
    public void testReadDataBase() throws Exception {
        MySQLAccess dao = new MySQLAccess();
        dao.readDataBase();
    }

}