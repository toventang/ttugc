package com.p2082ss.android.ugc.aweme.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.util.j */
public final class C80134j {

    /* renamed from: a */
    static final HashMap<String, Aweme> f179551a = new HashMap<>();

    /* renamed from: b */
    public static final C80134j f179552b = new C80134j();

    private C80134j() {
    }

    static {
        Covode.recordClassIndex(93378);
    }

    /* renamed from: a */
    public static Aweme m138899a(String str) {
        C89219l.m154721d(str, "");
        return f179551a.get(str);
    }
}
