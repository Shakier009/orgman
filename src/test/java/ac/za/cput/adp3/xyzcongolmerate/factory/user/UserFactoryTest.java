package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {


    @Test
    public void buildUser() {

        User user = UserFactory.buildUser("James@yahoo.com", "James", "Cole");
        Assert.assertNotNull(user);
        Assert.assertNotNull(user.getUserEmail());
        Assert.assertNotNull(user.getFirstName());
        Assert.assertNotNull(user.getLastName());
        System.out.println(user.toString());


        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 1. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 2. Test the UserFactory class
         * 3. Assert that the an object is created.
         */
    }
}