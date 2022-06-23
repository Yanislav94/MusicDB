package musicdb.service;

import musicdb.model.entity.Artist;
import musicdb.model.entity.BandEnum;
import org.springframework.stereotype.Service;

@Service
public interface ArtistService {
    void initArtists();

    Artist findByAlbumName(BandEnum bandEnum);

}
