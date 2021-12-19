package com.bytedance.jedi.p1445a.p1450e.p1451a.p1452a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1446a.AbstractC20126b;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.a.e.a.a.e */
public class C20178e<V> extends AbstractC20126b<C89391z, V> {

    /* renamed from: c */
    private List<? extends V> f47949c;

    static {
        Covode.recordClassIndex(23686);
    }

    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20126b
    /* renamed from: c */
    public final List<C89378p<C89391z, List<V>>> mo33470c() {
        List<C89378p<C89391z, List<V>>> a;
        List<? extends V> list = this.f47949c;
        if (list == null || (a = C89070n.m154516a(new C89378p(C89391z.f203057a, list))) == null) {
            return C89086z.INSTANCE;
        }
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20126b
    /* renamed from: b */
    public final /* synthetic */ List mo33468b(C89391z zVar) {
        C89219l.m154719c(zVar, "");
        return this.f47949c;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.List] */
    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20126b
    /* renamed from: b */
    public final /* synthetic */ void mo33469b(C89391z zVar, List list) {
        C89219l.m154719c(zVar, "");
        this.f47949c = list;
    }
}
