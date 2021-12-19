package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.b.a */
public final class C55058a {

    /* renamed from: a */
    public static final C55058a f126006a = new C55058a();

    /* renamed from: a */
    public static String m100682a(int i) {
        return i != 0 ? i != 1 ? i != 20 ? "" : "group" : "stranger" : "private";
    }

    private C55058a() {
    }

    static {
        Covode.recordClassIndex(64786);
    }

    /* renamed from: a */
    public static final String m100681a() {
        String uuid = UUID.randomUUID().toString();
        C89219l.m154716b(uuid, "");
        C55059b.m100688a(uuid);
        return uuid;
    }

    /* renamed from: a */
    public static final String m100683a(C53709a aVar) {
        if (aVar == null) {
            return "";
        }
        if (aVar.isStrangerChat()) {
            return "message_box";
        }
        String a = C55059b.m100686a("enter_from", "chat");
        C89219l.m154716b(a, "");
        return a;
    }
}
