package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_database")
public class PgDatabase {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "datdba", nullable = false)
    private String datdba;

    @Column(name = "encoding", nullable = false)
    private Integer encoding;

    @Column(name = "datistemplate", nullable = false)
    private Boolean datistemplate = false;

    @Column(name = "datallowconn", nullable = false)
    private Boolean datallowconn = false;

    @Column(name = "datconnlimit", nullable = false)
    private Integer datconnlimit;

    @Column(name = "datctype", nullable = false, length = Integer.MAX_VALUE)
    private String datctype;

    @Column(name = "daticulocale", length = Integer.MAX_VALUE)
    private String daticulocale;

    @Lob
    @Column(name = "dattablespace", nullable = false)
    private String dattablespace;
    @Column(name = "daticurules", length = Integer.MAX_VALUE)
    private String daticurules;

    @Column(name = "datcollate", nullable = false, length = Integer.MAX_VALUE)
    private String datcollate;
    @Column(name = "datcollversion", length = Integer.MAX_VALUE)
    private String datcollversion;

/*
 TODO [Reverse Engineering] create field to map the 'datname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "datname", columnDefinition = "name not null")
    private Object datname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'datlocprovider' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "datlocprovider", columnDefinition = ""char" not null")
    private Object datlocprovider;
*/
/*
 TODO [Reverse Engineering] create field to map the 'datfrozenxid' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "datfrozenxid", columnDefinition = "xid not null")
    private Object datfrozenxid;
*/
/*
 TODO [Reverse Engineering] create field to map the 'datminmxid' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "datminmxid", columnDefinition = "xid not null")
    private Object datminmxid;
*/
/*
 TODO [Reverse Engineering] create field to map the 'datacl' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "datacl", columnDefinition = "aclitem[]")
    private Object datacl;
*/
}