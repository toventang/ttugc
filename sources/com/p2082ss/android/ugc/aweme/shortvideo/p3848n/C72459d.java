package com.p2082ss.android.ugc.aweme.shortvideo.p3848n;

import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.n.d */
public final class C72459d extends AbstractC2562j<AbstractC72453a> implements AbstractC21566a, AbstractC72453a {

    /* renamed from: a */
    public final C2563k<C89378p<Effect, Integer>> f162440a = new C2563k<>();

    /* renamed from: b */
    private final C21582f f162441b;

    static {
        Covode.recordClassIndex(85134);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3848n.AbstractC72453a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2559g mo114725a() {
        return this.f162440a;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC72453a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f162441b;
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
    }

    public C72459d(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f162441b = fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3848n.AbstractC72453a
    /* renamed from: a */
    public final void mo114726a(Effect effect, int i) {
        this.f162440a.mo6999a(new C89378p<>(effect, Integer.valueOf(i)));
    }
}
