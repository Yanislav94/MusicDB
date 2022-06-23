package musicdb.web;

import musicdb.model.binding.AlbumAddBindingModel;
import musicdb.model.service.AlbumServiceModel;
import musicdb.service.AlbumService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/albums")
public class AlbumsController {

    private final AlbumService albumService;
    private final ModelMapper modelMapper;

    public AlbumsController(AlbumService albumService, ModelMapper modelMapper) {
        this.albumService = albumService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/add")
    public String add() {
        return "add-album";
    }

    @PostMapping("/add")
    public String addConfirm(@Valid @ModelAttribute()
                                         AlbumAddBindingModel albumAddBindingModel,
                             BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "redirect:add";
        }
        this.albumService.addAlbum(this.modelMapper.map(albumAddBindingModel, AlbumServiceModel.class));
        return "redirect:/";
    }
}
