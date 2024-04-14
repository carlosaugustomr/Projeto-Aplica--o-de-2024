package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pg_attribute")
public class PgAttribute {
    @EmbeddedId
    private PgAttributeId id;

    @Lob
    @Column(name = "atttypid", nullable = false)
    private String atttypid;

    @Column(name = "attlen", nullable = false)
    private Short attlen;

    @Column(name = "attcacheoff", nullable = false)
    private Integer attcacheoff;

    @Column(name = "atttypmod", nullable = false)
    private Integer atttypmod;

    @Column(name = "attndims", nullable = false)
    private Short attndims;

    @Column(name = "attbyval", nullable = false)
    private Boolean attbyval = false;

    @Column(name = "attnotnull", nullable = false)
    private Boolean attnotnull = false;
    @Column(name = "attislocal", nullable = false)
    private Boolean attislocal = false;

    @Column(name = "atthasdef", nullable = false)
    private Boolean atthasdef = false;
    @Column(name = "attinhcount", nullable = false)
    private Short attinhcount;

    @Column(name = "atthasmissing", nullable = false)
    private Boolean atthasmissing = false;
    @Column(name = "attstattarget", nullable = false)
    private Short attstattarget;

    @Lob
    @Column(name = "attcollation", nullable = false)
    private String attcollation;

    @Column(name = "attoptions")
    private List<String> attoptions;

    @Column(name = "attisdropped", nullable = false)
    private Boolean attisdropped = false;
    @Column(name = "attfdwoptions")
    private List<String> attfdwoptions;

/*
 TODO [Reverse Engineering] create field to map the 'attname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "attname", columnDefinition = "name not null")
    private Object attname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'attalign' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "attalign", columnDefinition = ""char" not null")
    private Object attalign;
*/
/*
 TODO [Reverse Engineering] create field to map the 'attstorage' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "attstorage", columnDefinition = ""char" not null")
    private Object attstorage;
*/
/*
 TODO [Reverse Engineering] create field to map the 'attcompression' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "attcompression", columnDefinition = ""char" not null")
    private Object attcompression;
*/
/*
 TODO [Reverse Engineering] create field to map the 'attidentity' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "attidentity", columnDefinition = ""char" not null")
    private Object attidentity;
*/
/*
 TODO [Reverse Engineering] create field to map the 'attgenerated' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "attgenerated", columnDefinition = ""char" not null")
    private Object attgenerated;
*/
/*
 TODO [Reverse Engineering] create field to map the 'attacl' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "attacl", columnDefinition = "aclitem[]")
    private Object attacl;
*/
/*
 TODO [Reverse Engineering] create field to map the 'attmissingval' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "attmissingval", columnDefinition = "anyarray")
    private Object attmissingval;
*/
}