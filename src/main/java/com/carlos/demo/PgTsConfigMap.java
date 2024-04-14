package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_ts_config_map")
public class PgTsConfigMap {
    @EmbeddedId
    private PgTsConfigMapId id;

    @Lob
    @Column(name = "mapdict", nullable = false)
    private String mapdict;

}