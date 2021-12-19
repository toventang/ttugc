package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.experiment.ck */
public final class C46794ck {

    /* renamed from: a */
    public static final C46794ck f109014a = new C46794ck();

    private C46794ck() {
    }

    static {
        Covode.recordClassIndex(55395);
    }

    /* renamed from: b */
    public static final boolean m90140b() {
        if (C46795cl.m90141a() == 0 && C46793cj.m90138a() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m90139a() {
        if (C46795cl.m90141a() == 2 || SettingsManager.m29616a().mo25394a("can_exp_video_archive", 0) == 1 || C46793cj.m90138a() == 2) {
            return true;
        }
        return false;
    }
}
