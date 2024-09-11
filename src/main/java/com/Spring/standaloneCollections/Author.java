package com.Spring.standaloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Author {
    private List<String> books;
    private Map<String, Integer> NamePrice;
    private Properties RankCategory;

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public Map<String, Integer> getNamePrice() {
        return NamePrice;
    }

    public void setNamePrice(Map<String, Integer> namePrice) {
        NamePrice = namePrice;
    }

    public Properties getRankCategory() {
        return RankCategory;
    }

    public void setRankCategory(Properties rankCategory) {
        RankCategory = rankCategory;
    }

    @Override
    public String toString() {
        return "Author{" +
                "books=" + books + " " +
                "NamePrice=" + NamePrice + " " +
                "RankCategory=" + RankCategory + " " +
                '}';
    }
}
