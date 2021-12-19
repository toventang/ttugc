package com.p2082ss.android.ugc.aweme.sticker.presenter.handler;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.EnumC75295a;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75549i;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75621d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.n */
public final class C75635n implements AbstractC75633m {

    /* renamed from: b */
    public static final C75636a f170047b = new C75636a((byte) 0);

    /* renamed from: a */
    public final AbstractC75549i f170048a;

    /* renamed from: c */
    private SafeHandler f170049c;

    /* renamed from: d */
    private Effect f170050d;

    /* renamed from: e */
    private final AbstractC1204m f170051e;

    /* renamed from: f */
    private final AbstractC75655o f170052f;

    /* renamed from: g */
    private final AbstractC89172b<Effect, C89391z> f170053g;

    static {
        Covode.recordClassIndex(88566);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.n$a */
    public static final class C75636a {
        static {
            Covode.recordClassIndex(88567);
        }

        private C75636a() {
        }

        public /* synthetic */ C75636a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.n$b */
    static final class RunnableC75637b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C75635n f170054a;

        /* renamed from: b */
        final /* synthetic */ AbstractC75633m.AbstractC75634a f170055b;

        /* renamed from: c */
        final /* synthetic */ AbstractC75620c f170056c;

        static {
            Covode.recordClassIndex(88568);
        }

        RunnableC75637b(C75635n nVar, AbstractC75633m.AbstractC75634a aVar, AbstractC75620c cVar) {
            this.f170054a = nVar;
            this.f170055b = aVar;
            this.f170056c = cVar;
        }

        public final void run() {
            this.f170054a.f170048a.hideNotice();
            this.f170055b.mo119345a(this.f170056c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m
    /* renamed from: a */
    public final C75619b mo23184a(AbstractC75620c cVar, AbstractC75633m.AbstractC75634a aVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        if (this.f170052f.mo119288a()) {
            return aVar.mo119345a(cVar);
        }
        boolean z = cVar instanceof C75618a;
        if (z) {
            C75618a aVar2 = (C75618a) cVar;
            if (aVar2.f170024c != EnumC75295a.RECOVER) {
                Effect effect = aVar2.f170022a;
                if (effect == null || C89219l.m154714a(effect, this.f170050d) || C75466g.m132345a(effect)) {
                    return aVar.mo119345a(cVar);
                }
                this.f170050d = effect;
                this.f170049c.removeCallbacksAndMessages(null);
                this.f170048a.hideNotice();
                if (!C75466g.m132340D(effect)) {
                    return aVar.mo119345a(cVar);
                }
                this.f170053g.invoke(effect);
                this.f170048a.hide();
                this.f170048a.mo119217b(effect);
                this.f170049c.postDelayed(new RunnableC75637b(this, aVar, cVar), 3000);
                return new C75619b(-1);
            }
        }
        boolean z2 = cVar instanceof C75621d;
        if (z2 || (z && ((C75618a) cVar).f170024c == EnumC75295a.RECOVER)) {
            this.f170049c.removeCallbacksAndMessages(null);
            this.f170048a.hideNotice();
            this.f170048a.hide();
            if (!z2 ? !(!z || ((C75618a) cVar).f170024c != EnumC75295a.UI_CLICK) : ((C75621d) cVar).f170030c == EnumC75295a.UI_CLICK) {
                this.f170048a.mo119214a();
            }
            this.f170050d = null;
        }
        return aVar.mo119345a(cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.Effect, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75635n(AbstractC1204m mVar, AbstractC75655o oVar, AbstractC75549i iVar, AbstractC89172b<? super Effect, C89391z> bVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(bVar, "");
        this.f170051e = mVar;
        this.f170052f = oVar;
        this.f170048a = iVar;
        this.f170053g = bVar;
        this.f170049c = new SafeHandler(mVar);
    }
}
