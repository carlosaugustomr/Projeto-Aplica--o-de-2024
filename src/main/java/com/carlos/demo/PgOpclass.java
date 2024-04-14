package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_opclass")
public class PgOpclass {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "opcmethod", nullable = false)
    private String opcmethod;

    @Lob
    @Column(name = "opcnamespace", nullable = false)
    private String opcnamespace;

    @Lob
    @Column(name = "opcowner", nullable = false)
    private String opcowner;

    @Lob
    @Column(name = "opcfamily", nullable = false)
    private String opcfamily;

    @Lob
    @Column(name = "opcintype", nullable = false)
    private String opcintype;

    @Column(name = "opcdefault", nullable = false)
    private Boolean opcdefault = false;
    @Lob
    @Column(name = "opckeytype", nullable = false)
    private String opckeytype;

/*
 TODO [Reverse Engineering] create field to map the 'opcname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "opcname", columnDefinition = "name not null")
    private Object opcname;
*/
}