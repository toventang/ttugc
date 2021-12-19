package com.bytedance.ies.xbridge.system.p1356a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.system.p1361c.C18896b;
import com.bytedance.ies.xbridge.system.p1361c.C18898c;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.system.a.b */
public abstract class AbstractC18846b extends AbstractC18468a {

    /* renamed from: a */
    private final String f44654a = "x.checkPermission";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44655b = AbstractC18400b.EnumC18401a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.system.a.b$a */
    public interface AbstractC18847a {

        /* renamed from: com.bytedance.ies.xbridge.system.a.b$a$a */
        public static final class C18848a {
            static {
                Covode.recordClassIndex(21557);
            }
        }

        static {
            Covode.recordClassIndex(21556);
        }

        /* renamed from: a */
        void mo29833a(int i, String str);

        /* renamed from: a */
        void mo29834a(C18898c cVar, String str);
    }

    static {
        Covode.recordClassIndex(21555);
    }

    /* renamed from: a */
    public abstract void mo29832a(C18896b bVar, AbstractC18847a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44654a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44655b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18896b> mo29415d() {
        return C18896b.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18898c> mo29416e() {
        return C18898c.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.system.a.b$b */
    public static final class C18849b implements AbstractC18847a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18846b f44656a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44657b;

        static {
            Covode.recordClassIndex(21558);
        }

        C18849b(AbstractC18846b bVar, AbstractC18400b.AbstractC18402b bVar2) {
            this.f44656a = bVar;
            this.f44657b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18846b.AbstractC18847a
        /* renamed from: a */
        public final void mo29833a(int i, String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44657b, i, str, null, 8);
        }

        @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18846b.AbstractC18847a
        /* renamed from: a */
        public final void mo29834a(C18898c cVar, String str) {
            C89219l.m154719c(cVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(cVar, "");
            if (cVar.f44736a == null) {
                AbstractC18468a.m34357a(this.f44657b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = cVar.f44736a;
            if (str2 != null) {
                linkedHashMap.put("status", str2);
            }
            AbstractC18846b.m34358a(this.f44657b, linkedHashMap, str);
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
        String str = C18586i.m34539a(nVar, "permission", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC18468a.m34357a(bVar, -3, null, null, 12);
            return;
        }
        C18896b bVar2 = new C18896b();
        C89219l.m154719c(str, "");
        bVar2.f44734a = str;
        mo29832a(bVar2, new C18849b(this, bVar), eVar);
    }
}
