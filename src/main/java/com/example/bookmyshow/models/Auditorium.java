package com.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{

    int audiNumber;
    @OneToMany
    private List<Seat> seats;

    @Enumerated(EnumType.STRING)
            @ElementCollection
    List<TheatreFeature> theatreFeatures;
}
