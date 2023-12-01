package com.example.demoCalendly.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty(message = "Title could not be empty")
    @Column(name = "title")
    private String title;

    @NotEmpty(message = "Description could not be empty.")
    @Column(name = "description")
    private String description;

    @NotEmpty(message = "Duration could not be empty or zero.")
    @Column(name = "duration")
    private Integer duration;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User host;




}
