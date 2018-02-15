package com.zone.innovation.activityfeed.resource;


import com.zone.innovation.activityfeed.model.ActivityFeed;
import com.zone.innovation.activityfeed.service.ActivityFeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ActivityFeedController {

    @Autowired
    ActivityFeedService newService;

    @GetMapping("/activityfeed/{customerid}")
    public @ResponseBody ActivityFeed getFeed(@PathVariable(name = "customerid") long customerId) {
        ActivityFeed feed = newService.getFeed(customerId);
        return feed;
    }
}
