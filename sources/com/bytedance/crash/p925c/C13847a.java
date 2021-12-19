package com.bytedance.crash.p925c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AbstractC13878h;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.p932j.C13905e;
import com.bytedance.crash.runtime.C14013j;
import com.bytedance.crash.runtime.C14019n;
import com.bytedance.crash.runtime.p933a.C13989e;
import com.bytedance.crash.util.C14044b;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.c.a */
public final class C13847a {
    static {
        Covode.recordClassIndex(15904);
    }

    /* renamed from: a */
    public static void m25012a(final String str, final Map<? extends String, ? extends String> map, final Map<String, String> map2, final AbstractC13878h hVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        try {
            C14019n.m25421b().mo22551a(new Runnable() {
                /* class com.bytedance.crash.p925c.C13847a.RunnableC138481 */

                static {
                    Covode.recordClassIndex(15905);
                }

                public final void run() {
                    try {
                        Context context = C13933m.f33936a;
                        long j = currentTimeMillis;
                        String str = str;
                        C13864b bVar = new C13864b();
                        bVar.mo22346a("is_dart", (Object) 1);
                        bVar.mo22346a("crash_time", Long.valueOf(j));
                        bVar.mo22346a("process_name", (Object) C14044b.m25520c(context));
                        bVar.mo22346a("data", (Object) str);
                        C14044b.m25512a(context, bVar.f33757a);
                        C13864b a = C13989e.m25320a().mo22510a(CrashType.DART, bVar);
                        if (map != null) {
                            JSONObject optJSONObject = a.f33757a.optJSONObject("custom");
                            if (optJSONObject == null) {
                                optJSONObject = new JSONObject();
                            }
                            C13864b.m25058a(optJSONObject, map);
                            Map map = map2;
                            if (map != null) {
                                C13864b.m25058a(optJSONObject, map);
                            }
                            bVar.mo22346a("custom", optJSONObject);
                        }
                        a.mo22346a("logcat", (Object) C14013j.m25406a(C13933m.m25230f()));
                        C13905e.m25158a().mo22388a(a.f33757a);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }
}
