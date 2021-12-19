package com.p2082ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.Address */
public class Address implements Serializable {
    @AbstractC27891c(mo46611a = "address")
    private String address;
    @AbstractC27891c(mo46611a = "city")
    private String city;
    @AbstractC27891c(mo46611a = "district")
    private String district;
    @AbstractC27891c(mo46611a = "province")
    private String provice;
    @AbstractC27891c(mo46611a = "simple_addr")
    private String simpleAddr;

    static {
        Covode.recordClassIndex(88204);
    }

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getProvice() {
        return this.provice;
    }

    public String getSimpleAddr() {
        return this.simpleAddr;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setDistrict(String str) {
        this.district = str;
    }

    public void setProvice(String str) {
        this.provice = str;
    }

    public void setSimpleAddr(String str) {
        this.simpleAddr = str;
    }
}
