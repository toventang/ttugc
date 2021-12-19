package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4358b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20191d;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.C84545m;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.EnumC84546n;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84596d;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84598f;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84599g;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84450i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.b.f */
public final class C84577f extends AbstractC20191d<List<? extends ProviderEffect>, List<? extends C84545m>> implements AbstractC84599g {

    /* renamed from: a */
    public final AbstractC84596d f189023a;

    /* renamed from: b */
    public final AbstractC84598f f189024b;

    static {
        Covode.recordClassIndex(98542);
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.a.b.b.f$a */
    static final class CallableC84578a<V> implements Callable<List<? extends C84545m>> {

        /* renamed from: a */
        final /* synthetic */ C84577f f189025a;

        /* renamed from: b */
        final /* synthetic */ List f189026b;

        static {
            Covode.recordClassIndex(98543);
        }

        CallableC84578a(C84577f fVar, List list) {
            this.f189025a = fVar;
            this.f189026b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ List<? extends C84545m> call() {
            EnumC84546n nVar;
            List<ProviderEffect> list = this.f189026b;
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (ProviderEffect providerEffect : list) {
                String a = this.f189025a.f189024b.mo129514a(providerEffect);
                if (C84450i.m145271a(this.f189025a.f189023a, providerEffect)) {
                    nVar = EnumC84546n.PROVIDER_STICKER_STATE_DOWNLOADING;
                } else if (this.f189025a.f189024b.mo129515b(providerEffect)) {
                    nVar = EnumC84546n.PROVIDER_STICKER_STATE_DOWNLOAD_SUCCESS;
                } else {
                    nVar = EnumC84546n.PROVIDER_STICKER_STATE_NOT_DOWNLOAD;
                }
                arrayList.add(new C84545m(nVar, a));
            }
            return arrayList;
        }
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t mo33481a(Object obj) {
        List list = (List) obj;
        C89219l.m154721d(list, "");
        AbstractC88979t c = AbstractC88979t.m154314c(new CallableC84578a(this, list));
        C89219l.m154716b(c, "");
        return c;
    }

    public C84577f(AbstractC84596d dVar, AbstractC84598f fVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(fVar, "");
        this.f189023a = dVar;
        this.f189024b = fVar;
    }
}
