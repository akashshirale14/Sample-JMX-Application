package com.jmx.sample;
public interface PlayerMBean {
    public String getName();
    public void setName(String name);
    public void setSalary(Double salary);
    public Double getSalary();
    public void setClubName(String clubName);
    public String getClubName();
    public void doBestMove();
}
