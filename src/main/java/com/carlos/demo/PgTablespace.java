package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pg_tablespace")
public class PgTablespace {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "spcowner", nullable = false)
    private String spcowner;
    @Column(name = "spcoptions")
    private List<String> spcoptions;

/*
 TODO [Reverse Engineering] create field to map the 'spcname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "spcname", columnDefinition = "name not null")
    private Object spcname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'spcacl' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "spcacl", columnDefinition = "aclitem[]")
    private Object spcacl;
*/
}