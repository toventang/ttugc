package com.bytedance.common.wschannel.p921e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29843f;

/* renamed from: com.bytedance.common.wschannel.e.a */
public final class C13744a {

    /* renamed from: a */
    private static final C13745b f33383a = new C13745b();

    static {
        Covode.recordClassIndex(15779);
    }

    /* renamed from: a */
    public static boolean m24774a() {
        if (!C29843f.m60136c()) {
            return false;
        }
        try {
            if (Integer.parseInt(f33383a.mo22103a("ro.miui.ui.version.name").substring(1)) >= 12) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }
}
