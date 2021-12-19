package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.jl */
public abstract class AbstractC26073jl {
    static {
        Covode.recordClassIndex(31488);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo42804a(CharSequence charSequence, byte[] bArr, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo42805a(byte[] bArr, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract String mo42806b(byte[] bArr, int i, int i2);

    AbstractC26073jl() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo42807c(byte[] bArr, int i, int i2) {
        if (mo42805a(bArr, i, i2) == 0) {
            return true;
        }
        return false;
    }
}
