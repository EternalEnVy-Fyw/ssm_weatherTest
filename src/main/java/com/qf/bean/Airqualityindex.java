package com.qf.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Airqualityindex implements Serializable {
    private Integer id;

    private Integer districtid;

    private String monitortime;

    private Integer pm10;

    private Integer pm25;

    private String monitoringstation;

    private String lastmodifytime;

    private District district;
}
