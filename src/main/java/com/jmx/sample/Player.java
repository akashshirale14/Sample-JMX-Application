package com.jmx.sample;

public class Player implements PlayerMBean{

    String bestMove = "Dribbling";
    String name;
    String club;
    double salary = 1000D;
    public Player(String name, String club) {
        this.name = name;
        this.club = club;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setClubName(String clubName) {
        this.club = clubName;
    }

    public String getClubName() {
        return club;
    }

    public void doBestMove() {
        System.out.println(bestMove + " " + name + " " + club + " " + salary);
    }
}
