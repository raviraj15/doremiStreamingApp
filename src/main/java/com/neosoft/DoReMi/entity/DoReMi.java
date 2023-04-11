package com.neosoft.DoReMi.entity;

public class DoReMi {

    // Constants for the subscription plan prices
    private static final double MUSIC_FREE_PRICE = 0.0;
    private static final double MUSIC_PERSONAL_PRICE = 100.0;
    private static final double MUSIC_PREMIUM_PRICE = 250.0;
    private static final double VIDEO_FREE_PRICE = 0.0;
    private static final double VIDEO_PERSONAL_PRICE = 200.0;
    private static final double VIDEO_PREMIUM_PRICE = 500.0;
    private static final double PODCAST_FREE_PRICE = 0.0;
    private static final double PODCAST_PERSONAL_PRICE = 100.0;
    private static final double PODCAST_PREMIUM_PRICE = 300.0;
    
    // Constants for the top-up prices
    private static final double FOUR_DEVICE_PRICE = 50.0;
    private static final double TEN_DEVICE_PRICE = 100.0;
    
    // User's subscription plans
    private static String musicPlan;
    private static String videoPlan;
    private static String podcastPlan;
    
    // User's top-up subscription
    private static String topUpPlan;
    
    // Number of devices that the user can stream on
    private static int numDevices = 1;
    
    public static void main(String[] args) {
        
        // Sample user choices for plans and top-up
        musicPlan = "PREMIUM";
        videoPlan = "PERSONAL";
        podcastPlan = "FREE";
        topUpPlan = "FOUR_DEVICE";
        
        // Print user's choices
        System.out.println("User's subscription plans:");
        System.out.println("Music: " + musicPlan);
        System.out.println("Video: " + videoPlan);
        System.out.println("Podcast: " + podcastPlan);
        System.out.println("Top-up: " + topUpPlan);
        
        // Calculate total cost and number of devices
        double totalCost = calculateCost();
        System.out.println("Total cost: Rs." + totalCost);
        System.out.println("Number of devices: " + numDevices);
    }
    
    private static double calculateCost() {
        double cost = 0.0;
        cost += getMusicPlanPrice();
        cost += getVideoPlanPrice();
        cost += getPodcastPlanPrice();
       
        return cost;
    }
    
   

	private static double getMusicPlanPrice() {
        switch (musicPlan) {
            case "FREE":
                return MUSIC_FREE_PRICE;
            case "PERSONAL":
                return MUSIC_PERSONAL_PRICE;
            case "PREMIUM":
                return MUSIC_PREMIUM_PRICE;
            default:
                System.out.println("Invalid music plan selected");
                return 0.0;
        }
    }
    
    private static double getVideoPlanPrice() {
        switch (videoPlan) {
            case "FREE":
                return VIDEO_FREE_PRICE;
            case "PERSONAL":
                return VIDEO_PERSONAL_PRICE;
            case "PREMIUM":
                return VIDEO_PREMIUM_PRICE;
            default:
                System.out.println("Invalid video plan selected");
                return 0.0;
        }
    }
    
    private static double getPodcastPlanPrice() {
        switch (podcastPlan) {
            case "FREE":
                return PODCAST_FREE_PRICE;
            case "PERSONAL":
                return PODCAST_PERSONAL_PRICE;
            case "PREMIUM":
                return PODCAST_PREMIUM_PRICE;
            default:
                System.out.println("Invalid podcast plan selected");
                return 0.0;
        }
    }
}