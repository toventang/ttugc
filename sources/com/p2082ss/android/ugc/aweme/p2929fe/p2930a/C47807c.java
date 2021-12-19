package com.p2082ss.android.ugc.aweme.p2929fe.p2930a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.fe.a.c */
public final class C47807c {
    static {
        Covode.recordClassIndex(56433);
    }

    /* renamed from: a */
    public static Map<String, String> m90823a() {
        HashMap hashMap = new HashMap();
        C29803q.m60037b(hashMap, true);
        return hashMap;
    }

    /* renamed from: a */
    public static Map<String, String> m90824a(List<String> list) {
        HashMap hashMap = new HashMap();
        hashMap.put("appVersion", C17867d.m33085f());
        hashMap.put("device_id", AppLog.getServerDeviceId());
        Context a = C17867d.m33078a();
        if (TextUtils.isEmpty(C58029j.f132254f) || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132254f = NetworkUtils.getNetworkAccessType(a);
        }
        hashMap.put("netType", C58029j.f132254f);
        hashMap.put("appName", C17867d.m33081b());
        hashMap.put("aid", String.valueOf(C17867d.f42590n));
        hashMap.put("user_id", C31575b.m65865g().getCurUserId());
        hashMap.put("versionCode", String.valueOf(C17867d.m33084e()));
        hashMap.put("channel", C17867d.f42595s);
        hashMap.put("os_version", Build.VERSION.RELEASE);
        hashMap.put("device_platform", "android");
        hashMap.put("ironManSupported", String.valueOf(C59320c.C59324a.f135560a.mo96989a().checkMiniAppEnable(C17867d.m33078a())));
        hashMap.put("prefetch_enable", "1");
        hashMap.put("device_type", Build.MODEL);
        if (list != null) {
            for (String str : list) {
                hashMap.remove(str);
            }
        }
        return hashMap;
    }
}
