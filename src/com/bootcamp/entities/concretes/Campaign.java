package com.bootcamp.entities.concretes;

import com.bootcamp.entities.abstracts.Entity;

public class Campaign implements Entity {
    private Integer Id;
    private String campaignName;
    private Double campaignDiscount;

    public Campaign(Integer id, String campaignName, Double campaignDiscount) {
        Id = id;
        this.campaignName = campaignName;
        this.campaignDiscount = campaignDiscount;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public Double getCampaignDiscount() {
        return campaignDiscount;
    }

    public void setCampaignDiscount(Double campaignDiscount) {
        this.campaignDiscount = campaignDiscount;
    }
}
