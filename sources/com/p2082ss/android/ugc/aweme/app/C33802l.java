package com.p2082ss.android.ugc.aweme.app;

import android.content.SharedPreferences;
import com.bytedance.common.utility.p910e.C13611a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.ugc.aweme.app.l */
public final class C33802l {
    static {
        Covode.recordClassIndex(40699);
    }

    /* renamed from: a */
    public static int m69153a() {
        return C34822d.m71158a(C17867d.m33078a(), "app_setting", 0).getInt("last_version_code", 0);
    }

    /* renamed from: a */
    public static void m69154a(int i) {
        SharedPreferences.Editor edit = C34822d.m71158a(C17867d.m33078a(), "app_setting", 0).edit();
        edit.putInt("last_version_code", i);
        C13611a.m24460a(edit);
    }
}
