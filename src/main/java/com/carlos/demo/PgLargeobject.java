package com.carlos.demo;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_largeobject")
public class PgLargeobject {
    @EmbeddedId
    private PgLargeobjectId id;

    @Column(name = "data", nullable = false)
    private byte[] data;

}