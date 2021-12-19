package com.p2082ss.android.message.log;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.message.log.c */
public final class C30070c {
    static {
        Covode.recordClassIndex(36566);
    }

    /* renamed from: a */
    private static Object m60824a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m60825a(Context context, String str, Bundle bundle) {
        if (!C13627m.m24498a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                if (bundle != null) {
                    for (String str2 : bundle.keySet()) {
                        jSONObject.put(str2, m60824a(bundle, str2));
                    }
                }
            } catch (Throwable unused) {
            }
            m60827a(context, "event_v3", str, null, 0, 0, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m60828a(Context context, String str, String str2, JSONObject... jSONObjectArr) {
        if (jSONObjectArr.length > 0) {
            m60827a(context, "event_v1", str, str2, 0, 0, jSONObjectArr[0]);
        } else {
            m60827a(context, "event_v1", str, str2, 0, 0, null);
        }
    }

    /* renamed from: a */
    public static void m60826a(Context context, String str, String str2, String str3, long j, long j2) {
        m60827a(context, str, str2, str3, j, j2, null);
    }

    /* renamed from: a */
    public static void m60827a(final Context context, final String str, final String str2, final String str3, final long j, final long j2, final JSONObject jSONObject) {
        if (!C13627m.m24498a(str) && !C13627m.m24498a(str2)) {
            new RunnableC13596e() {
                /* class com.p2082ss.android.message.log.C30070c.C300711 */

                static {
                    Covode.recordClassIndex(36567);
                }

                @Override // com.bytedance.common.utility.p907b.RunnableC13596e
                public final void run() {
                    try {
                        C30069b bVar = new C30069b();
                        bVar.f71765a = str;
                        bVar.f71766b = str2;
                        bVar.f71767c = str3;
                        bVar.f71768d = j;
                        bVar.f71769e = j2;
                        JSONObject jSONObject = jSONObject;
                        if (jSONObject != null) {
                            bVar.f71770f = jSONObject.toString();
                        }
                        Logger.debug();
                        C30067a a = C30067a.m60819a(context);
                        if (a != null) {
                            a.mo53437a(bVar);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }.mo21860a();
        }
    }
}
