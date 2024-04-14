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
public class PgLargeobjectId implements java.io.Serializable {
    private static final long serialVersionUID = -2102381309099587094L;
    @Lob
    @Column(name = "loid", nullable = false)
    private String loid;

    @Column(name = "pageno", nullable = false)
    private Integer pageno;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PgLargeobjectId entity = (PgLargeobjectId) o;
        return Objects.equals(this.pageno, entity.pageno) &&
                Objects.equals(this.loid, entity.loid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageno, loid);
    }

}