package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_collation")
public class PgCollation {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "collnamespace", nullable = false)
    private String collnamespace;

    @Lob
    @Column(name = "collowner", nullable = false)
    private String collowner;

    @Column(name = "collisdeterministic", nullable = false)
    private Boolean collisdeterministic = false;

    @Column(name = "collencoding", nullable = false)
    private Integer collencoding;

    @Column(name = "collcollate", length = Integer.MAX_VALUE)
    private String collcollate;

    @Column(name = "collctype", length = Integer.MAX_VALUE)
    private String collctype;
    @Column(name = "collicurules", length = Integer.MAX_VALUE)
    private String collicurules;

    @Column(name = "colliculocale", length = Integer.MAX_VALUE)
    private String colliculocale;
    @Column(name = "collversion", length = Integer.MAX_VALUE)
    private String collversion;

/*
 TODO [Reverse Engineering] create field to map the 'collname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "collname", columnDefinition = "name not null")
    private Object collname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'collprovider' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "collprovider", columnDefinition = ""char" not null")
    private Object collprovider;
*/
}