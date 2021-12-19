package com.bytedance.ies.xbridge.p1334m.p1335a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1334m.p1337c.C18720b;
import com.bytedance.ies.xbridge.p1334m.p1337c.C18722c;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.m.a.b */
public abstract class AbstractC18704b extends AbstractC18468a {

    /* renamed from: a */
    private final String f44487a = "x.getStorageItem";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44488b = AbstractC18400b.EnumC18401a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.m.a.b$a */
    public interface AbstractC18705a {
        static {
            Covode.recordClassIndex(21399);
        }

        /* renamed from: a */
        void mo29744a(C18722c cVar, String str);

        /* renamed from: a */
        void mo29745a(String str);
    }

    static {
        Covode.recordClassIndex(21398);
    }

    /* renamed from: a */
    public abstract void mo29743a(C18720b bVar, AbstractC18705a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44487a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44488b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18720b> mo29415d() {
        return C18720b.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18722c> mo29416e() {
        return C18722c.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.m.a.b$b */
    public static final class C18706b implements AbstractC18705a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18704b f44489a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44490b;

        static {
            Covode.recordClassIndex(21400);
        }

        @Override // com.bytedance.ies.xbridge.p1334m.p1335a.AbstractC18704b.AbstractC18705a
        /* renamed from: a */
        public final void mo29745a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44490b, 0, str, null, 8);
        }

        C18706b(AbstractC18704b bVar, AbstractC18400b.AbstractC18402b bVar2) {
            this.f44489a = bVar;
            this.f44490b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.p1334m.p1335a.AbstractC18704b.AbstractC18705a
        /* renamed from: a */
        public final void mo29744a(C18722c cVar, String str) {
            C89219l.m154719c(cVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(cVar, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Object obj = cVar.f44505a;
            if (obj != null) {
                linkedHashMap.put("data", obj);
            }
            AbstractC18704b.m34358a(this.f44490b, linkedHashMap, str);
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
        C18720b bVar2 = new C18720b();
        C89219l.m154719c(str, "");
        bVar2.f44503a = str;
        mo29743a(bVar2, new C18706b(this, bVar), eVar);
    }
}
