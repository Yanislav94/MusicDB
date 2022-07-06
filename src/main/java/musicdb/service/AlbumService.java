package musicdb.service;
import musicdb.model.entity.Album;
import musicdb.model.service.AlbumServiceModel;
import musicdb.model.view.AlbumViewModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AlbumService {
    void addAlbum(AlbumServiceModel albumServiceModel);

    List<AlbumViewModel> findAllItems();

}
