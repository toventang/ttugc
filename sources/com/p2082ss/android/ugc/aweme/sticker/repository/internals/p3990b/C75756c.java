package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3990b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75710p;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.p3984a.C75688a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.b.c */
public final class C75756c implements AbstractC75710p {

    /* renamed from: a */
    private final AbstractC89171a<AbstractC84398d> f170176a;

    static {
        Covode.recordClassIndex(88690);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75756c(AbstractC89171a<? extends AbstractC84398d> aVar) {
        C89219l.m154721d(aVar, "");
        this.f170176a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75710p
    /* renamed from: a */
    public final boolean mo119439a(Effect effect) {
        C89219l.m154721d(effect, "");
        return C75688a.m132804a(this.f170176a.invoke(), effect);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75710p
    /* renamed from: b */
    public final boolean mo119440b(Effect effect) {
        C89219l.m154721d(effect, "");
        return C75688a.m132805b(this.f170176a.invoke(), effect);
    }
}
