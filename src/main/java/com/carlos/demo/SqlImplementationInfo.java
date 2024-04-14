package com.carlos.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sql_implementation_info")
public class SqlImplementationInfo {
  /*
 TODO [Reverse Engineering] create field to map the 'implementation_info_id' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "implementation_info_id", columnDefinition = "character_data")
    private Object implementationInfoId;
*/
/*
 TODO [Reverse Engineering] create field to map the 'implementation_info_name' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "implementation_info_name", columnDefinition = "character_data")
    private Object implementationInfoName;
*/
/*
 TODO [Reverse Engineering] create field to map the 'integer_value' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "integer_value", columnDefinition = "cardinal_number")
    private Object integerValue;
*/
/*
 TODO [Reverse Engineering] create field to map the 'character_value' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "character_value", columnDefinition = "character_data")
    private Object characterValue;
*/
/*
 TODO [Reverse Engineering] create field to map the 'comments' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "comments", columnDefinition = "character_data")
    private Object comments;
*/
}