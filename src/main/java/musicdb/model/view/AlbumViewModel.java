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

    public String name;
    public String artist;
    public GenreEum genre;
    public BigDecimal price;
    public String imgUrl;
    public Date releaseDate;

}
