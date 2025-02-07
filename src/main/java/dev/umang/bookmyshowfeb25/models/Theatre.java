package dev.umang.bookmyshowfeb25.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel{
    private String name;
    @OneToMany
    private List<Screen> screens;
    @ManyToOne
    private City city;
}

/*
City Theatre => 1 : M
Theatre City => M : 1

Theatre Screen
1       M
1        1
 */