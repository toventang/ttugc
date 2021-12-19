package com.p2082ss.ttvideoengine.p4415h;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.ttvideoengine.p4430s.C86631b;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.h.t */
public enum EnumC86487t {
    instance;
    

    /* renamed from: a */
    private AbstractC86480q f194233a;

    /* renamed from: b */
    private JSONArray f194234b = new JSONArray();

    /* renamed from: c */
    private JSONArray f194235c = new JSONArray();

    /* renamed from: d */
    private AbstractC86469k f194236d;

    /* renamed from: e */
    private AbstractC86479p f194237e;

    /* renamed from: f */
    private Context f194238f;

    /* renamed from: g */
    private int f194239g = 2;

    /* renamed from: com_ss_ttvideoengine_log_VideoEventManager_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m149591xb4e2e764(String str, String str2) {
        return 0;
    }

    public final int getLoggerVersion() {
        return m149593x63f9a216(this);
    }

    /* renamed from: com.ss.ttvideoengine.h.t$a */
    static class RunnableC86488a implements Runnable {

        /* renamed from: a */
        private EnumC86487t f194240a;

        /* renamed from: b */
        private JSONObject f194241b;

        static {
            Covode.recordClassIndex(101716);
        }

        public final void run() {
            JSONObject jSONObject;
            EnumC86487t tVar = this.f194240a;
            if (tVar != null && (jSONObject = this.f194241b) != null) {
                tVar.showEvent(jSONObject);
            }
        }

        public RunnableC86488a(EnumC86487t tVar, JSONObject jSONObject) {
            this.f194240a = tVar;
            this.f194241b = jSONObject;
        }
    }

    static {
        Covode.recordClassIndex(101715);
    }

    public final int VideoEventManager__getLoggerVersion$___twin___() {
        C86641i.m150117e("VideoEventManager", "getLoggerVersion: " + this.f194239g);
        return this.f194239g;
    }

    public final synchronized JSONArray popAllEvents() {
        JSONArray jSONArray;
        MethodCollector.m26663i(4925);
        jSONArray = this.f194234b;
        this.f194234b = new JSONArray();
        MethodCollector.m26664o(4925);
        return jSONArray;
    }

    public final JSONArray popAllEventsV2() {
        MethodCollector.m26663i(5045);
        JSONArray jSONArray = this.f194235c;
        synchronized (EnumC86487t.class) {
            try {
                this.f194235c = new JSONArray();
            } finally {
                MethodCollector.m26664o(5045);
            }
        }
        return jSONArray;
    }

    public final void setListener(AbstractC86480q qVar) {
        this.f194233a = qVar;
    }

    public final void setUploader(AbstractC86469k kVar) {
        this.f194236d = kVar;
    }

    public final void setContext(Context context) {
        this.f194238f = m149592x5463a87c(context);
    }

    /* renamed from: com_ss_ttvideoengine_log_VideoEventManager_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m149592x5463a87c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public final synchronized void setEngineUploader(AbstractC86479p pVar) {
        MethodCollector.m26663i(4771);
        this.f194237e = pVar;
        MethodCollector.m26664o(4771);
    }

    private EnumC86487t(String str) {
    }

    public final void setLoggerVersion(int i) {
        C86641i.m150117e("VideoEventManager", "setLoggerVersion: ".concat(String.valueOf(i)));
        if (i == 1 || i == 2) {
            this.f194239g = i;
        }
    }

    /* renamed from: com_ss_ttvideoengine_log_VideoEventManager_com_ss_android_ugc_aweme_video_VideoEventManagerLancet_getLoggerVersion */
    public static int m149593x63f9a216(EnumC86487t tVar) {
        int i = 1;
        if (C16048b.m29633a().mo25421a(true, "player_event_log_v2_open", true)) {
            i = 2;
        }
        m149591xb4e2e764("VideoEventManagerLancet", Log.getStackTraceString(new RuntimeException("value:".concat(String.valueOf(i)))));
        return i;
    }

    public final void showEvent(JSONObject jSONObject) {
        String str;
        if (((C86641i.f195276c >> 2) & 1) == 1 || ((C86641i.f195274a >> 2) & 1) == 1) {
            String jSONObject2 = jSONObject.toString();
            if (jSONObject2 != null) {
                int i = 3900;
                if (jSONObject2.length() > 3900) {
                    int length = jSONObject2.length();
                    int i2 = 0;
                    while (i < length) {
                        C86641i.m150110a("VideoEventManager", jSONObject2.substring(i2, i));
                        i2 += 3900;
                        i = Math.min(i + 3900, length);
                    }
                    C86641i.m150110a("VideoEventManager", jSONObject2.substring(i2, i));
                }
            }
            C86641i.m150110a("VideoEventManager", jSONObject2);
        }
        if (((C86641i.f195274a >> 1) & 1) == 1) {
            Context context = this.f194238f;
            if (context != null) {
                str = Settings.Global.getString(context.getContentResolver(), "engine.debug");
                if (str == null) {
                    return;
                }
            } else {
                str = "";
            }
            String[] split = str.split(",", -1);
            for (String str2 : split) {
                if (jSONObject.opt(str2) != null) {
                    C86641i.m150110a("VideoEventManager", str2 + ":" + jSONObject.opt(str2));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo137691a(boolean z, JSONObject jSONObject) {
        MethodCollector.m26663i(4975);
        synchronized (EnumC86487t.class) {
            if (jSONObject == null) {
                MethodCollector.m26664o(4975);
                return;
            }
            try {
                C86641i.m150113b("VideoEventManager", "addEvent  uploadLog = ".concat(String.valueOf(z)));
                C86631b.m150044a(new RunnableC86488a(this, jSONObject));
                AbstractC86479p pVar = this.f194237e;
                if (pVar != null) {
                    pVar.mo137482a("video_playq", jSONObject);
                    return;
                }
                if (this.f194236d == null || !z) {
                    this.f194234b.put(jSONObject);
                    AbstractC86480q qVar = this.f194233a;
                    if (qVar != null) {
                        qVar.mo101145a();
                    }
                }
                MethodCollector.m26664o(4975);
            } finally {
                MethodCollector.m26664o(4975);
            }
        }
    }

    public final void addEventV2(boolean z, JSONObject jSONObject, String str) {
        MethodCollector.m26663i(5050);
        synchronized (EnumC86487t.class) {
            if (jSONObject == null) {
                MethodCollector.m26664o(5050);
                return;
            }
            try {
                C86641i.m150113b("VideoEventManager", "addEventV2  uploadLog = " + z + ", listener:" + this.f194233a + ", uploader:" + this.f194236d);
                C86631b.m150044a(new RunnableC86488a(this, jSONObject));
                AbstractC86479p pVar = this.f194237e;
                if (pVar != null) {
                    pVar.mo137483b(str, jSONObject);
                    return;
                }
                if (this.f194236d == null || !z) {
                    this.f194235c.put(jSONObject);
                    AbstractC86480q qVar = this.f194233a;
                    if (qVar != null) {
                        qVar.onEventV2(str);
                    }
                }
                MethodCollector.m26664o(5050);
            } finally {
                MethodCollector.m26664o(5050);
            }
        }
    }
}
