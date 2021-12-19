package com.p2082ss.android.ugc.aweme.p3070im.service.p3252c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.im.service.c.d */
public final class C56203d {

    /* renamed from: a */
    public static final C56203d f128199a = new C56203d();

    private C56203d() {
    }

    static {
        Covode.recordClassIndex(66012);
    }

    /* renamed from: a */
    public static int m102112a() {
        return C16048b.m29633a().mo25412a(true, "im_guide_user_to_send_message", 0);
    }

    /* renamed from: b */
    public static boolean m102113b() {
        if (m102112a() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m102116e() {
        if (m102112a() == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m102114c() {
        if (m102112a() == 3 || m102112a() == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m102115d() {
        if (m102112a() == 0 || m102112a() == 1 || m102112a() == 2 || m102112a() == 4) {
            return true;
        }
        return false;
    }
}
