package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.google.p1970ar.core.ArCoreApk;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: com.google.ar.core.u */
final class C27112u extends ArCoreApk.Availability {
    static {
        Covode.recordClassIndex(32692);
    }

    @Override // com.google.p1970ar.core.ArCoreApk.Availability
    public final boolean isSupported() {
        return true;
    }

    C27112u() {
        super("SUPPORTED_NOT_INSTALLED", 4, 201, null);
    }
}
