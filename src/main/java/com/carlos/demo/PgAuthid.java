package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "pg_authid")
public class PgAuthid {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Column(name = "rolsuper", nullable = false)
    private Boolean rolsuper = false;

    @Column(name = "rolinherit", nullable = false)
    private Boolean rolinherit = false;

    @Column(name = "rolcreaterole", nullable = false)
    private Boolean rolcreaterole = false;

    @Column(name = "rolcreatedb", nullable = false)
    private Boolean rolcreatedb = false;

    @Column(name = "rolcanlogin", nullable = false)
    private Boolean rolcanlogin = false;

    @Column(name = "rolreplication", nullable = false)
    private Boolean rolreplication = false;

    @Column(name = "rolbypassrls", nullable = false)
    private Boolean rolbypassrls = false;

    @Column(name = "rolconnlimit", nullable = false)
    private Integer rolconnlimit;

    @Column(name = "rolpassword", length = Integer.MAX_VALUE)
    private String rolpassword;
    @Column(name = "rolvaliduntil")
    private OffsetDateTime rolvaliduntil;

/*
 TODO [Reverse Engineering] create field to map the 'rolname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "rolname", columnDefinition = "name not null")
    private Object rolname;
*/
}