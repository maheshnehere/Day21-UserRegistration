package test.com.bridgelabs.day19_user_registration; 

import com.bridgelabs.day19_user_registration.SampleEmailCheck;
import com.bridgelabs.day19_user_registration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;


public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    SampleEmailCheck sampleEmailCheck = new SampleEmailCheck();

    public UserRegistrationTest() throws FileNotFoundException {
    }

    @Test
    public void testValidateName() throws Exception {
        boolean result = userRegistration.validateName("Sourav");
        Assert.assertTrue(result);
    }
    @Test
    public void testValidateEmail() throws Exception {
        boolean result = userRegistration.validateEmail("sourav.prasanna.7@gmail.com");
        Assert.assertTrue(result);
    }
    @Test
    public void testValidateMobile() throws Exception {
        boolean result = userRegistration.validateMobile("8667642258");
        Assert.assertTrue(result);
    }
    @Test
    public void testValidatePassword() throws Exception {
        boolean result = userRegistration.validatePassword("So@27079");
        Assert.assertTrue(result);
    }
    @Test
    public void testValidEmailCheck() throws Exception {
        boolean result = sampleEmailCheck.validEmailcheck();
        Assert.assertTrue(result);
    }
    @Test
    public void testInValidEmailCheck() throws Exception {
        boolean result = sampleEmailCheck.invalidEmailcheck();
        Assert.assertTrue(result);
    }
} 
