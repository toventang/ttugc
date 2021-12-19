package com.bytedance.android.live.wallet.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class CurrencyInfo {
    @AbstractC27891c(mo46611a = "code")
    private String code;
    @AbstractC27891c(mo46611a = "keep_dot")
    private int keepDot;
    @AbstractC27891c(mo46611a = "symbol")
    private String symbol;

    static {
        Covode.recordClassIndex(7104);
    }

    public CurrencyInfo() {
        this(null, 0, null, 7, null);
    }

    public final String getCode() {
        return this.code;
    }

    public final int getKeepDot() {
        return this.keepDot;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final void setKeepDot(int i) {
        this.keepDot = i;
    }

    public final void setCode(String str) {
        C89219l.m154721d(str, "");
        this.code = str;
    }

    public final void setSymbol(String str) {
        C89219l.m154721d(str, "");
        this.symbol = str;
    }

    public CurrencyInfo(String str, int i, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.code = str;
        this.keepDot = i;
        this.symbol = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CurrencyInfo(String str, int i, String str2, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2);
    }
}
