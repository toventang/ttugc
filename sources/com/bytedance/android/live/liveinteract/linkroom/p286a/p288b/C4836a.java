package com.bytedance.android.live.liveinteract.linkroom.p286a.p288b;

import android.content.Context;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1206f.C17309b;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.a.b.a */
public final class C4836a {
    static {
        Covode.recordClassIndex(5418);
    }

    /* renamed from: a */
    public static void m10966a(int i) {
        String str;
        if (i == 1) {
            str = "anchor_linkmic_red_dot_shown";
        } else {
            str = "guest_linkmic_red_dot_shown";
        }
        m10968b(str);
    }

    /* renamed from: a */
    public static boolean m10967a(String str) {
        Context context = ((IHostContext) C6193a.m13435a(IHostContext.class)).context();
        if (context == null || C17309b.m32048a(context, C17309b.f41588b).mo27622a(str, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m10968b(String str) {
        Context context = ((IHostContext) C6193a.m13435a(IHostContext.class)).context();
        if (context != null) {
            C17309b.m32048a(context, C17309b.f41588b).mo27619a(str, (Object) true).mo27621a();
        }
    }
}
