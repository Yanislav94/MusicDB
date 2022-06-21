package com.example.musicdb.service;
import com.example.musicdb.model.entity.Artist;
import com.example.musicdb.model.entity.BandEnum;
import com.example.musicdb.model.repository.ArtistRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;
    private final ModelMapper modelMapper;

    public ArtistServiceImpl(ArtistRepository artistRepository, ModelMapper modelMapper) {
        this.artistRepository = artistRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void initArtists() {
        artistRepository.save(new Artist(BandEnum.METALLICA, "test"));
    }
}
