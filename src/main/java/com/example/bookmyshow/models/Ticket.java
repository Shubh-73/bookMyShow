package com.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
public class Ticket extends BaseModel {

    private int amount;
    private Date bookingTime;
    @ManyToOne
    private User bookedBy;
    @ManyToOne
    private Show show;

    @ManyToMany
    private List<Seat> seats;

    @OneToMany(mappedBy = "ticket")
    private List<Payment> payments;

    @Enumerated(EnumType.ORDINAL)
    private TicketStatus ticketStatus;
}
