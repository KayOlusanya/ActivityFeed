package com.zone.innovation.activityfeed.resource;


import com.zone.innovation.activityfeed.dao.FeedRepository;
import com.zone.innovation.activityfeed.model.ActivityFeed;
import com.zone.innovation.activityfeed.model.Feed;
import com.zone.innovation.activityfeed.service.ActivityFeedService;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ActivityFeedController {

    @Autowired
    ActivityFeedService newService;
    
    @Autowired
    FeedRepository feedRepository;

    @GetMapping("/activityfeed/{customerid}")
    public @ResponseBody ActivityFeed getFeed(@PathVariable(name = "customerid") long customerId) {
        ActivityFeed feed = newService.getFeed(customerId);
        return feed;
    }
    
    @GetMapping("/activityfeed/")
    public @ResponseBody List<Feed> getFeed(){
    	List<Feed> feedList = new ArrayList<>();
    	feedRepository.findAll().forEach(feedList::add);
    	return feedList;
    }
}
