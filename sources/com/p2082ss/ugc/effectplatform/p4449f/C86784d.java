package com.p2082ss.ugc.effectplatform.p4449f;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ugc.effectplatform.f.d */
public final class C86784d extends Exception {

    /* renamed from: a */
    private int f195693a;

    static {
        Covode.recordClassIndex(102483);
    }

    public final int getStatus_code() {
        return this.f195693a;
    }

    public final void setStatus_code(int i) {
        this.f195693a = i;
    }

    public C86784d(int i, String str) {
        super(str);
        this.f195693a = i;
    }
}
