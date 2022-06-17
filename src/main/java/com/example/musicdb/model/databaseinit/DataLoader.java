package com.example.musicdb.model.databaseinit;

import com.example.musicdb.model.service.ArtistService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    private final ArtistService artistService;

    public DataLoader(ArtistService artistService) {
        this.artistService = artistService;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {

        artistService.initArtists();

    }
}
