package com.jinjin.test.springbootdeveloper.repository;

import com.jinjin.test.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}