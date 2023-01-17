package com.example.Book_My_Show.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="shows")
@Data
@NoArgsConstructor
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate showDate;
    private LocalDate showTime;
    @CreationTimestamp
    private Date createdOn;
    @CreationTimestamp
    private Date updatedOn;

    @ManyToOne
    @JoinColumn
    private Movie movie;

    @ManyToOne
    @JoinColumn
    private Theatre theatre;

    @OneToMany(mappedBy = "show",cascade = CascadeType.ALL)
    private List<ShowSeats> listOfSeats;

    @OneToMany(mappedBy = "show",cascade =CascadeType.ALL)
    private List<Ticket> listOfTickets;

}
