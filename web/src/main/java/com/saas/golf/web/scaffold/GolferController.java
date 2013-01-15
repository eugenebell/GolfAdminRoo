package com.saas.golf.web.scaffold;

import com.saas.golf.domain.Golfer;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/golfers")
@Controller
@RooWebScaffold(path = "golfers", formBackingObject = Golfer.class)
public class GolferController {
}
