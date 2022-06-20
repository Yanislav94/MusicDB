package com.example.musicdb.model.databaseinit;
import com.example.musicdb.model.entity.BandEnum;
import com.example.musicdb.model.service.ArtistService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ArtistService artistService;

    public DataLoader(ArtistService artistService) {
        this.artistService = artistService;
    }


    @Override
    public void run(String... args) throws Exception {
        artistService.initArtists();
    }
}
