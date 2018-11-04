package edu.dcccd.lesson13.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String role;
    @Column(name = "user_id")
    private Long userId;

    public Role(String role, Long userId) {
        this.role = role;
        this.userId = userId;
    }
}