package com.yuyeon.helloshop.domain.item;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("A")
public class Album extends Item {

    private String artist;
    private String etc;

}
