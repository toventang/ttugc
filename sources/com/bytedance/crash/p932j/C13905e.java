package com.bytedance.crash.p932j;

import android.content.Context;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.nativecrash.C13964g;
import com.bytedance.crash.runtime.C14019n;
import com.bytedance.crash.runtime.C14022p;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14062n;
import com.bytedance.crash.util.C14069r;
import com.bytedance.crash.util.C14076w;
import java.io.File;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.j.e */
public final class C13905e {

    /* renamed from: b */
    private static volatile C13905e f33878b;

    /* renamed from: a */
    public final Context f33879a;

    static {
        Covode.recordClassIndex(15965);
    }

    /* renamed from: a */
    public static C13905e m25158a() {
        if (f33878b == null) {
            f33878b = new C13905e(C13933m.f33936a);
        }
        return f33878b;
    }

    private C13905e(Context context) {
        this.f33879a = context;
    }

    /* renamed from: b */
    public final void mo22389b(final JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            C14019n.m25421b().mo22551a(new Runnable() {
                /* class com.bytedance.crash.p932j.C13905e.RunnableC139061 */

                static {
                    Covode.recordClassIndex(15966);
                }

                public final void run() {
                    String javaCrashUploadUrl = C13933m.f33942g.getJavaCrashUploadUrl();
                    try {
                        jSONObject.put("upload_scene", "direct");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    C13907f.m25165a(javaCrashUploadUrl, jSONObject.toString());
                }
            });
        }
    }

    /* renamed from: a */
    public final boolean mo22388a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String javaCrashUploadUrl = C13933m.f33942g.getJavaCrashUploadUrl();
                File file = new File(C14069r.m25619a(this.f33879a), "dart_".concat(String.valueOf(C13933m.m25228d())));
                C14056j.m25559a(file, file.getName(), javaCrashUploadUrl, jSONObject);
                jSONObject.put("upload_scene", "direct");
                if (!C13907f.m25165a(javaCrashUploadUrl, jSONObject.toString()).mo22410a()) {
                    return false;
                }
                C14056j.m25574a(file);
                return true;
            } catch (Throwable unused) {
                C13933m.f33942g.isDebugMode();
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo22387a(String str, JSONObject jSONObject) {
        if (!C14062n.m25597a(jSONObject)) {
            try {
                File file = new File(C14069r.m25619a(this.f33879a), C1764a.m5928a("ensure_%s", new Object[]{C13933m.m25228d()}));
                C14056j.m25559a(file, file.getName(), str, jSONObject);
                if (C13907f.m25165a(str, jSONObject.toString()).mo22410a()) {
                    C14056j.m25574a(file);
                }
            } catch (Throwable unused) {
                C13933m.f33942g.isDebugMode();
            }
        }
    }

    /* renamed from: a */
    public static boolean m25160a(JSONObject jSONObject, File file, File file2) {
        boolean z = false;
        try {
            String asanReportUploadUrl = C13933m.f33942g.getAsanReportUploadUrl();
            C14076w.m25659a(jSONObject, file2);
            z = C13907f.m25167a(asanReportUploadUrl, jSONObject.toString(), new C14056j.C14058b(file), new C14056j.C14058b(file2)).mo22410a();
            return z;
        } catch (Throwable unused) {
            C13933m.f33942g.isDebugMode();
            return z;
        }
    }

    /* renamed from: a */
    public static boolean m25159a(String str, String str2, String str3, List<String> list) {
        new StringBuilder("real upload alog ").append(str3).append(": ").append(list);
        C13933m.f33942g.isDebugMode();
        try {
            return C13907f.m25172a(C13933m.f33942g.getAlogUploadUrl(), str, str2, str3, list);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m25161a(JSONObject jSONObject, File file, File file2, long j) {
        try {
            String nativeCrashUploadUrl = C13933m.f33942g.getNativeCrashUploadUrl();
            try {
                C14076w.m25659a(jSONObject, file2);
            } catch (Throwable th) {
                C13849d.m25014a("NPTH_CATCH", th);
            }
            return C13907f.m25167a(nativeCrashUploadUrl, jSONObject.toString(), new C14056j.C14058b(file), new C14056j.C14058b(file2), C14022p.m25429b(j), C13964g.m25284a(jSONObject.optJSONArray("alive_pids"))).mo22410a();
        } catch (Throwable unused) {
            C13933m.f33942g.isDebugMode();
            return false;
        }
    }
}
