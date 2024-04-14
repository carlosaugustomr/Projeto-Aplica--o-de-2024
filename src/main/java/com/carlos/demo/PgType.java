package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_type")
public class PgType {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "typnamespace", nullable = false)
    private String typnamespace;

    @Lob
    @Column(name = "typowner", nullable = false)
    private String typowner;

    @Column(name = "typlen", nullable = false)
    private Short typlen;

    @Column(name = "typbyval", nullable = false)
    private Boolean typbyval = false;

    @Column(name = "typispreferred", nullable = false)
    private Boolean typispreferred = false;

    @Column(name = "typisdefined", nullable = false)
    private Boolean typisdefined = false;

    @Column(name = "typnotnull", nullable = false)
    private Boolean typnotnull = false;

    @Lob
    @Column(name = "typrelid", nullable = false)
    private String typrelid;
    @Lob
    @Column(name = "typbasetype", nullable = false)
    private String typbasetype;

    @Column(name = "typtypmod", nullable = false)
    private Integer typtypmod;

    @Lob
    @Column(name = "typelem", nullable = false)
    private String typelem;
    @Column(name = "typndims", nullable = false)
    private Integer typndims;

    @Lob
    @Column(name = "typarray", nullable = false)
    private String typarray;
    @Lob
    @Column(name = "typcollation", nullable = false)
    private String typcollation;

    @Column(name = "typdefault", length = Integer.MAX_VALUE)
    private String typdefault;

/*
 TODO [Reverse Engineering] create field to map the 'typname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "typname", columnDefinition = "name not null")
    private Object typname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'typtype' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "typtype", columnDefinition = ""char" not null")
    private Object typtype;
*/
/*
 TODO [Reverse Engineering] create field to map the 'typcategory' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "typcategory", columnDefinition = ""char" not null")
    private Object typcategory;
*/
/*
 TODO [Reverse Engineering] create field to map the 'typdelim' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "typdelim", columnDefinition = ""char" not null")
    private Object typdelim;
*/
/*
 TODO [Reverse Engineering] create field to map the 'typsubscript' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "typsubscript", columnDefinition = "regproc not null")
    private Object typsubscript;
*/
/*
 TODO [Reverse Engineering] create field to map the 'typinput' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "typinput", columnDefinition = "regproc not null")
    private Object typinput;
*/
/*
 TODO [Reverse Engineering] create field to map the 'typoutput' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "typoutput", columnDefinition = "regproc not null")
    private Object typoutput;
*/
/*
 TODO [Reverse Engineering] create field to map the 'typreceive' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "typreceive", columnDefinition = "regproc not null")
    private Object typreceive;
*/
/*
 TODO [Reverse Engineering] create field to map the 'typsend' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "typsend", columnDefinition = "regproc not null")
    private Object typsend;
*/
/*
 TODO [Reverse Engineering] create field to map the 'typmodin' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "typmodin", columnDefinition = "regproc not null")
    private Object typmodin;
*/
/*
 TODO [Reverse Engineering] create field to map the 'typmodout' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "typmodout", columnDefinition = "regproc not null")
    private Object typmodout;
*/
/*
 TODO [Reverse Engineering] create field to map the 'typanalyze' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "typanalyze", columnDefinition = "regproc not null")
    private Object typanalyze;
*/
/*
 TODO [Reverse Engineering] create field to map the 'typalign' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "typalign", columnDefinition = ""char" not null")
    private Object typalign;
*/
/*
 TODO [Reverse Engineering] create field to map the 'typstorage' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "typstorage", columnDefinition = ""char" not null")
    private Object typstorage;
*/
/*
 TODO [Reverse Engineering] create field to map the 'typdefaultbin' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "typdefaultbin", columnDefinition = "pg_node_tree")
    private Object typdefaultbin;
*/
/*
 TODO [Reverse Engineering] create field to map the 'typacl' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "typacl", columnDefinition = "aclitem[]")
    private Object typacl;
*/
}