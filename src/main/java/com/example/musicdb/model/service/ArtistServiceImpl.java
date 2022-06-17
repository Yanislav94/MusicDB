package com.example.musicdb.model.service;

import com.example.musicdb.model.entity.Artist;
import com.example.musicdb.model.entity.BandEnum;
import com.example.musicdb.model.repository.ArtistRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import java.util.Arrays;

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
        if (this.artistRepository.count() == 0) {
            Arrays.stream(BandEnum.values()).forEach(bandEnum -> {
                this.artistRepository.save(new Artist(bandEnum.toString(), ""));
            });
        }
    }
}
