package com.example.Book_My_Show.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String mobile;
    @CreationTimestamp
    @Temporal(value =TemporalType.TIMESTAMP)
    private Data createdOn;
    @CreationTimestamp
    @Temporal(value =TemporalType.TIMESTAMP)
    private Date updatedOn;

    @OneToMany(mappedBy = "ticket",cascade = CascadeType.ALL)
    private List<Ticket> listOfTickets;

}
