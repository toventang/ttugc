package com.google.android.gms.common;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.w */
public final class C25618w extends C25594u {

    /* renamed from: d */
    private final Callable<String> f60736d;

    static {
        Covode.recordClassIndex(31028);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.C25594u
    /* renamed from: a */
    public final String mo41852a() {
        try {
            return this.f60736d.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private C25618w(Callable<String> callable) {
        super(false, null, null);
        this.f60736d = callable;
    }

    /* synthetic */ C25618w(Callable callable, byte b) {
        this(callable);
    }
}
