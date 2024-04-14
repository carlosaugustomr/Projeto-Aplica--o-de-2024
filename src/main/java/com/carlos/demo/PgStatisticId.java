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
public class PgStatisticId implements java.io.Serializable {
    private static final long serialVersionUID = 912182702148005729L;
    @Lob
    @Column(name = "starelid", nullable = false)
    private String starelid;

    @Column(name = "staattnum", nullable = false)
    private Short staattnum;

    @Column(name = "stainherit", nullable = false)
    private Boolean stainherit = false;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PgStatisticId entity = (PgStatisticId) o;
        return Objects.equals(this.starelid, entity.starelid) &&
                Objects.equals(this.staattnum, entity.staattnum) &&
                Objects.equals(this.stainherit, entity.stainherit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(starelid, staattnum, stainherit);
    }

}