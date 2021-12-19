package com.bytedance.ies.xbridge.p1317i.p1318a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18700m;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1317i.p1320c.C18619e;
import com.bytedance.ies.xbridge.p1317i.p1320c.C18622f;
import com.bytedance.ies.xbridge.p1317i.p1320c.C18623g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.i.a.c */
public abstract class AbstractC18593c extends AbstractC18468a {

    /* renamed from: a */
    private final AbstractC18400b.EnumC18401a f44288a = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: b */
    private final String f44289b = "x.uploadImage";

    /* renamed from: com.bytedance.ies.xbridge.i.a.c$a */
    public interface AbstractC18594a {
        static {
            Covode.recordClassIndex(21288);
        }

        /* renamed from: a */
        void mo29676a(int i, String str);

        /* renamed from: a */
        void mo29677a(C18623g gVar, String str);
    }

    static {
        Covode.recordClassIndex(21287);
    }

    /* renamed from: a */
    public abstract void mo29675a(C18619e eVar, AbstractC18594a aVar, EnumC18483e eVar2);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44289b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44288a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18619e> mo29415d() {
        return C18619e.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18623g> mo29416e() {
        return C18623g.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.i.a.c$b */
    public static final class C18595b implements AbstractC18594a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18593c f44290a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44291b;

        static {
            Covode.recordClassIndex(21289);
        }

        C18595b(AbstractC18593c cVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44290a = cVar;
            this.f44291b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1317i.p1318a.AbstractC18593c.AbstractC18594a
        /* renamed from: a */
        public final void mo29676a(int i, String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44291b, i, str, null, 8);
        }

        @Override // com.bytedance.ies.xbridge.p1317i.p1318a.AbstractC18593c.AbstractC18594a
        /* renamed from: a */
        public final void mo29677a(C18623g gVar, String str) {
            C89219l.m154719c(gVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(gVar, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = gVar.f44359a;
            if (str2 != null) {
                linkedHashMap.put("url", str2);
            }
            String str3 = gVar.f44360b;
            if (str3 != null) {
                linkedHashMap.put("uri", str3);
            }
            Map<String, ? extends Object> map = gVar.f44361c;
            if (map != null) {
                linkedHashMap.put("response", map);
            }
            String str4 = gVar.f44362d;
            if (str4 != null) {
                linkedHashMap.put("base64", str4);
            }
            AbstractC18593c.m34358a(this.f44291b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        boolean z;
        String str;
        String str2;
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        String str3 = C18586i.m34539a(nVar, "url", "");
        int i = 0;
        if (str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            AbstractC18700m c = C18586i.m34544c(nVar, "formDataBody");
            String str4 = C18586i.m34539a(nVar, "filePath", "");
            if (!(str4.length() == 0 && c == null)) {
                AbstractC18754n b = C18586i.m34543b(nVar, "params");
                AbstractC18754n b2 = C18586i.m34543b(nVar, "header");
                C18619e eVar2 = new C18619e();
                C89219l.m154719c(str3, "");
                eVar2.f44350a = str3;
                C89219l.m154719c(str4, "");
                eVar2.f44351b = str4;
                ArrayList arrayList = new ArrayList();
                if (c != null) {
                    int a = c.mo29730a();
                    while (true) {
                        if (i >= a) {
                            break;
                        }
                        AbstractC18659k g = c.mo29738g(i);
                        if (C18622f.f44357a[g.mo29707a().ordinal()] == 1) {
                            AbstractC18754n g2 = g.mo29713g();
                            if (g2 != null) {
                                str = C18586i.m34539a(g2, "key", "");
                            } else {
                                str = null;
                            }
                            AbstractC18754n g3 = g.mo29713g();
                            if (g3 == null || (str2 = C18586i.m34539a(g3, "value", "")) == null) {
                                str2 = "";
                            }
                            if (str == null) {
                                break;
                            }
                            arrayList.add(new C18619e.C18621b(str, str2));
                        }
                        i++;
                    }
                }
                arrayList = null;
                eVar2.f44354e = arrayList;
                if (b != null) {
                    eVar2.f44352c = b;
                }
                if (b2 != null) {
                    eVar2.f44353d = b2;
                }
                mo29675a(eVar2, new C18595b(this, bVar), eVar);
                return;
            }
        }
        AbstractC18468a.m34357a(bVar, -3, null, null, 12);
    }
}
