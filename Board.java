package CornSalad.TIE.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
//효정 수정 버전
@Entity
@Getter
@Setter
public class Board {
    @Id
    @GeneratedValue
    @Column(name = "BOARD_ID")
    private Long ID;
    private String BOARD_CODE; // enum 파일로 insta, tiktok, youtube를 만드는 건 어떨까요?
    private String BOARD_NAME;
    private LocalDateTime CREATE_DATE;
    private LocalDateTime MODIFY_DATE;

    //private Boolean DELETE_YN; 게시판에 삭제 여부가 필요할까요?

    // @Embedded
    //private Status USER_STATUS; // [ACTIVE, INACTIVE]

    @OneToMany(mappedBy = "board")
    private List<Channel> Channel = new ArrayList<>();

    @OneToMany(mappedBy = "board")
    private List<Channel_recommend> Channel_recommend = new ArrayList<>();


}
