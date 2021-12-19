package com.p2082ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50746g;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50700h;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50701i;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50686a;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.b */
public final class C50728b implements AbstractC50701i {

    /* renamed from: a */
    public final AbstractC50746g f117099a;

    /* renamed from: b */
    public final AbstractC50707o f117100b;

    static {
        Covode.recordClassIndex(59893);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50701i
    /* renamed from: a */
    public final AbstractC88403ab<AbstractC50700h> mo86050a() {
        AbstractC88403ab<AbstractC50700h> c = this.f117099a.mo33639a().mo143275b().mo142925c(new C50729a(this));
        C89219l.m154716b(c, "");
        return c;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.b$a */
    static final class C50729a<T, R> implements AbstractC88434g<C50686a, AbstractC50700h> {

        /* renamed from: a */
        final /* synthetic */ C50728b f117101a;

        static {
            Covode.recordClassIndex(59894);
        }

        C50729a(C50728b bVar) {
            this.f117101a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ AbstractC50700h apply(C50686a aVar) {
            C50686a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return new C50727a(aVar2, this.f117101a.f117100b, this.f117101a.f117099a);
        }
    }

    public C50728b(AbstractC50746g gVar, AbstractC50707o oVar) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(oVar, "");
        this.f117099a = gVar;
        this.f117100b = oVar;
    }
}
