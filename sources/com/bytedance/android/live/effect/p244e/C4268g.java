package com.bytedance.android.live.effect.p244e;

import com.bytedance.android.live.effect.C4284g;
import com.bytedance.android.live.effect.api.p240a.AbstractC4157j;
import com.bytedance.android.live.effect.model.C4315e;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.e.g */
public final class C4268g implements AbstractC4157j.AbstractC4161d<C11672a> {
    static {
        Covode.recordClassIndex(4838);
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4157j.AbstractC4161d
    /* renamed from: a */
    public final List<C4315e<C11672a>> mo9870a(List<C4315e<C11672a>> list) {
        C89219l.m154721d(list, "");
        Iterator a = C89070n.m154598r(list).mo2926a();
        while (a.hasNext()) {
            for (T t : ((C4315e) a.next()).f11862b) {
                if (!C4284g.m10392a((C11672a) t)) {
                    C4284g.m10390a(t.f27909q, null);
                }
            }
        }
        return list;
    }
}
