package com.example.tableview.controllers;

import com.example.tableview.model.Article;
import com.example.tableview.repositories.ArticleRepository;
import com.example.tableview.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {

    private final ArticleRepository articleRepository;

    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("/api/articles")
    public List<Article> getArticles() {
        return articleRepository.findAll();
    }

    @Autowired
    private ArticleService articleService;

    @GetMapping("/api/articles/page/{number}")
    public Page<Article> getArticles(@PathVariable int number,
                                     @RequestParam(defaultValue = "10") int size) {
        return articleService.getArticles(number - 1, size);
    }
}
