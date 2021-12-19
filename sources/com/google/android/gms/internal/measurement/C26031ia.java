package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.ia */
final class C26031ia {

    /* renamed from: a */
    static final AbstractC26028hy f61326a = m50764a();

    /* renamed from: b */
    static final AbstractC26028hy f61327b = new C26032ib();

    static {
        Covode.recordClassIndex(31446);
    }

    /* renamed from: a */
    private static AbstractC26028hy m50764a() {
        try {
            return (AbstractC26028hy) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
