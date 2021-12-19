package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.AbstractC45891h;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.b */
public final class C46083b {
    static {
        Covode.recordClassIndex(54641);
    }

    /* renamed from: a */
    static final C46091h m88939a(Effect effect) {
        try {
            C46093i iVar = (C46093i) C45866d.m88489b().mo46670a(effect.getExtra(), C46093i.class);
            String str = effect.getUnzipPath() + File.separator + iVar.f107339a;
            C89219l.m154721d(str, "");
            iVar.f107340b = str;
            C89219l.m154716b(iVar, "");
            return new C46091h(effect, iVar);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final List<C46079a> m88940a(EffectChannelResponse effectChannelResponse) {
        if (effectChannelResponse == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (T t : effectChannelResponse.getAllCategoryEffects()) {
            if (t != null) {
                try {
                    C46090g gVar = (C46090g) C45866d.m88489b().mo46670a(t.getExtra(), C46090g.class);
                    if (gVar == null) {
                        gVar = new C46090g();
                    }
                    arrayList.add(new C46079a(t, gVar));
                } catch (Exception e) {
                    AbstractC45891h d = C45866d.m88491d();
                    if (d != null) {
                        d.mo77252a(e);
                    }
                }
            }
        }
        return arrayList;
    }
}
