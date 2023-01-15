package test.com.bridgelabs.day19_user_registration;

import com.bridgelabs.day19_user_registration.UserRegistrationException;
import com.bridgelabs.day19_user_registration.SampleEmailCheck;
import com.bridgelabs.day19_user_registration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;


public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    SampleEmailCheck sampleEmailCheck = new SampleEmailCheck();

    public UserRegistrationTest() throws FileNotFoundException {
    }

    @Test
    public void testValidateName() throws UserRegistrationException {
        boolean result = userRegistration.name.validate("Sourav");
        Assert.assertTrue(result);
    }
    @Test
    public void testValidateEmail() throws UserRegistrationException {
        boolean result = userRegistration.email.validate("sourav.prasanna.7@gmail.com");
        Assert.assertTrue(result);
    }
    @Test
    public void testValidateMobile() throws UserRegistrationException {
        boolean result = userRegistration.mobile.validate("8667642258");
        Assert.assertTrue(result);
    }
    @Test
    public void testValidatePassword() throws UserRegistrationException {
        boolean result = userRegistration.password.validate("So@27079");
        Assert.assertTrue(result);
    }
    @Test
    public void testValidEmailCheck() throws UserRegistrationException {
        ArrayList<Boolean> result = sampleEmailCheck.validEmailcheck();
        for(boolean results : result) {
            Assert.assertTrue(results);
        }
    }
    @Test
    public void testInValidEmailCheck() throws UserRegistrationException {
        ArrayList<Boolean> result = sampleEmailCheck.invalidEmailcheck();
        for(boolean results : result) {
            Assert.assertTrue(results);
        }
    }
}
