package com.bytedance.ies.xbridge.p1305f.p1306a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.params.C18752c;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1305f.p1308c.C18537d;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.f.a.c */
public abstract class AbstractC18523c extends AbstractC18468a {

    /* renamed from: a */
    private final String f44182a = "x.getContainerID";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44183b = AbstractC18400b.EnumC18401a.PUBLIC;

    /* renamed from: com.bytedance.ies.xbridge.f.a.c$a */
    public interface AbstractC18524a {
        static {
            Covode.recordClassIndex(21218);
        }

        /* renamed from: a */
        void mo29649a(C18537d dVar, String str);

        /* renamed from: a */
        void mo29650a(String str);
    }

    static {
        Covode.recordClassIndex(21217);
    }

    /* renamed from: a */
    public abstract void mo29648a(C18752c cVar, AbstractC18524a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44182a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44183b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18752c> mo29415d() {
        return C18752c.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18537d> mo29416e() {
        return C18537d.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.f.a.c$b */
    public static final class C18525b implements AbstractC18524a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18523c f44184a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44185b;

        static {
            Covode.recordClassIndex(21219);
        }

        @Override // com.bytedance.ies.xbridge.p1305f.p1306a.AbstractC18523c.AbstractC18524a
        /* renamed from: a */
        public final void mo29650a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44185b, 0, str, null, 8);
        }

        C18525b(AbstractC18523c cVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44184a = cVar;
            this.f44185b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1305f.p1306a.AbstractC18523c.AbstractC18524a
        /* renamed from: a */
        public final void mo29649a(C18537d dVar, String str) {
            C89219l.m154719c(dVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(dVar, "");
            if (dVar.f44201a == null) {
                AbstractC18468a.m34357a(this.f44185b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = dVar.f44201a;
            if (str2 != null) {
                linkedHashMap.put("containerID", str2);
            }
            AbstractC18523c.m34358a(this.f44185b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        mo29648a(C18752c.C18753a.m34818a(nVar), new C18525b(this, bVar), eVar);
    }
}
