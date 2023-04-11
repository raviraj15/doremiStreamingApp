package com.neosoft.DoReMi.entity;

public class VideoSubscriptionPlan extends SubscriptionPlan {
    private String name;
	private String category;
	private int price;
	private int durationInDays;

	public VideoSubscriptionPlan(String name, int price, int durationInDays) {
        this.name = name;
        this.category = "video";
        this.price = price;
        this.durationInDays = durationInDays;
	}  }