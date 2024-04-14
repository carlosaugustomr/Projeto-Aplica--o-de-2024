package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_trigger")
public class PgTrigger {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "tgrelid", nullable = false)
    private String tgrelid;

    @Lob
    @Column(name = "tgparentid", nullable = false)
    private String tgparentid;

    @Lob
    @Column(name = "tgfoid", nullable = false)
    private String tgfoid;

    @Column(name = "tgtype", nullable = false)
    private Short tgtype;

    @Column(name = "tgisinternal", nullable = false)
    private Boolean tgisinternal = false;

    @Lob
    @Column(name = "tgconstrrelid", nullable = false)
    private String tgconstrrelid;

    @Lob
    @Column(name = "tgconstrindid", nullable = false)
    private String tgconstrindid;

    @Lob
    @Column(name = "tgconstraint", nullable = false)
    private String tgconstraint;

    @Column(name = "tgdeferrable", nullable = false)
    private Boolean tgdeferrable = false;
    @Column(name = "tgnargs", nullable = false)
    private Short tgnargs;

    @Column(name = "tginitdeferred", nullable = false)
    private Boolean tginitdeferred = false;
    @Column(name = "tgargs", nullable = false)
    private byte[] tgargs;

/*
 TODO [Reverse Engineering] create field to map the 'tgname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "tgname", columnDefinition = "name not null")
    private Object tgname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'tgenabled' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "tgenabled", columnDefinition = ""char" not null")
    private Object tgenabled;
*/
/*
 TODO [Reverse Engineering] create field to map the 'tgattr' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "tgattr", columnDefinition = "int2vector not null")
    private Object tgattr;
*/
/*
 TODO [Reverse Engineering] create field to map the 'tgqual' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "tgqual", columnDefinition = "pg_node_tree")
    private Object tgqual;
*/
/*
 TODO [Reverse Engineering] create field to map the 'tgoldtable' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "tgoldtable", columnDefinition = "name")
    private Object tgoldtable;
*/
/*
 TODO [Reverse Engineering] create field to map the 'tgnewtable' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "tgnewtable", columnDefinition = "name")
    private Object tgnewtable;
*/
}