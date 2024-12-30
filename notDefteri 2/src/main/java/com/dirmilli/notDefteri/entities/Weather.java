package com.dirmilli.notDefteri.entities;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "weather")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weather {
    
    
@Id
@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
private long id;

@Column(name = "description")
private String description;
}
