package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pg_event_trigger")
public class PgEventTrigger {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "evtfoid", nullable = false)
    private String evtfoid;

    @Lob
    @Column(name = "evtowner", nullable = false)
    private String evtowner;
    @Column(name = "evttags")
    private List<String> evttags;

/*
 TODO [Reverse Engineering] create field to map the 'evtname' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "evtname", columnDefinition = "name not null")
    private Object evtname;
*/
/*
 TODO [Reverse Engineering] create field to map the 'evtevent' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "evtevent", columnDefinition = "name not null")
    private Object evtevent;
*/
/*
 TODO [Reverse Engineering] create field to map the 'evtenabled' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "evtenabled", columnDefinition = ""char" not null")
    private Object evtenabled;
*/
}