package com.bytedance.android.live.wallet.base;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class DiamondStruct {
    @AbstractC27891c(mo46611a = "describe")
    public String describe;
    @AbstractC27891c(mo46611a = "diamond_count")
    public int diamondCount;
    @AbstractC27891c(mo46611a = "exchange_price")
    public int exchangePrice;
    @AbstractC27891c(mo46611a = "giving_count")
    public int givingCount;
    @AbstractC27891c(mo46611a = "iap_id")
    public String iapId;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    public int f15784id;
    @AbstractC27891c(mo46611a = "price")
    public int price;

    static {
        Covode.recordClassIndex(7025);
    }

    public String toString() {
        return "DiamondStruct{id=" + this.f15784id + ", iapId='" + this.iapId + '\'' + ", price=" + this.price + ", exchangePrice=" + this.exchangePrice + ", diamondCount=" + this.diamondCount + ", givingCount=" + this.givingCount + ", describe='" + this.describe + '\'' + '}';
    }
}
