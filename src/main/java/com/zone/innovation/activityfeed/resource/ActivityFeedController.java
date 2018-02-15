package com.zone.innovation.activityfeed.resource;


import com.zone.innovation.activityfeed.model.ActivityFeed;
import com.zone.innovation.activityfeed.service.ActivityFeedService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ActivityFeedController {

    @RequestMapping(method=RequestMethod.GET )
    public @ResponseBody ActivityFeed getFeed() {
        ActivityFeedService newService = new ActivityFeedService();
        ActivityFeed feed = newService.getFeed(1);
        return feed;
    }
}
