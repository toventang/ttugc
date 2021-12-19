package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.fz */
final class C25970fz {

    /* renamed from: a */
    static final AbstractC25968fx<?> f61162a = new C25967fw();

    /* renamed from: b */
    private static final AbstractC25968fx<?> f61163b = m50539b();

    /* renamed from: a */
    static AbstractC25968fx<?> m50538a() {
        AbstractC25968fx<?> fxVar = f61163b;
        if (fxVar != null) {
            return fxVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static {
        Covode.recordClassIndex(31385);
    }

    /* renamed from: b */
    private static AbstractC25968fx<?> m50539b() {
        try {
            return (AbstractC25968fx) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
