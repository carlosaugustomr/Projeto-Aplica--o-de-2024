package com.carlos.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_auth_members")
public class PgAuthMember {
    @Id
    @Lob
    @Column(name = "oid", nullable = false)
    private String oid;

    @Lob
    @Column(name = "roleid", nullable = false)
    private String roleid;

    @Lob
    @Column(name = "member", nullable = false)
    private String member;

    @Lob
    @Column(name = "grantor", nullable = false)
    private String grantor;

    @Column(name = "admin_option", nullable = false)
    private Boolean adminOption = false;

    @Column(name = "inherit_option", nullable = false)
    private Boolean inheritOption = false;

    @Column(name = "set_option", nullable = false)
    private Boolean setOption = false;

}