package com.bytedance.bpea.basics;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.basics.a */
public final class C13340a extends Exception {

    /* renamed from: a */
    private final int f32606a;

    /* renamed from: b */
    private final String f32607b;

    static {
        Covode.recordClassIndex(15336);
    }

    public final int getErrorCode() {
        return this.f32606a;
    }

    public final String getErrorMsg() {
        return this.f32607b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13340a(int i, String str) {
        super(str);
        C89219l.m154719c(str, "");
        this.f32606a = i;
        this.f32607b = str;
    }
}
