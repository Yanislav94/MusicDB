package musicdb.model.view;

import musicdb.model.entity.GenreEum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@ConstructorBinding
public class AlbumViewModel {

    public String name;
    public String artist;
    public GenreEum genreEum;
    public BigDecimal price;
    public String imageURL;
    public Instant releaseDate;

}
