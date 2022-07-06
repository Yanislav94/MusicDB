package musicdb.web;

import musicdb.model.entity.*;
import musicdb.model.repository.AlbumRepository;
import musicdb.service.AlbumService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {

    private final AlbumService albumService;

    public HomeController(AlbumService albumService, AlbumRepository albumRepository) {
        this.albumService = albumService;
    }

    @GetMapping("/")
    public ModelAndView index(HttpSession httpSession, ModelAndView modelAndView) {

        if (httpSession.getAttribute("user") == null) {
            modelAndView.setViewName("index");
        } else {
            if (!this.albumService.findAllItems().isEmpty()) {
                modelAndView.addObject("albums", this.albumService.findAllItems());
            }
            modelAndView.setViewName("home");
        }

        return modelAndView;
    }
}
