package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_ts_parser")
public class PgTsParser {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "prsnamespace", nullable = false)
    private String prsnamespace;

/*
 TODO [Reverse Engineering] create field to map the 'prsname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "prsname", columnDefinition = "name not null")
    private Object prsname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'prsstart' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "prsstart", columnDefinition = "regproc not null")
    private Object prsstart;
*/
/*
 TODO [Reverse Engineering] create field to map the 'prstoken' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "prstoken", columnDefinition = "regproc not null")
    private Object prstoken;
*/
/*
 TODO [Reverse Engineering] create field to map the 'prsend' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "prsend", columnDefinition = "regproc not null")
    private Object prsend;
*/
/*
 TODO [Reverse Engineering] create field to map the 'prsheadline' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "prsheadline", columnDefinition = "regproc not null")
    private Object prsheadline;
*/
/*
 TODO [Reverse Engineering] create field to map the 'prslextype' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "prslextype", columnDefinition = "regproc not null")
    private Object prslextype;
*/
}