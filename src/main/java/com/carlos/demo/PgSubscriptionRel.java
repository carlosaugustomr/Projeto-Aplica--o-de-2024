package com.carlos.demo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_subscription_rel")
public class PgSubscriptionRel {
    @EmbeddedId
    private PgSubscriptionRelId id;

/*
 TODO [Reverse Engineering] create field to map the 'srsubstate' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "srsubstate", columnDefinition = ""char" not null")
    private Object srsubstate;
*/
/*
 TODO [Reverse Engineering] create field to map the 'srsublsn' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "srsublsn", columnDefinition = "pg_lsn")
    private Object srsublsn;
*/
}