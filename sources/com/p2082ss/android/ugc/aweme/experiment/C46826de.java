package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.experiment.de */
public final class C46826de {

    /* renamed from: a */
    public static int f109097a = C16048b.m29633a().mo25412a(true, "feed_scrool_duration_opt_ratio", 100);

    /* renamed from: a */
    public static int m90149a() {
        int i = f109097a;
        if (i > 200) {
            return 200;
        }
        if (i < 30) {
            return 30;
        }
        return i;
    }

    static {
        Covode.recordClassIndex(55427);
    }
}
