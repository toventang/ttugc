package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4357a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84551a;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84566b;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.C84605m;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84436a;
import com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a.AbstractC84461a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.a.a */
public final class C84552a extends AbstractC84461a<Effect, Effect, C84605m> implements AbstractC84551a {

    /* renamed from: e */
    private final AbstractC84436a f188962e;

    /* renamed from: f */
    private final AbstractC89171a<AbstractC84566b> f188963f;

    static {
        Covode.recordClassIndex(98517);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a.AbstractC84461a
    /* renamed from: a */
    public final /* synthetic */ String mo119499a(Effect effect) {
        Effect effect2 = effect;
        C89219l.m154721d(effect2, "");
        String effectId = effect2.getEffectId();
        if (effectId.length() <= 0 || effectId == null) {
            return effect2.getId();
        }
        return effectId;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.f] */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a.AbstractC84461a
    /* renamed from: a */
    public final /* synthetic */ void mo119500a(Effect effect, AbstractC84447f<Effect, Effect, C84605m> fVar) {
        Effect effect2 = effect;
        C89219l.m154721d(effect2, "");
        C89219l.m154721d(fVar, "");
        if (this.f188962e.mo129418a(effect2)) {
            fVar.mo119504a(effect2, effect2);
        } else {
            this.f188963f.invoke().mo119501a(effect2, fVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.infosticker.a.b.b> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84552a(AbstractC84436a aVar, AbstractC89171a<? extends AbstractC84566b> aVar2, int i) {
        super(i);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f188962e = aVar;
        this.f188963f = aVar2;
    }
}
