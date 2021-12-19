package com.bytedance.frameworks.baselib.network.http.p988d.p989a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import java.util.Map;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.C90198s;
import okhttp3.Request;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.l */
public final class C14719l implements AbstractC90202u {
    static {
        Covode.recordClassIndex(16816);
    }

    @Override // okhttp3.AbstractC90202u
    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        Request a = aVar.mo144856a();
        Map<String, String> a2 = C14731e.m26983a(a.url().toString(), a.headers().mo145034d());
        if (a2 == null) {
            return aVar.mo144857a(a);
        }
        Request.C90016a aVar2 = new Request.C90016a();
        aVar2.mo144697a(a.url());
        aVar2.mo144693a(a.method(), a.body());
        aVar2.mo144690a(Object.class, a.tag());
        C90198s.C90199a c = a.headers().mo145033c();
        for (Map.Entry<String, String> entry : a2.entrySet()) {
            c.mo145039a(entry.getKey(), entry.getValue());
        }
        aVar2.mo144696a(c.mo145040a());
        return aVar.mo144857a(aVar2.mo144698a());
    }
}
