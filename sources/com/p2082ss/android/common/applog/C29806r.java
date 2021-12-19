package com.p2082ss.android.common.applog;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.common.applog.p2129b.C29784d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ConcurrentModificationException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.r */
public class C29806r {

    /* renamed from: b */
    private static volatile C29806r f71131b;

    /* renamed from: a */
    public Context f71132a;

    static {
        Covode.recordClassIndex(36211);
    }

    private C29806r(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f71132a = applicationContext;
    }

    /* renamed from: a */
    public static C29806r m60039a(Context context) {
        MethodCollector.m26663i(6011);
        if (f71131b == null) {
            synchronized (C29806r.class) {
                try {
                    if (f71131b == null) {
                        f71131b = new C29806r(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6011);
                    throw th;
                }
            }
        }
        C29806r rVar = f71131b;
        MethodCollector.m26664o(6011);
        return rVar;
    }

    /* renamed from: a */
    public final Pair<Long, String> mo52079a(C29784d dVar, JSONObject jSONObject) {
        String str;
        if (dVar == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("magic_tag", "ss_app_log");
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("datetime", AppLog.formatDate(dVar.f71024a));
            jSONObject3.put("local_time_ms", System.currentTimeMillis());
            jSONObject3.put("session_id", dVar.f71025b);
            int i = 1;
            jSONObject3.put("bg_session", 1);
            if (!TextUtils.isEmpty(dVar.f71027d)) {
                jSONObject3.put("from_session", dVar.f71027d);
            }
            if (!TextUtils.isEmpty(dVar.f71029f)) {
                jSONObject3.put("to_session", dVar.f71029f);
            }
            jSONObject3.put("duration", Math.max(1L, Math.max(0L, (dVar.f71030g - dVar.f71024a) - dVar.f71031h) / 1000));
            boolean z = dVar.f71026c;
            boolean z2 = dVar.f71028e;
            if (z || z2) {
                if (z && !z2) {
                    i = 2;
                } else if (z || !z2) {
                    i = 4;
                } else {
                    i = 3;
                }
            }
            jSONObject3.put("session_type", i);
            jSONObject3.put("is_background", false);
            AppLog.tryPutEventIndex(jSONObject3);
            jSONArray.put(jSONObject3);
            jSONObject2.put("terminate", jSONArray);
            try {
                str = jSONObject2.toString();
            } catch (ConcurrentModificationException unused) {
                str = jSONObject2.toString();
            }
            return Pair.create(Long.valueOf(C29786d.m59984a(this.f71132a).mo52057a(str)), str);
        } catch (Throwable unused2) {
            return null;
        }
    }
}
