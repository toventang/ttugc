package com.bytedance.android.live.effect.api;

import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableNewGestureDialogSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.effect.api.a */
public final class C4147a {

    /* renamed from: a */
    public static final String f11583a;

    /* renamed from: b */
    public static final String f11584b = C3966y.m9657a((int) R.string.gmr);

    /* renamed from: c */
    public static final String f11585c = C3966y.m9657a((int) R.string.gmt);

    /* renamed from: d */
    public static final String f11586d = C3966y.m9657a((int) R.string.gmo);

    /* renamed from: e */
    public static final String f11587e = C3966y.m9657a((int) R.string.gmp);

    /* renamed from: f */
    public static String f11588f;

    static {
        String a;
        Covode.recordClassIndex(4717);
        if (LiveEnableNewGestureDialogSetting.INSTANCE.enable()) {
            a = C3966y.m9657a((int) R.string.gmq);
        } else {
            a = C3966y.m9657a((int) R.string.gms);
        }
        f11583a = a;
    }
}
