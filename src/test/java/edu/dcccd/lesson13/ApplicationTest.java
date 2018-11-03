package edu.dcccd.lesson13;

import edu.dcccd.lesson13.model.User;
import edu.dcccd.lesson13.model.Role;
import edu.dcccd.lesson13.repos.RoleRepository;
import edu.dcccd.lesson13.repos.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static edu.dcccd.lesson13.utils.EncryptedPasswordUtils.encryptPassword;
import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Transactional
public class ApplicationTest {
    @Autowired private UserRepository userRepo;
    @Autowired private RoleRepository roleRepo;
    @Autowired private PasswordEncoder passwordEncoder;


    @Test
    public void contextLoads() {
    }

    @Test
    public void testCount() {
        long count = userRepo.count();
        assertEquals(2, count);
        userRepo.findAll().forEach(System.out::println);
        roleRepo.findAll().forEach(System.out::println);
    }

    @Test
    public void testAdd() {
        userRepo.findAll().forEach(System.out::println);
        User user = new User("bfly", encryptPassword("pw"));
        user = userRepo.save(user);
        assertEquals(1L, user.getId().longValue());
        Role role = new Role("ROLE_USER:", user.getId());
        role = roleRepo.save(role);
        userRepo.findAll().forEach(System.out::println);
        roleRepo.findAll().forEach(System.out::println);
    }
}