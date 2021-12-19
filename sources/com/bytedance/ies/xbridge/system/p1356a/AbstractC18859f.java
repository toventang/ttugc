package com.bytedance.ies.xbridge.system.p1356a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.system.p1361c.C18906g;
import com.bytedance.ies.xbridge.system.p1361c.C18908h;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.system.a.f */
public abstract class AbstractC18859f extends AbstractC18468a {

    /* renamed from: a */
    private final String f44670a = "x.setCalendarEvent";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44671b = AbstractC18400b.EnumC18401a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.system.a.f$a */
    public interface AbstractC18860a {

        /* renamed from: com.bytedance.ies.xbridge.system.a.f$a$a */
        public static final class C18861a {
            static {
                Covode.recordClassIndex(21570);
            }
        }

        static {
            Covode.recordClassIndex(21569);
        }

        /* renamed from: a */
        void mo29845a(int i, String str);

        /* renamed from: a */
        void mo29846a(C18908h hVar, String str);
    }

    static {
        Covode.recordClassIndex(21568);
    }

    /* renamed from: a */
    public abstract void mo29844a(C18906g gVar, AbstractC18860a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44670a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44671b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18906g> mo29415d() {
        return C18906g.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18908h> mo29416e() {
        return C18908h.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.system.a.f$b */
    public static final class C18862b implements AbstractC18860a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18859f f44672a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44673b;

        static {
            Covode.recordClassIndex(21571);
        }

        C18862b(AbstractC18859f fVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44672a = fVar;
            this.f44673b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18859f.AbstractC18860a
        /* renamed from: a */
        public final void mo29845a(int i, String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44673b, i, str, null, 8);
        }

        @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18859f.AbstractC18860a
        /* renamed from: a */
        public final void mo29846a(C18908h hVar, String str) {
            C89219l.m154719c(hVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(hVar, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = hVar.f44755a;
            if (str2 != null) {
                linkedHashMap.put("eventID", str2);
            }
            AbstractC18859f.m34358a(this.f44673b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        Long a = AbstractC18749a.C18750a.m34817a(nVar, "startDate");
        Long a2 = AbstractC18749a.C18750a.m34817a(nVar, "endDate");
        if (!(a == null || a2 == null)) {
            String str = C18586i.m34539a(nVar, "location", "");
            String str2 = C18586i.m34539a(nVar, "url", "");
            String str3 = C18586i.m34539a(nVar, "title", "");
            String str4 = C18586i.m34539a(nVar, "notes", "");
            boolean a3 = C18586i.m34542a(nVar, "allDay", false);
            long a4 = (long) AbstractC18749a.C18750a.m34816a(nVar, "alarmOffset", 0);
            C18906g gVar = new C18906g();
            gVar.f44746b = a.longValue();
            gVar.f44745a = a2.longValue();
            gVar.f44748d = str3;
            gVar.f44749e = str4;
            gVar.f44750f = Long.valueOf(a4);
            gVar.f44752h = str;
            gVar.f44753i = str2;
            gVar.f44751g = Boolean.valueOf(a3);
            if (gVar.f44745a >= gVar.f44746b && gVar.f44745a > 0 && gVar.f44746b > 0) {
                mo29844a(gVar, new C18862b(this, bVar), eVar);
                return;
            }
        }
        AbstractC18468a.m34357a(bVar, -3, "paramModel convert to null!", null, 8);
    }
}
