package musicdb.model.databaseinit;
import musicdb.service.ArtistService;
import musicdb.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ArtistService artistService;
    private final UserService userService;

    public DataLoader(ArtistService artistService, UserService userService) {
        this.artistService = artistService;
        this.userService = userService;
    }


    @Override
    public void run(String... args) throws Exception {
        artistService.initArtists();
        userService.initUser();

    }
}
