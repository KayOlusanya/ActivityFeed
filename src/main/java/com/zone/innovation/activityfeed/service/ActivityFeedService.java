package com.zone.innovation.activityfeed.service;

import com.zone.innovation.activityfeed.model.ActivityFeed;
import org.springframework.stereotype.Component;

public class ActivityFeedService {


    public ActivityFeed getFeed(long customerID){
        return new ActivityFeed();
    }
}
