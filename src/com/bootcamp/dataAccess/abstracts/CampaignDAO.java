package com.bootcamp.dataAccess.abstracts;


import com.bootcamp.entities.concretes.Campaign;

public interface CampaignDAO {
    void save(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);
}
