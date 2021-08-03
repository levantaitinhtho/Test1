package com.java.basic.main;

class Date {
    private int day;
    private int month;
    private int year;
    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year ;
    }
    public void  setDate(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year =  year;
    }
    public void setDay(int day){
        this.day=day;
    }
    public int getDay(){
        return day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public void display(){
        String day = this.day + "";
        String month = this.month + "";
        String year = this.year + "";
        if(day.length()==1){
            day="0"+day;
        }
        if(month.length()==1){
            month="0"+ month;
        }
        System.out.println(day + "/" + month + "/" +year);
    }

    public static void main(String[] args) {
        Date d = new Date (22,9,2002);
        d.display();
        d.setDate(1,1,1010);
        d.display();
        d.setMonth(3);
        d.display();
        d.setDate(2,2,2020);
        d.display();
        d.setYear(2002);
        d.display();
    }
}