package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pg_class")
public class PgClass {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "relnamespace", nullable = false)
    private String relnamespace;

    @Lob
    @Column(name = "reltype", nullable = false)
    private String reltype;

    @Lob
    @Column(name = "reloftype", nullable = false)
    private String reloftype;

    @Lob
    @Column(name = "relowner", nullable = false)
    private String relowner;

    @Lob
    @Column(name = "relam", nullable = false)
    private String relam;

    @Lob
    @Column(name = "relfilenode", nullable = false)
    private String relfilenode;

    @Lob
    @Column(name = "reltablespace", nullable = false)
    private String reltablespace;

    @Column(name = "relpages", nullable = false)
    private Integer relpages;

    @Column(name = "reltuples", nullable = false)
    private Float reltuples;

    @Column(name = "relallvisible", nullable = false)
    private Integer relallvisible;

    @Lob
    @Column(name = "reltoastrelid", nullable = false)
    private String reltoastrelid;

    @Column(name = "relhasindex", nullable = false)
    private Boolean relhasindex = false;

    @Column(name = "relisshared", nullable = false)
    private Boolean relisshared = false;

    @Column(name = "relnatts", nullable = false)
    private Short relnatts;

    @Column(name = "relchecks", nullable = false)
    private Short relchecks;

    @Column(name = "relhasrules", nullable = false)
    private Boolean relhasrules = false;

    @Column(name = "relhastriggers", nullable = false)
    private Boolean relhastriggers = false;

    @Column(name = "relhassubclass", nullable = false)
    private Boolean relhassubclass = false;

    @Column(name = "relrowsecurity", nullable = false)
    private Boolean relrowsecurity = false;
    @Column(name = "relispartition", nullable = false)
    private Boolean relispartition = false;

    @Column(name = "relforcerowsecurity", nullable = false)
    private Boolean relforcerowsecurity = false;
    @Lob
    @Column(name = "relrewrite", nullable = false)
    private String relrewrite;

    @Column(name = "relispopulated", nullable = false)
    private Boolean relispopulated = false;
    @Column(name = "reloptions")
    private List<String> reloptions;

/*
 TODO [Reverse Engineering] create field to map the 'relname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "relname", columnDefinition = "name not null")
    private Object relname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'relpersistence' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "relpersistence", columnDefinition = ""char" not null")
    private Object relpersistence;
*/
/*
 TODO [Reverse Engineering] create field to map the 'relkind' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "relkind", columnDefinition = ""char" not null")
    private Object relkind;
*/
/*
 TODO [Reverse Engineering] create field to map the 'relreplident' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "relreplident", columnDefinition = ""char" not null")
    private Object relreplident;
*/
/*
 TODO [Reverse Engineering] create field to map the 'relfrozenxid' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "relfrozenxid", columnDefinition = "xid not null")
    private Object relfrozenxid;
*/
/*
 TODO [Reverse Engineering] create field to map the 'relminmxid' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "relminmxid", columnDefinition = "xid not null")
    private Object relminmxid;
*/
/*
 TODO [Reverse Engineering] create field to map the 'relacl' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "relacl", columnDefinition = "aclitem[]")
    private Object relacl;
*/
/*
 TODO [Reverse Engineering] create field to map the 'relpartbound' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "relpartbound", columnDefinition = "pg_node_tree")
    private Object relpartbound;
*/
}