package com.bootcamp.entities.concretes;

import com.bootcamp.entities.abstracts.Entity;

import java.time.LocalDate;

public class Game implements Entity {
    private Integer Id;
    private String name;
    private Genre genre;
    private Integer point;
    private LocalDate releaseYear;
    private Double price;
    private Campaign campaign;

    public Game(Integer id, String name, Genre genre, Integer point, LocalDate releaseYear, Double price) {
        Id = id;
        this.name = name;
        this.genre = genre;
        this.point = point;
        this.releaseYear = releaseYear;
        this.price = price;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public LocalDate getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(LocalDate releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCampaign(Campaign campaign) {
        price *=1-(campaign.getCampaignDiscount()/100);
        System.out.println("Campaign applied to "+name+", new price is "+price.intValue());
    }
}
