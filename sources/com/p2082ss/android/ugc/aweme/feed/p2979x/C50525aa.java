package com.p2082ss.android.ugc.aweme.feed.p2979x;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49495aa;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.x.aa */
public final class C50525aa {

    /* renamed from: a */
    public static final C50525aa f116788a = new C50525aa();

    private C50525aa() {
    }

    static {
        Covode.recordClassIndex(59672);
    }

    /* renamed from: b */
    public static final void m94709b(String str) {
        m94711c("stop in ".concat(String.valueOf(str)));
    }

    /* renamed from: c */
    public static void m94711c(String str) {
        if (C49495aa.m92735b()) {
            C51423a.m95784a(3, "FeedPlayerLogger", str);
        }
    }

    /* renamed from: a */
    public static final void m94707a(String str) {
        C89219l.m154721d(str, "");
        m94711c("pause, source ".concat(String.valueOf(str)));
    }

    /* renamed from: a */
    public static final void m94708a(String str, String str2) {
        C89219l.m154721d(str2, "");
        m94711c("play " + str + " source " + str2);
    }

    /* renamed from: b */
    public static final void m94710b(String str, String str2) {
        C89219l.m154721d(str, "");
        m94711c("PlayerController." + str + " result is " + str2);
    }

    /* renamed from: c */
    public static final void m94712c(String str, String str2) {
        C89219l.m154721d(str, "");
        m94711c("PlayerManager." + str + " result is " + str2);
    }
}
