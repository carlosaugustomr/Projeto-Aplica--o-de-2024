package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pg_proc")
public class PgProc {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "pronamespace", nullable = false)
    private String pronamespace;

    @Lob
    @Column(name = "proowner", nullable = false)
    private String proowner;

    @Lob
    @Column(name = "prolang", nullable = false)
    private String prolang;

    @Column(name = "procost", nullable = false)
    private Float procost;

    @Column(name = "prorows", nullable = false)
    private Float prorows;

    @Lob
    @Column(name = "provariadic", nullable = false)
    private String provariadic;

    @Column(name = "prosecdef", nullable = false)
    private Boolean prosecdef = false;

    @Column(name = "proleakproof", nullable = false)
    private Boolean proleakproof = false;

    @Column(name = "proisstrict", nullable = false)
    private Boolean proisstrict = false;

    @Column(name = "proretset", nullable = false)
    private Boolean proretset = false;

    @Column(name = "proallargtypes")
    private List<String> proallargtypes;

    @Column(name = "proargnames")
    private List<String> proargnames;

    @Column(name = "pronargs", nullable = false)
    private Short pronargs;
    @Column(name = "protrftypes")
    private List<String> protrftypes;

    @Column(name = "pronargdefaults", nullable = false)
    private Short pronargdefaults;
    @Column(name = "prosrc", nullable = false, length = Integer.MAX_VALUE)
    private String prosrc;

    @Lob
    @Column(name = "prorettype", nullable = false)
    private String prorettype;
    @Column(name = "probin", length = Integer.MAX_VALUE)
    private String probin;

    @Column(name = "proconfig")
    private List<String> proconfig;

/*
 TODO [Reverse Engineering] create field to map the 'proname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "proname", columnDefinition = "name not null")
    private Object proname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'prosupport' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "prosupport", columnDefinition = "regproc not null")
    private Object prosupport;
*/
/*
 TODO [Reverse Engineering] create field to map the 'prokind' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "prokind", columnDefinition = ""char" not null")
    private Object prokind;
*/
/*
 TODO [Reverse Engineering] create field to map the 'provolatile' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "provolatile", columnDefinition = ""char" not null")
    private Object provolatile;
*/
/*
 TODO [Reverse Engineering] create field to map the 'proparallel' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "proparallel", columnDefinition = ""char" not null")
    private Object proparallel;
*/
/*
 TODO [Reverse Engineering] create field to map the 'proargtypes' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "proargtypes", columnDefinition = "oidvector not null")
    private Object proargtypes;
*/
/*
 TODO [Reverse Engineering] create field to map the 'proargmodes' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "proargmodes", columnDefinition = ""char"[]")
    private Object proargmodes;
*/
/*
 TODO [Reverse Engineering] create field to map the 'proargdefaults' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "proargdefaults", columnDefinition = "pg_node_tree")
    private Object proargdefaults;
*/
/*
 TODO [Reverse Engineering] create field to map the 'prosqlbody' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "prosqlbody", columnDefinition = "pg_node_tree")
    private Object prosqlbody;
*/
/*
 TODO [Reverse Engineering] create field to map the 'proacl' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "proacl", columnDefinition = "aclitem[]")
    private Object proacl;
*/
}