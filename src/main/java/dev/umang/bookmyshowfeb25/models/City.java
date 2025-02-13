package dev.umang.bookmyshowfeb25.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class City extends BaseModel{
    private String name;
    @OneToMany(mappedBy = "city")
    private List<Theatre> theatres;
}

/*
City Theatre => 1 : M
1      M
1      1
 */
