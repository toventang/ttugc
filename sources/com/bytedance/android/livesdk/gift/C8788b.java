package com.bytedance.android.livesdk.gift;

import android.content.SharedPreferences;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.bytedance.android.livesdk.gift.b */
public final class C8788b {
    static {
        Covode.recordClassIndex(9666);
    }

    /* renamed from: a */
    public static boolean m17097a() {
        if (C3966y.m9669e() != null) {
            return C34822d.m71158a(C3966y.m9669e(), "broadcast_storage", 0).getBoolean("saved_last_gift_feature", true);
        }
        return true;
    }

    /* renamed from: a */
    public static void m17096a(boolean z) {
        if (C3966y.m9669e() != null) {
            SharedPreferences.Editor edit = C34822d.m71158a(C3966y.m9669e(), "broadcast_storage", 0).edit();
            edit.putBoolean("saved_last_gift_feature", z);
            edit.commit();
        }
    }
}
