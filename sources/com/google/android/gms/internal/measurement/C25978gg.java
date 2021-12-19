package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC25981gj;

/* renamed from: com.google.android.gms.internal.measurement.gg */
final class C25978gg implements AbstractC26021hr {

    /* renamed from: a */
    static final C25978gg f61234a = new C25978gg();

    private C25978gg() {
    }

    static {
        Covode.recordClassIndex(31393);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26021hr
    /* renamed from: a */
    public final boolean mo42611a(Class<?> cls) {
        return AbstractC25981gj.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26021hr
    /* renamed from: b */
    public final AbstractC26018ho mo42612b(Class<?> cls) {
        String str;
        String str2;
        if (!AbstractC25981gj.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            if (valueOf.length() != 0) {
                str2 = "Unsupported message type: ".concat(valueOf);
            } else {
                str2 = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        try {
            return (AbstractC26018ho) AbstractC25981gj.m50555a(cls.asSubclass(AbstractC25981gj.class)).mo42005a(AbstractC25981gj.C25986e.f61245c);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            if (valueOf2.length() != 0) {
                str = "Unable to get message info for ".concat(valueOf2);
            } else {
                str = new String("Unable to get message info for ");
            }
            throw new RuntimeException(str, e);
        }
    }
}
