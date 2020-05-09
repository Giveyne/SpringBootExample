package com.example.demo.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Energy_lvl")
public class Elvl {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 12)
    private Long Id;

    @Column(name = "elvl", length = 16)
    private BigDecimal elvl;

    @Column(name = "isin", length = 12)
    private String isin;

    public Elvl() {
    }


    public Elvl(BigDecimal elvl, String isin) {
        this.elvl = elvl;
        this.isin = isin;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public BigDecimal getElvl() {
        return elvl;
    }

    public void setElvl(BigDecimal elvl) {
        this.elvl = elvl;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }
}
