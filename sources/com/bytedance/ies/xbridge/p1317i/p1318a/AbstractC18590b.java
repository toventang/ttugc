package com.bytedance.ies.xbridge.p1317i.p1318a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1317i.p1320c.C18615c;
import com.bytedance.ies.xbridge.p1317i.p1320c.C18617d;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.i.a.b */
public abstract class AbstractC18590b extends AbstractC18468a {

    /* renamed from: a */
    private final AbstractC18400b.EnumC18401a f44284a = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: b */
    private final String f44285b = "x.downloadFile";

    /* renamed from: com.bytedance.ies.xbridge.i.a.b$a */
    public interface AbstractC18591a {
        static {
            Covode.recordClassIndex(21285);
        }

        /* renamed from: a */
        void mo29673a(C18617d dVar, String str);

        /* renamed from: a */
        void mo29674a(String str);
    }

    static {
        Covode.recordClassIndex(21284);
    }

    /* renamed from: a */
    public abstract void mo29672a(C18615c cVar, AbstractC18591a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44285b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44284a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18615c> mo29415d() {
        return C18615c.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18617d> mo29416e() {
        return C18617d.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.i.a.b$b */
    public static final class C18592b implements AbstractC18591a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18590b f44286a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44287b;

        static {
            Covode.recordClassIndex(21286);
        }

        @Override // com.bytedance.ies.xbridge.p1317i.p1318a.AbstractC18590b.AbstractC18591a
        /* renamed from: a */
        public final void mo29674a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44287b, 0, str, null, 8);
        }

        C18592b(AbstractC18590b bVar, AbstractC18400b.AbstractC18402b bVar2) {
            this.f44286a = bVar;
            this.f44287b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.p1317i.p1318a.AbstractC18590b.AbstractC18591a
        /* renamed from: a */
        public final void mo29673a(C18617d dVar, String str) {
            C89219l.m154719c(dVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(dVar, "");
            if (dVar.f44346a == null || dVar.f44348c == null) {
                AbstractC18468a.m34357a(this.f44287b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = dVar.f44346a;
            if (str2 == null) {
                C89219l.m154707a();
            }
            linkedHashMap.put("httpCode", str2);
            String str3 = dVar.f44348c;
            if (str3 == null) {
                C89219l.m154707a();
            }
            linkedHashMap.put("filePath", str3);
            Map<String, ? extends Object> map = dVar.f44347b;
            if (map != null) {
                linkedHashMap.put("header", map);
            }
            AbstractC18590b.m34358a(this.f44287b, linkedHashMap, str);
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
        String str = C18586i.m34539a(nVar, "url", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = C18586i.m34539a(nVar, "extension", "");
            if (str2.length() != 0) {
                AbstractC18754n b = C18586i.m34543b(nVar, "params");
                AbstractC18754n b2 = C18586i.m34543b(nVar, "header");
                C18615c cVar = new C18615c();
                C89219l.m154719c(str, "");
                cVar.f44341a = str;
                C89219l.m154719c(str2, "");
                cVar.f44342b = str2;
                if (b != null) {
                    cVar.f44343c = b;
                }
                if (b2 != null) {
                    cVar.f44344d = b2;
                }
                mo29672a(cVar, new C18592b(this, bVar), eVar);
                return;
            }
        }
        AbstractC18468a.m34357a(bVar, -3, null, null, 12);
    }
}
