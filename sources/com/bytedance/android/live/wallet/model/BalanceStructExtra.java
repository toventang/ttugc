package com.bytedance.android.live.wallet.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;

public final class BalanceStructExtra {
    @AbstractC27891c(mo46611a = "base_package")
    private BasePackage basePackage;
    @AbstractC27891c(mo46611a = "currency_info")
    private CurrencyInfo currencyInfo;
    @AbstractC27891c(mo46611a = "coins")
    private long maxCoins;

    static {
        Covode.recordClassIndex(7099);
    }

    public BalanceStructExtra() {
        this(null, null, 0, 7, null);
    }

    public final BasePackage getBasePackage() {
        return this.basePackage;
    }

    public final CurrencyInfo getCurrencyInfo() {
        return this.currencyInfo;
    }

    public final long getMaxCoins() {
        return this.maxCoins;
    }

    public final void setBasePackage(BasePackage basePackage2) {
        this.basePackage = basePackage2;
    }

    public final void setCurrencyInfo(CurrencyInfo currencyInfo2) {
        this.currencyInfo = currencyInfo2;
    }

    public final void setMaxCoins(long j) {
        this.maxCoins = j;
    }

    public BalanceStructExtra(CurrencyInfo currencyInfo2, BasePackage basePackage2, long j) {
        this.currencyInfo = currencyInfo2;
        this.basePackage = basePackage2;
        this.maxCoins = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BalanceStructExtra(CurrencyInfo currencyInfo2, BasePackage basePackage2, long j, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : currencyInfo2, (i & 2) != 0 ? null : basePackage2, (i & 4) != 0 ? 0 : j);
    }
}
