package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtFollowButtonStyleSetting;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.userinfowidget.a */
public final class C11024a {
    static {
        Covode.recordClassIndex(12642);
    }

    /* renamed from: a */
    public static String m19685a() {
        if (LiveMtFollowButtonStyleSetting.INSTANCE.getValue() != 1) {
            return "ttlive_user_info_follow_complete.webp";
        }
        if (C3966y.m9672g()) {
            return "ttlive_lottie_anim_follow_tick_rtl.webp";
        }
        return "ttlive_lottie_anim_follow_tick.webp";
    }
}
