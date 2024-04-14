package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_default_acl")
public class PgDefaultAcl {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "defaclrole", nullable = false)
    private String defaclrole;

    @Lob
    @Column(name = "defaclnamespace", nullable = false)
    private String defaclnamespace;

/*
 TODO [Reverse Engineering] create field to map the 'defaclobjtype' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "defaclobjtype", columnDefinition = ""char" not null")
    private Object defaclobjtype;
*/
/*
 TODO [Reverse Engineering] create field to map the 'defaclacl' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "defaclacl", columnDefinition = "aclitem[] not null")
    private Object defaclacl;
*/
}