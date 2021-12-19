package com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4033b.p4035b;

import com.bytedance.als.AbstractC2562j;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b.b.b */
public final class C76864b extends AbstractC2562j<AbstractC76863a> implements AbstractC21566a, AbstractC76863a {

    /* renamed from: a */
    public final AbstractC76863a f172496a = this;

    /* renamed from: b */
    public C76865c f172497b;

    /* renamed from: c */
    private final C21582f f172498c;

    /* renamed from: d */
    private final AbstractC22186b f172499d;

    /* renamed from: e */
    private final int f172500e = R.id.egb;

    static {
        Covode.recordClassIndex(89860);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC76863a getApiComponent() {
        return this.f172496a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f172498c;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4033b.p4035b.AbstractC76863a
    /* renamed from: a */
    public final void mo120470a() {
        if (this.f172497b == null) {
            this.f172497b = new C76865c(getDiContainer());
        }
        AbstractC22186b bVar = this.f172499d;
        C76865c cVar = this.f172497b;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        if (!bVar.mo36421f(cVar)) {
            AbstractC22186b bVar2 = this.f172499d;
            int i = this.f172500e;
            C76865c cVar2 = this.f172497b;
            if (cVar2 == null) {
                C89219l.m154710a("scene");
            }
            bVar2.mo36387a(i, cVar2, "Tap2AddTextScene");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4033b.p4035b.AbstractC76863a
    /* renamed from: a */
    public final void mo120471a(boolean z) {
        if (this.f172497b != null) {
            C76865c cVar = this.f172497b;
            if (cVar == null) {
                C89219l.m154710a("scene");
            }
            cVar.f172503b = z;
        }
    }

    public C76864b(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f172498c = fVar;
        this.f172499d = bVar;
    }
}
