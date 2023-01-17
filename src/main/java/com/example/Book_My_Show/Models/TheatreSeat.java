package com.example.Book_My_Show.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="theatre_seats")
@Data
@NoArgsConstructor
public class TheatreSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String seatNo;
    @Enumerated(value = EnumType.STRING)
    private String seatType;
    private int rate;

    @ManyToOne
    @JoinColumn
    private Theatre theatre;
}
