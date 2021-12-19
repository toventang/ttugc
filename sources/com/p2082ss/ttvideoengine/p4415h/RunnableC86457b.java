package com.p2082ss.ttvideoengine.p4415h;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.h.b */
final /* synthetic */ class RunnableC86457b implements Runnable {

    /* renamed from: a */
    private final C86446a f193896a;

    /* renamed from: b */
    private final String f193897b;

    /* renamed from: c */
    private final JSONObject f193898c;

    static {
        Covode.recordClassIndex(101685);
    }

    RunnableC86457b(C86446a aVar, String str, JSONObject jSONObject) {
        this.f193896a = aVar;
        this.f193897b = str;
        this.f193898c = jSONObject;
    }

    public final void run() {
        C86446a aVar = this.f193896a;
        String str = this.f193897b;
        JSONObject jSONObject = this.f193898c;
        C86641i.m150110a("AppLogEngineUploader", "onEvent event ".concat(String.valueOf(str)));
        if (jSONObject != null) {
            C86446a.m149183a(jSONObject);
            try {
                Class<?> cls = Class.forName("com.ss.android.common.applog.AppLog");
                jSONObject.put("session_id", (String) cls.getMethod("getCurrentSessionId", new Class[0]).invoke(null, new Object[0]));
                cls.getMethod("recordMiscLog", Context.class, String.class, JSONObject.class).invoke(null, aVar.f193829a, str, jSONObject);
            } catch (Exception e) {
                C86641i.m150117e("AppLogEngineUploader", "upload error " + e.toString());
            }
        }
    }
}
