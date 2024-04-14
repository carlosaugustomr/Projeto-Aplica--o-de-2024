package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_publication_rel")
public class PgPublicationRel {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "prpubid", nullable = false)
    private String prpubid;

    @Lob
    @Column(name = "prrelid", nullable = false)
    private String prrelid;

/*
 TODO [Reverse Engineering] create field to map the 'prqual' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "prqual", columnDefinition = "pg_node_tree")
    private Object prqual;
*/
/*
 TODO [Reverse Engineering] create field to map the 'prattrs' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "prattrs", columnDefinition = "int2vector")
    private Object prattrs;
*/
}