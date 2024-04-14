package com.carlos.demo;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pg_db_role_setting")
public class PgDbRoleSetting {
    @EmbeddedId
    private PgDbRoleSettingId id;

    @Column(name = "setconfig")
    private List<String> setconfig;

}