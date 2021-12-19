package com.bytedance.ies.xbridge.p1334m.p1335a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1334m.p1337c.C18724d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.m.a.c */
public abstract class AbstractC18707c extends AbstractC18468a {

    /* renamed from: a */
    private final String f44491a = "x.removeStorageItem";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44492b = AbstractC18400b.EnumC18401a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.m.a.c$a */
    public interface AbstractC18708a {
        static {
            Covode.recordClassIndex(21402);
        }

        /* renamed from: a */
        void mo29747a(C18745b bVar, String str);

        /* renamed from: a */
        void mo29748a(String str);
    }

    static {
        Covode.recordClassIndex(21401);
    }

    /* renamed from: a */
    public abstract void mo29746a(C18724d dVar, AbstractC18708a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44491a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44492b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18724d> mo29415d() {
        return C18724d.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.m.a.c$b */
    public static final class C18709b implements AbstractC18708a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18707c f44493a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44494b;

        static {
            Covode.recordClassIndex(21403);
        }

        @Override // com.bytedance.ies.xbridge.p1334m.p1335a.AbstractC18707c.AbstractC18708a
        /* renamed from: a */
        public final void mo29748a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44494b, 0, str, null, 8);
        }

        C18709b(AbstractC18707c cVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44493a = cVar;
            this.f44494b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1334m.p1335a.AbstractC18707c.AbstractC18708a
        /* renamed from: a */
        public final void mo29747a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18707c.m34358a(this.f44494b, C18745b.C18746a.m34815a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        boolean z;
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
        if (z) {
            AbstractC18468a.m34357a(bVar, -3, null, null, 12);
            return;
        }
        C18724d dVar = new C18724d();
        C89219l.m154719c(str, "");
        dVar.f44507a = str;
        mo29746a(dVar, new C18709b(this, bVar), eVar);
    }
}
