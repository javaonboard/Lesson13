package edu.dcccd.lesson13;

import edu.dcccd.lesson13.model.User;
import edu.dcccd.lesson13.repos.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static edu.dcccd.lesson13.utils.EncryptedPasswordUtils.encryptPassword;
import static junit.framework.TestCase.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {
    @Autowired private UserRepository userRepo;
    @Autowired private PasswordEncoder passwordEncoder;


    @Test
    public void contextLoads() {
    }

    @Test
    public void testCount() {
        long count = userRepo.count();
        assertEquals(2, count);
    }

    @Test
    public void testAdd() {
        User user = new User("bfly", encryptPassword("pw"));
        user = userRepo.save(user);
        System.out.println(user.getId());
        assertEquals(3, Optional.ofNullable(user.getId()));
    }
}