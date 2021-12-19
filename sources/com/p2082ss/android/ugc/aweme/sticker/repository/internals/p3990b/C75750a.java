package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3990b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75706l;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75708n;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75690ab;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75691ac;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f;
import com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a.AbstractC84461a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.b.a */
public final class C75750a extends AbstractC84461a<C75691ac, Effect, C75690ab> implements AbstractC75706l {

    /* renamed from: e */
    private final AbstractC75708n f170168e;

    static {
        Covode.recordClassIndex(88684);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a.AbstractC84461a
    /* renamed from: a */
    public final /* synthetic */ String mo119499a(C75691ac acVar) {
        C75691ac acVar2 = acVar;
        C89219l.m154721d(acVar2, "");
        return acVar2.f170122a.getEffectId();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75706l
    /* renamed from: a */
    public final boolean mo119434a(Effect effect) {
        C89219l.m154721d(effect, "");
        return this.f170168e.mo119435a(effect, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75750a(AbstractC75708n nVar, int i) {
        super(i);
        C89219l.m154721d(nVar, "");
        this.f170168e = nVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.f] */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a.AbstractC84461a
    /* renamed from: a */
    public final /* synthetic */ void mo119500a(C75691ac acVar, AbstractC84447f<C75691ac, Effect, C75690ab> fVar) {
        C89219l.m154721d(acVar, "");
        C89219l.m154721d(fVar, "");
        this.f170168e.mo119501a(acVar, fVar);
    }
}
