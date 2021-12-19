package com.p2082ss.android.ugc.aweme.sticker.view.internal.search;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.d */
public final class C76332d {

    /* renamed from: a */
    public final List<Effect> f171472a;

    static {
        Covode.recordClassIndex(89287);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C76332d) && C89219l.m154714a(this.f171472a, ((C76332d) obj).f171472a);
        }
        return true;
    }

    public final int hashCode() {
        List<Effect> list = this.f171472a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "RecommendTrendData(effectId=" + this.f171472a + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> */
    /* JADX WARN: Multi-variable type inference failed */
    public C76332d(List<? extends Effect> list) {
        C89219l.m154721d(list, "");
        this.f171472a = list;
    }
}
