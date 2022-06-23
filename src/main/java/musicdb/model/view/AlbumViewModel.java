package musicdb.model.view;

import musicdb.model.entity.GenreEum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ConstructorBinding
public class AlbumViewModel {

    private String name;
    private String artist;
    private GenreEum genre;
    private BigDecimal price;
    private String imgUrl;
    private Date releaseDate;
}
