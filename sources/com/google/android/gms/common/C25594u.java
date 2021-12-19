package com.google.android.gms.common;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.u */
public class C25594u {

    /* renamed from: a */
    static final C25594u f60699a = new C25594u(true, null, null);

    /* renamed from: b */
    final boolean f60700b;

    /* renamed from: c */
    final Throwable f60701c;

    /* renamed from: d */
    private final String f60702d;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo41852a() {
        return this.f60702d;
    }

    static {
        Covode.recordClassIndex(31003);
    }

    /* renamed from: a */
    static C25594u m49398a(String str) {
        return new C25594u(false, str, null);
    }

    /* renamed from: a */
    static C25594u m49399a(String str, Throwable th) {
        return new C25594u(false, str, th);
    }

    C25594u(boolean z, String str, Throwable th) {
        this.f60700b = z;
        this.f60702d = str;
        this.f60701c = th;
    }
}
