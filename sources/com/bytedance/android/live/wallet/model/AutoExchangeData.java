package com.bytedance.android.live.wallet.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;

public final class AutoExchangeData {
    @AbstractC27891c(mo46611a = "auto_exchange_after")
    private boolean after;
    @AbstractC27891c(mo46611a = "auto_exchange_before")
    private boolean before;

    static {
        Covode.recordClassIndex(7097);
    }

    public AutoExchangeData() {
        this(false, false, 3, null);
    }

    public final boolean getAfter() {
        return this.after;
    }

    public final boolean getBefore() {
        return this.before;
    }

    public final void setAfter(boolean z) {
        this.after = z;
    }

    public final void setBefore(boolean z) {
        this.before = z;
    }

    public AutoExchangeData(boolean z, boolean z2) {
        this.before = z;
        this.after = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutoExchangeData(boolean z, boolean z2, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
