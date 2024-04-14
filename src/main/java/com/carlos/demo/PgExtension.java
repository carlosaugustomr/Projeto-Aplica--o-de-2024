package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pg_extension")
public class PgExtension {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "extowner", nullable = false)
    private String extowner;

    @Lob
    @Column(name = "extnamespace", nullable = false)
    private String extnamespace;

    @Column(name = "extrelocatable", nullable = false)
    private Boolean extrelocatable = false;

    @Column(name = "extversion", nullable = false, length = Integer.MAX_VALUE)
    private String extversion;

    @Column(name = "extconfig")
    private List<String> extconfig;
    @Column(name = "extcondition")
    private List<String> extcondition;

/*
 TODO [Reverse Engineering] create field to map the 'extname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "extname", columnDefinition = "name not null")
    private Object extname;
*/
}