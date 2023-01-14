package test.com.bridgelabs.day19_user_registration; 

import com.bridgelabs.day19_user_registration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
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
} 
