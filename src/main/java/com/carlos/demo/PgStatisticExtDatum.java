package com.carlos.demo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_statistic_ext_data")
public class PgStatisticExtDatum {
    @EmbeddedId
    private PgStatisticExtDatumId id;

/*
 TODO [Reverse Engineering] create field to map the 'stxdndistinct' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "stxdndistinct", columnDefinition = "pg_ndistinct")
    private Object stxdndistinct;
*/
/*
 TODO [Reverse Engineering] create field to map the 'stxddependencies' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "stxddependencies", columnDefinition = "pg_dependencies")
    private Object stxddependencies;
*/
/*
 TODO [Reverse Engineering] create field to map the 'stxdmcv' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "stxdmcv", columnDefinition = "pg_mcv_list")
    private Object stxdmcv;
*/
/*
 TODO [Reverse Engineering] create field to map the 'stxdexpr' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "stxdexpr", columnDefinition = "pg_statistic[]")
    private Object stxdexpr;
*/
}