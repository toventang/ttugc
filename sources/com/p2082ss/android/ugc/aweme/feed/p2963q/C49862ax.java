package com.p2082ss.android.ugc.aweme.feed.p2963q;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.q.ax */
public final class C49862ax {

    /* renamed from: a */
    final C49445o f114947a;

    /* renamed from: b */
    final AbstractC49849am f114948b;

    static {
        Covode.recordClassIndex(58969);
    }

    /* renamed from: a */
    public final String mo84888a() {
        AbstractC48149ai bg = this.f114948b.mo84754bg();
        if (bg == null) {
            return "no story list viewholder";
        }
        C89219l.m154716b(bg, "");
        if (bg.mo80105T() == null) {
            return "no story viewholder";
        }
        C49445o oVar = this.f114947a;
        AbstractC48149ai T = bg.mo80105T();
        C89219l.m154716b(T, "");
        String a = oVar.mo81184a(T.mo80206b(), false, bg.mo80105T());
        C89219l.m154716b(a, "");
        return a;
    }

    public C49862ax(C49445o oVar, AbstractC49849am amVar) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(amVar, "");
        this.f114947a = oVar;
        this.f114948b = amVar;
    }
}
