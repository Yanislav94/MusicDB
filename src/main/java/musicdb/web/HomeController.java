package musicdb.web;

import musicdb.model.entity.User;
import musicdb.service.AlbumService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;
import java.util.Optional;


@Controller
public class HomeController {

    private final AlbumService albumService;

    public HomeController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/")
    public ModelAndView index(HttpSession httpSession, ModelAndView modelAndView) {
        modelAndView.setViewName("home");
        modelAndView.addObject("albums", "vankoethebest");
//        if (httpSession.getAttribute("user") == null) {
//            modelAndView.setViewName("index");
//        } else {
//
//        }

        return modelAndView;
    }
}
