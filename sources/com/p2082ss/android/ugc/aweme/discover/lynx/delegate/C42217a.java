package com.p2082ss.android.ugc.aweme.discover.lynx.delegate;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.C42186b;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.a */
public class C42217a extends AbstractC42218b {

    /* renamed from: a */
    public final List<AbstractC42218b> f98387a = new ArrayList();

    static {
        Covode.recordClassIndex(50159);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.delegate.AbstractC42218b
    /* renamed from: a */
    public final void mo71429a() {
        for (AbstractC42218b bVar : this.f98387a) {
            bVar.mo71429a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42217a(C42186b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    public final void mo71430a(AbstractC42218b bVar) {
        C89219l.m154721d(bVar, "");
        this.f98387a.add(bVar);
    }
}
