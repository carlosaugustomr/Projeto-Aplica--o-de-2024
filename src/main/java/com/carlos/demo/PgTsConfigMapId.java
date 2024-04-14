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
public class PgTsConfigMapId implements java.io.Serializable {
    private static final long serialVersionUID = 2966284482140150388L;
    @Lob
    @Column(name = "mapcfg", nullable = false)
    private String mapcfg;

    @Column(name = "maptokentype", nullable = false)
    private Integer maptokentype;

    @Column(name = "mapseqno", nullable = false)
    private Integer mapseqno;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PgTsConfigMapId entity = (PgTsConfigMapId) o;
        return Objects.equals(this.mapcfg, entity.mapcfg) &&
                Objects.equals(this.mapseqno, entity.mapseqno) &&
                Objects.equals(this.maptokentype, entity.maptokentype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mapcfg, mapseqno, maptokentype);
    }

}