package com.saas.golf.web.scaffold;

import com.saas.golf.domain.Competition;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/competitions")
@Controller
@RooWebScaffold(path = "competitions", formBackingObject = Competition.class)
public class CompetitionController {
}
