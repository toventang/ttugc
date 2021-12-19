package com.p2082ss.android.ugc.aweme.web;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.web.jsbridge2.AbstractC18347m;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.crossplatform.CrossPlatformServiceImpl;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.h */
public class C81546h {

    /* renamed from: a */
    private static long f182354a = System.currentTimeMillis();

    static {
        Covode.recordClassIndex(94924);
    }

    /* renamed from: a */
    public static List<String> m141419a(List<String> list) {
        return m141420a(list, false);
    }

    /* renamed from: a */
    private static void m141421a(Set<String> set, String[] strArr) {
        int i = -1;
        String str = "";
        if (set != null) {
            try {
                i = set.size();
                str = set.toString();
            } catch (Exception unused) {
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("size", i);
        jSONObject.put("content", str);
        if (!TextUtils.isEmpty(strArr[0])) {
            jSONObject.put("response", strArr);
        }
        C12290b.m22064a("jsb_config_log", jSONObject);
    }

    /* renamed from: a */
    public static List<String> m141420a(List<String> list, boolean z) {
        Set<String> a;
        long currentTimeMillis;
        HashSet hashSet = new HashSet();
        List<String> jsbSafeHost = C58939a.C58940a.f134171a.f134170a.getJsbSafeHost();
        if (jsbSafeHost != null) {
            hashSet.addAll(jsbSafeHost);
        }
        boolean a2 = SettingsManager.m29616a().mo25400a("jsb_ignore_gecko_safe_host", true);
        if (!z || !a2) {
            long currentTimeMillis2 = System.currentTimeMillis();
            String[] strArr = new String[1];
            boolean a3 = SettingsManager.m29616a().mo25400a("use_bridge_engine_v2", true);
            do {
                a = C18364w.m34181a(list, new AbstractC18347m.AbstractC18348a() {
                    /* class com.p2082ss.android.ugc.aweme.web.C81546h.C815471 */

                    static {
                        Covode.recordClassIndex(94925);
                    }

                    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m.AbstractC18348a
                    /* renamed from: a */
                    public final String mo29390a(String str, String str2) {
                        return Keva.getRepo("jsbridge2-permission", 1).getString(str, str2);
                    }

                    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m.AbstractC18348a
                    /* renamed from: b */
                    public final void mo29392b(String str, String str2) {
                        Keva.getRepo("jsbridge2-permission", 1).storeString(str, str2);
                    }

                    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m.AbstractC18348a
                    /* renamed from: a */
                    public final void mo29391a(String str, AbstractC18347m.AbstractC18348a.AbstractC18349a aVar) {
                        aVar.mo29315a(Keva.getRepo("jsbridge2-permission", 1).getString(str, ""));
                    }
                }, CrossPlatformServiceImpl.m81709c().mo69603b());
                currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                if (!a.isEmpty() || !a3 || System.currentTimeMillis() - f182354a > 3000) {
                }
            } while (currentTimeMillis < InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            if (!a.isEmpty() || !a3) {
                hashSet.addAll(a);
            } else {
                m141421a(a, strArr);
            }
        }
        return new ArrayList(hashSet);
    }
}
