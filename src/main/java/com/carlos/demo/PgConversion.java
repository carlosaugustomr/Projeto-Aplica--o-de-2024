package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_conversion")
public class PgConversion {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "connamespace", nullable = false)
    private String connamespace;

    @Lob
    @Column(name = "conowner", nullable = false)
    private String conowner;

    @Column(name = "conforencoding", nullable = false)
    private Integer conforencoding;

    @Column(name = "contoencoding", nullable = false)
    private Integer contoencoding;
    @Column(name = "condefault", nullable = false)
    private Boolean condefault = false;

/*
 TODO [Reverse Engineering] create field to map the 'conname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "conname", columnDefinition = "name not null")
    private Object conname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'conproc' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "conproc", columnDefinition = "regproc not null")
    private Object conproc;
*/
}