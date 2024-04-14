package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_namespace")
public class PgNamespace {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "nspowner", nullable = false)
    private String nspowner;

/*
 TODO [Reverse Engineering] create field to map the 'nspname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "nspname", columnDefinition = "name not null")
    private Object nspname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'nspacl' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "nspacl", columnDefinition = "aclitem[]")
    private Object nspacl;
*/
}