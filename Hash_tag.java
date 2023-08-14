package CornSalad.TIE.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "HASH_TAG")
public class Hash_tag {
    @Id
    @GeneratedValue
    @Column(name = "TAG_ID")
    private Long ID;

    private int TAG_COUNT;

    private String TAG_CONTENTS;

    private Type TAG_TYPE; // HASH, COMMENTS
}
