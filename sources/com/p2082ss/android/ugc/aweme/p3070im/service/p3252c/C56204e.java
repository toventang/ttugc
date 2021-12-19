package com.p2082ss.android.ugc.aweme.p3070im.service.p3252c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.im.service.c.e */
public final class C56204e {

    /* renamed from: a */
    public static final C56204e f128200a = new C56204e();

    private C56204e() {
    }

    static {
        Covode.recordClassIndex(66013);
    }

    /* renamed from: b */
    public static boolean m102118b() {
        if (m102120d() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m102119c() {
        if (m102120d() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static int m102120d() {
        return C16048b.m29633a().mo25412a(true, "messaging_longpress_optimization", 0);
    }

    /* renamed from: a */
    public static boolean m102117a() {
        if (m102120d() == 1 || m102120d() == 2) {
            return true;
        }
        return false;
    }
}
