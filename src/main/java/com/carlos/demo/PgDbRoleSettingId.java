package com.carlos.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class PgDbRoleSettingId implements java.io.Serializable {
    private static final long serialVersionUID = 6716562911543379290L;
    @Lob
    @Column(name = "setdatabase", nullable = false)
    private String setdatabase;

    @Lob
    @Column(name = "setrole", nullable = false)
    private String setrole;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PgDbRoleSettingId entity = (PgDbRoleSettingId) o;
        return Objects.equals(this.setrole, entity.setrole) &&
                Objects.equals(this.setdatabase, entity.setdatabase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setrole, setdatabase);
    }

}