package com.bytedance.android.live.publicscreen.impl.p395b;

import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1114a.AbstractC16042a;
import com.bytedance.ies.p1114a.AbstractC16043b;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.publicscreen.impl.b.b */
public final class C5904b extends AbstractC16043b<AbstractC5905a> {

    /* renamed from: a */
    AbstractC88412b f14783a;

    /* renamed from: com.bytedance.android.live.publicscreen.impl.b.b$a */
    public interface AbstractC5905a extends AbstractC16042a {
        static {
            Covode.recordClassIndex(6513);
        }

        /* renamed from: a */
        void mo11756a();

        /* renamed from: a */
        void mo11757a(AbstractC2994b bVar);
    }

    static {
        Covode.recordClassIndex(6512);
    }

    @Override // com.bytedance.ies.p1114a.AbstractC16043b
    /* renamed from: b */
    public final void mo8577b() {
        super.mo8577b();
        AbstractC88412b bVar = this.f14783a;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.b.b$b */
    static final class C5906b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5904b f14784a;

        static {
            Covode.recordClassIndex(6514);
        }

        C5906b(C5904b bVar) {
            this.f14784a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC2994b bVar = (AbstractC2994b) obj;
            AbstractC5905a aVar = (AbstractC5905a) this.f14784a.f38654y;
            if (aVar != null) {
                aVar.mo11757a(bVar);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.b.b$c */
    static final class C5907c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5904b f14785a;

        static {
            Covode.recordClassIndex(6515);
        }

        C5907c(C5904b bVar) {
            this.f14785a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC5905a aVar = (AbstractC5905a) this.f14785a.f38654y;
            if (aVar != null) {
                aVar.mo11756a();
            }
        }
    }
}
