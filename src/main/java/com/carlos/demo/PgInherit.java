package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_inherits")
public class PgInherit {
    @EmbeddedId
    private PgInheritId id;

    @Lob
    @Column(name = "inhparent", nullable = false)
    private String inhparent;

    @Column(name = "inhdetachpending", nullable = false)
    private Boolean inhdetachpending = false;

}