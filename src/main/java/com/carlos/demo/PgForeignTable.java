package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pg_foreign_table")
public class PgForeignTable {
    @Id
    @Lob
    @Column(name = "ftrelid", nullable = false)
    private String ftrelid;

    @Lob
    @Column(name = "ftserver", nullable = false)
    private String ftserver;

    @Column(name = "ftoptions")
    private List<String> ftoptions;

}