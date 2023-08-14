package CornSalad.TIE.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Admin {
    @Id
    @GeneratedValue
    @Column(name = "ADMIN_ID")
    private Long ID;
    private String ADMIN_NAME;

    private String ADMIN_NICK; //ID->NICK 변경

    //private String ADMIN_PASSWORD

    private LocalDateTime CREATE_DATE;

    private LocalDateTime MODIFY_DATE;

    private Status ADMIN_STATUS;

    @OneToMany(mappedBy = "admin")
    private List<Channel> Channel = new ArrayList<>();
}
