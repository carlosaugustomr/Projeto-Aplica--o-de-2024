package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_transform")
public class PgTransform {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "trftype", nullable = false)
    private String trftype;

    @Lob
    @Column(name = "trflang", nullable = false)
    private String trflang;

/*
 TODO [Reverse Engineering] create field to map the 'trffromsql' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "trffromsql", columnDefinition = "regproc not null")
    private Object trffromsql;
*/
/*
 TODO [Reverse Engineering] create field to map the 'trftosql' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "trftosql", columnDefinition = "regproc not null")
    private Object trftosql;
*/
}