package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_partitioned_table")
public class PgPartitionedTable {
    @Id
    @Lob
    @Column(name = "partrelid", nullable = false)
    private String partrelid;

    @Column(name = "partnatts", nullable = false)
    private Short partnatts;
    @Lob
    @Column(name = "partdefid", nullable = false)
    private String partdefid;

/*
 TODO [Reverse Engineering] create field to map the 'partstrat' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "partstrat", columnDefinition = ""char" not null")
    private Object partstrat;
*/
/*
 TODO [Reverse Engineering] create field to map the 'partattrs' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "partattrs", columnDefinition = "int2vector not null")
    private Object partattrs;
*/
/*
 TODO [Reverse Engineering] create field to map the 'partclass' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "partclass", columnDefinition = "oidvector not null")
    private Object partclass;
*/
/*
 TODO [Reverse Engineering] create field to map the 'partcollation' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "partcollation", columnDefinition = "oidvector not null")
    private Object partcollation;
*/
/*
 TODO [Reverse Engineering] create field to map the 'partexprs' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "partexprs", columnDefinition = "pg_node_tree")
    private Object partexprs;
*/
}