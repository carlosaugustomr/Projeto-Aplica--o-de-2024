package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pg_user_mapping")
public class PgUserMapping {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "umuser", nullable = false)
    private String umuser;

    @Lob
    @Column(name = "umserver", nullable = false)
    private String umserver;

    @Column(name = "umoptions")
    private List<String> umoptions;

}