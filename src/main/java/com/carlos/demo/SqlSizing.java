package com.carlos.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sql_sizing")
public class SqlSizing {
  /*
 TODO [Reverse Engineering] create field to map the 'sizing_id' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "sizing_id", columnDefinition = "cardinal_number")
    private Object sizingId;
*/
/*
 TODO [Reverse Engineering] create field to map the 'sizing_name' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "sizing_name", columnDefinition = "character_data")
    private Object sizingName;
*/
/*
 TODO [Reverse Engineering] create field to map the 'supported_value' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "supported_value", columnDefinition = "cardinal_number")
    private Object supportedValue;
*/
/*
 TODO [Reverse Engineering] create field to map the 'comments' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "comments", columnDefinition = "character_data")
    private Object comments;
*/
}