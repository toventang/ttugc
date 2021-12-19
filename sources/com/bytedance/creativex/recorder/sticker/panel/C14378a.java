package com.bytedance.creativex.recorder.sticker.panel;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.C75479a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.sticker.panel.a */
public final class C14378a implements AbstractC14380c, AbstractC21566a {

    /* renamed from: a */
    private final C21582f f34806a;

    /* renamed from: b */
    private final AbstractC89172b<C75574j, C89391z> f34807b;

    static {
        Covode.recordClassIndex(16453);
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f34806a;
    }

    @Override // com.bytedance.creativex.recorder.sticker.panel.AbstractC14380c
    /* renamed from: a */
    public final AbstractC14379b mo23192a() {
        AbstractC14330a aVar = (AbstractC14330a) getDiContainer().mo35248a(AbstractC14330a.class, (String) null);
        C21582f diContainer = getDiContainer();
        C75479a aVar2 = new C75479a(aVar.mo23167t(), aVar.mo23168u());
        AbstractC89172b<C75574j, C89391z> bVar = this.f34807b;
        if (bVar != null) {
            C89219l.m154721d(bVar, "");
            aVar2.f169604h = bVar;
        }
        return new C14381d(diContainer, aVar2);
    }

    private C14378a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f34806a = fVar;
        this.f34807b = null;
    }

    public /* synthetic */ C14378a(C21582f fVar, byte b) {
        this(fVar);
    }
}
