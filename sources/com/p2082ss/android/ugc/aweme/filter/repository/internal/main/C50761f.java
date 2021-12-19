package com.p2082ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20191d;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50722e;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50750k;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50751l;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50810n;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.C50721d;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.EnumC50720c;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.C50812b;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50696d;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50698f;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.EnumC50699g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.f */
public final class C50761f extends AbstractC20191d<List<? extends C50698f>, List<? extends C50696d>> implements AbstractC50810n {

    /* renamed from: a */
    public final AbstractC50722e f117157a;

    /* renamed from: b */
    public final AbstractC50750k f117158b;

    /* renamed from: f */
    public final AbstractC50751l f117159f;

    static {
        Covode.recordClassIndex(59929);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.f$a */
    static final class CallableC50762a<V> implements Callable<List<? extends C50696d>> {

        /* renamed from: a */
        final /* synthetic */ C50761f f117160a;

        /* renamed from: b */
        final /* synthetic */ List f117161b;

        static {
            Covode.recordClassIndex(59930);
        }

        CallableC50762a(C50761f fVar, List list) {
            this.f117160a = fVar;
            this.f117161b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ List<? extends C50696d> call() {
            EnumC50699g gVar;
            C50721d dVar;
            List<C50698f> list = this.f117161b;
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (C50698f fVar : list) {
                if (this.f117160a.f117157a.mo86096a(fVar)) {
                    gVar = EnumC50699g.FILTER_STATE_DOWNLOAD_SUCCESS;
                } else {
                    AbstractC50750k kVar = this.f117160a.f117158b;
                    C89219l.m154721d(kVar, "");
                    C89219l.m154721d(fVar, "");
                    EnumC50720c c = kVar.mo86085c(fVar);
                    if (c != null && (c == EnumC50720c.PENDING || c == EnumC50720c.START)) {
                        gVar = EnumC50699g.FILTER_STATE_DOWNLOADING;
                    } else if (this.f117160a.f117159f.mo86011a(fVar)) {
                        gVar = EnumC50699g.FILTER_STATE_DOWNLOAD_SUCCESS;
                    } else {
                        gVar = EnumC50699g.FILTER_STATE_NOT_DOWNLOAD;
                    }
                }
                if (this.f117160a.f117157a.mo86096a(fVar)) {
                    dVar = this.f117160a.f117157a.mo86013a(fVar.f117047a);
                } else if (gVar == EnumC50699g.FILTER_STATE_DOWNLOAD_SUCCESS) {
                    dVar = this.f117160a.f117159f.mo86109d(fVar.f117047a);
                } else {
                    dVar = C50812b.f117260a;
                }
                arrayList.add(new C50696d(fVar.f117047a, gVar, dVar.f117088a, dVar.f117089b));
            }
            return arrayList;
        }
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t mo33481a(Object obj) {
        List list = (List) obj;
        C89219l.m154721d(list, "");
        AbstractC88979t c = AbstractC88979t.m154314c(new CallableC50762a(this, list));
        C89219l.m154716b(c, "");
        return c;
    }

    public C50761f(AbstractC50722e eVar, AbstractC50750k kVar, AbstractC50751l lVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(lVar, "");
        this.f117157a = eVar;
        this.f117158b = kVar;
        this.f117159f = lVar;
    }
}
