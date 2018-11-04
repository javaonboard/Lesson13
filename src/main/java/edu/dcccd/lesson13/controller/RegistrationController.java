package edu.dcccd.lesson13.controller;

import edu.dcccd.lesson13.model.RegistrationForm;
import edu.dcccd.lesson13.model.Role;
import edu.dcccd.lesson13.model.User;
import edu.dcccd.lesson13.repos.RoleRepository;
import edu.dcccd.lesson13.repos.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {
  
  private UserRepository userRepo;
  private RoleRepository roleRepo;
  private PasswordEncoder passwordEncoder;

  public RegistrationController(
      UserRepository userRepo, RoleRepository roleRepo, PasswordEncoder passwordEncoder) {
    this.userRepo = userRepo;
    this.roleRepo = roleRepo;
    this.passwordEncoder = passwordEncoder;
  }
  
  @GetMapping
  public String registerForm() {
    return "registration";
  }
  
  @PostMapping
  public String processRegistration( RegistrationForm form) {
      System.out.println(form.getUsername() + "/" + form.getPassword());
      User user = userRepo.save(form.toUser(passwordEncoder));
      userRepo.findAll().forEach(System.out::println);
      roleRepo.save(new Role("ROLE_USER", user.getId()));
      roleRepo.findAll().forEach(System.out::println);
      return "redirect:/login";
  }

}
