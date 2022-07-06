package musicdb.model.service;

import lombok.NoArgsConstructor;
import musicdb.model.entity.BandEnum;
import musicdb.model.entity.GenreEum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Getter @Setter @NoArgsConstructor
public class AlbumServiceModel extends BaseServiceModel{

    public String name;
    public String imgUrl;
    public BigDecimal price;
    public int copies;
    public String producer;
    public BandEnum artist;
    public GenreEum genre;
    @DateTimeFormat(pattern = "dd-MM-YYYY")
    public Date releaseDate;
    private String description;
}
