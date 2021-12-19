package com.bytedance.frameworks.baselib.network.http.p983b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.frameworks.baselib.network.http.b.c */
public class C14620c extends C14619b {
    private static final long serialVersionUID = -7186627969477257933L;

    /* renamed from: a */
    private final int f35415a;

    static {
        Covode.recordClassIndex(16711);
    }

    public int getStatusCode() {
        return this.f35415a;
    }

    public C14620c(int i, String str) {
        super(str);
        this.f35415a = i;
    }
}
