package com.bytedance.android.live.effect.p242c;

import com.bytedance.android.live.effect.C4284g;
import com.bytedance.android.live.effect.api.p240a.AbstractC4157j;
import com.bytedance.android.live.effect.model.C4315e;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.c.b */
public final class C4194b implements AbstractC4157j.AbstractC4161d<FilterModel> {
    static {
        Covode.recordClassIndex(4764);
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4157j.AbstractC4161d
    /* renamed from: a */
    public final List<C4315e<FilterModel>> mo9870a(List<C4315e<FilterModel>> list) {
        C89219l.m154721d(list, "");
        Iterator a = C89070n.m154598r(list).mo2926a();
        while (a.hasNext()) {
            for (T t : ((C4315e) a.next()).f11862b) {
                if (!C4284g.m10393a(t.getEffect())) {
                    C4284g.m10390a(t.getEffect(), null);
                }
            }
        }
        return list;
    }
}
