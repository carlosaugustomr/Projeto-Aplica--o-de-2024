package com.carlos.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sql_parts")
public class SqlPart {
  /*
 TODO [Reverse Engineering] create field to map the 'feature_id' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "feature_id", columnDefinition = "character_data")
    private Object featureId;
*/
/*
 TODO [Reverse Engineering] create field to map the 'feature_name' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "feature_name", columnDefinition = "character_data")
    private Object featureName;
*/
/*
 TODO [Reverse Engineering] create field to map the 'is_supported' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "is_supported", columnDefinition = "yes_or_no")
    private Object isSupported;
*/
/*
 TODO [Reverse Engineering] create field to map the 'is_verified_by' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "is_verified_by", columnDefinition = "character_data")
    private Object isVerifiedBy;
*/
/*
 TODO [Reverse Engineering] create field to map the 'comments' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "comments", columnDefinition = "character_data")
    private Object comments;
*/
}