package com.example.tableview.service;

import com.example.tableview.model.Article;
import com.example.tableview.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public Page<Article> getArticles(int number, int size) {
        return articleRepository.findAll(PageRequest.of(number, size));
    }
}
