package com.bytedance.android.monitor;

import android.os.Looper;
import com.bytedance.android.monitor.p706d.C11919c;
import com.bytedance.android.monitor.p708f.C11929a;
import com.bytedance.android.monitor.webview.AbstractC12009a;
import com.bytedance.android.monitor.webview.C12043h;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.a */
public class C11897a {

    /* renamed from: a */
    public AbstractC12009a f28454a = new C12043h();

    static {
        Covode.recordClassIndex(13623);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19106a(final C11919c cVar) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            C11929a.m21040a().submit(new Runnable() {
                /* class com.bytedance.android.monitor.C11897a.RunnableC118981 */

                static {
                    Covode.recordClassIndex(13624);
                }

                public final void run() {
                    C11905b.m20996a(cVar);
                }
            });
        } else {
            C11905b.m20996a(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19107a(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z, AbstractC12009a aVar) {
        C11919c.C11920a aVar2 = new C11919c.C11920a(str3);
        aVar2.f28480a = str;
        aVar2.f28481b = str2;
        aVar2.f28482c = jSONObject;
        aVar2.f28483d = jSONObject2;
        aVar2.f28484e = jSONObject3;
        aVar2.f28486g = jSONObject4;
        aVar2.f28487h = z;
        aVar2.f28488i = aVar;
        mo19106a(aVar2.mo19133a());
    }
}
