package musicdb.model.service;

import lombok.Getter;
import lombok.Setter;
import musicdb.model.entity.BandEnum;
import org.springframework.boot.context.properties.ConstructorBinding;

@Getter
@Setter
@ConstructorBinding
public class ArtistServiceModel {

    public BandEnum name;
    public String careerInformation;

}
