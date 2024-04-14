package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pg_subscription")
public class PgSubscription {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "subdbid", nullable = false)
    private String subdbid;

    @Lob
    @Column(name = "subowner", nullable = false)
    private String subowner;

    @Column(name = "subenabled", nullable = false)
    private Boolean subenabled = false;

    @Column(name = "subbinary", nullable = false)
    private Boolean subbinary = false;

    @Column(name = "subconninfo", nullable = false, length = Integer.MAX_VALUE)
    private String subconninfo;

    @Column(name = "subdisableonerr", nullable = false)
    private Boolean subdisableonerr = false;
    @Column(name = "subsynccommit", nullable = false, length = Integer.MAX_VALUE)
    private String subsynccommit;

    @Column(name = "subpasswordrequired", nullable = false)
    private Boolean subpasswordrequired = false;
    @Column(name = "subpublications", nullable = false)
    private List<String> subpublications;

    @Column(name = "subrunasowner", nullable = false)
    private Boolean subrunasowner = false;
    @Column(name = "suborigin", length = Integer.MAX_VALUE)
    private String suborigin;

/*
 TODO [Reverse Engineering] create field to map the 'subskiplsn' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "subskiplsn", columnDefinition = "pg_lsn not null")
    private Object subskiplsn;
*/
/*
 TODO [Reverse Engineering] create field to map the 'subname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "subname", columnDefinition = "name not null")
    private Object subname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'substream' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "substream", columnDefinition = ""char" not null")
    private Object substream;
*/
/*
 TODO [Reverse Engineering] create field to map the 'subtwophasestate' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "subtwophasestate", columnDefinition = ""char" not null")
    private Object subtwophasestate;
*/
/*
 TODO [Reverse Engineering] create field to map the 'subslotname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "subslotname", columnDefinition = "name")
    private Object subslotname;
*/
}