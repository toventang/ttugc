package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.retrofit2.k */
public final class C22057k extends RuntimeException {

    /* renamed from: a */
    private final int f52087a;

    /* renamed from: b */
    private final transient C22099u<?> f52088b;

    static {
        Covode.recordClassIndex(25747);
    }

    public final int code() {
        return this.f52087a;
    }

    public final C22099u<?> response() {
        return this.f52088b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22057k(C22099u<?> uVar) {
        super("HTTP " + uVar.f52261a.f52040b);
        C22101w.m41535a(uVar, "response == null");
        this.f52087a = uVar.f52261a.f52040b;
        this.f52088b = uVar;
    }
}
