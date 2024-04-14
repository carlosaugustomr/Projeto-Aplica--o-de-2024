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
public class PgStatisticExtDatumId implements java.io.Serializable {
    private static final long serialVersionUID = -1971804436866864650L;
    @Lob
    @Column(name = "stxoid", nullable = false)
    private String stxoid;

    @Column(name = "stxdinherit", nullable = false)
    private Boolean stxdinherit = false;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PgStatisticExtDatumId entity = (PgStatisticExtDatumId) o;
        return Objects.equals(this.stxdinherit, entity.stxdinherit) &&
                Objects.equals(this.stxoid, entity.stxoid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stxdinherit, stxoid);
    }

}