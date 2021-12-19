package com.bytedance.android.livesdk.p450an;

import android.text.TextUtils;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.livesetting.other.LoginGuideConfigSetting;
import com.bytedance.android.livesdk.model.LoginGuideConfig;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.an.a */
public final class C6782a {
    static {
        Covode.recordClassIndex(7520);
    }

    /* renamed from: b */
    public static String m14570b() {
        LoginGuideConfig value = LoginGuideConfigSetting.INSTANCE.getValue();
        if (value == null) {
            return null;
        }
        return value.getImageUrlFromFollow();
    }

    /* renamed from: a */
    public static String m14569a() {
        LoginGuideConfig value = LoginGuideConfigSetting.INSTANCE.getValue();
        if (value == null || TextUtils.isEmpty(value.getFromFollow())) {
            return C3966y.m9657a((int) R.string.gj0);
        }
        return value.getFromFollow();
    }
}
