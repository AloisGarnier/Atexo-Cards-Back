package fr.atexo.agarnier.cards.controller.rest;

import fr.atexo.agarnier.cards.entity.Hand;
import fr.atexo.agarnier.cards.service.DrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cards")
@CrossOrigin(origins = "${front.url}")
public class DrawRestController {

    DrawService drawService;

    @GetMapping("/draw")
    public Hand drawTenCards() {
        return drawService.drawCards(10);
    }

    @PostMapping("/sort")
    public Hand sortHand(@RequestBody Hand hand) {
        return drawService.sortHand(hand);
    }

    @Autowired
    public void setDrawService(DrawService drawService) {
        this.drawService = drawService;
    }
}
