package com.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@EntityListeners({AuditingEntityListener.class})
public class BaseModel {

    @Id
    long id;

    @CreatedDate
    @Temporal(TemporalType.TIME)
    Date createdAt;

    @LastModifiedDate
    @Temporal(TemporalType.TIME)
    Date modifiedAt;
}
