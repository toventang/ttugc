package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.bw */
final class C25853bw extends AbstractC25845bo<Double> {
    static {
        Covode.recordClassIndex(31268);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Double mo42198a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String a = super.mo42199a();
        String valueOf = String.valueOf(obj);
        String.valueOf(a).length();
        String.valueOf(valueOf).length();
        return null;
    }

    C25853bw(C25855by byVar, String str, Double d) {
        super(byVar, str, d);
    }
}
