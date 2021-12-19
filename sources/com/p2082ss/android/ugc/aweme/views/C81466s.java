package com.p2082ss.android.ugc.aweme.views;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.views.s */
public final class C81466s {

    /* renamed from: a */
    public static final C81466s f182122a = new C81466s();

    private C81466s() {
    }

    static {
        Covode.recordClassIndex(94838);
    }

    /* renamed from: a */
    public static boolean m141248a() {
        if (m141250c() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static int m141250c() {
        return C16048b.m29633a().mo25412a(true, "video_caption_line_height", 0);
    }

    /* renamed from: b */
    public static int m141249b() {
        int c = m141250c();
        if (c == 1) {
            return 20;
        }
        if (c != 2) {
            return 18;
        }
        return 22;
    }
}
