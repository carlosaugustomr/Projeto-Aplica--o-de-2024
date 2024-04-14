package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_statistic_ext")
public class PgStatisticExt {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "stxrelid", nullable = false)
    private String stxrelid;

    @Lob
    @Column(name = "stxnamespace", nullable = false)
    private String stxnamespace;

    @Lob
    @Column(name = "stxowner", nullable = false)
    private String stxowner;
    @Column(name = "stxstattarget", nullable = false)
    private Integer stxstattarget;

/*
 TODO [Reverse Engineering] create field to map the 'stxname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "stxname", columnDefinition = "name not null")
    private Object stxname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'stxkeys' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "stxkeys", columnDefinition = "int2vector not null")
    private Object stxkeys;
*/
/*
 TODO [Reverse Engineering] create field to map the 'stxkind' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "stxkind", columnDefinition = ""char"[] not null")
    private Object stxkind;
*/
/*
 TODO [Reverse Engineering] create field to map the 'stxexprs' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "stxexprs", columnDefinition = "pg_node_tree")
    private Object stxexprs;
*/
}