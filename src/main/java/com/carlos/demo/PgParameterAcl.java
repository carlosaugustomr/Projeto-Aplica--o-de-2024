package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_parameter_acl")
public class PgParameterAcl {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Column(name = "parname", nullable = false, length = Integer.MAX_VALUE)
    private String parname;

/*
 TODO [Reverse Engineering] create field to map the 'paracl' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "paracl", columnDefinition = "aclitem[]")
    private Object paracl;
*/
}