package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;
import java.security.cert.X509Certificate;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.b.bo */
public final class C26924bo extends C26925bp {

    /* renamed from: a */
    private final byte[] f63813a;

    static {
        Covode.recordClassIndex(32399);
    }

    public C26924bo(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f63813a = bArr;
    }

    @Override // java.security.cert.Certificate, com.google.android.play.core.p1963b.C26925bp
    public final byte[] getEncoded() {
        return this.f63813a;
    }
}
