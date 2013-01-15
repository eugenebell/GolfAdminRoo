package com.saas.golf.web.scaffold;

import com.saas.golf.domain.GolfCourse;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/golfcourses")
@Controller
@RooWebJson(jsonObject = GolfCourse.class)
@RooWebScaffold(path = "golfcourses", formBackingObject = GolfCourse.class)
public class GolfCourseController {
}
