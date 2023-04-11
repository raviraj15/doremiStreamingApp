package com.neosoft.DoReMi.entity;

public class MusicSubscriptionPlan extends SubscriptionPlan {
    private String name;
	private String category;
	private int price;
	private int durationInDays;

	public MusicSubscriptionPlan(String name, int price, int durationInDays) {
        this.name = name;
        this.category = "music";
        this.price = price;
        this.durationInDays = durationInDays;
    }
}