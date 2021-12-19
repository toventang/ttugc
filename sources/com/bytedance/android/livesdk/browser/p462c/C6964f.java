package com.bytedance.android.livesdk.browser.p462c;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.livesetting.hybrid.TTLiveWebviewMonitorConfigSlardarAndroidSetting;
import com.bytedance.android.monitor.webview.AbstractC12009a;
import com.bytedance.android.monitor.webview.AbstractC12021c;
import com.bytedance.android.monitor.webview.C12036f;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.c.f */
public final class C6964f {

    /* renamed from: a */
    private static boolean f17428a;

    static {
        Covode.recordClassIndex(7703);
    }

    /* renamed from: a */
    public static void m14873a() {
        if (!f17428a) {
            f17428a = true;
            AbstractC12021c.C12022a d = C12044i.f28862a.mo19228d();
            AbstractC12021c.C12022a a = d.mo19254a(new AbstractC12009a() {
                /* class com.bytedance.android.livesdk.browser.p462c.C6964f.C69651 */

                static {
                    Covode.recordClassIndex(7704);
                }

                @Override // com.bytedance.android.monitor.webview.AbstractC12009a
                /* renamed from: a */
                public final void mo13268a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
                    C3868c.m9498b(str, i, jSONObject, jSONObject2);
                }
            });
            a.f28769a = "99999";
            a.f28778j = TTLiveWebviewMonitorConfigSlardarAndroidSetting.INSTANCE.getValue();
            a.f28770b = C12036f.m21317a();
            C12044i.f28862a.mo19225b(d);
        }
    }
}
