package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pg_statistic")
public class PgStatistic {
    @EmbeddedId
    private PgStatisticId id;

    @Column(name = "stanullfrac", nullable = false)
    private Float stanullfrac;

    @Column(name = "stawidth", nullable = false)
    private Integer stawidth;

    @Column(name = "stadistinct", nullable = false)
    private Float stadistinct;

    @Column(name = "stakind1", nullable = false)
    private Short stakind1;

    @Column(name = "stakind2", nullable = false)
    private Short stakind2;

    @Column(name = "stakind3", nullable = false)
    private Short stakind3;

    @Column(name = "stakind4", nullable = false)
    private Short stakind4;

    @Column(name = "stakind5", nullable = false)
    private Short stakind5;

    @Lob
    @Column(name = "staop1", nullable = false)
    private String staop1;

    @Lob
    @Column(name = "staop2", nullable = false)
    private String staop2;

    @Lob
    @Column(name = "staop3", nullable = false)
    private String staop3;

    @Lob
    @Column(name = "staop4", nullable = false)
    private String staop4;

    @Lob
    @Column(name = "staop5", nullable = false)
    private String staop5;

    @Lob
    @Column(name = "stacoll1", nullable = false)
    private String stacoll1;

    @Lob
    @Column(name = "stacoll2", nullable = false)
    private String stacoll2;

    @Lob
    @Column(name = "stacoll3", nullable = false)
    private String stacoll3;

    @Lob
    @Column(name = "stacoll4", nullable = false)
    private String stacoll4;

    @Lob
    @Column(name = "stacoll5", nullable = false)
    private String stacoll5;

    @Column(name = "stanumbers1")
    private List<Float> stanumbers1;

    @Column(name = "stanumbers2")
    private List<Float> stanumbers2;

    @Column(name = "stanumbers3")
    private List<Float> stanumbers3;

    @Column(name = "stanumbers4")
    private List<Float> stanumbers4;

    @Column(name = "stanumbers5")
    private List<Float> stanumbers5;

/*
 TODO [Reverse Engineering] create field to map the 'stavalues1' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "stavalues1", columnDefinition = "anyarray")
    private Object stavalues1;
*/
/*
 TODO [Reverse Engineering] create field to map the 'stavalues2' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "stavalues2", columnDefinition = "anyarray")
    private Object stavalues2;
*/
/*
 TODO [Reverse Engineering] create field to map the 'stavalues3' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "stavalues3", columnDefinition = "anyarray")
    private Object stavalues3;
*/
/*
 TODO [Reverse Engineering] create field to map the 'stavalues4' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "stavalues4", columnDefinition = "anyarray")
    private Object stavalues4;
*/
/*
 TODO [Reverse Engineering] create field to map the 'stavalues5' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "stavalues5", columnDefinition = "anyarray")
    private Object stavalues5;
*/
}