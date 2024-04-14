package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_attrdef")
public class PgAttrdef {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "adrelid", nullable = false)
    private String adrelid;

    @Column(name = "adnum", nullable = false)
    private Short adnum;

/*
 TODO [Reverse Engineering] create field to map the 'adbin' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "adbin", columnDefinition = "pg_node_tree not null")
    private Object adbin;
*/
}