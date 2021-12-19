package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.api.internal.cl */
final class C25431cl extends ThreadLocal<Boolean> {
    static {
        Covode.recordClassIndex(30830);
    }

    C25431cl() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Boolean initialValue() {
        return false;
    }
}
