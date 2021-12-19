package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.RuntimeBehaviorServiceDiff */
public final class RuntimeBehaviorServiceDiff {
    public static final RuntimeBehaviorServiceDiff INSTANCE = new RuntimeBehaviorServiceDiff();

    private RuntimeBehaviorServiceDiff() {
    }

    static {
        Covode.recordClassIndex(79724);
    }

    public final void event(String str) {
        C89219l.m154721d(str, "");
        RuntimeBehaviorServiceImpl.m94812c().mo85865a(str);
    }

    public final void event(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        RuntimeBehaviorServiceImpl.m94812c().mo85866a(str, str2);
    }
}
