package CornSalad.TIE.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Channel {

    @Id @GeneratedValue
    @Column(name = "CHANNEL_ID")
    private Long ID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADMIN_ID")
    private Admin Admin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOARD_ID")
    private Board Board;

    //private Review_tag tag_count; 아직 review tag 만들지 못함

    private String CHANNEL_TITLE;
    private String CHANNEL_CONTENTS;

    private Image CHANNEL_PHOTO; // 데이터 타입이 이게 맞을까요?

    //private String CHANNEL_CATEGORY; // board를 받아오는데 필요할까요?

    private LocalDateTime CREATE_DATE;
    private LocalDateTime MODIFY_DATE;
    private Boolean DELETE_YN;
}