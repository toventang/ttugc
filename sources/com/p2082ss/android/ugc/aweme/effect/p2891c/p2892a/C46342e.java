package com.p2082ss.android.ugc.aweme.effect.p2891c.p2892a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import dmt.p4542av.video.C88294r;
import dmt.p4542av.video.C88300w;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.c.a.e */
public final class C46342e extends AbstractC46338a {

    /* renamed from: a */
    private final AbstractC89171a<AbstractC31071f> f108023a;

    /* renamed from: b */
    private final AbstractC89171a<C88294r> f108024b;

    static {
        Covode.recordClassIndex(54919);
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2891c.p2892a.AbstractC46338a
    /* renamed from: a */
    public final void mo78833a(C88300w wVar) {
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.effect.p2891c.p2892a.AbstractC46338a
    /* renamed from: a */
    public final boolean mo78834a() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2891c.p2892a.AbstractC46338a
    /* renamed from: b */
    public final void mo78836b(C88300w wVar) {
        C88294r invoke = this.f108024b.invoke();
        if (invoke != null) {
            AbstractC31071f invoke2 = this.f108023a.invoke();
            if (invoke.f200350a >= 0) {
                invoke2.mo56257a(invoke.f200350a, invoke.f200351b, invoke.f200352c, invoke.f200356g);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.asve.editor.f> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46342e(AbstractC89171a<? extends AbstractC31071f> aVar, AbstractC89171a<C88294r> aVar2) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f108023a = aVar;
        this.f108024b = aVar2;
    }
}
