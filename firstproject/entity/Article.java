package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity// DB가 해당 객체 인식 가능
public class Article {
    @Id
    @GeneratedValue // 1,2,3,...자동생성 어노테이션
    private Long id;// 대표값이 있어야함(고유값)
    @Column //디비 테이블 단위
    private String title;
    private String content;

    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
