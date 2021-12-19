package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.experiment.ec */
public final class C46873ec {

    /* renamed from: a */
    public static final C46873ec f109225a = new C46873ec();

    private C46873ec() {
    }

    static {
        Covode.recordClassIndex(55474);
    }

    /* renamed from: c */
    private static int m90189c() {
        return C16048b.m29633a().mo25412a(true, "live_tab_pop_up_in_record", 0);
    }

    /* renamed from: a */
    public static final boolean m90187a() {
        if (m90189c() == 1 || m90189c() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m90188b() {
        if (m90189c() == 2 || m90189c() == 3) {
            return true;
        }
        return false;
    }
}
