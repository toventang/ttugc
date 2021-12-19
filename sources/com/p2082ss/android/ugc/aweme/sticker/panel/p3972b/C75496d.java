package com.p2082ss.android.ugc.aweme.sticker.panel.p3972b;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.d */
public final class C75496d extends C1445j.AbstractC1447a {

    /* renamed from: a */
    private final List<Effect> f169651a;

    /* renamed from: b */
    private final List<Effect> f169652b;

    /* renamed from: c */
    private final AbstractC89244h f169653c = C89250i.m154773a((AbstractC89171a) C75497a.f169655a);

    /* renamed from: d */
    private final Effect f169654d;

    static {
        Covode.recordClassIndex(88418);
    }

    /* renamed from: c */
    private final Effect m132431c() {
        return (Effect) this.f169653c.getValue();
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: a */
    public final int mo3768a() {
        return this.f169651a.size();
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final int mo3770b() {
        return this.f169652b.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.d$a */
    static final class C75497a extends AbstractC89220m implements AbstractC89171a<Effect> {

        /* renamed from: a */
        public static final C75497a f169655a = new C75497a();

        static {
            Covode.recordClassIndex(88419);
        }

        C75497a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Effect invoke() {
            Effect effect = new Effect(null, 1, null);
            effect.setId("id_fake_header");
            effect.setUnzipPath("");
            return effect;
        }
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final boolean mo3771b(int i, int i2) {
        return C89219l.m154714a((Object) this.f169651a.get(i).getEffectId(), (Object) this.f169652b.get(i2).getEffectId());
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: c */
    public final boolean mo3772c(int i, int i2) {
        Effect effect = this.f169651a.get(i);
        Effect effect2 = this.f169652b.get(i2);
        if (this.f169654d == null || C89219l.m154714a((Object) effect.getEffectId(), (Object) this.f169654d.getEffectId()) == C89219l.m154714a((Object) effect2.getEffectId(), (Object) this.f169654d.getEffectId())) {
            return true;
        }
        return false;
    }

    public C75496d(Effect effect, List<? extends Effect> list, List<? extends Effect> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f169654d = effect;
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, m132431c());
        this.f169651a = arrayList;
        ArrayList arrayList2 = new ArrayList(list2);
        arrayList2.add(0, m132431c());
        this.f169652b = arrayList2;
    }
}
