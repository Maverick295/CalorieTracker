package com.calorietracker.entity;

import jakarta.persistence.*;

@Entity
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int calories;

    private int proteins;

    private int fats;

    private int carbs;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", updatable = false, insertable = false)
    private User user;

    @Column(name = "user_id")
    private Long userId;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Dish setName(String name) {
        this.name = name;
        return this;
    }

    public int getCalories() {
        return calories;
    }

    public Dish setCalories(int calories) {
        this.calories = calories;
        return this;
    }

    public int getProteins() {
        return proteins;
    }

    public Dish setProteins(int proteins) {
        this.proteins = proteins;
        return this;
    }

    public int getFats() {
        return fats;
    }

    public Dish setFats(int fats) {
        this.fats = fats;
        return this;
    }

    public int getCarbs() {
        return carbs;
    }

    public Dish setCarbs(int carbs) {
        this.carbs = carbs;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Dish setUser(User user) {
        this.user = user;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public Dish setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
}
