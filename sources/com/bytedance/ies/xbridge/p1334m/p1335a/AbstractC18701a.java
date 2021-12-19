package com.bytedance.ies.xbridge.p1334m.p1335a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.params.C18752c;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1334m.p1337c.C18718a;
import java.util.LinkedHashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.m.a.a */
public abstract class AbstractC18701a extends AbstractC18468a {

    /* renamed from: a */
    private final String f44483a = "x.getStorageInfo";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44484b = AbstractC18400b.EnumC18401a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.m.a.a$a */
    public interface AbstractC18702a {
        static {
            Covode.recordClassIndex(21396);
        }

        /* renamed from: a */
        void mo29741a(C18718a aVar, String str);

        /* renamed from: a */
        void mo29742a(String str);
    }

    static {
        Covode.recordClassIndex(21395);
    }

    /* renamed from: a */
    public abstract void mo29740a(C18752c cVar, AbstractC18702a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44483a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44484b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18752c> mo29415d() {
        return C18752c.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18718a> mo29416e() {
        return C18718a.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.m.a.a$b */
    public static final class C18703b implements AbstractC18702a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18701a f44485a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44486b;

        static {
            Covode.recordClassIndex(21397);
        }

        @Override // com.bytedance.ies.xbridge.p1334m.p1335a.AbstractC18701a.AbstractC18702a
        /* renamed from: a */
        public final void mo29742a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44486b, 0, str, null, 8);
        }

        C18703b(AbstractC18701a aVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44485a = aVar;
            this.f44486b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1334m.p1335a.AbstractC18701a.AbstractC18702a
        /* renamed from: a */
        public final void mo29741a(C18718a aVar, String str) {
            C89219l.m154719c(aVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(aVar, "");
            if (aVar.f44501a == null) {
                AbstractC18468a.m34357a(this.f44486b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<String> list = aVar.f44501a;
            if (list != null) {
                linkedHashMap.put("keys", list);
            }
            AbstractC18701a.m34358a(this.f44486b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        mo29740a(C18752c.C18753a.m34818a(nVar), new C18703b(this, bVar), eVar);
    }
}
