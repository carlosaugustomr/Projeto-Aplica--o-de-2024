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
public class PgInheritId implements java.io.Serializable {
    private static final long serialVersionUID = 7263267610513486429L;
    @Lob
    @Column(name = "inhrelid", nullable = false)
    private String inhrelid;

    @Column(name = "inhseqno", nullable = false)
    private Integer inhseqno;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PgInheritId entity = (PgInheritId) o;
        return Objects.equals(this.inhrelid, entity.inhrelid) &&
                Objects.equals(this.inhseqno, entity.inhseqno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inhrelid, inhseqno);
    }

}