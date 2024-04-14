package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_publication_namespace")
public class PgPublicationNamespace {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "pnpubid", nullable = false)
    private String pnpubid;

    @Lob
    @Column(name = "pnnspid", nullable = false)
    private String pnnspid;

}