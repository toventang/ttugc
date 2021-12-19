package com.bytedance.android.live.publicscreen.impl.widget;

import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.live.publicscreen.p386a.p387a.AbstractC5858a;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5884d;
import com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5887a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.AbstractC89396c;
import p4628j.p4629a.p4630a.C89399f;

/* renamed from: com.bytedance.android.live.publicscreen.impl.widget.a */
public final class C6050a extends C89399f implements AbstractC5884d {

    /* renamed from: a */
    public C5889g f15165a;

    /* renamed from: d */
    private final ArrayList<Class<? extends AbstractC5873h>> f15166d = new ArrayList<>();

    static {
        Covode.recordClassIndex(6667);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5884d
    /* renamed from: a */
    public final <MODEL extends AbstractC5873h, VH extends AbstractC5887a<MODEL>> void mo11737a(Class<MODEL> cls, AbstractC5858a<MODEL, VH> aVar) {
        C89219l.m154721d(cls, "");
        C89219l.m154721d(aVar, "");
        C5889g gVar = this.f15165a;
        if (gVar == null) {
            C89219l.m154710a("publicScreenContext");
        }
        C89219l.m154721d(gVar, "");
        aVar.f14720a = gVar;
        this.f203061c.mo143774a((Class<?>) cls);
        mo143771a((Class) cls, (AbstractC89396c) aVar);
        if (!this.f15166d.contains(cls)) {
            this.f15166d.add(cls);
        }
    }
}
