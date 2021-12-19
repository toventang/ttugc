package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4357a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84536d;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.C84540h;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.C84549q;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.EnumC84544l;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84551a;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84445d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84436a;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84437b;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84438c;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84439d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84441e;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84442f;
import com.p2082ss.android.ugc.tools.p4346h.p4349b.p4352c.AbstractC84527a;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.a.b */
public final class C84553b extends AbstractC84527a<EffectCategoryResponse, C84540h> implements AbstractC84536d {

    /* renamed from: a */
    public final AbstractC84551a f188964a;

    /* renamed from: b */
    public final AbstractC84436a f188965b;

    static {
        Covode.recordClassIndex(98518);
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.a.b.a.b$b */
    static final class CallableC84555b<V> implements Callable<AbstractC88984x<? extends C84540h>> {

        /* renamed from: a */
        final /* synthetic */ C84553b f188968a;

        /* renamed from: b */
        final /* synthetic */ Effect f188969b;

        /* renamed from: c */
        final /* synthetic */ boolean f188970c;

        static {
            Covode.recordClassIndex(98520);
        }

        CallableC84555b(C84553b bVar, Effect effect, boolean z) {
            this.f188968a = bVar;
            this.f188969b = effect;
            this.f188970c = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ AbstractC88984x<? extends C84540h> call() {
            return this.f188968a.f188964a.mo129430a(this.f188969b, this.f188970c).mo143292d(new AbstractC88434g<C84445d<Effect, Effect>, C84540h>(this) {
                /* class com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4357a.C84553b.CallableC84555b.C845561 */

                /* renamed from: a */
                final /* synthetic */ CallableC84555b f188971a;

                static {
                    Covode.recordClassIndex(98521);
                }

                {
                    this.f188971a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ C84540h apply(C84445d<Effect, Effect> dVar) {
                    C84549q qVar;
                    C84445d<Effect, Effect> dVar2 = dVar;
                    C89219l.m154721d(dVar2, "");
                    KEY key = dVar2.f188780b;
                    int i = C84557c.f188972a[dVar2.f188779a.ordinal()];
                    if (i == 1 || i == 2) {
                        qVar = new C84549q(EnumC84544l.INFO_STICKER_STATE_DOWNLOADING);
                    } else if (i == 3) {
                        qVar = new C84549q(EnumC84544l.INFO_STICKER_STATE_DOWNLOAD_SUCCESS);
                    } else if (i != 4) {
                        qVar = new C84549q(EnumC84544l.INFO_STICKER_STATE_UNKNOWN);
                    } else {
                        qVar = new C84549q(EnumC84544l.INFO_STICKER_STATE_DOWNLOAD_FAILED);
                    }
                    return new C84540h(key, qVar, dVar2.f188783e, dVar2.f188782d);
                }
            });
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84439d, com.p2082ss.android.ugc.tools.p4346h.p4349b.p4352c.AbstractC84527a
    /* renamed from: a */
    public final /* synthetic */ EffectCategoryResponse mo129424a(Effect effect) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(effect, "");
        return AbstractC84439d.C84440a.m145262a(this, effect);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84439d, com.p2082ss.android.ugc.tools.p4346h.p4349b.p4352c.AbstractC84527a
    /* renamed from: a */
    public final /* synthetic */ EffectCategoryResponse mo129425a(String str) {
        C89219l.m154721d(str, "");
        return this.f188927c.get(str);
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.a.b.a.b$a */
    static final class C84554a<T> implements AbstractC88983w<C84540h> {

        /* renamed from: a */
        final /* synthetic */ C84553b f188966a;

        /* renamed from: b */
        final /* synthetic */ Effect f188967b;

        static {
            Covode.recordClassIndex(98519);
        }

        C84554a(C84553b bVar, Effect effect) {
            this.f188966a = bVar;
            this.f188967b = effect;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<C84540h> vVar) {
            C89219l.m154721d(vVar, "");
            if (this.f188966a.f188965b.mo129418a(this.f188967b)) {
                vVar.mo143031a(new C84540h(this.f188967b, new C84549q(EnumC84544l.INFO_STICKER_STATE_DOWNLOAD_SUCCESS)));
            }
            vVar.mo143023a();
        }
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84439d
    /* renamed from: a */
    public final AbstractC88979t<C84540h> mo129422a(Effect effect, boolean z) {
        C89219l.m154721d(effect, "");
        AbstractC88979t<C84540h> d = AbstractC88979t.m154294a(new C84554a(this, effect)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143293d(AbstractC88979t.m154303a(new CallableC84555b(this, effect, z)));
        C89219l.m154716b(d, "");
        return d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84553b(AbstractC84438c cVar, AbstractC84442f<EffectCategoryResponse> fVar, AbstractC84437b<Effect> bVar, AbstractC84441e eVar, AbstractC84551a aVar, AbstractC84436a aVar2) {
        super(cVar, fVar, bVar, eVar);
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f188964a = aVar;
        this.f188965b = aVar2;
    }
}
