package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4357a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20191d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84551a;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84450i;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84436a;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84441e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.a.f */
public final class C84562f extends AbstractC20191d<List<? extends Effect>, List<? extends EnumC84444c>> implements AbstractC84441e {

    /* renamed from: a */
    public final AbstractC84436a f188988a;

    /* renamed from: b */
    public final AbstractC84551a f188989b;

    static {
        Covode.recordClassIndex(98527);
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.a.b.a.f$a */
    static final class CallableC84563a<V> implements Callable<List<? extends EnumC84444c>> {

        /* renamed from: a */
        final /* synthetic */ C84562f f188990a;

        /* renamed from: b */
        final /* synthetic */ List f188991b;

        static {
            Covode.recordClassIndex(98528);
        }

        CallableC84563a(C84562f fVar, List list) {
            this.f188990a = fVar;
            this.f188991b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ List<? extends EnumC84444c> call() {
            EnumC84444c cVar;
            List<Effect> list = this.f188991b;
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (Effect effect : list) {
                if (C84450i.m145271a(this.f188990a.f188989b, effect)) {
                    cVar = EnumC84444c.DOWNLOADING;
                } else if (this.f188990a.f188988a.mo129418a(effect)) {
                    cVar = EnumC84444c.DOWNLOAD_SUCCESS;
                } else {
                    cVar = EnumC84444c.NOT_DOWNLOAD;
                }
                arrayList.add(cVar);
            }
            return arrayList;
        }
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t mo33481a(Object obj) {
        List list = (List) obj;
        C89219l.m154721d(list, "");
        AbstractC88979t c = AbstractC88979t.m154314c(new CallableC84563a(this, list));
        C89219l.m154716b(c, "");
        return c;
    }

    public C84562f(AbstractC84436a aVar, AbstractC84551a aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f188988a = aVar;
        this.f188989b = aVar2;
    }
}
