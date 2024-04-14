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
public class PgInitPrivId implements java.io.Serializable {
    private static final long serialVersionUID = 509920128822083491L;
    @Lob
    @Column(name = "objoid", nullable = false)
    private String objoid;

    @Lob
    @Column(name = "classoid", nullable = false)
    private String classoid;

    @Column(name = "objsubid", nullable = false)
    private Integer objsubid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PgInitPrivId entity = (PgInitPrivId) o;
        return Objects.equals(this.objoid, entity.objoid) &&
                Objects.equals(this.objsubid, entity.objsubid) &&
                Objects.equals(this.classoid, entity.classoid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objoid, objsubid, classoid);
    }

}