package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_ts_config")
public class PgTsConfig {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "cfgnamespace", nullable = false)
    private String cfgnamespace;

    @Lob
    @Column(name = "cfgowner", nullable = false)
    private String cfgowner;
    @Lob
    @Column(name = "cfgparser", nullable = false)
    private String cfgparser;

/*
 TODO [Reverse Engineering] create field to map the 'cfgname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "cfgname", columnDefinition = "name not null")
    private Object cfgname;
*/
}