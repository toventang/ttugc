package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.story;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.b */
public final class C54346b {

    /* renamed from: a */
    public static final C54346b f124484a = new C54346b();

    private C54346b() {
    }

    static {
        Covode.recordClassIndex(64046);
    }

    /* renamed from: a */
    public static void m99660a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        Keva.getRepo("story_direct_message").storeString(str, str2);
    }

    /* renamed from: b */
    public static boolean m99661b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return C89219l.m154714a((Object) str2, (Object) Keva.getRepo("story_direct_message").getString(str, ""));
    }
}
