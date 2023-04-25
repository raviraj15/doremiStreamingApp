package com.neosoft.DoReMi.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SubscriptionReminder {

	   // Define constants for subscription plans and top ups
    private static final String FREE = "Free";
    private static final String PERSONAL = "Personal";
    private static final String PREMIUM = "Premium";
    private static final String FOUR_DEVICE = "Four Device";
    private static final String TEN_DEVICE = "Ten Device";
    private static final int FREE_MUSIC_COST = 0;
    private static final int PERSONAL_MUSIC_COST = 100;
    private static final int PREMIUM_MUSIC_COST = 250;
    private static final int FREE_VIDEO_COST = 0;
    private static final int PERSONAL_VIDEO_COST = 200;
    private static final int PREMIUM_VIDEO_COST = 500;
    private static final int FREE_PODCAST_COST = 0;
    private static final int PERSONAL_PODCAST_COST = 100;
    private static final int PREMIUM_PODCAST_COST = 300;
    private static final int FOUR_DEVICE_COST = 50;
    private static final int TEN_DEVICE_COST = 100;
    
    public static void main(String[] args) {
        // Define subscription start date
        LocalDate subscriptionStartDate = LocalDate.of(2023, 4, 25);
        
        // Calculate reminder dates and total renewal cost for each subscription category
        LocalDate musicReminderDate = subscriptionStartDate.plus(21, ChronoUnit.DAYS);
        int musicRenewalCost = PREMIUM_MUSIC_COST;
        LocalDate videoReminderDate = subscriptionStartDate.plus(21, ChronoUnit.DAYS);
        int videoRenewalCost = PREMIUM_VIDEO_COST;
        LocalDate podcastReminderDate = subscriptionStartDate.plus(21, ChronoUnit.DAYS);
        int podcastRenewalCost = PREMIUM_PODCAST_COST;
        LocalDate topUpReminderDate = subscriptionStartDate.plus(21, ChronoUnit.DAYS);
        int topUpRenewalCost = 0;
        
        // Apply top up based on user's choice
        String selectedTopUp = FOUR_DEVICE;
        if (selectedTopUp.equals(FOUR_DEVICE)) {
            musicRenewalCost += FOUR_DEVICE_COST;
            videoRenewalCost += FOUR_DEVICE_COST;
            podcastRenewalCost += FOUR_DEVICE_COST;
            topUpRenewalCost = FOUR_DEVICE_COST;
        } else if (selectedTopUp.equals(TEN_DEVICE)) {
            musicRenewalCost += TEN_DEVICE_COST;
            videoRenewalCost += TEN_DEVICE_COST;
            podcastRenewalCost += TEN_DEVICE_COST;
            topUpRenewalCost = TEN_DEVICE_COST;
        }
        
        // Print reminder dates and total renewal cost for each subscription category
        System.out.println("Music subscription reminder: " + musicReminderDate);
        System.out.println("Music renewal cost: Rs." + musicRenewalCost);
        System.out.println("Video subscription reminder: " + videoReminderDate);
        System.out.println("Video renewal cost: Rs." + videoRenewalCost);
        System.out.println("Podcast subscription reminder: " + podcastReminderDate);
        System.out.println("Podcast renewal cost: Rs." + podcastRenewalCost);
        System.out.println("Top up reminder date: " + topUpReminderDate);
        System.out.println("Top up renewal cost: Rs." + topUpRenewalCost);
        System.out.println("Total renewal cost: Rs." + (musicRenewalCost + videoRenewalCost + podcastRenewalCost + topUpRenewalCost));
    }
}
