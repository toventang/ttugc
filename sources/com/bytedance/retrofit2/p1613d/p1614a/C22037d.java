package com.bytedance.retrofit2.p1613d.p1614a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import java.util.Objects;

/* renamed from: com.bytedance.retrofit2.d.a.d */
public final class C22037d extends RuntimeException {

    /* renamed from: a */
    private final int f52054a;

    /* renamed from: b */
    private final transient C22099u<?> f52055b;

    static {
        Covode.recordClassIndex(25727);
    }

    public final int code() {
        return this.f52054a;
    }

    public final C22099u<?> response() {
        return this.f52055b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22037d(C22099u<?> uVar) {
        super("HTTP " + uVar.f52261a.f52040b);
        Objects.requireNonNull(uVar, "response == null");
        this.f52054a = uVar.f52261a.f52040b;
        this.f52055b = uVar;
    }
}
