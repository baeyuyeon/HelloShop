package com.yuyeon.helloshop.domain;

import jakarta.persistence.MappedSuperclass;
import java.util.Date;
import lombok.Data;

@MappedSuperclass
@Data
public class BaseEntity {

    private Date createDate;
    private Date lastModifiedDate;

}
