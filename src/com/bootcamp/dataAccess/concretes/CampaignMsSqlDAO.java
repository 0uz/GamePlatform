package com.bootcamp.dataAccess.concretes;

import com.bootcamp.dataAccess.abstracts.CampaignDAO;
import com.bootcamp.entities.concretes.Campaign;
import com.bootcamp.entities.concretes.User;

public class CampaignMsSqlDAO implements CampaignDAO{
    @Override
    public void save(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" saved to MsSql");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" updated to MsSql");

    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" deleted to MsSql");

    }
}
