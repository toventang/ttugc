package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.settings.m */
public final class C68747m {

    /* renamed from: a */
    public static final int f153778a = 1;

    /* renamed from: b */
    public static final int f153779b = 2;

    /* renamed from: c */
    public static final int f153780c = 3;

    /* renamed from: d */
    public static final int f153781d = 4;

    /* renamed from: e */
    public static final C68747m f153782e = new C68747m();

    private C68747m() {
    }

    /* renamed from: b */
    public static boolean m121181b() {
        int e = m121184e();
        if (e == f153779b || e == f153780c) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m121182c() {
        if (m121184e() == f153781d) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m121183d() {
        int e = m121184e();
        if (e == f153779b || e == f153781d) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static int m121184e() {
        return C16048b.m29633a().mo25412a(true, "enable_publish_parallel", 1);
    }

    static {
        Covode.recordClassIndex(81016);
    }

    /* renamed from: a */
    public static final boolean m121180a() {
        int e = m121184e();
        if (e == f153779b || e == f153780c || e == f153781d) {
            return true;
        }
        return false;
    }
}
