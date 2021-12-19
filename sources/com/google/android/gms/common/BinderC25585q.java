package com.google.android.gms.common;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.q */
public final class BinderC25585q extends AbstractBinderC25582n {

    /* renamed from: a */
    private final byte[] f60662a;

    static {
        Covode.recordClassIndex(30992);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.AbstractBinderC25582n
    /* renamed from: c */
    public final byte[] mo41839c() {
        return this.f60662a;
    }

    BinderC25585q(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f60662a = bArr;
    }
}
