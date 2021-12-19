package com.bytedance.bpea.core.checker.p871a;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.core.checker.a.d */
public final class C13373d {

    /* renamed from: a */
    public static final C13373d f32675a = new C13373d();

    /* renamed from: b */
    private static final Map<String, Class<? extends AbstractC13370a>> f32676b;

    private C13373d() {
    }

    static {
        Covode.recordClassIndex(15370);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f32676b = linkedHashMap;
        linkedHashMap.put(EnumC13372c.CONFIG.getValue(), C13374e.class);
        linkedHashMap.put(EnumC13372c.PLACEHOLDER.getValue(), C13377h.class);
        linkedHashMap.put(EnumC13372c.INVALID.getValue(), C13376g.class);
        linkedHashMap.put(EnumC13372c.ENTRY_VERIFY.getValue(), C13375f.class);
    }

    /* renamed from: a */
    public static AbstractC13370a m24052a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        try {
            Class<? extends AbstractC13370a> cls = f32676b.get(jSONObject.getString(StringSet.type));
            if (cls == null) {
                return null;
            }
            AbstractC13370a aVar = (AbstractC13370a) cls.newInstance();
            if (aVar == null) {
                return aVar;
            }
            C89219l.m154719c(jSONObject, "");
            try {
                aVar.f32671a = jSONObject;
                aVar.mo21617a(jSONObject.optJSONObject("params"));
                return aVar;
            } catch (Throwable unused) {
                return aVar;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
