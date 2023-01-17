package com.example.Book_My_Show.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="theatre")
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String city;
    private String address;

    // List of shows
    @OneToMany(mappedBy = "theatre",cascade = CascadeType.ALL)
    private List<Show> listOfShows;

    // List of theatreSeats
    @OneToMany(mappedBy = "theatre",cascade = CascadeType.ALL)
    List<TheatreSeat> theatreSeatList;
}
