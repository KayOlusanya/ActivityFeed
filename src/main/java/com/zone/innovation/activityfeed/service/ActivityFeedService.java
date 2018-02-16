package com.zone.innovation.activityfeed.service;

import org.springframework.stereotype.Component;

import com.zone.innovation.activityfeed.model.ActivityFeed;

@Component
public class ActivityFeedService {
	

    public ActivityFeed getFeed(long customerID){
        return new ActivityFeed();
    }
}
