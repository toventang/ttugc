package com.bytedance.ies.xbridge.p1334m.p1335a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1334m.p1337c.C18726e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.m.a.d */
public abstract class AbstractC18710d extends AbstractC18468a {

    /* renamed from: a */
    private final String f44495a = "x.setStorageItem";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44496b = AbstractC18400b.EnumC18401a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.m.a.d$a */
    public interface AbstractC18711a {
        static {
            Covode.recordClassIndex(21405);
        }

        /* renamed from: a */
        void mo29750a(int i, String str);

        /* renamed from: a */
        void mo29751a(C18745b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21404);
    }

    /* renamed from: a */
    public abstract void mo29749a(C18726e eVar, AbstractC18711a aVar, EnumC18483e eVar2);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44495a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44496b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18726e> mo29415d() {
        return C18726e.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.m.a.d$b */
    public static final class C18712b implements AbstractC18711a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18710d f44497a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44498b;

        static {
            Covode.recordClassIndex(21406);
        }

        C18712b(AbstractC18710d dVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44497a = dVar;
            this.f44498b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1334m.p1335a.AbstractC18710d.AbstractC18711a
        /* renamed from: a */
        public final void mo29750a(int i, String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44498b, i, str, null, 8);
        }

        @Override // com.bytedance.ies.xbridge.p1334m.p1335a.AbstractC18710d.AbstractC18711a
        /* renamed from: a */
        public final void mo29751a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18710d.m34358a(this.f44498b, C18745b.C18746a.m34815a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        boolean z;
        AbstractC18659k i;
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        String str = C18586i.m34539a(nVar, "key", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !nVar.mo29759b("data") && (i = nVar.mo29766i("data")) != null) {
            C18726e eVar2 = new C18726e();
            C89219l.m154719c(str, "");
            eVar2.f44509a = str;
            C89219l.m154719c(i, "");
            eVar2.f44510b = i;
            mo29749a(eVar2, new C18712b(this, bVar), eVar);
            return;
        }
        AbstractC18468a.m34357a(bVar, -3, null, null, 12);
    }
}
