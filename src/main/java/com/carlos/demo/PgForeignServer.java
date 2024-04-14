package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pg_foreign_server")
public class PgForeignServer {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "srvowner", nullable = false)
    private String srvowner;

    @Lob
    @Column(name = "srvfdw", nullable = false)
    private String srvfdw;

    @Column(name = "srvtype", length = Integer.MAX_VALUE)
    private String srvtype;

    @Column(name = "srvversion", length = Integer.MAX_VALUE)
    private String srvversion;
    @Column(name = "srvoptions")
    private List<String> srvoptions;

/*
 TODO [Reverse Engineering] create field to map the 'srvname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "srvname", columnDefinition = "name not null")
    private Object srvname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'srvacl' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "srvacl", columnDefinition = "aclitem[]")
    private Object srvacl;
*/
}