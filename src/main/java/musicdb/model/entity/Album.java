package musicdb.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "albums")
@Getter
@Setter
@NoArgsConstructor
public class Album extends BaseEntity{

    @Column
    private String name;
    @Column
    private String imgUrl;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column
    private int copies;
    @Column
    private BigDecimal price;
    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date releaseDate;
    @Column
    private String producer;
    @Enumerated(EnumType.STRING)
    private GenreEum genreEum;
    @ManyToOne
    private Artist artist;
    @ManyToOne
    private User addedFrom;

}
