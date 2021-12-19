package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.ba */
final class C25831ba extends ContentObserver {
    static {
        Covode.recordClassIndex(31246);
    }

    C25831ba() {
        super(null);
    }

    public final void onChange(boolean z) {
        C25828ay.f60933d.set(true);
    }
}
