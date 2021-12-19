package com.bytedance.ies.p1208im.core.p1224e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.api.p1210a.AbstractC17417b;
import com.bytedance.ies.p1208im.core.api.p1210a.C17418c;
import com.bytedance.ies.p1208im.core.api.p1210a.EnumC17416a;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17451d;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.e.g */
public final class C17523g implements AbstractC17417b {

    /* renamed from: a */
    public static final C17523g f41935a;

    /* renamed from: b */
    private static Map<String, String> f41936b;

    /* renamed from: c */
    private static boolean f41937c;

    private C17523g() {
    }

    static {
        Covode.recordClassIndex(20012);
        C17523g gVar = new C17523g();
        f41935a = gVar;
        C17415a.m32258e().mo27821a(gVar);
    }

    /* renamed from: a */
    public static final Map<String, String> m32497a() {
        MethodCollector.m26663i(7622);
        if (SettingsManager.m29616a().mo25400a("im_sdk_request_header_disable_cache", false)) {
            Map<String, String> b = m32498b();
            MethodCollector.m26664o(7622);
            return b;
        }
        synchronized (f41935a) {
            try {
                if (f41936b == null || f41937c) {
                    f41936b = m32498b();
                }
            } finally {
                MethodCollector.m26664o(7622);
            }
        }
        Map<String, String> map = f41936b;
        if (map == null) {
            C89219l.m154715b();
        }
        map.put("iid", C17415a.m32254a().mo27849e());
        Map<String, String> map2 = f41936b;
        if (map2 == null) {
            C89219l.m154715b();
        }
        return map2;
    }

    /* renamed from: b */
    private static Map<String, String> m32498b() {
        f41937c = false;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC17451d a = C17415a.m32254a();
        String e = a.mo27849e();
        if (!TextUtils.isEmpty(e)) {
            linkedHashMap.put("iid", e);
        } else {
            f41937c = true;
        }
        int b = a.mo27846b();
        if (b <= 0) {
            f41937c = true;
        }
        linkedHashMap.put("aid", String.valueOf(b));
        String i = a.mo27853i();
        if (!TextUtils.isEmpty(i)) {
            linkedHashMap.put("user-agent", i);
        } else {
            f41937c = true;
        }
        String j = a.mo27854j();
        if (!TextUtils.isEmpty(j)) {
            linkedHashMap.put("sim_mcc_mnc", j);
        }
        String k = a.mo27855k();
        if (!TextUtils.isEmpty(k)) {
            linkedHashMap.put("net_mcc_mnc", k);
        }
        return linkedHashMap;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1210a.AbstractC17417b
    /* renamed from: a */
    public final void mo27788a(EnumC17416a aVar, C17418c cVar) {
        C89219l.m154721d(aVar, "");
        C17415a.m32255b().mo27836b("SDKRequestHeader", "onAccountChange: ".concat(String.valueOf(aVar)));
        f41936b = null;
        f41937c = true;
    }
}
