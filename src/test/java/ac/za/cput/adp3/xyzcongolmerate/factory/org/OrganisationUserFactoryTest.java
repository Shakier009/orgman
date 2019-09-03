package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    @Test
    public void buildOrganisationUser() {

      OrganisationUser orgUser = OrganisationUserFactory.buildOrganisationUser("1", "Newton@yahoo.com");
      Assert.assertNotNull(orgUser);
      System.out.println(orgUser.toString());


        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 1. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 2. Test the OrganisationUserFactory class
         * 3. Assert that the an object is created.
         */
    }
}