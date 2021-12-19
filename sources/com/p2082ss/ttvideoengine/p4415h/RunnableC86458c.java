package com.p2082ss.ttvideoengine.p4415h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.h.c */
final /* synthetic */ class RunnableC86458c implements Runnable {

    /* renamed from: a */
    private final String f193899a;

    /* renamed from: b */
    private final JSONObject f193900b;

    static {
        Covode.recordClassIndex(101686);
    }

    RunnableC86458c(String str, JSONObject jSONObject) {
        this.f193899a = str;
        this.f193900b = jSONObject;
    }

    public final void run() {
        String str = this.f193899a;
        JSONObject jSONObject = this.f193900b;
        C86641i.m150110a("AppLogEngineUploader", "onEventV2 monitorName ".concat(String.valueOf(str)));
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            C86446a.m149183a(jSONObject);
            try {
                jSONObject.putOpt("params_for_special", "videoplayer_monitor");
                Class.forName("com.ss.android.common.c.a").getMethod("a", String.class, JSONObject.class).invoke(null, str, jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
                C86641i.m150117e("AppLogEngineUploader", "upload error ".concat(String.valueOf(e)));
            }
        }
    }
}
