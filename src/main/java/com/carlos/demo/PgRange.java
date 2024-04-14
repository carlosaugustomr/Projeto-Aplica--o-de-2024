package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_range")
public class PgRange {
    @Id
    @Lob
    @Column(name = "rngtypid", nullable = false)
    private String rngtypid;

    @Lob
    @Column(name = "rngsubtype", nullable = false)
    private String rngsubtype;

    @Lob
    @Column(name = "rngmultitypid", nullable = false)
    private String rngmultitypid;

    @Lob
    @Column(name = "rngcollation", nullable = false)
    private String rngcollation;

    @Lob
    @Column(name = "rngsubopc", nullable = false)
    private String rngsubopc;

/*
 TODO [Reverse Engineering] create field to map the 'rngcanonical' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "rngcanonical", columnDefinition = "regproc not null")
    private Object rngcanonical;
*/
/*
 TODO [Reverse Engineering] create field to map the 'rngsubdiff' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "rngsubdiff", columnDefinition = "regproc not null")
    private Object rngsubdiff;
*/
}