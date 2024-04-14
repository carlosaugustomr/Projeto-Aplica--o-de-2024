package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_am")
public class PgAm {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

/*
 TODO [Reverse Engineering] create field to map the 'amname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "amname", columnDefinition = "name not null")
    private Object amname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'amhandler' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "amhandler", columnDefinition = "regproc not null")
    private Object amhandler;
*/
/*
 TODO [Reverse Engineering] create field to map the 'amtype' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "amtype", columnDefinition = ""char" not null")
    private Object amtype;
*/
}