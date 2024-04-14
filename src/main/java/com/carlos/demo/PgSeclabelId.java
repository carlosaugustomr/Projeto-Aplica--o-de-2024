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
public class PgSeclabelId implements java.io.Serializable {
    private static final long serialVersionUID = -4538422302855284500L;
    @Lob
    @Column(name = "objoid", nullable = false)
    private String objoid;

    @Lob
    @Column(name = "classoid", nullable = false)
    private String classoid;

    @Column(name = "objsubid", nullable = false)
    private Integer objsubid;

    @Column(name = "provider", nullable = false, length = Integer.MAX_VALUE)
    private String provider;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PgSeclabelId entity = (PgSeclabelId) o;
        return Objects.equals(this.objoid, entity.objoid) &&
                Objects.equals(this.provider, entity.provider) &&
                Objects.equals(this.objsubid, entity.objsubid) &&
                Objects.equals(this.classoid, entity.classoid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objoid, provider, objsubid, classoid);
    }

}