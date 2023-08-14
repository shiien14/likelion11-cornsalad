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
    private Status USER_STATUS; // [ACTIVE, INACTIVE]

    @OneToMany(mappedBy = "user")
    private List<Comment> Comment = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<User_log> User_logs = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Hash_tag TAG_ID; // 이부분 보완필요.. hashtag 단방향 연관을 만들고싶어요 ㅠㅅㅠ


}
