package musicdb.model.service;

import musicdb.model.entity.BandEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConstructorBinding;

@Getter
@Setter
@ConstructorBinding
public class ArtistServiceModel {

    private BandEnum artist;
    private String careerInformation;

}
