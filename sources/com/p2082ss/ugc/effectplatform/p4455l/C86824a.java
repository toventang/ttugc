package com.p2082ss.ugc.effectplatform.p4455l;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.Effect;
import java.util.List;
import p4519d.p4520a.p4521a.C87988a;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4530d.p4531a.C88049f;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.l.a */
public final class C86824a {

    /* renamed from: a */
    public static final C87988a<String> f195743a = new C87988a<>(true);

    /* renamed from: b */
    public static final C86824a f195744b = new C86824a();

    private C86824a() {
    }

    static {
        Covode.recordClassIndex(102523);
    }

    /* renamed from: a */
    public static void m150396a(Effect effect) {
        C89219l.m154719c(effect, "");
        f195743a.add(effect.getUnzipPath() + "_trans_");
    }

    /* renamed from: b */
    public static void m150398b(Effect effect) {
        C89219l.m154719c(effect, "");
        f195743a.remove(effect.getUnzipPath() + "_trans_");
    }

    /* renamed from: a */
    public static void m150397a(String str, Effect effect) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(effect, "");
        List<C88049f> a = C88045d.m153105a(str);
        if (a != null) {
            for (T t : a) {
                if (C89361p.m154874b(t.f199959a, effect.getId() + "_trans_", false)) {
                    C88045d.m153114c(t.f199960b);
                }
            }
        }
        m150398b(effect);
    }
}
