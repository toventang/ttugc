package com.bytedance.ies.ugc.aweme.rich.p1268a.p1269a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.rich.a.a.a */
public final class C18133a {

    /* renamed from: a */
    public static final C18133a f43191a = new C18133a();

    /* renamed from: b */
    private static final List<AbstractC18134b> f43192b = new ArrayList();

    private C18133a() {
    }

    static {
        Covode.recordClassIndex(20774);
    }

    /* renamed from: a */
    public final synchronized void mo28905a(AbstractC18134b bVar) {
        MethodCollector.m26663i(6813);
        if (bVar != null) {
            List<AbstractC18134b> list = f43192b;
            if (!list.contains(bVar)) {
                list.add(bVar);
                MethodCollector.m26664o(6813);
                return;
            }
        }
        MethodCollector.m26664o(6813);
    }

    /* renamed from: b */
    public final synchronized void mo28907b(AbstractC18134b bVar) {
        MethodCollector.m26663i(6962);
        if (bVar != null) {
            List<AbstractC18134b> list = f43192b;
            if (list.contains(bVar)) {
                list.remove(bVar);
                MethodCollector.m26664o(6962);
                return;
            }
        }
        MethodCollector.m26664o(6962);
    }

    /* renamed from: a */
    public final synchronized void mo28906a(String str, String str2, String str3, JSONObject jSONObject) {
        MethodCollector.m26663i(7115);
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        C89219l.m154719c(jSONObject, "");
        List<AbstractC18134b> list = f43192b;
        if (list.isEmpty()) {
            MethodCollector.m26664o(7115);
            return;
        }
        for (AbstractC18134b bVar : list) {
            try {
                bVar.mo28563a(str, str2, str3, jSONObject);
            } catch (Throwable unused) {
            }
        }
        MethodCollector.m26664o(7115);
    }
}
