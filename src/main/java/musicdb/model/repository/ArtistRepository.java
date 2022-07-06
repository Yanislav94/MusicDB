package musicdb.model.repository;

import musicdb.model.entity.Artist;
import musicdb.model.entity.BandEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, String> {

    Optional<Artist> findArtistByName(BandEnum artist);
}
