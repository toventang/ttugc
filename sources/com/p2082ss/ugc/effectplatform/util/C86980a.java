package com.p2082ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4519d.p4520a.p4532e.C88060b;
import p4519d.p4520a.p4534g.C88066a;
import p4600h.C89388w;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.util.a */
public final class C86980a {

    /* renamed from: a */
    public static final C86980a f196130a = new C86980a();

    private C86980a() {
    }

    static {
        Covode.recordClassIndex(102746);
    }

    /* renamed from: a */
    public static final boolean m150631a(Effect effect) {
        int i;
        C89219l.m154719c(effect, "");
        List<String> requirements_sec = effect.getRequirements_sec();
        if (requirements_sec == null || requirements_sec.isEmpty()) {
            return false;
        }
        List<String> requirements = effect.getRequirements();
        if (!(requirements instanceof Collection) || !requirements.isEmpty()) {
            Iterator<T> it = requirements.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((!C89361p.m154870a((CharSequence) it.next())) && (i = i + 1) < 0) {
                    C89070n.m154523b();
                }
            }
        } else {
            i = 0;
        }
        List<String> requirements_sec2 = effect.getRequirements_sec();
        if (requirements_sec2 != null && (!(requirements_sec2 instanceof Collection) || !requirements_sec2.isEmpty())) {
            Iterator<T> it2 = requirements_sec2.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                if ((!C89361p.m154870a((CharSequence) it2.next())) && (i2 = i2 + 1) < 0) {
                    C89070n.m154523b();
                }
            }
            if (i2 == 0 || i2 == i) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static Map<String, List<String>> m150634b(Effect effect, C86695b bVar) {
        C89219l.m154719c(effect, "");
        String model_names = effect.getModel_names();
        C88060b.m153135a("effect_platform", "EffectUtils#getModelNamesOfEffect->effectId = " + effect.getEffect_id() + ", modelNames = " + model_names);
        if (C87007u.m150697a(model_names) || bVar == null) {
            return null;
        }
        if (model_names == null) {
            try {
                C89219l.m154707a();
            } catch (Exception e) {
                C88060b.m153136a("effect_platform", "EffectUtils#getModelNamesOfEffect", e);
                return null;
            }
        }
        return (Map) bVar.f195508a.convertJsonToObj(model_names, Map.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String[] m150632a(com.p2082ss.ugc.effectplatform.model.Effect r11, com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b r12) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.util.C86980a.m150632a(com.ss.ugc.effectplatform.model.Effect, com.ss.ugc.effectplatform.a.b.b):java.lang.String[]");
    }

    /* renamed from: a */
    private static String[] m150633a(String[] strArr, Map<String, ? extends List<String>> map) {
        if (C88066a.m153140a(map)) {
            return strArr;
        }
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            arrayList.addAll((List) entry.getValue());
        }
        ArrayList arrayList2 = new ArrayList();
        if (strArr != null) {
            arrayList2.addAll(C89064i.m154508i(strArr));
        }
        arrayList2.addAll(arrayList);
        Object[] array = arrayList2.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }
}
