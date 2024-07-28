package com.skrn.dash;

public class Worker {
    private final String name;
    private final String description;
    private final String average_rating;
    private final String xp;
    private final String min_price;



    public Worker(String name, String description, String average_rating, String xp, String min_price) {
        this.name = name;
        this.description = description;
        this.average_rating = average_rating;
        this.xp = xp;
        this.min_price = min_price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public String getAverage_rating() {
        return average_rating;
    }
    public String getXp() {
        return xp;
    }
    public String getMin_price() {
        return min_price;
    }
}
