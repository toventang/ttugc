package com.p2082ss.ugc.effectplatform.p4449f;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ugc.effectplatform.f.e */
public final class C86785e extends Exception {

    /* renamed from: a */
    private int f195694a;

    static {
        Covode.recordClassIndex(102484);
    }

    public final int getStatusCode() {
        return this.f195694a;
    }

    public final void setStatusCode(int i) {
        this.f195694a = i;
    }

    public C86785e(int i, String str) {
        super(str);
        this.f195694a = i;
    }
}
