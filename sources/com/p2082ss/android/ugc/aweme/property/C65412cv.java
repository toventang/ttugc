package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.property.cv */
public final class C65412cv {

    /* renamed from: a */
    public static final C65412cv f147561a = new C65412cv();

    private C65412cv() {
    }

    static {
        Covode.recordClassIndex(76899);
    }

    /* renamed from: a */
    public static final int m117127a() {
        return C16048b.m29633a().mo25412a(true, "camera_reply_questions", 0);
    }

    /* renamed from: c */
    public static boolean m117129c() {
        if (m117127a() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m117130d() {
        if (m117127a() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m117131e() {
        if (m117127a() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m117128b() {
        if (m117127a() == 2 || m117127a() == 3) {
            return true;
        }
        return false;
    }
}
