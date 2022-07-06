package musicdb.model.view;

import musicdb.model.entity.GenreEum;
import lombok.Getter;
import lombok.Setter;
import musicdb.model.service.ArtistServiceModel;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ConstructorBinding
public class AlbumViewModel {

    public String name;
    public ArtistServiceModel artist;
    public GenreEum genreEum;
    public BigDecimal price;
    public String imgUrl;
    @DateTimeFormat(pattern = "dd-MM-YYYY")
    public Date releaseDate;
    public String description;
    public int copies;

}
