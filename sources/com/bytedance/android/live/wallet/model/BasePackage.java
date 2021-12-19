package com.bytedance.android.live.wallet.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;

public final class BasePackage {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private long f15915id;
    @AbstractC27891c(mo46611a = "price")
    private long price;
    @AbstractC27891c(mo46611a = "real_dot")
    private int realDot;

    static {
        Covode.recordClassIndex(7100);
    }

    public BasePackage() {
        this(0, 0, 0, 7, null);
    }

    public final long getId() {
        return this.f15915id;
    }

    public final long getPrice() {
        return this.price;
    }

    public final int getRealDot() {
        return this.realDot;
    }

    public final void setId(long j) {
        this.f15915id = j;
    }

    public final void setPrice(long j) {
        this.price = j;
    }

    public final void setRealDot(int i) {
        this.realDot = i;
    }

    public BasePackage(long j, long j2, int i) {
        this.f15915id = j;
        this.price = j2;
        this.realDot = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasePackage(long j, long j2, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : j, (i2 & 2) == 0 ? j2 : 0, (i2 & 4) != 0 ? 0 : i);
    }
}
