package com.saas.golf.web.scaffold;

import com.saas.golf.domain.PlayerParticipant;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/playerparticipants")
@Controller
@RooWebScaffold(path = "playerparticipants", formBackingObject = PlayerParticipant.class)
public class PlayerParticipantController {
}
