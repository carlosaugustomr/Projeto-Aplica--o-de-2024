package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_enum")
public class PgEnum {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "enumtypid", nullable = false)
    private String enumtypid;

    @Column(name = "enumsortorder", nullable = false)
    private Float enumsortorder;

/*
 TODO [Reverse Engineering] create field to map the 'enumlabel' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "enumlabel", columnDefinition = "name not null")
    private Object enumlabel;
*/
}