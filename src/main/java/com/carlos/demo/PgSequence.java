package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_sequence")
public class PgSequence {
    @Id
    @Lob
    @Column(name = "seqrelid", nullable = false)
    private String seqrelid;

    @Lob
    @Column(name = "seqtypid", nullable = false)
    private String seqtypid;

    @Column(name = "seqstart", nullable = false)
    private Long seqstart;

    @Column(name = "seqincrement", nullable = false)
    private Long seqincrement;

    @Column(name = "seqmax", nullable = false)
    private Long seqmax;

    @Column(name = "seqmin", nullable = false)
    private Long seqmin;

    @Column(name = "seqcache", nullable = false)
    private Long seqcache;

    @Column(name = "seqcycle", nullable = false)
    private Boolean seqcycle = false;

}