package com.p2082ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.o */
public final class C60155o {

    /* renamed from: a */
    public static final C60155o f137124a;

    /* renamed from: b */
    private static final String f137125b;

    private C60155o() {
    }

    static {
        Covode.recordClassIndex(70682);
        C60155o oVar = new C60155o();
        f137124a = oVar;
        f137125b = oVar.getClass().getSimpleName();
    }

    /* renamed from: a */
    public static AbstractC60154n m109634a(Effect effect, AbstractC60142d dVar) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(dVar, "");
        C60156p pVar = null;
        try {
            pVar = new C60156p(effect.getName(), effect.getUnzipPath(), dVar, effect, effect.getIcon_url().getUrl_list().get(0));
            return pVar;
        } catch (Exception e) {
            e.getMessage();
            return pVar;
        }
    }
}
