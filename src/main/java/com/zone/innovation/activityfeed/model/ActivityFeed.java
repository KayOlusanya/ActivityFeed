package com.zone.innovation.activityfeed.model;

import java.util.List;

public class ActivityFeed {
    private Long id;
    private String description;
    private Long customerId;
    //private List<Transaction> transactions;

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

    public List<Transaction> getTransactions() {
        return null;
    }

    public void setTransactions(List<Transaction> transactions) {
       // this.transactions = transactions;
    }
}
