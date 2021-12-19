package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.experiment.fr */
public final class C46952fr {

    /* renamed from: a */
    public static final C46952fr f109427a = new C46952fr();

    private C46952fr() {
    }

    static {
        Covode.recordClassIndex(55553);
    }

    /* renamed from: a */
    public static final int m90235a() {
        return C16048b.m29633a().mo25412a(true, "effect_music_bubble_display_logic", 0);
    }

    /* renamed from: b */
    public static final boolean m90236b() {
        if (m90235a() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static int m90238d() {
        if (m90235a() == 4) {
            return 10;
        }
        return 50;
    }

    /* renamed from: e */
    public static boolean m90239e() {
        int a = m90235a();
        if (a == 3 || a == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m90237c() {
        int a = m90235a();
        if (a == 2 || a == 3 || a == 4) {
            return true;
        }
        return false;
    }
}
