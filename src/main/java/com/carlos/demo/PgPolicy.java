package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pg_policy")
public class PgPolicy {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "polrelid", nullable = false)
    private String polrelid;
    @Column(name = "polpermissive", nullable = false)
    private Boolean polpermissive = false;

    @Column(name = "polroles", nullable = false)
    private List<String> polroles;

/*
 TODO [Reverse Engineering] create field to map the 'polname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "polname", columnDefinition = "name not null")
    private Object polname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'polcmd' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "polcmd", columnDefinition = ""char" not null")
    private Object polcmd;
*/
/*
 TODO [Reverse Engineering] create field to map the 'polqual' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "polqual", columnDefinition = "pg_node_tree")
    private Object polqual;
*/
/*
 TODO [Reverse Engineering] create field to map the 'polwithcheck' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "polwithcheck", columnDefinition = "pg_node_tree")
    private Object polwithcheck;
*/
}