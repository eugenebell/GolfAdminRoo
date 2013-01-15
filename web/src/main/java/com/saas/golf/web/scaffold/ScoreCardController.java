package com.saas.golf.web.scaffold;

import com.saas.golf.domain.ScoreCard;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/scorecards")
@Controller
@RooWebJson(jsonObject = ScoreCard.class)
@RooWebScaffold(path = "scorecards", formBackingObject = ScoreCard.class)
public class ScoreCardController {
}
