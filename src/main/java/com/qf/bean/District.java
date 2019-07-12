package com.qf.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class District implements Serializable {
    private Integer id;

    private String name;

    private List<Airqualityindex> airqualityindexList;
}
