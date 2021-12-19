package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.bu */
public final class C25851bu extends AbstractC25845bo<Long> {
    static {
        Covode.recordClassIndex(31266);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Long mo42198a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String a = super.mo42199a();
        String valueOf = String.valueOf(obj);
        String.valueOf(a).length();
        String.valueOf(valueOf).length();
        return null;
    }

    C25851bu(C25855by byVar, String str, Long l) {
        super(byVar, str, l);
    }
}
