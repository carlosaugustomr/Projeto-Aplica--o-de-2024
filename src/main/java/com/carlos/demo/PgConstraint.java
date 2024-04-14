package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pg_constraint")
public class PgConstraint {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "connamespace", nullable = false)
    private String connamespace;

    @Column(name = "condeferrable", nullable = false)
    private Boolean condeferrable = false;

    @Column(name = "condeferred", nullable = false)
    private Boolean condeferred = false;

    @Column(name = "convalidated", nullable = false)
    private Boolean convalidated = false;

    @Lob
    @Column(name = "conrelid", nullable = false)
    private String conrelid;

    @Lob
    @Column(name = "contypid", nullable = false)
    private String contypid;

    @Lob
    @Column(name = "conindid", nullable = false)
    private String conindid;

    @Lob
    @Column(name = "conparentid", nullable = false)
    private String conparentid;

    @Lob
    @Column(name = "confrelid", nullable = false)
    private String confrelid;

    @Column(name = "conislocal", nullable = false)
    private Boolean conislocal = false;
    @Column(name = "conpfeqop")
    private List<String> conpfeqop;

    @Column(name = "coninhcount", nullable = false)
    private Short coninhcount;
    @Column(name = "conppeqop")
    private List<String> conppeqop;

    @Column(name = "connoinherit", nullable = false)
    private Boolean connoinherit = false;
    @Column(name = "conffeqop")
    private List<String> conffeqop;

    @Column(name = "conkey")
    private List<Short> conkey;
    @Column(name = "confdelsetcols")
    private List<Short> confdelsetcols;

    @Column(name = "confkey")
    private List<Short> confkey;
    @Column(name = "conexclop")
    private List<String> conexclop;

/*
 TODO [Reverse Engineering] create field to map the 'conname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "conname", columnDefinition = "name not null")
    private Object conname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'contype' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "contype", columnDefinition = ""char" not null")
    private Object contype;
*/
/*
 TODO [Reverse Engineering] create field to map the 'confupdtype' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "confupdtype", columnDefinition = ""char" not null")
    private Object confupdtype;
*/
/*
 TODO [Reverse Engineering] create field to map the 'confdeltype' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "confdeltype", columnDefinition = ""char" not null")
    private Object confdeltype;
*/
/*
 TODO [Reverse Engineering] create field to map the 'confmatchtype' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "confmatchtype", columnDefinition = ""char" not null")
    private Object confmatchtype;
*/
/*
 TODO [Reverse Engineering] create field to map the 'conbin' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "conbin", columnDefinition = "pg_node_tree")
    private Object conbin;
*/
}