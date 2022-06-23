package musicdb.model.binding;

import musicdb.model.entity.BandEnum;
import musicdb.model.entity.GenreEum;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConstructorBinding;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
@ConstructorBinding
public class AlbumAddBindingModel {

    @Length(min = 3, max = 20)
    private String name;
    @Length(min = 2)
    private String imgUrl;
    @Min(value = 0)
    private BigDecimal price;
    @Min(value = 10)
    private int copies;
    @NotNull
    private String producer;
    private BandEnum artist;
    private GenreEum genre;
}
