package com.carlos.demo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_init_privs")
public class PgInitPriv {
    @EmbeddedId
    private PgInitPrivId id;

/*
 TODO [Reverse Engineering] create field to map the 'privtype' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "privtype", columnDefinition = ""char" not null")
    private Object privtype;
*/
/*
 TODO [Reverse Engineering] create field to map the 'initprivs' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "initprivs", columnDefinition = "aclitem[] not null")
    private Object initprivs;
*/
}