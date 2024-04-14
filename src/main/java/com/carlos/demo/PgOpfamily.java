package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_opfamily")
public class PgOpfamily {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "opfmethod", nullable = false)
    private String opfmethod;

    @Lob
    @Column(name = "opfnamespace", nullable = false)
    private String opfnamespace;
    @Lob
    @Column(name = "opfowner", nullable = false)
    private String opfowner;

/*
 TODO [Reverse Engineering] create field to map the 'opfname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "opfname", columnDefinition = "name not null")
    private Object opfname;
*/
}