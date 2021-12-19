package com.p2082ss.ugc.effectplatform.p4453j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.C86839d;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86798g;
import com.p2082ss.ugc.effectplatform.util.C86993j;
import com.p2082ss.ugc.effectplatform.util.EffectUtilKt;
import java.util.Iterator;
import p4519d.p4520a.p4521a.C87989b;
import p4519d.p4520a.p4521a.C87990c;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.j.b */
public final class C86811b {

    /* renamed from: a */
    public static final C87989b<String, Effect> f195720a = new C87989b<>(true);

    /* renamed from: b */
    public static final C87989b<String, C87990c<AbstractC86798g>> f195721b = new C87989b<>(true);

    /* renamed from: c */
    public static final C86811b f195722c = new C86811b();

    private C86811b() {
    }

    static {
        Covode.recordClassIndex(102510);
    }

    /* renamed from: a */
    public static boolean m150376a(String str) {
        if (str == null) {
            return false;
        }
        return f195720a.containsKey(str);
    }

    /* renamed from: a */
    public static boolean m150375a(Effect effect) {
        boolean z = false;
        if (effect != null && !C89361p.m154870a((CharSequence) effect.getId())) {
            if (m150376a(C86839d.m150405a(effect))) {
                return false;
            }
            z = C88045d.m153118f(effect.getUnzipPath());
            if (z) {
                long currentTimeMillis = System.currentTimeMillis();
                boolean a = EffectUtilKt.m150630a(effect.getUnzipPath());
                C88060b.m153135a("checkEffect", "checkEffectChildrenFile effect: " + effect.getEffect_id() + ", name: " + effect.getName() + ", result: " + a + ", time cost: " + (System.currentTimeMillis() - currentTimeMillis));
                return a;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static void m150373a(Effect effect, AbstractC86798g gVar) {
        String str;
        String a;
        C89219l.m154719c(gVar, "");
        if (effect != null) {
            str = C86839d.m150405a(effect);
        } else {
            str = null;
        }
        if (!m150376a(str)) {
            if (m150375a(effect)) {
                gVar.onSuccess(effect);
            }
        } else if (effect != null && (a = C86839d.m150405a(effect)) != null) {
            C87989b<String, C87990c<AbstractC86798g>> bVar = f195721b;
            C87990c<AbstractC86798g> cVar = bVar.get(a);
            if (cVar == null) {
                cVar = new C87990c<>(true);
                bVar.put(a, cVar);
            }
            cVar.add(gVar);
        }
    }

    /* renamed from: a */
    public static void m150374a(Effect effect, C86840e eVar) {
        String a;
        C89219l.m154719c(eVar, "");
        if (effect != null && (a = C86839d.m150405a(effect)) != null) {
            C87990c<AbstractC86798g> cVar = f195721b.get(a);
            if (cVar != null) {
                Iterator<T> it = cVar.iterator();
                while (it.hasNext()) {
                    it.next().onFail(effect, eVar);
                }
            }
            f195721b.remove(a);
            f195720a.remove(a);
        }
    }

    /* renamed from: a */
    public static boolean m150377a(String str, Effect effect) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(effect, "");
        if (C89361p.m154870a((CharSequence) effect.getTransResPath())) {
            C86993j.m150660a(str, effect);
        }
        C88060b.m153135a("checkEffect", "effect has trans res");
        return C88045d.m153118f(effect.getTransResPath());
    }
}
