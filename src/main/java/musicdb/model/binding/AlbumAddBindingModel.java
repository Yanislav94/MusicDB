package musicdb.model.binding;

import lombok.NoArgsConstructor;
import musicdb.model.entity.BandEnum;
import musicdb.model.entity.GenreEum;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class AlbumAddBindingModel {

    @Length(min = 3, max = 20)
    public String name;
    @Length(min = 2)
    private String imgUrl;
    @Min(value = 0)
    private BigDecimal price;
    @Min(value = 10)
    private int copies;
    private String producer;
    private BandEnum artist;
    private GenreEum genre;
    private String description;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date releaseDate;
}
