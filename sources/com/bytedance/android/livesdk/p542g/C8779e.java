package com.bytedance.android.livesdk.p542g;

import android.text.TextUtils;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveForbbidenDetailPageSetting;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.g.e */
public final class C8779e {

    /* renamed from: a */
    public static boolean f21647a;

    static {
        Covode.recordClassIndex(9656);
    }

    /* renamed from: a */
    public static String m17078a() {
        String value = LiveForbbidenDetailPageSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            return m17079b();
        }
        return value;
    }

    /* renamed from: b */
    private static String m17079b() {
        if (((IHostApp) C6193a.m13435a(IHostApp.class)).isInMusicallyRegion()) {
            return "https://webcast-va.tiktokv.com/falcon/webcast_mt/page/ban/index.html?showHeader=1";
        }
        return "https://webcast.tiktokv.com/falcon/webcast_mt/page/ban/index.html?showHeader=1";
    }
}
