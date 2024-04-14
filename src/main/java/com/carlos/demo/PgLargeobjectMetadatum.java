package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_largeobject_metadata")
public class PgLargeobjectMetadatum {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "lomowner", nullable = false)
    private String lomowner;

/*
 TODO [Reverse Engineering] create field to map the 'lomacl' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "lomacl", columnDefinition = "aclitem[]")
    private Object lomacl;
*/
}