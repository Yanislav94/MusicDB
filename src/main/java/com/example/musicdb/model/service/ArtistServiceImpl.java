package com.example.musicdb.model.service;

import com.example.musicdb.model.entity.Artist;
import com.example.musicdb.model.entity.BandEnum;
import com.example.musicdb.model.repository.ArtistRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public void initArtists() {
        if (this.artistRepository.count() == 0) {
            Arrays.stream(BandEnum.values()).forEach(bandEnum -> {
                this.artistRepository.save(new Artist(bandEnum.name(), ""));
            });
        }
    }
}
