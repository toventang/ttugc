package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.experiment.m */
public final class C47035m {

    /* renamed from: a */
    public static final C47035m f109584a = new C47035m();

    private C47035m() {
    }

    static {
        Covode.recordClassIndex(55636);
    }

    /* renamed from: a */
    public static int m90293a() {
        return C16048b.m29633a().mo25412a(true, "BA_direct_message_new_entry_point", 0);
    }

    /* renamed from: b */
    public static boolean m90295b() {
        int a = m90293a();
        if (a == 1 || a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m90294a(boolean z) {
        int a = m90293a();
        if (a == 0 || (a == 1 && z)) {
            return true;
        }
        return false;
    }
}
