package com.example.myweatherbase.activities.model;

// Class obtained from https://json2csharp.com/code-converters/json-to-pojo
// and modified by adding Serializable interface

import com.example.myweatherbase.API.CallMethods;

import java.io.Serializable;
import java.util.ArrayList;

class Main implements Serializable{
    public double temp;
    public double feels_like;
    public double temp_min;
    public double temp_max;
    public int pressure;
    public int sea_level;
    public int grnd_level;
    public int humidity;
    public double temp_kf;
}

 class Weather implements Serializable{
    public int id;
    public String main;
    public String description;
    public String icon;

    public String getDescription() {
        return description;
    }
}

class Clouds implements Serializable{
    public int all;
}

class Wind implements Serializable{
    public double speed;
    public int deg;
    public double gust;
}

class Sys implements Serializable{
    public String pod;
}

class Rain implements Serializable{
    public double _3h;
}

class Coord implements Serializable{
    public double lat;
    public double lon;
}

class City implements Serializable {
    public int id;
    public String name;
    public Coord coord;
    public String country;
    public int population;
    public int timezone;
    public int sunrise;
    public int sunset;

    public String getName() {
        return name;
    }
}

public class Root implements Serializable {
    public String cod;
    public int message;
    public int cnt;
    public ArrayList<List> list;
    public City city;

    public String getCity(){
        return city.name;
    }
    public int getTimeZone(){
        return city.timezone;
    }

    public ArrayList<List> getList() {
        return list;
    }
    
}

