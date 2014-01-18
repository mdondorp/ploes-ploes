package nl.ica.ddoa.dda.routeplanner.web;
import nl.ica.ddoa.dda.routeplanner.domain.Wegwerkzaamheid;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/wegwerkzaamheids")
@Controller
@RooWebScaffold(path = "wegwerkzaamheids", formBackingObject = Wegwerkzaamheid.class)
@RooWebJson(jsonObject = Wegwerkzaamheid.class)
@RooWebFinder
public class WegwerkzaamheidController {
}
