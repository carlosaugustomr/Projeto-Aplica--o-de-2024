package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_publication")
public class PgPublication {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "pubowner", nullable = false)
    private String pubowner;

    @Column(name = "puballtables", nullable = false)
    private Boolean puballtables = false;

    @Column(name = "pubinsert", nullable = false)
    private Boolean pubinsert = false;

    @Column(name = "pubupdate", nullable = false)
    private Boolean pubupdate = false;

    @Column(name = "pubdelete", nullable = false)
    private Boolean pubdelete = false;

    @Column(name = "pubtruncate", nullable = false)
    private Boolean pubtruncate = false;
    @Column(name = "pubviaroot", nullable = false)
    private Boolean pubviaroot = false;

/*
 TODO [Reverse Engineering] create field to map the 'pubname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "pubname", columnDefinition = "name not null")
    private Object pubname;
*/
}