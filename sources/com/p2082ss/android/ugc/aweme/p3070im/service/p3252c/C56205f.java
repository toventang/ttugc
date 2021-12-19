package com.p2082ss.android.ugc.aweme.p3070im.service.p3252c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.im.service.c.f */
public final class C56205f {

    /* renamed from: a */
    public static final C56205f f128201a = new C56205f();

    private C56205f() {
    }

    static {
        Covode.recordClassIndex(66014);
    }

    /* renamed from: a */
    public static int m102121a() {
        return C16048b.m29633a().mo25412a(true, "im_chat_reply", 0);
    }

    /* renamed from: b */
    public static final boolean m102122b() {
        if (m102121a() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m102123c() {
        if (m102121a() == 4 || m102121a() == 3) {
            return true;
        }
        return false;
    }
}
