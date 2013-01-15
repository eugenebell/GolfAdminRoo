package com.saas.golf.web.scaffold;

import com.saas.golf.domain.GolfRound;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/golfrounds")
@Controller
@RooWebScaffold(path = "golfrounds", formBackingObject = GolfRound.class)
public class GolfRoundController {
}
