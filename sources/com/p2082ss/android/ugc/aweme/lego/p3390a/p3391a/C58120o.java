package com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.p3390a.C58140b;
import com.p2082ss.android.ugc.aweme.lego.p3395e.C58218b;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.a.a.o */
public final class C58120o extends AbstractC58129r {
    static {
        Covode.recordClassIndex(68186);
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.o$a */
    static final class RunnableC58121a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f132379a;

        static {
            Covode.recordClassIndex(68187);
        }

        RunnableC58121a(List list) {
            this.f132379a = list;
        }

        public final void run() {
            for (final AbstractC58252n nVar : this.f132379a) {
                Objects.requireNonNull(nVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoRequest");
                AbstractC58259r rVar = (AbstractC58259r) nVar;
                EnumC58147aa b = rVar.mo58051b();
                C58218b bVar = C58221f.f132579c;
                C89219l.m154716b(b, "");
                bVar.mo95680a(b, rVar);
                C58254p.m105191a(EnumC58147aa.NORMAL).execute(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.C58120o.RunnableC58121a.RunnableC581221 */

                    static {
                        Covode.recordClassIndex(68188);
                    }

                    public final void run() {
                        C58221f.f132579c.mo95681a((AbstractC58259r) nVar, C58140b.m105075a());
                    }
                });
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95598a(List<? extends AbstractC58252n> list) {
        C89219l.m154721d(list, "");
        if (!list.isEmpty()) {
            C58254p.m105191a(EnumC58147aa.P0).execute(new RunnableC58121a(list));
        }
    }
}
