package com.google.android.gms.common;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.p */
abstract class AbstractBinderC25584p extends AbstractBinderC25582n {

    /* renamed from: b */
    private static final WeakReference<byte[]> f60660b = new WeakReference<>(null);

    /* renamed from: a */
    private WeakReference<byte[]> f60661a = f60660b;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract byte[] mo41843d();

    static {
        Covode.recordClassIndex(30991);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.AbstractBinderC25582n
    /* renamed from: c */
    public final byte[] mo41839c() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f60661a.get();
            if (bArr == null) {
                bArr = mo41843d();
                this.f60661a = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    AbstractBinderC25584p(byte[] bArr) {
        super(bArr);
    }
}
