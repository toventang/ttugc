package com.p2082ss.ugc.effectplatform.p4440a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.Effect;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.a.b */
public final class C86693b {

    /* renamed from: a */
    public final Effect f195505a;

    /* renamed from: b */
    public final List<String> f195506b;

    /* renamed from: c */
    public final String f195507c;

    static {
        Covode.recordClassIndex(102391);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86693b)) {
            return false;
        }
        C86693b bVar = (C86693b) obj;
        return C89219l.m154714a(this.f195505a, bVar.f195505a) && C89219l.m154714a(this.f195506b, bVar.f195506b) && C89219l.m154714a(this.f195507c, bVar.f195507c);
    }

    public final int hashCode() {
        Effect effect = this.f195505a;
        int i = 0;
        int hashCode = (effect != null ? effect.hashCode() : 0) * 31;
        List<String> list = this.f195506b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.f195507c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "EffectFetcherArguments(effect=" + this.f195505a + ", downloadUrl=" + this.f195506b + ", effectDir=" + this.f195507c + ")";
    }

    public C86693b(Effect effect, List<String> list, String str) {
        C89219l.m154719c(effect, "");
        this.f195505a = effect;
        this.f195506b = list;
        this.f195507c = str;
    }
}
