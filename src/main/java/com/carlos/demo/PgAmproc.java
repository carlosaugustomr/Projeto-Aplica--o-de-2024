package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_amproc")
public class PgAmproc {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "amprocfamily", nullable = false)
    private String amprocfamily;

    @Lob
    @Column(name = "amproclefttype", nullable = false)
    private String amproclefttype;

    @Lob
    @Column(name = "amprocrighttype", nullable = false)
    private String amprocrighttype;

    @Column(name = "amprocnum", nullable = false)
    private Short amprocnum;

/*
 TODO [Reverse Engineering] create field to map the 'amproc' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "amproc", columnDefinition = "regproc not null")
    private Object amproc;
*/
}