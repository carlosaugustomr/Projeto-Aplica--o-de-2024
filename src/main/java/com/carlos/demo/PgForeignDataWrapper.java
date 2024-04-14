package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pg_foreign_data_wrapper")
public class PgForeignDataWrapper {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "fdwowner", nullable = false)
    private String fdwowner;

    @Lob
    @Column(name = "fdwhandler", nullable = false)
    private String fdwhandler;

    @Lob
    @Column(name = "fdwvalidator", nullable = false)
    private String fdwvalidator;
    @Column(name = "fdwoptions")
    private List<String> fdwoptions;

/*
 TODO [Reverse Engineering] create field to map the 'fdwname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "fdwname", columnDefinition = "name not null")
    private Object fdwname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'fdwacl' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "fdwacl", columnDefinition = "aclitem[]")
    private Object fdwacl;
*/
}