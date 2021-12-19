package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3093c.p3094a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.c.a.a */
public final class C53841a {

    /* renamed from: a */
    public static final C53841a f123464a = new C53841a();

    private C53841a() {
    }

    static {
        Covode.recordClassIndex(63501);
    }

    /* renamed from: a */
    public static Keva m99080a() {
        Keva repo = Keva.getRepo("message_button_text_repo");
        C89219l.m154716b(repo, "");
        return repo;
    }

    /* renamed from: a */
    public static void m99081a(String str, Keva keva, long j) {
        if (!keva.contains("key_double_follow_time_stamp".concat(String.valueOf(str)))) {
            keva.storeLong("key_double_follow_time_stamp".concat(String.valueOf(str)), j);
        }
    }
}
