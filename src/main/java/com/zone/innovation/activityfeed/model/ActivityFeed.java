package com.zone.innovation.activityfeed.model;

import java.util.List;

public class ActivityFeed {
    private Long id;
    private String description;
    private Long customerId;
    private List<Feed> transactions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public List<Feed> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Feed> transactions) {
       this.transactions = transactions;
    }
}
