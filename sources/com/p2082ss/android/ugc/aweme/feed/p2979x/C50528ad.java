package com.p2082ss.android.ugc.aweme.feed.p2979x;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.main.MainPageExperimentServiceImpl;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.x.ad */
public final class C50528ad {

    /* renamed from: a */
    public static final C50528ad f116789a = new C50528ad();

    private C50528ad() {
    }

    static {
        Covode.recordClassIndex(59675);
    }

    /* renamed from: a */
    public static final boolean m94717a(String str) {
        C89219l.m154721d(str, "");
        if (TextUtils.equals(str, "homepage_hot")) {
            return true;
        }
        C89219l.m154716b(MainPageExperimentServiceImpl.m108379b(), "");
        if (TextUtils.equals(str, "homepage_follow")) {
            return true;
        }
        return C16048b.m29633a().mo25421a(true, "show_global_multi_func", false);
    }
}
