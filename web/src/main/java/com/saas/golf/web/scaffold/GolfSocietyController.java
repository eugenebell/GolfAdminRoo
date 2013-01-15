package com.saas.golf.web.scaffold;

import com.saas.golf.domain.GolfSociety;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/golfsocietys")
@Controller
@RooWebScaffold(path = "golfsocietys", formBackingObject = GolfSociety.class)
public class GolfSocietyController {
}
