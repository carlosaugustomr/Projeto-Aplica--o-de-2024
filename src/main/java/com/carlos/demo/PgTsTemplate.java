package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_ts_template")
public class PgTsTemplate {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "tmplnamespace", nullable = false)
    private String tmplnamespace;

/*
 TODO [Reverse Engineering] create field to map the 'tmplname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "tmplname", columnDefinition = "name not null")
    private Object tmplname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'tmplinit' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "tmplinit", columnDefinition = "regproc not null")
    private Object tmplinit;
*/
/*
 TODO [Reverse Engineering] create field to map the 'tmpllexize' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "tmpllexize", columnDefinition = "regproc not null")
    private Object tmpllexize;
*/
}