package edu.dcccd.lesson13.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptedPasswordUtils {

    // Encrypt Password with BCryptPasswordEncoder
    private static String encryptPassword( String password ) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

    public static void main(String[] args) {
        //get your password encrypted.
        System.out.println("Encrypted Password: " + encryptPassword("password"));
    }

}