package com.bytedance.ies.xbridge.p1343n.p1344a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.model.params.C18752c;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.n.a.d */
public abstract class AbstractC18765d extends AbstractC18468a {

    /* renamed from: a */
    private final String f44543a = "x.showLoading";

    /* renamed from: com.bytedance.ies.xbridge.n.a.d$a */
    public interface AbstractC18766a {
        static {
            Covode.recordClassIndex(21462);
        }

        /* renamed from: a */
        void mo29808a(C18745b bVar, String str);

        /* renamed from: a */
        void mo29809a(String str);
    }

    static {
        Covode.recordClassIndex(21461);
    }

    /* renamed from: a */
    public abstract void mo29807a(C18752c cVar, AbstractC18766a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44543a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return AbstractC18400b.EnumC18401a.PRIVATE;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18752c> mo29415d() {
        return C18752c.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.n.a.d$b */
    public static final class C18767b implements AbstractC18766a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18765d f44544a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44545b;

        static {
            Covode.recordClassIndex(21463);
        }

        @Override // com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18765d.AbstractC18766a
        /* renamed from: a */
        public final void mo29809a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44545b, 0, str, null, 8);
        }

        C18767b(AbstractC18765d dVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44544a = dVar;
            this.f44545b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18765d.AbstractC18766a
        /* renamed from: a */
        public final void mo29808a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18765d.m34358a(this.f44545b, C18745b.C18746a.m34815a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        mo29807a(C18752c.C18753a.m34818a(nVar), new C18767b(this, bVar), eVar);
    }
}
