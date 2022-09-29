package com.company.Summative1AssessmentAguadzeMichael.models;

import java.util.Objects;

public class Quote {
    private int id;

    private String author;

    private String quote;

    public Quote(int id, String author, String quote) {
        this.id = id;
        this.author = author;
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quote)) return false;
        Quote quote1 = (Quote) o;
        return getAuthor().equals(quote1.getAuthor()) && getQuote().equals(quote1.getQuote());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor(), getQuote());
    }

}

