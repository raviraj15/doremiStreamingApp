package com.neosoft.DoReMi.entity;

public class PodcastSubscriptionPlan extends SubscriptionPlan {
    private String name;
	private String category;
	private int price;
	private int durationInDays;

	public PodcastSubscriptionPlan(String name, int price, int durationInDays) {
        this.name = name;
        this.category = "podcast";
        this.price = price;
        this.durationInDays = durationInDays;
    }
}