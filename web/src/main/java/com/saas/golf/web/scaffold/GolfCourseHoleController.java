package com.saas.golf.web.scaffold;

import com.saas.golf.domain.GolfCourseHole;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/golfcourseholes")
@Controller
@RooWebScaffold(path = "golfcourseholes", formBackingObject = GolfCourseHole.class)
public class GolfCourseHoleController {
}
