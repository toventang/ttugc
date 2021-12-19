package com.bytedance.ies.xbridge.p1309g.p1310a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.params.C18752c;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1309g.p1312c.C18549a;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.g.a.a */
public abstract class AbstractC18541a extends AbstractC18468a {

    /* renamed from: a */
    private final String f44205a = "x.getAppInfo";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44206b = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.g.a.a$a */
    public interface AbstractC18542a {
        static {
            Covode.recordClassIndex(21236);
        }

        /* renamed from: a */
        void mo29653a(C18549a aVar, String str);

        /* renamed from: a */
        void mo29654a(String str);
    }

    static {
        Covode.recordClassIndex(21235);
    }

    /* renamed from: a */
    public abstract void mo29652a(C18752c cVar, AbstractC18542a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44205a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44206b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18752c> mo29415d() {
        return C18752c.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18549a> mo29416e() {
        return C18549a.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.g.a.a$b */
    public static final class C18543b implements AbstractC18542a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18541a f44207a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44208b;

        static {
            Covode.recordClassIndex(21237);
        }

        @Override // com.bytedance.ies.xbridge.p1309g.p1310a.AbstractC18541a.AbstractC18542a
        /* renamed from: a */
        public final void mo29654a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44208b, 0, str, null, 8);
        }

        C18543b(AbstractC18541a aVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44207a = aVar;
            this.f44208b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1309g.p1310a.AbstractC18541a.AbstractC18542a
        /* renamed from: a */
        public final void mo29653a(C18549a aVar, String str) {
            Boolean bool;
            Boolean bool2;
            C89219l.m154719c(aVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(aVar, "");
            if (!(aVar.f44214a == null || aVar.f44215b == null || aVar.f44216c == null || aVar.f44217d == null || aVar.f44218e == null || (bool = aVar.f44220g) == null)) {
                bool.booleanValue();
                if (!(aVar.f44222i == null || aVar.f44224k == null || aVar.f44225l == null || aVar.f44226m == null || aVar.f44227n == null || (bool2 = aVar.f44228o) == null)) {
                    bool2.booleanValue();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String str2 = aVar.f44214a;
                    if (str2 != null) {
                        linkedHashMap.put("appID", str2);
                    }
                    String str3 = aVar.f44215b;
                    if (str3 != null) {
                        linkedHashMap.put("installID", str3);
                    }
                    String str4 = aVar.f44216c;
                    if (str4 != null) {
                        linkedHashMap.put("appName", str4);
                    }
                    String str5 = aVar.f44217d;
                    if (str5 != null) {
                        linkedHashMap.put("appVersion", str5);
                    }
                    String str6 = aVar.f44218e;
                    if (str6 != null) {
                        linkedHashMap.put("channel", str6);
                    }
                    String str7 = aVar.f44219f;
                    if (str7 != null) {
                        linkedHashMap.put("language", str7);
                    }
                    Boolean bool3 = aVar.f44220g;
                    if (bool3 != null) {
                        linkedHashMap.put("isTeenMode", Boolean.valueOf(bool3.booleanValue()));
                    }
                    String str8 = aVar.f44222i;
                    if (str8 != null) {
                        linkedHashMap.put("osVersion", str8);
                    }
                    Integer num = aVar.f44223j;
                    if (num != null) {
                        linkedHashMap.put("statusBarHeight", Integer.valueOf(num.intValue()));
                    }
                    String str9 = aVar.f44224k;
                    if (str9 != null) {
                        linkedHashMap.put("devicePlatform", str9);
                    }
                    String str10 = aVar.f44225l;
                    if (str10 != null) {
                        linkedHashMap.put("deviceModel", str10);
                    }
                    String str11 = aVar.f44226m;
                    if (str11 != null) {
                        linkedHashMap.put("netType", str11);
                    }
                    String str12 = aVar.f44227n;
                    if (str12 != null) {
                        linkedHashMap.put("carrier", str12);
                    }
                    String str13 = aVar.f44221h;
                    if (str13 != null) {
                        linkedHashMap.put("appTheme", str13);
                    }
                    Boolean bool4 = aVar.f44228o;
                    if (bool4 != null) {
                        linkedHashMap.put("is32Bit", Boolean.valueOf(bool4.booleanValue()));
                    }
                    AbstractC18541a.m34358a(this.f44208b, linkedHashMap, str);
                    return;
                }
            }
            AbstractC18468a.m34357a(this.f44208b, -5, null, null, 12);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        mo29652a(C18752c.C18753a.m34818a(nVar), new C18543b(this, bVar), eVar);
    }
}
