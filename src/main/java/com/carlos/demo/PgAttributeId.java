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
public class PgAttributeId implements java.io.Serializable {
    private static final long serialVersionUID = -3163393443291172851L;
    @Lob
    @Column(name = "attrelid", nullable = false)
    private String attrelid;

    @Column(name = "attnum", nullable = false)
    private Short attnum;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PgAttributeId entity = (PgAttributeId) o;
        return Objects.equals(this.attnum, entity.attnum) &&
                Objects.equals(this.attrelid, entity.attrelid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attnum, attrelid);
    }

}