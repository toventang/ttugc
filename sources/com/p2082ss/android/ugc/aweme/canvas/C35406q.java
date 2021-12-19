package com.p2082ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.canvas.q */
public final class C35406q {

    /* renamed from: a */
    public static final C35406q f83541a = new C35406q();

    /* renamed from: b */
    private static final boolean f83542b = C16048b.m29633a().mo25421a(true, "enable_photo_lowfps", false);

    private C35406q() {
    }

    /* renamed from: a */
    public static int m72427a() {
        if (f83542b) {
            return 10;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m72428b() {
        if (f83542b) {
            return 30;
        }
        return 0;
    }

    static {
        Covode.recordClassIndex(42580);
    }
}
