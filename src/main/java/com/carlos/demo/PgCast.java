package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_cast")
public class PgCast {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "castsource", nullable = false)
    private String castsource;

    @Lob
    @Column(name = "casttarget", nullable = false)
    private String casttarget;

    @Lob
    @Column(name = "castfunc", nullable = false)
    private String castfunc;

/*
 TODO [Reverse Engineering] create field to map the 'castcontext' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "castcontext", columnDefinition = ""char" not null")
    private Object castcontext;
*/
/*
 TODO [Reverse Engineering] create field to map the 'castmethod' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "castmethod", columnDefinition = ""char" not null")
    private Object castmethod;
*/
}