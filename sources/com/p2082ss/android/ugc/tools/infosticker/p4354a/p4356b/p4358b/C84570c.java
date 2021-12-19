package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4358b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84534b;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.C84543k;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.C84545m;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.EnumC84546n;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84581c;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84596d;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84598f;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84599g;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84445d;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.b.c */
public final class C84570c implements AbstractC84534b {

    /* renamed from: a */
    public final AbstractC84596d f189001a;

    /* renamed from: b */
    public final AbstractC84598f f189002b;

    /* renamed from: c */
    private final AbstractC84581c f189003c;

    /* renamed from: d */
    private final AbstractC84599g f189004d;

    static {
        Covode.recordClassIndex(98535);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84534b
    /* renamed from: a */
    public final AbstractC84451j<ProviderEffect, ProviderEffectModel> mo129479a() {
        return this.f189003c.mo129518a();
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.a.b.b.c$b */
    static final class CallableC84572b<V> implements Callable<AbstractC88984x<? extends C84543k>> {

        /* renamed from: a */
        final /* synthetic */ C84570c f189007a;

        /* renamed from: b */
        final /* synthetic */ ProviderEffect f189008b;

        static {
            Covode.recordClassIndex(98537);
        }

        CallableC84572b(C84570c cVar, ProviderEffect providerEffect) {
            this.f189007a = cVar;
            this.f189008b = providerEffect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ AbstractC88984x<? extends C84543k> call() {
            return this.f189007a.f189001a.mo129430a(this.f189008b, true).mo143292d(new AbstractC88434g<C84445d<ProviderEffect, String>, C84543k>(this) {
                /* class com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4358b.C84570c.CallableC84572b.C845731 */

                /* renamed from: a */
                final /* synthetic */ CallableC84572b f189009a;

                static {
                    Covode.recordClassIndex(98538);
                }

                {
                    this.f189009a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ C84543k apply(C84445d<ProviderEffect, String> dVar) {
                    C84545m mVar;
                    C84445d<ProviderEffect, String> dVar2 = dVar;
                    C89219l.m154721d(dVar2, "");
                    KEY key = dVar2.f188780b;
                    C84570c cVar = this.f189009a.f189007a;
                    int i = C84574d.f189010a[dVar2.f188779a.ordinal()];
                    if (i == 1 || i == 2) {
                        mVar = new C84545m(EnumC84546n.PROVIDER_STICKER_STATE_DOWNLOADING, "");
                    } else if (i == 3) {
                        RESULT result = dVar2.f188781c;
                        if (result == null) {
                            result = cVar.f189002b.mo129514a(dVar2.f188780b);
                        }
                        mVar = new C84545m(EnumC84546n.PROVIDER_STICKER_STATE_DOWNLOAD_SUCCESS, result);
                    } else if (i != 4) {
                        mVar = new C84545m(EnumC84546n.PROVIDER_STICKER_STATE_UNKNOWN, "");
                    } else {
                        mVar = new C84545m(EnumC84546n.PROVIDER_STICKER_STATE_DOWNLOAD_FAILED, "");
                    }
                    return new C84543k(key, mVar, dVar2.f188783e, dVar2.f188782d);
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84534b
    /* renamed from: a */
    public final AbstractC84451j<ProviderEffect, ProviderEffectModel> mo129480a(String str) {
        C89219l.m154721d(str, "");
        return this.f189003c.mo129519a(str);
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.a.b.b.c$a */
    static final class C84571a<T> implements AbstractC88983w<C84543k> {

        /* renamed from: a */
        final /* synthetic */ C84570c f189005a;

        /* renamed from: b */
        final /* synthetic */ ProviderEffect f189006b;

        static {
            Covode.recordClassIndex(98536);
        }

        C84571a(C84570c cVar, ProviderEffect providerEffect) {
            this.f189005a = cVar;
            this.f189006b = providerEffect;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<C84543k> vVar) {
            C89219l.m154721d(vVar, "");
            if (this.f189005a.f189002b.mo129515b(this.f189006b)) {
                vVar.mo143031a(new C84543k(this.f189006b, new C84545m(EnumC84546n.PROVIDER_STICKER_STATE_DOWNLOAD_SUCCESS, this.f189005a.f189002b.mo129514a(this.f189006b))));
            }
            vVar.mo143023a();
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84534b
    /* renamed from: a */
    public final AbstractC88979t<C84543k> mo129481a(ProviderEffect providerEffect) {
        C89219l.m154721d(providerEffect, "");
        AbstractC88979t<C84543k> d = AbstractC88979t.m154294a(new C84571a(this, providerEffect)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143293d(AbstractC88979t.m154303a(new CallableC84572b(this, providerEffect)));
        C89219l.m154716b(d, "");
        return d;
    }

    public C84570c(AbstractC84581c cVar, AbstractC84599g gVar, AbstractC84596d dVar, AbstractC84598f fVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(fVar, "");
        this.f189003c = cVar;
        this.f189004d = gVar;
        this.f189001a = dVar;
        this.f189002b = fVar;
    }
}
