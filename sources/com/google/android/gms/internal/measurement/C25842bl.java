package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.bl */
final class C25842bl extends ContentObserver {
    static {
        Covode.recordClassIndex(31257);
    }

    C25842bl() {
        super(null);
    }

    public final void onChange(boolean z) {
        AbstractC25845bo.f60968c.incrementAndGet();
    }
}
