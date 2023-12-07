package com.petlife.forum.service;

import java.util.List;

import com.petlife.forum.dao.ArticleDAO;
import com.petlife.forum.dao.impl.ArticleDAOImpl;
import com.petlife.forum.entity.Article;

public class ArticleService {
    private final ArticleDAO dao;

    public ArticleService() {
        dao = new ArticleDAOImpl();
    }
     
    public void addArticle(Article article) {
    	dao.add(article);
    }
    
    public void deleteArticle(Integer articleId) {
    	dao.delete(articleId);
    }
    
    public void updateArticle(Article article) {
    	dao.update(article);
    }
    
    public Article getOneArticle(Integer articleId) {
    	return dao.findByPK(articleId);
    }
    
    public List<Article> getAll(){
    	return dao.getAll();
    }
   }