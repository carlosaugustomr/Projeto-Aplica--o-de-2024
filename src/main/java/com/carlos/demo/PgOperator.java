package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_operator")
public class PgOperator {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "oprnamespace", nullable = false)
    private String oprnamespace;

    @Lob
    @Column(name = "oprowner", nullable = false)
    private String oprowner;

    @Column(name = "oprcanmerge", nullable = false)
    private Boolean oprcanmerge = false;

    @Column(name = "oprcanhash", nullable = false)
    private Boolean oprcanhash = false;

    @Lob
    @Column(name = "oprleft", nullable = false)
    private String oprleft;

    @Lob
    @Column(name = "oprright", nullable = false)
    private String oprright;
    @Lob
    @Column(name = "oprcom", nullable = false)
    private String oprcom;

    @Lob
    @Column(name = "oprresult", nullable = false)
    private String oprresult;
    @Lob
    @Column(name = "oprnegate", nullable = false)
    private String oprnegate;

/*
 TODO [Reverse Engineering] create field to map the 'oprname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "oprname", columnDefinition = "name not null")
    private Object oprname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'oprkind' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "oprkind", columnDefinition = ""char" not null")
    private Object oprkind;
*/
/*
 TODO [Reverse Engineering] create field to map the 'oprcode' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "oprcode", columnDefinition = "regproc not null")
    private Object oprcode;
*/
/*
 TODO [Reverse Engineering] create field to map the 'oprrest' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "oprrest", columnDefinition = "regproc not null")
    private Object oprrest;
*/
/*
 TODO [Reverse Engineering] create field to map the 'oprjoin' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "oprjoin", columnDefinition = "regproc not null")
    private Object oprjoin;
*/
}