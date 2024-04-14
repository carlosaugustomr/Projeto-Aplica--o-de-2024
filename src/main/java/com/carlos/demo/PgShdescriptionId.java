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
public class PgShdescriptionId implements java.io.Serializable {
    private static final long serialVersionUID = -1558467492714019121L;
    @Lob
    @Column(name = "objoid", nullable = false)
    private String objoid;

    @Lob
    @Column(name = "classoid", nullable = false)
    private String classoid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PgShdescriptionId entity = (PgShdescriptionId) o;
        return Objects.equals(this.objoid, entity.objoid) &&
                Objects.equals(this.classoid, entity.classoid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objoid, classoid);
    }

}