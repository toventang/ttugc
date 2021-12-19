package com.bytedance.android.p126a.p136b;

import android.net.Uri;
import com.bytedance.android.p126a.p127a.p131d.C2626b;
import com.bytedance.android.p126a.p127a.p132e.AbstractC2629a;
import com.bytedance.android.p126a.p127a.p135h.C2642c;
import com.bytedance.android.p126a.p127a.p135h.C2644e;
import com.bytedance.android.p126a.p136b.p138b.C2665b;
import com.bytedance.android.p126a.p136b.p138b.C2667c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.p1097d.C15418q;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.b.b */
public class C2654b extends AbstractC2629a {

    /* renamed from: a */
    private static volatile C2654b f7948a;

    static {
        Covode.recordClassIndex(3042);
    }

    /* renamed from: b */
    public final void mo7173b() {
        mo7148a("c2s_network_type_on_retry", C2644e.f7932a.mo7164b(), (JSONObject) null);
    }

    /* renamed from: a */
    public static C2654b m7680a() {
        MethodCollector.m26663i(2082);
        if (f7948a == null) {
            synchronized (C2654b.class) {
                try {
                    if (f7948a == null) {
                        f7948a = new C2654b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2082);
                    throw th;
                }
            }
        }
        C2654b bVar = f7948a;
        MethodCollector.m26664o(2082);
        return bVar;
    }

    /* renamed from: a */
    public final void mo7172a(C2667c cVar, long j) {
        String str;
        Map<String, List<String>> map;
        List<String> list;
        C2626b bVar;
        if (cVar != null) {
            int i = cVar.f7965a;
            JSONObject b = m7619b(j);
            JSONObject jSONObject = new JSONObject();
            long j2 = -1;
            C2665b bVar2 = cVar.f7969e;
            JSONObject jSONObject2 = null;
            if (bVar2 == null || (bVar = bVar2.f7960e) == null) {
                str = null;
            } else {
                if (bVar.f7882d) {
                    j2 = bVar.f7881c;
                } else {
                    j2 = bVar.f7883e;
                }
                jSONObject2 = bVar.f7886h;
                str = bVar.f7885g;
            }
            try {
                jSONObject.put("cid", j2);
                jSONObject.putOpt("ad_extra_data", jSONObject2);
                jSONObject.putOpt("log_extra", str);
                jSONObject = C2642c.m7648a(cVar.f7970f, jSONObject);
                if (bVar2 != null) {
                    jSONObject.put("method", bVar2.f7958c);
                }
                if (!cVar.mo7183a()) {
                    if (bVar2 != null) {
                        jSONObject.put("url", bVar2.f7957b);
                    }
                    if (i == 302 && (map = cVar.f7967c) != null && map.containsKey(C15418q.f37640b) && (list = map.get(C15418q.f37640b)) != null && !list.isEmpty()) {
                        jSONObject.putOpt("url_302", list.get(0));
                    }
                }
                if (bVar2 != null) {
                    jSONObject.put("host", Uri.parse(bVar2.f7957b).getHost());
                }
            } catch (Throwable unused) {
            }
            mo7149a("c2s_network_response_status", i, b, jSONObject);
        }
    }
}
