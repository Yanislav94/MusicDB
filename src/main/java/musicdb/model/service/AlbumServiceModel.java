package musicdb.model.service;

import musicdb.model.entity.GenreEum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.math.BigDecimal;

@Getter @Setter @ConstructorBinding
public class AlbumServiceModel extends BaseServiceModel{

    private String name;
    private String imgUrl;
    private BigDecimal price;
    private int copies;
    private String producer;
    private ArtistServiceModel artist;
    private GenreEum genre;

}
