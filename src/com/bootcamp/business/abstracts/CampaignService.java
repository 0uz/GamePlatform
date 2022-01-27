package com.bootcamp.business.abstracts;

import com.bootcamp.entities.concretes.Campaign;
import com.bootcamp.entities.concretes.User;

public interface CampaignService {
    void save(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);
}
