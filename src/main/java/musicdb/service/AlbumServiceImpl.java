package musicdb.service;

import musicdb.model.entity.Album;
import musicdb.model.entity.Artist;
import musicdb.model.entity.BandEnum;
import musicdb.model.entity.GenreEum;
import musicdb.model.repository.AlbumRepository;
import musicdb.model.repository.ArtistRepository;
import musicdb.model.service.AlbumServiceModel;
import musicdb.model.view.AlbumViewModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    private final AlbumRepository albumRepository;
    private final ModelMapper modelMapper;
    private final ArtistService artistService;
    private final ArtistRepository artistRepository;

    public AlbumServiceImpl(AlbumRepository albumRepository, ModelMapper modelMapper, ArtistService artistService, ArtistRepository artistRepository) {
        this.albumRepository = albumRepository;
        this.modelMapper = modelMapper;
        this.artistService = artistService;
        this.artistRepository = artistRepository;
    }


    @Override
    public void addAlbum(AlbumServiceModel albumServiceModel) {


        Album album = this.modelMapper.map(albumServiceModel, Album.class);

        album.setArtist(this.artistService.findByAlbumName(albumServiceModel.getArtist().getArtist()));

        this.albumRepository.saveAndFlush(album);
        System.out.println("");
    }

    @Override
    public List<AlbumViewModel> findAllItems() {
        List<AlbumViewModel> asd = this.albumRepository
                .findAll()
                .stream()
                .map(album -> {
                    AlbumViewModel albumViewModel = this.modelMapper
                            .map(album, AlbumViewModel.class);
                    ;
                    return albumViewModel;
                }).toList();


        return asd;
    }

}
