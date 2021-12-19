package com.bytedance.android.monitorV2;

import android.os.Looper;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.android.monitorV2.p731d.C12084d;
import com.bytedance.android.monitorV2.p733f.C12093a;
import com.bytedance.android.monitorV2.p735h.p736a.C12097a;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.android.monitorV2.p740l.C12125b;
import com.bytedance.android.monitorV2.webview.AbstractC12190b;
import com.bytedance.android.monitorV2.webview.C12188a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitorV2.a */
public class C12064a {

    /* renamed from: a */
    public AbstractC12190b f28924a = new C12188a();

    static {
        Covode.recordClassIndex(13793);
    }

    /* renamed from: d */
    private static boolean m21472d(C12084d dVar) {
        C12097a.C12098a a = HybridMultiMonitor.getInstance().getHybridSettingManager().mo19479b().mo19449a(dVar.f28951b);
        if (a == null) {
            return false;
        }
        return C12125b.m21631a(a, dVar.f28963n);
    }

    /* renamed from: c */
    private static boolean m21471c(C12084d dVar) {
        String str = dVar.f28952c;
        if (C12125b.m21633b(str) == 1) {
            C12115b.m21583b("CustomMonitor", C1764a.m5928a("event: %s, sample hit", new Object[]{str}));
            return true;
        } else if (C12125b.m21633b(str) == 0) {
            C12115b.m21583b("CustomMonitor", C1764a.m5928a("event: %s, sample not hit", new Object[]{str}));
            return false;
        } else {
            C12115b.m21583b("CustomMonitor", C1764a.m5928a("event: %s, sample not found, checking canSample level...", new Object[]{str}));
            return m21472d(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19413a(final C12084d dVar) {
        if (m21470b(dVar)) {
            C12115b.m21583b("CustomMonitor", C1764a.m5928a("do report bid: %s, event: %s", new Object[]{dVar.f28951b, dVar.f28952c}));
            if (Looper.getMainLooper() == Looper.myLooper()) {
                C12093a.m21522a().submit(new Runnable() {
                    /* class com.bytedance.android.monitorV2.C12064a.RunnableC120651 */

                    static {
                        Covode.recordClassIndex(13794);
                    }

                    public final void run() {
                        C12074b.m21493a(dVar);
                    }
                });
            } else {
                C12074b.m21493a(dVar);
            }
        }
    }

    /* renamed from: b */
    private static boolean m21470b(C12084d dVar) {
        String str = dVar.f28951b;
        String str2 = dVar.f28952c;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        if (C12125b.m21626a(str, str2) == 1) {
            C12115b.m21583b("CustomMonitor", C1764a.m5928a("bid: %s, event: %s, sample hit", new Object[]{str, str2}));
            return true;
        } else if (C12125b.m21626a(str, str2) == 0) {
            C12115b.m21583b("CustomMonitor", C1764a.m5928a("bid: %s, event: %s, sample not hit", new Object[]{str, str2}));
            return false;
        } else {
            C12115b.m21583b("CustomMonitor", C1764a.m5928a("bid: %s, event: %s, sample not found, checking all...", new Object[]{str, str2}));
            return m21471c(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19414a(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, AbstractC12190b bVar) {
        JSONObject jSONObject5 = new JSONObject();
        C12084d.C12085a aVar = new C12084d.C12085a(str3);
        aVar.f28965a = str;
        aVar.f28966b = str2;
        aVar.f28967c = jSONObject;
        aVar.f28968d = jSONObject2;
        aVar.f28969e = jSONObject3;
        aVar.f28970f = jSONObject5;
        aVar.f28972h = jSONObject4;
        C12084d.C12085a a = aVar.mo19432a(i);
        a.f28976l = bVar;
        mo19413a(a.mo19435a());
    }
}
