package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_language")
public class PgLanguage {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "lanowner", nullable = false)
    private String lanowner;

    @Column(name = "lanispl", nullable = false)
    private Boolean lanispl = false;

    @Column(name = "lanpltrusted", nullable = false)
    private Boolean lanpltrusted = false;

    @Lob
    @Column(name = "lanplcallfoid", nullable = false)
    private String lanplcallfoid;

    @Lob
    @Column(name = "laninline", nullable = false)
    private String laninline;
    @Lob
    @Column(name = "lanvalidator", nullable = false)
    private String lanvalidator;

/*
 TODO [Reverse Engineering] create field to map the 'lanname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "lanname", columnDefinition = "name not null")
    private Object lanname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'lanacl' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "lanacl", columnDefinition = "aclitem[]")
    private Object lanacl;
*/
}