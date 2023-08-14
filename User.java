package CornSalad.TIE.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    private Long ID;
    private String USER_NAME;
    private String USER_NICK;
    private String USER_EMAIL;
    private String USER_GENDER;
    private String USER_BIRTH_YEAR;

    @Embedded
    private Status USER_STATUS;

    @OneToMany(mappedBy = "user")
    private List<Comment> orders = new ArrayList<>();

}