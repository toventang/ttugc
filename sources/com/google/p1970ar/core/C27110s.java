package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.google.p1970ar.core.ArCoreApk;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: com.google.ar.core.s */
final class C27110s extends ArCoreApk.Availability {
    static {
        Covode.recordClassIndex(32690);
    }

    @Override // com.google.p1970ar.core.ArCoreApk.Availability
    public final boolean isUnknown() {
        return true;
    }

    C27110s() {
        super("UNKNOWN_TIMED_OUT", 2, 2, null);
    }
}
