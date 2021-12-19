package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.google.p1970ar.core.ArCoreApk;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: com.google.ar.core.v */
final class C27113v extends ArCoreApk.Availability {
    static {
        Covode.recordClassIndex(32693);
    }

    @Override // com.google.p1970ar.core.ArCoreApk.Availability
    public final boolean isSupported() {
        return true;
    }

    C27113v() {
        super("SUPPORTED_APK_TOO_OLD", 5, 202, null);
    }
}
