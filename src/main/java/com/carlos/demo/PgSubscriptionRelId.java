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
public class PgSubscriptionRelId implements java.io.Serializable {
    private static final long serialVersionUID = 6176266782752733383L;
    @Lob
    @Column(name = "srrelid", nullable = false)
    private String srrelid;

    @Lob
    @Column(name = "srsubid", nullable = false)
    private String srsubid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PgSubscriptionRelId entity = (PgSubscriptionRelId) o;
        return Objects.equals(this.srsubid, entity.srsubid) &&
                Objects.equals(this.srrelid, entity.srrelid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(srsubid, srrelid);
    }

}