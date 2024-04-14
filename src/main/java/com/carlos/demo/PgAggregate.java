package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_aggregate")
public class PgAggregate {
    @Id
    @Column(name = "aggfnoid", columnDefinition = "regproc not null")
    private Object id;

    @Column(name = "aggnumdirectargs", nullable = false)
    private Short aggnumdirectargs;
    @Column(name = "aggfinalextra", nullable = false)
    private Boolean aggfinalextra = false;

    @Column(name = "aggmfinalextra", nullable = false)
    private Boolean aggmfinalextra = false;

    @Lob
    @Column(name = "aggsortop", nullable = false)
    private String aggsortop;

    @Lob
    @Column(name = "aggtranstype", nullable = false)
    private String aggtranstype;

    @Column(name = "aggtransspace", nullable = false)
    private Integer aggtransspace;

    @Lob
    @Column(name = "aggmtranstype", nullable = false)
    private String aggmtranstype;

    @Column(name = "aggmtransspace", nullable = false)
    private Integer aggmtransspace;

    @Column(name = "agginitval", length = Integer.MAX_VALUE)
    private String agginitval;

    @Column(name = "aggminitval", length = Integer.MAX_VALUE)
    private String aggminitval;

/*
 TODO [Reverse Engineering] create field to map the 'aggkind' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "aggkind", columnDefinition = ""char" not null")
    private Object aggkind;
*/
/*
 TODO [Reverse Engineering] create field to map the 'aggtransfn' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "aggtransfn", columnDefinition = "regproc not null")
    private Object aggtransfn;
*/
/*
 TODO [Reverse Engineering] create field to map the 'aggfinalfn' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "aggfinalfn", columnDefinition = "regproc not null")
    private Object aggfinalfn;
*/
/*
 TODO [Reverse Engineering] create field to map the 'aggcombinefn' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "aggcombinefn", columnDefinition = "regproc not null")
    private Object aggcombinefn;
*/
/*
 TODO [Reverse Engineering] create field to map the 'aggserialfn' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "aggserialfn", columnDefinition = "regproc not null")
    private Object aggserialfn;
*/
/*
 TODO [Reverse Engineering] create field to map the 'aggdeserialfn' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "aggdeserialfn", columnDefinition = "regproc not null")
    private Object aggdeserialfn;
*/
/*
 TODO [Reverse Engineering] create field to map the 'aggmtransfn' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "aggmtransfn", columnDefinition = "regproc not null")
    private Object aggmtransfn;
*/
/*
 TODO [Reverse Engineering] create field to map the 'aggminvtransfn' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "aggminvtransfn", columnDefinition = "regproc not null")
    private Object aggminvtransfn;
*/
/*
 TODO [Reverse Engineering] create field to map the 'aggmfinalfn' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "aggmfinalfn", columnDefinition = "regproc not null")
    private Object aggmfinalfn;
*/
/*
 TODO [Reverse Engineering] create field to map the 'aggfinalmodify' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "aggfinalmodify", columnDefinition = ""char" not null")
    private Object aggfinalmodify;
*/
/*
 TODO [Reverse Engineering] create field to map the 'aggmfinalmodify' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "aggmfinalmodify", columnDefinition = ""char" not null")
    private Object aggmfinalmodify;
*/
}