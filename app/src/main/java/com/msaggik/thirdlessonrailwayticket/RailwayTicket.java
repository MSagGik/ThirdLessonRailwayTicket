package com.msaggik.thirdlessonrailwayticket;

public class RailwayTicket {
    // задание полей сущности (её характеристик)
    private String departurePoint; // место отправления
    private String arrivalPoint; // место прибытия
    private String departureDate; // время отправления
    private String arrivalDate; // время прибытия
    private String travelTime; // время пути
    private int distance; // расстояние пути
    private float ticketPrice; // стоимость билета

    // создание пустого конструктора
    public RailwayTicket() {
    }

    // создание конструктора исходных данных
    public RailwayTicket(String departurePoint, String arrivalPoint, String departureDate, String travelTime, float ticketPrice) {
        this.departurePoint = departurePoint; // место отправления
        this.arrivalPoint = arrivalPoint; // место прибытия
        this.departureDate = departureDate; // время отправления
        this.travelTime = travelTime; // время пути
        this.ticketPrice = ticketPrice; // стоимость билета
    }

    // создание геттеров и сеттеров
    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public void setArrivalPoint(String arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    // переопределение метода toString()
    @Override
    public String toString() {
        return "Железнодорожный билет:" +
                " место отправления " + departurePoint +
                ", место прибытия " + arrivalPoint +
                ", дата отправления " + departureDate +
                ", время пути " + travelTime +
                ", стоимость билета " + ticketPrice + " монет";
    }
}
