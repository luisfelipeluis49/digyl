package com.british.demon.kings.digyl.controllers;

import com.british.demon.kings.digyl.dtos.Language;
import com.british.demon.kings.digyl.repository.LanguageRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/languages")
public class LanguageController {

    private LanguageRepository languageRepository = new LanguageRepository();

    @GetMapping
    public ResponseEntity getLanguage() {

        List<Language> languages = languageRepository.getLanguages();

        return ResponseEntity.ok().body(languages);
    }
}
