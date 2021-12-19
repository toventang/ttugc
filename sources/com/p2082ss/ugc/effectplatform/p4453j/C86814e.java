package com.p2082ss.ugc.effectplatform.p4453j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86838c;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponseV2;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86798g;
import com.p2082ss.ugc.effectplatform.task.C86877ah;
import com.p2082ss.ugc.effectplatform.task.C86882al;
import com.p2082ss.ugc.effectplatform.task.C86905d;
import com.p2082ss.ugc.effectplatform.task.C86906e;
import com.p2082ss.ugc.effectplatform.task.C86912g;
import com.p2082ss.ugc.effectplatform.task.C86946n;
import com.p2082ss.ugc.effectplatform.util.C87006t;
import java.util.List;
import java.util.Map;
import p4519d.p4520a.p4533f.AbstractC88065d;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.j.e */
public final class C86814e {

    /* renamed from: a */
    public final C86687a f195725a;

    static {
        Covode.recordClassIndex(102513);
    }

    public C86814e(C86687a aVar) {
        C89219l.m154719c(aVar, "");
        this.f195725a = aVar;
    }

    /* renamed from: a */
    public final String mo140051a(List<String> list, Map<String, String> map, AbstractC86796e<List<Effect>> eVar) {
        String a = C87006t.m150696a();
        if (eVar != null) {
            this.f195725a.f195443K.mo140036a(a, eVar);
        }
        C86882al alVar = this.f195725a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(new C86905d(this.f195725a, list, a, map));
        }
        return a;
    }

    /* renamed from: a */
    public final String mo140048a(Effect effect, boolean z, AbstractC86798g gVar) {
        AbstractC88065d gVar2;
        C89219l.m154719c(effect, "");
        String a = C87006t.m150696a();
        if (C89361p.m154870a((CharSequence) effect.getId())) {
            if (gVar != null) {
                gVar.onFail(effect, new C86840e(10014));
            }
            return a;
        }
        if (gVar != null) {
            this.f195725a.f195443K.mo140036a(a, gVar);
        }
        if (z) {
            gVar2 = new C86946n(this.f195725a, effect, a);
        } else {
            gVar2 = new C86912g(effect, this.f195725a, a);
        }
        C86882al alVar = this.f195725a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(gVar2);
        }
        return a;
    }

    /* renamed from: a */
    public final String mo140050a(List<? extends Effect> list, C86838c cVar, AbstractC86796e<List<Effect>> eVar) {
        C89219l.m154719c(list, "");
        String a = C87006t.m150696a();
        if (eVar != null) {
            this.f195725a.f195443K.mo140036a(a, eVar);
        }
        C86882al alVar = this.f195725a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(new C86906e(this.f195725a, list, a, cVar));
        }
        return a;
    }

    /* renamed from: a */
    public final String mo140049a(String str, String str2, int i, int i2, Map<String, String> map, AbstractC86796e<SearchEffectResponseV2> eVar, String str3) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        String a = C87006t.m150696a();
        if (eVar != null) {
            this.f195725a.f195443K.mo140036a(a, eVar);
        }
        C86882al alVar = this.f195725a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(new C86877ah(this.f195725a, str, str2, i, i2, map, a, str3));
        }
        return a;
    }
}
