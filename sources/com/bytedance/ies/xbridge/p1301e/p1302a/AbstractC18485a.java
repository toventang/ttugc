package com.bytedance.ies.xbridge.p1301e.p1302a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1301e.p1304c.C18503a;
import com.bytedance.ies.xbridge.p1301e.p1304c.C18505b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.e.a.a */
public abstract class AbstractC18485a extends AbstractC18468a {

    /* renamed from: a */
    private final AbstractC18400b.EnumC18401a f44132a = AbstractC18400b.EnumC18401a.PUBLIC;

    /* renamed from: b */
    private final String f44133b = "x.publishEvent";

    /* renamed from: com.bytedance.ies.xbridge.e.a.a$a */
    public interface AbstractC18486a {
        static {
            Covode.recordClassIndex(21180);
        }

        /* renamed from: a */
        void mo29630a(C18745b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21179);
    }

    /* renamed from: a */
    public abstract void mo29629a(C18503a aVar, AbstractC18486a aVar2, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44133b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44132a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18503a> mo29415d() {
        return C18503a.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.e.a.a$b */
    public static final class C18487b implements AbstractC18486a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18485a f44134a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44135b;

        static {
            Covode.recordClassIndex(21181);
        }

        C18487b(AbstractC18485a aVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44134a = aVar;
            this.f44135b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1301e.p1302a.AbstractC18485a.AbstractC18486a
        /* renamed from: a */
        public final void mo29630a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18485a.m34358a(this.f44135b, C18745b.C18746a.m34815a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        boolean z;
        double d;
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
            int i2 = C18505b.f44159a[i.mo29707a().ordinal()];
            if (i2 == 1) {
                d = i.mo29709c();
            } else if (i2 == 2) {
                d = i.mo29709c();
            }
            long j = (long) d;
            AbstractC18754n b = C18586i.m34543b(nVar, "params");
            C18503a aVar = new C18503a();
            C89219l.m154719c(str, "");
            aVar.f44156a = str;
            aVar.f44157b = j;
            aVar.f44158c = b;
            mo29629a(aVar, new C18487b(this, bVar), eVar);
            return;
        }
        AbstractC18468a.m34357a(bVar, -3, null, null, 12);
    }
}
