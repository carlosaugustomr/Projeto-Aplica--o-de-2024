package com.carlos.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_depend")
public class PgDepend {
    @Lob
    @Column(name = "classid", nullable = false)
    private String classid;

    @Lob
    @Column(name = "objid", nullable = false)
    private String objid;

    @Column(name = "objsubid", nullable = false)
    private Integer objsubid;

    @Lob
    @Column(name = "refclassid", nullable = false)
    private String refclassid;

    @Lob
    @Column(name = "refobjid", nullable = false)
    private String refobjid;

    @Column(name = "refobjsubid", nullable = false)
    private Integer refobjsubid;

/*
 TODO [Reverse Engineering] create field to map the 'deptype' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "deptype", columnDefinition = ""char" not null")
    private Object deptype;
*/
}