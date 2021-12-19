package com.bytedance.ies.xbridge.p1343n.p1344a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.EnumC18805o;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1343n.p1348d.C18788a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.n.a.a */
public abstract class AbstractC18755a extends AbstractC18468a {

    /* renamed from: a */
    private final String f44531a = "x.configureStatusBar";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44532b = AbstractC18400b.EnumC18401a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.n.a.a$a */
    public interface AbstractC18756a {
        static {
            Covode.recordClassIndex(21452);
        }

        /* renamed from: a */
        void mo29799a(int i, String str);

        /* renamed from: a */
        void mo29800a(C18745b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21451);
    }

    /* renamed from: a */
    public abstract void mo29798a(C18788a aVar, AbstractC18756a aVar2, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44531a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44532b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18788a> mo29415d() {
        return C18788a.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.n.a.a$b */
    public static final class C18757b implements AbstractC18756a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18755a f44533a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44534b;

        static {
            Covode.recordClassIndex(21453);
        }

        C18757b(AbstractC18755a aVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44533a = aVar;
            this.f44534b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18755a.AbstractC18756a
        /* renamed from: a */
        public final void mo29799a(int i, String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44534b, i, str, null, 8);
        }

        @Override // com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18755a.AbstractC18756a
        /* renamed from: a */
        public final void mo29800a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18755a.m34358a(this.f44534b, C18745b.C18746a.m34815a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        Boolean bool;
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        String str = C18586i.m34539a(nVar, "style", "");
        C89219l.m154719c(nVar, "");
        C89219l.m154719c("visible", "");
        if (nVar.mo29766i("visible").mo29707a() == EnumC18805o.Boolean) {
            bool = Boolean.valueOf(nVar.mo29760c("visible"));
        } else {
            bool = null;
        }
        String str2 = C18586i.m34539a(nVar, "backgroundColor", "");
        if (bool == null) {
            AbstractC18468a.m34357a(bVar, -3, "Please check your input!", null, 8);
            return;
        }
        C18788a aVar = new C18788a();
        if (str.length() > 0) {
            aVar.f44562a = str;
        }
        if (str2.length() > 0) {
            aVar.f44563b = str2;
        }
        aVar.f44564c = bool;
        mo29798a(aVar, new C18757b(this, bVar), eVar);
    }
}
