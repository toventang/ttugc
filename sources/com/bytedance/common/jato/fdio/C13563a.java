package com.bytedance.common.jato.fdio;

import com.bytedance.common.jato.C13558e;
import com.bytedance.common.jato.Jato;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.jato.fdio.a */
public final class C13563a {
    static {
        Covode.recordClassIndex(15580);
    }

    /* renamed from: a */
    public static void m24368a(final String str) {
        C13558e.m24362b().execute(new Runnable() {
            /* class com.bytedance.common.jato.fdio.C13563a.RunnableC135641 */

            static {
                Covode.recordClassIndex(15581);
            }

            public final void run() {
                if (!Jato.isDebug()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("collect_or_preload", str);
                        C13558e.m24360a().mo23858a("fdio_monitor_3", jSONObject, (JSONObject) null);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public static void m24369b(final String str) {
        C13558e.m24362b().execute(new Runnable() {
            /* class com.bytedance.common.jato.fdio.C13563a.RunnableC135652 */

            static {
                Covode.recordClassIndex(15582);
            }

            public final void run() {
                if (!Jato.isDebug()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("collect_reason", str);
                        C13558e.m24360a().mo23858a("fdio_monitor_3", jSONObject, (JSONObject) null);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }
}
