package com.saas.golf.web.scaffold;

import com.saas.golf.domain.GolfClub;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/golfclubs")
@Controller
@RooWebScaffold(path = "golfclubs", formBackingObject = GolfClub.class)
public class GolfClubController {
}
