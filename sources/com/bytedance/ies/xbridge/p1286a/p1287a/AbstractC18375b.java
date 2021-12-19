package com.bytedance.ies.xbridge.p1286a.p1287a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.p1286a.p1289c.C18392b;
import com.bytedance.ies.xbridge.p1286a.p1289c.C18394c;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.a.a.b */
public abstract class AbstractC18375b extends AbstractC18468a {

    /* renamed from: a */
    private final AbstractC18400b.EnumC18401a f43956a = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: b */
    private final String f43957b = "x.login";

    /* renamed from: com.bytedance.ies.xbridge.a.a.b$a */
    public interface AbstractC18376a {

        /* renamed from: com.bytedance.ies.xbridge.a.a.b$a$a */
        public static final class C18377a {
            static {
                Covode.recordClassIndex(21049);
            }
        }

        static {
            Covode.recordClassIndex(21048);
        }

        /* renamed from: a */
        void mo29420a(C18394c cVar, String str);

        /* renamed from: a */
        void mo29421a(String str);
    }

    static {
        Covode.recordClassIndex(21047);
    }

    /* renamed from: a */
    public abstract void mo29419a(C18392b bVar, AbstractC18376a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f43957b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f43956a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18392b> mo29415d() {
        return C18392b.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18394c> mo29416e() {
        return C18394c.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.a.a.b$b */
    public static final class C18378b implements AbstractC18376a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18375b f43958a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f43959b;

        static {
            Covode.recordClassIndex(21050);
        }

        @Override // com.bytedance.ies.xbridge.p1286a.p1287a.AbstractC18375b.AbstractC18376a
        /* renamed from: a */
        public final void mo29421a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f43959b, 0, str, null, 8);
        }

        C18378b(AbstractC18375b bVar, AbstractC18400b.AbstractC18402b bVar2) {
            this.f43958a = bVar;
            this.f43959b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.p1286a.p1287a.AbstractC18375b.AbstractC18376a
        /* renamed from: a */
        public final void mo29420a(C18394c cVar, String str) {
            C89219l.m154719c(cVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(cVar, "");
            if (cVar.f43985a == null) {
                AbstractC18468a.m34357a(this.f43959b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = cVar.f43985a;
            if (str2 != null) {
                linkedHashMap.put("status", str2);
            }
            AbstractC18375b.m34358a(this.f43959b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        AbstractC18754n b = C18586i.m34543b(nVar, "context");
        C18392b bVar2 = new C18392b();
        if (b != null) {
            bVar2.f43983a = b;
        }
        mo29419a(bVar2, new C18378b(this, bVar), eVar);
    }
}
