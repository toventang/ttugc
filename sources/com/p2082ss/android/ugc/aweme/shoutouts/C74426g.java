package com.p2082ss.android.ugc.aweme.shoutouts;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.g */
public final class C74426g implements Serializable {
    @AbstractC27891c(mo46611a = "creator_earning")

    /* renamed from: a */
    private C74381a f167370a;
    @AbstractC27891c(mo46611a = "coin")

    /* renamed from: b */
    private int f167371b;
    @AbstractC27891c(mo46611a = "buyer_payment")

    /* renamed from: c */
    private C74381a f167372c;

    static {
        Covode.recordClassIndex(87204);
    }

    public final C74381a getBuyerMoneyDes() {
        return this.f167372c;
    }

    public final int getCoin() {
        return this.f167371b;
    }

    public final C74381a getMoneyDes() {
        return this.f167370a;
    }

    public final void setBuyerMoneyDes(C74381a aVar) {
        this.f167372c = aVar;
    }

    public final void setCoin(int i) {
        this.f167371b = i;
    }

    public final void setMoneyDes(C74381a aVar) {
        this.f167370a = aVar;
    }
}
