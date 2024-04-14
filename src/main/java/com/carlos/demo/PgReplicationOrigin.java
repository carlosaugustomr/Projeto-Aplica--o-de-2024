package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_replication_origin")
public class PgReplicationOrigin {
    @Id
    @Lob
    @Column(name = "roident", nullable = false)
    private String roident;

    @Column(name = "roname", nullable = false, length = Integer.MAX_VALUE)
    private String roname;

}