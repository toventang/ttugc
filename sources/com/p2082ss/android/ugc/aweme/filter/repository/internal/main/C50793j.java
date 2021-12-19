package com.p2082ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1458h.AbstractC20270e;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50722e;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50747h;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.C50710a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50695c;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.j */
public final class C50793j extends AbstractC20270e<C50710a> implements AbstractC50747h {

    /* renamed from: a */
    final AbstractC50722e f117231a;

    static {
        Covode.recordClassIndex(59961);
    }

    @Override // com.bytedance.jedi.p1445a.p1458h.AbstractC20266a
    /* renamed from: b */
    public final AbstractC88979t<C50710a> mo33640b() {
        AbstractC88979t<C50710a> a = AbstractC88979t.m154294a(new C50794a(this));
        C89219l.m154716b(a, "");
        return a;
    }

    public C50793j(AbstractC50722e eVar) {
        C89219l.m154721d(eVar, "");
        this.f117231a = eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.j$a */
    static final class C50794a<T> implements AbstractC88983w<C50710a> {

        /* renamed from: a */
        final /* synthetic */ C50793j f117232a;

        static {
            Covode.recordClassIndex(59962);
        }

        C50794a(C50793j jVar) {
            this.f117232a = jVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<C50710a> vVar) {
            C89219l.m154721d(vVar, "");
            vVar.mo143031a(new C50710a(new C50695c(this.f117232a.f117231a.mo86014a(), C89086z.INSTANCE), true));
            vVar.mo143023a();
        }
    }
}
