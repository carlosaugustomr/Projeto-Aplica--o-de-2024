package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_index")
public class PgIndex {
    @Id
    @Lob
    @Column(name = "indexrelid", nullable = false)
    private String indexrelid;

    @Lob
    @Column(name = "indrelid", nullable = false)
    private String indrelid;

    @Column(name = "indnatts", nullable = false)
    private Short indnatts;

    @Column(name = "indnkeyatts", nullable = false)
    private Short indnkeyatts;

    @Column(name = "indisunique", nullable = false)
    private Boolean indisunique = false;

    @Column(name = "indnullsnotdistinct", nullable = false)
    private Boolean indnullsnotdistinct = false;

    @Column(name = "indisprimary", nullable = false)
    private Boolean indisprimary = false;

    @Column(name = "indisexclusion", nullable = false)
    private Boolean indisexclusion = false;

    @Column(name = "indimmediate", nullable = false)
    private Boolean indimmediate = false;

    @Column(name = "indisclustered", nullable = false)
    private Boolean indisclustered = false;

    @Column(name = "indisvalid", nullable = false)
    private Boolean indisvalid = false;

    @Column(name = "indcheckxmin", nullable = false)
    private Boolean indcheckxmin = false;

    @Column(name = "indisready", nullable = false)
    private Boolean indisready = false;

    @Column(name = "indislive", nullable = false)
    private Boolean indislive = false;

    @Column(name = "indisreplident", nullable = false)
    private Boolean indisreplident = false;

/*
 TODO [Reverse Engineering] create field to map the 'indkey' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "indkey", columnDefinition = "int2vector not null")
    private Object indkey;
*/
/*
 TODO [Reverse Engineering] create field to map the 'indcollation' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "indcollation", columnDefinition = "oidvector not null")
    private Object indcollation;
*/
/*
 TODO [Reverse Engineering] create field to map the 'indclass' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "indclass", columnDefinition = "oidvector not null")
    private Object indclass;
*/
/*
 TODO [Reverse Engineering] create field to map the 'indoption' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "indoption", columnDefinition = "int2vector not null")
    private Object indoption;
*/
/*
 TODO [Reverse Engineering] create field to map the 'indexprs' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "indexprs", columnDefinition = "pg_node_tree")
    private Object indexprs;
*/
/*
 TODO [Reverse Engineering] create field to map the 'indpred' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "indpred", columnDefinition = "pg_node_tree")
    private Object indpred;
*/
}