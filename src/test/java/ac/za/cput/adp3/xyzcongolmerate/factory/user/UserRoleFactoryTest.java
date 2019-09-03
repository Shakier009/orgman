package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    @Test
    public void buildUserRole() {
       UserRole user = UserRoleFactory.buildUserRole("1", "Zed@yahoo.com", "1");
       Assert.assertNotNull(user);
        System.out.println(user.toString());


        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the UserRoleFactory class
         * 4. Assert that the an object is created.
         */
    }
}