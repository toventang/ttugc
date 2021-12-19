package com.bytedance.ies.bullet.p1129c.p1132c.p1133a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1138b.AbstractC16252a;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.a.j */
public final class C16181j implements AbstractC16252a<C16162c> {

    /* renamed from: a */
    private final List<AbstractC16252a<C16162c>> f38966a;

    static {
        Covode.recordClassIndex(18474);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.ies.bullet.c.e.b.a<com.bytedance.ies.bullet.c.c.a.c>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C16181j(List<? extends AbstractC16252a<C16162c>> list) {
        C89219l.m154719c(list, "");
        this.f38966a = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.c.c.a.j$a */
    public static final class C16182a extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16181j f38967a;

        /* renamed from: b */
        final /* synthetic */ Iterator f38968b;

        /* renamed from: c */
        final /* synthetic */ C16162c f38969c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f38970d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f38971e;

        static {
            Covode.recordClassIndex(18475);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16182a(C16181j jVar, Iterator it, C16162c cVar, AbstractC89172b bVar, AbstractC89172b bVar2) {
            super(1);
            this.f38967a = jVar;
            this.f38968b = it;
            this.f38969c = cVar;
            this.f38970d = bVar;
            this.f38971e = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154719c(th, "");
            if (this.f38968b.hasNext()) {
                this.f38967a.mo25747a(this.f38968b, this.f38969c, this.f38970d, this.f38971e);
            } else {
                this.f38971e.invoke(th);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.f.a.b, h.f.a.b] */
    @Override // com.bytedance.ies.bullet.p1129c.p1136e.p1138b.AbstractC16252a
    /* renamed from: a */
    public final /* synthetic */ void mo25746a(C16162c cVar, AbstractC89172b<? super C16162c, C89391z> bVar, AbstractC89172b bVar2) {
        C16162c cVar2 = cVar;
        C89219l.m154719c(cVar2, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        Iterator<AbstractC16252a<C16162c>> it = this.f38966a.iterator();
        if (!it.hasNext()) {
            bVar2.invoke(new Throwable("None of BridgeRegistryTransformer processor for func name: " + cVar2.f38917a));
        } else {
            mo25747a(it, cVar2, bVar, bVar2);
        }
    }

    /* renamed from: a */
    public final void mo25747a(Iterator<? extends AbstractC16252a<C16162c>> it, C16162c cVar, AbstractC89172b<? super C16162c, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        try {
            ((AbstractC16252a) it.next()).mo25746a(cVar, bVar, new C16182a(this, it, cVar, bVar, bVar2));
        } catch (Exception e) {
            bVar2.invoke(e);
        }
    }
}
