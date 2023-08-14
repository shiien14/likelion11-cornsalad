package CornSalad.TIE.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
//효정 수정 버전
@Entity
@Getter
@Setter
public class Channel_recommend {
    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    private Long ID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOARD_ID")
    private Board Board;

}
