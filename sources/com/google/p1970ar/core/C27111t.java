package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.google.p1970ar.core.ArCoreApk;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: com.google.ar.core.t */
final class C27111t extends ArCoreApk.Availability {
    static {
        Covode.recordClassIndex(32691);
    }

    @Override // com.google.p1970ar.core.ArCoreApk.Availability
    public final boolean isUnsupported() {
        return true;
    }

    C27111t() {
        super("UNSUPPORTED_DEVICE_NOT_CAPABLE", 3, 100, null);
    }
}
