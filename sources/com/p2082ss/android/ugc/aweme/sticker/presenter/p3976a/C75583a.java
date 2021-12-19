package com.p2082ss.android.ugc.aweme.sticker.presenter.p3976a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Random;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.a.a */
public final class C75583a implements AbstractC75586c {

    /* renamed from: a */
    private final AbstractC89244h f169911a = C89250i.m154773a((AbstractC89171a) C75584a.f169914a);

    /* renamed from: b */
    private Effect f169912b;

    /* renamed from: c */
    private final AbstractC89189s<Integer, Integer, String, Effect, Boolean, Integer> f169913c;

    static {
        Covode.recordClassIndex(88508);
    }

    /* renamed from: b */
    private final Random m132579b() {
        return (Random) this.f169911a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.a.a$a */
    static final class C75584a extends AbstractC89220m implements AbstractC89171a<Random> {

        /* renamed from: a */
        public static final C75584a f169914a = new C75584a();

        static {
            Covode.recordClassIndex(88509);
        }

        C75584a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Random invoke() {
            return new Random();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.p3976a.AbstractC75586c
    /* renamed from: a */
    public final int mo119309a() {
        return m132578b(null, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.s<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.String, ? super com.ss.android.ugc.effectmanager.effect.model.Effect, ? super java.lang.Boolean, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75583a(AbstractC89189s<? super Integer, ? super Integer, ? super String, ? super Effect, ? super Boolean, Integer> sVar) {
        C89219l.m154721d(sVar, "");
        this.f169913c = sVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.p3976a.AbstractC75586c
    /* renamed from: a */
    public final int mo119310a(Effect effect, boolean z) {
        C89219l.m154721d(effect, "");
        return m132578b(effect, z);
    }

    /* renamed from: b */
    private final int m132578b(Effect effect, boolean z) {
        String str;
        int i;
        String effectId;
        Integer e;
        this.f169912b = effect;
        int nextInt = m132579b().nextInt();
        if (effect == null || (str = effect.getUnzipPath()) == null) {
            str = "";
        }
        if (effect == null || (effectId = effect.getEffectId()) == null || (e = C89361p.m154863e(effectId)) == null) {
            i = 0;
        } else {
            i = e.intValue();
        }
        return this.f169913c.invoke(Integer.valueOf(nextInt), Integer.valueOf(i), str, effect, Boolean.valueOf(z)).intValue();
    }
}
