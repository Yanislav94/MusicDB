package musicdb.service;

import musicdb.model.entity.Album;
import musicdb.model.repository.AlbumRepository;
import musicdb.model.service.AlbumServiceModel;
import musicdb.model.view.AlbumViewModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
public class AlbumServiceImpl implements AlbumService {

    private final AlbumRepository albumRepository;
    private final ModelMapper modelMapper;
    private final ArtistService artistService;

    public AlbumServiceImpl(AlbumRepository albumRepository, ModelMapper modelMapper, ArtistService artistService) {
        this.albumRepository = albumRepository;
        this.modelMapper = modelMapper;
        this.artistService = artistService;
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
        return this.albumRepository.findAll().stream().map(album -> {
            AlbumViewModel albumViewModel = this.modelMapper
                    .map(album, AlbumViewModel.class);
            albumViewModel.setImgUrl(String.format("/image/%s.jpg", album.getArtist()
                    .getBandEnum().name()
                    .toLowerCase(Locale.ROOT)));
            return albumViewModel;
        }).collect(Collectors.toList());
    }
}
