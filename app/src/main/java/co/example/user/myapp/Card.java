package co.example.user.myapp;


public class Card {
    String name;
    String date;
    String place;
    String category;
    String id;

    Card(String id, String name, String date, String place, String category) {
        this.name = name;
        this.date = date;
        this.place = place;
        this.category = category;
        this.id = id;
    }
}
