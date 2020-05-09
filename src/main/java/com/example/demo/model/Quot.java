package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name = "quotation_base")
public class Quot {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 12)
    private Long Id;
    @Id
    @Column(name = "isin", length = 12)
    @Size(min=12, max=12, message="ISIN must be 12 characters long.")
    private String ISIN;
    @Column(name = "bid", length = 16)
    private BigDecimal bid;
    @Column(name = "ask", length = 16)
    private BigDecimal ask;
    @Column(name = "bidsize", length = 16)
    private BigDecimal bidSize;
    @Column(name = "asksize", length = 16)
    private BigDecimal askSize;

    public Quot() {
    }

    public Quot(@Size(min = 12, max = 12, message = "ISIN must be 12 characters long.") String ISIN, BigDecimal bid, BigDecimal ask, BigDecimal bidSize, BigDecimal askSize, Elvl elvl) {
        this.ISIN = ISIN;
        this.bid = bid;
        this.ask = ask;
        this.bidSize = bidSize;
        this.askSize = askSize;

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }


    public String getISIN() {
        return ISIN;
    }

    public void setISIN(String ISIN) {
        this.ISIN = ISIN;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public BigDecimal getAsk() {
        return ask;
    }

    public void setAsk(BigDecimal ask) {
        this.ask = ask;
    }

    public BigDecimal getBidSize() {
        return bidSize;
    }

    public void setBidSize(BigDecimal bidSize) {
        this.bidSize = bidSize;
    }

    public BigDecimal getAskSize() {
        return askSize;
    }

    public void setAskSize(BigDecimal askSize) {
        this.askSize = askSize;
    }

}
