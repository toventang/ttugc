package com.p2082ss.android.ugc.aweme.feed.p2944e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.e.n */
public final class C49444n {

    /* renamed from: a */
    public static final C49444n f113625a = new C49444n();

    private C49444n() {
    }

    static {
        Covode.recordClassIndex(58257);
    }

    /* renamed from: a */
    public static final void m92595a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        IRuntimeBehaviorService c = RuntimeBehaviorServiceImpl.m94812c();
        if (c != null) {
            c.mo85866a(str, str2);
        }
    }
}
