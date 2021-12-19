package com.bytedance.bridge.magpie.p879a.p882c;

import com.bytedance.bridge.magpie.p879a.AbstractC13408b;
import com.bytedance.bridge.magpie.p879a.p880a.C13405b;
import com.bytedance.bridge.magpie.p886e.C13453e;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bridge.magpie.a.c.f */
public final class C13425f {

    /* renamed from: a */
    static AbstractC13408b f32727a;

    /* renamed from: b */
    public static final Map<String, C13405b> f32728b = new LinkedHashMap();

    /* renamed from: c */
    public static final C13425f f32729c = new C13425f();

    private C13425f() {
    }

    static {
        Covode.recordClassIndex(15425);
    }

    /* renamed from: a */
    public static void m24138a(String str, JSONObject jSONObject) {
        int i;
        C89219l.m154719c(str, "");
        Map<String, C13405b> map = f32728b;
        C13405b bVar = map.get(str);
        if (bVar == null) {
            if (f32727a != null) {
                i = 128;
            } else {
                i = 16;
            }
            map.put(str, new C13405b(str, i, jSONObject));
            C13453e.m24179c("MagpiePermission", "create PermissionConfigNamespace for host");
            return;
        }
        bVar.mo21628a(jSONObject);
        C13453e.m24179c("MagpiePermission", "update PermissionConfigNamespace for ".concat(String.valueOf(str)));
    }
}
