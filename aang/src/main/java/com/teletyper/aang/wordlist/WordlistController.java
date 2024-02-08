package com.teletyper.aang.wordlist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
        path = "/wordlist"
)
public class WordlistController {
private final WordlistService wordlistService;
public WordlistController(WordlistService wordlistService){
    this.wordlistService = wordlistService;
}

}
