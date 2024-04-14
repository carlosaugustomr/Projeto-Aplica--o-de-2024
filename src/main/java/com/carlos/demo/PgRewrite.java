package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_rewrite")
public class PgRewrite {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "ev_class", nullable = false)
    private String evClass;
    @Column(name = "is_instead", nullable = false)
    private Boolean isInstead = false;

/*
 TODO [Reverse Engineering] create field to map the 'rulename' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "rulename", columnDefinition = "name not null")
    private Object rulename;
*/
/*
 TODO [Reverse Engineering] create field to map the 'ev_type' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "ev_type", columnDefinition = ""char" not null")
    private Object evType;
*/
/*
 TODO [Reverse Engineering] create field to map the 'ev_enabled' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "ev_enabled", columnDefinition = ""char" not null")
    private Object evEnabled;
*/
/*
 TODO [Reverse Engineering] create field to map the 'ev_qual' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "ev_qual", columnDefinition = "pg_node_tree not null")
    private Object evQual;
*/
/*
 TODO [Reverse Engineering] create field to map the 'ev_action' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "ev_action", columnDefinition = "pg_node_tree not null")
    private Object evAction;
*/
}