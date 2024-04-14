package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_ts_dict")
public class PgTsDict {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "dictnamespace", nullable = false)
    private String dictnamespace;

    @Lob
    @Column(name = "dictowner", nullable = false)
    private String dictowner;

    @Lob
    @Column(name = "dicttemplate", nullable = false)
    private String dicttemplate;
    @Column(name = "dictinitoption", length = Integer.MAX_VALUE)
    private String dictinitoption;

/*
 TODO [Reverse Engineering] create field to map the 'dictname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "dictname", columnDefinition = "name not null")
    private Object dictname;
*/
}