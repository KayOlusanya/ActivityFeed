package com.zone.innovation.activityfeed.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zone.innovation.activityfeed.model.Feed;

@Repository
public interface FeedRepository extends CrudRepository<Feed,Long>{

}
