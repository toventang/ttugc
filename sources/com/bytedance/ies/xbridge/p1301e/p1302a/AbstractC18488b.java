package com.bytedance.ies.xbridge.p1301e.p1302a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1301e.p1304c.C18506c;
import com.bytedance.ies.xbridge.p1301e.p1304c.C18508d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.e.a.b */
public abstract class AbstractC18488b extends AbstractC18468a {

    /* renamed from: a */
    private final AbstractC18400b.EnumC18401a f44136a = AbstractC18400b.EnumC18401a.PUBLIC;

    /* renamed from: b */
    private final String f44137b = "x.subscribeEvent";

    /* renamed from: com.bytedance.ies.xbridge.e.a.b$a */
    public interface AbstractC18489a {
        static {
            Covode.recordClassIndex(21183);
        }

        /* renamed from: a */
        void mo29632a(C18745b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21182);
    }

    /* renamed from: a */
    public abstract void mo29631a(C18506c cVar, AbstractC18489a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44137b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44136a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18506c> mo29415d() {
        return C18506c.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.e.a.b$b */
    public static final class C18490b implements AbstractC18489a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18488b f44138a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44139b;

        static {
            Covode.recordClassIndex(21184);
        }

        C18490b(AbstractC18488b bVar, AbstractC18400b.AbstractC18402b bVar2) {
            this.f44138a = bVar;
            this.f44139b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.p1301e.p1302a.AbstractC18488b.AbstractC18489a
        /* renamed from: a */
        public final void mo29632a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18488b.m34358a(this.f44139b, C18745b.C18746a.m34815a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        boolean z;
        long j;
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        String str = C18586i.m34539a(nVar, "eventName", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && nVar.mo29757a("timestamp")) {
            AbstractC18659k i = nVar.mo29766i("timestamp");
            int i2 = C18508d.f44163a[i.mo29707a().ordinal()];
            if (i2 == 1) {
                j = (long) i.mo29709c();
            } else if (i2 == 2) {
                j = (long) i.mo29710d();
            }
            C18506c cVar = new C18506c();
            C89219l.m154719c(str, "");
            cVar.f44161a = str;
            cVar.f44162b = j;
            mo29631a(cVar, new C18490b(this, bVar), eVar);
            return;
        }
        AbstractC18468a.m34357a(bVar, -3, null, null, 12);
    }
}
