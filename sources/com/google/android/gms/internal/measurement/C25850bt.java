package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.bt */
public final class C25850bt extends AbstractC25845bo<Boolean> {
    static {
        Covode.recordClassIndex(31265);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25845bo
    /* renamed from: a */
    public final /* synthetic */ Boolean mo42198a(Object obj) {
        if (obj instanceof Boolean) {
            return obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C25828ay.f60931b.matcher(str).matches()) {
                return true;
            }
            if (C25828ay.f60932c.matcher(str).matches()) {
                return false;
            }
        }
        String a = super.mo42199a();
        String valueOf = String.valueOf(obj);
        String.valueOf(a).length();
        String.valueOf(valueOf).length();
        return null;
    }

    C25850bt(C25855by byVar, String str, Boolean bool) {
        super(byVar, str, bool);
    }
}
