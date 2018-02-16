package com.zone.innovation.activityfeed.service;

import com.zone.innovation.activityfeed.dao.FeedRepository;
import com.zone.innovation.activityfeed.model.Feed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zone.innovation.activityfeed.model.ActivityFeed;

import java.util.ArrayList;
import java.util.List;

@Component
public class ActivityFeedService {


    @Autowired
    FeedRepository feedRepository;

    public ActivityFeed getFeed(long customerID){List<Feed> feedList = new ArrayList<>();
        return new ActivityFeed();
    }

    public List<Feed> getFeeds(long customerID){
        List<Feed> feedList = new ArrayList<Feed>();
        feedRepository.findAll().forEach(feedList::add);
        return feedList;
    }
}
