package com.p2082ss.android.p2144h.p2145a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.applog.C29810v;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.p2144h.C29913a;
import com.p2082ss.android.p2144h.C29919b;
import com.p2082ss.android.p2144h.C29920c;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.h.a.a */
public final class C29916a extends AbstractC29917b {
    static {
        Covode.recordClassIndex(36327);
    }

    @Override // com.p2082ss.android.p2144h.p2145a.AbstractC29918c
    /* renamed from: a */
    public final String mo52223a() {
        return C29919b.f71375c;
    }

    @Override // com.p2082ss.android.p2144h.p2145a.AbstractC29917b
    /* renamed from: a */
    public final void mo52225a(C29920c cVar) {
        long j;
        String str = cVar.f71394a;
        Map<String, Object> map = cVar.f71396c;
        if (!TextUtils.isEmpty(str)) {
            if (C29919b.f71378f == (cVar.f71395b & C29919b.f71378f)) {
                if (map == null) {
                    AppLog.onEvent(null, str);
                    return;
                }
                String str2 = (String) map.get(C29919b.f71389q);
                Object obj = map.get(C29919b.f71386n);
                String str3 = obj instanceof String ? (String) obj : null;
                Object obj2 = map.get(C29919b.f71390r);
                long j2 = 0;
                if (obj2 instanceof Long) {
                    j = ((Long) obj2).longValue();
                } else {
                    j = 0;
                }
                Object obj3 = map.get(C29919b.f71391s);
                if (obj3 instanceof Long) {
                    j2 = ((Long) obj3).longValue();
                }
                Object obj4 = map.get(C29919b.f71392t);
                AppLog.onEvent((Context) null, str2, str, str3, j, j2, obj4 instanceof JSONObject ? (JSONObject) obj4 : null);
            } else if (C29919b.f71379g == (cVar.f71395b & C29919b.f71379g)) {
                JSONObject jSONObject = new JSONObject();
                if (map != null) {
                    try {
                        for (Map.Entry<String, Object> entry : map.entrySet()) {
                            if (entry != null && (entry.getValue() instanceof String) && (entry.getKey() instanceof String)) {
                                jSONObject.put(entry.getKey(), entry.getValue());
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                C29819a.m60077a(cVar.f71394a, jSONObject);
            }
        }
    }

    @Override // com.p2082ss.android.p2144h.p2145a.AbstractC29918c
    /* renamed from: a */
    public final void mo52224a(Context context, C29913a aVar) {
        AppLog.setAppId(aVar.f71358h);
        AppLog.setChannel(aVar.f71354d);
        AppLog.init(context, false, new C29810v(new String[]{"https://log.tiktokv.com/service/2/app_log/"}, new String[]{"https://log.tiktokv.com/service/2/app_log/"}, new String[]{"https://log.tiktokv.com/service/2/device_register/", "https://log.tiktokv.com/service/2/device_register/"}, "https://log.tiktokv.com/service/2/app_alert_check/", "https://log.tiktokv.com/service/2/log_settings/", new String[]{"https://log.tiktokv.com/service/2/app_log/"}, "https://log.tiktokv.com/service/2/log_settings/", "https://log.tiktokv.com"));
    }
}
