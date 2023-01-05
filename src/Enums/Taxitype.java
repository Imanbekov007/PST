package Enums;

import java.math.BigDecimal;

public enum Taxitype {
    STANDARD(new BigDecimal(10),new BigDecimal(50)),
    COMFORT(new BigDecimal(20),new BigDecimal(100)),
    BUSINESS(new BigDecimal(30),new BigDecimal(150)),
    ;
    private BigDecimal priceperKm;
    private BigDecimal priceforLanding;

    Taxitype(BigDecimal priceperKm, BigDecimal priceforLanding) {
        this.priceperKm = priceperKm;
        this.priceforLanding = priceforLanding;
    }

    public BigDecimal getPriceperKm() {
        return priceperKm;
    }

    public void setPriceperKm(BigDecimal priceperKm) {
        this.priceperKm = priceperKm;
    }

    public BigDecimal getPriceforLanding() {
        return priceforLanding;

    }

    public void setPriceforLanding(BigDecimal priceforLanding) {
        this.priceforLanding = priceforLanding;
    }



}
