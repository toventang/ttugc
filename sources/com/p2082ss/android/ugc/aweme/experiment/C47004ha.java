package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.experiment.ha */
public final class C47004ha {

    /* renamed from: a */
    public static boolean f109524a;

    /* renamed from: b */
    public static final C47004ha f109525b = new C47004ha();

    /* renamed from: c */
    private static final int f109526c = 1;

    /* renamed from: d */
    private static boolean f109527d;

    private C47004ha() {
    }

    /* renamed from: a */
    private static int m90280a() {
        return C16048b.m29633a().mo25412a(false, "use_lynx_for_favorite_hashtag_collection", 0);
    }

    static {
        boolean z;
        Covode.recordClassIndex(55605);
        boolean z2 = true;
        if (m90280a() == 0) {
            z = true;
        } else {
            z = false;
        }
        f109524a = z;
        if (m90280a() != 1) {
            z2 = false;
        }
        f109527d = z2;
    }
}
