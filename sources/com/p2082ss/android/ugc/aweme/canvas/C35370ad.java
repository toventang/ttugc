package com.p2082ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.canvas.ad */
public final class C35370ad {

    /* renamed from: a */
    public static final C35370ad f83455a = new C35370ad();

    /* renamed from: b */
    private static final boolean f83456b = C16048b.m29633a().mo25421a(true, "enable_photo_lowfps_story", false);

    private C35370ad() {
    }

    /* renamed from: a */
    public static int m72396a() {
        if (f83456b) {
            return 10;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m72397b() {
        if (f83456b) {
            return 30;
        }
        return 0;
    }

    static {
        Covode.recordClassIndex(42541);
    }
}
