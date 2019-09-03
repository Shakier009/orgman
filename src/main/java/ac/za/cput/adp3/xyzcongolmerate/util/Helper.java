package ac.za.cput.adp3.xyzcongolmerate.util;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;

import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {

        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {

        String up = "";
        String x = getClassName(aClass);
        //String x = aClass.getSimpleName();
        int z = x.length();
        for (int i = 0; i < z; i++){
            if (Character.isUpperCase(x.charAt(i))){
                char w = x.charAt(i);
                up = up + w;
            }
        }
        return up;

        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line 17 [throw new UnsupportedOperationException("Not yet supported!");]
         * 2. Get the capitalized letter(s) from the className and return it.
         */
    }
}
