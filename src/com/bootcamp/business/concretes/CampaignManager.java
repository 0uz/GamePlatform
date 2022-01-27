package com.bootcamp.business.concretes;

import com.bootcamp.business.abstracts.CampaignService;
import com.bootcamp.dataAccess.abstracts.CampaignDAO;
import com.bootcamp.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {
    private CampaignDAO campaignDAO;

    public CampaignManager(CampaignDAO campaignDAO) {
        this.campaignDAO = campaignDAO;
    }

    @Override
    public void save(Campaign campaign) {
        campaignDAO.save(campaign);
    }

    @Override
    public void update(Campaign campaign) {
        campaignDAO.update(campaign);
    }

    @Override
    public void delete(Campaign campaign) {
        campaignDAO.delete(campaign);
    }
}
