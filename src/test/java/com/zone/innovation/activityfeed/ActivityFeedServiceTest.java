package com.zone.innovation.activityfeed;

import com.zone.innovation.activityfeed.dao.FeedRepository;
import com.zone.innovation.activityfeed.model.Feed;
import com.zone.innovation.activityfeed.service.ActivityFeedService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ActivityFeedServiceTest {


    @MockBean
    private FeedRepository feedRepo;

    @Autowired
    ActivityFeedService activityFeedService;


    @Test
    public void testGetFeedById() {
        Feed aNewOne = new Feed();
        aNewOne.setTitle("this title");
        List<Feed> aNewFeedList = new ArrayList<Feed>();
        aNewFeedList.add(aNewOne);
        when(feedRepo.findAll()).thenReturn(aNewFeedList);
        List<Feed> feeds = activityFeedService.getFeeds(1);
        assertNotNull(feeds);
        assertTrue(feeds.size() == 1);
        Feed aFeed = feeds.get(0);
        assertEquals("this title",aFeed.getTitle());
    }
}
