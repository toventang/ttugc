package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.property.o */
public final class C65492o {

    /* renamed from: a */
    public static final C65492o f147707a = new C65492o();

    private C65492o() {
    }

    static {
        Covode.recordClassIndex(76979);
    }

    /* renamed from: a */
    public static final boolean m117216a() {
        if (C16048b.m29633a().mo25412a(true, "camera_anti_shake_version", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m117217b() {
        if (C16048b.m29633a().mo25412a(true, "camera_anti_shake_version", 0) == 2) {
            return true;
        }
        return false;
    }
}
