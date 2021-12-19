package com.bytedance.ies.xbridge.p1286a.p1287a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.params.C18752c;
import com.bytedance.ies.xbridge.p1286a.p1289c.C18389a;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.a.a.a */
public abstract class AbstractC18372a extends AbstractC18468a {

    /* renamed from: a */
    private final String f43952a = "x.getUserInfo";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f43953b = AbstractC18400b.EnumC18401a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.a.a.a$a */
    public interface AbstractC18373a {
        static {
            Covode.recordClassIndex(21045);
        }

        /* renamed from: a */
        void mo29417a(C18389a aVar, String str);

        /* renamed from: a */
        void mo29418a(String str);
    }

    static {
        Covode.recordClassIndex(21044);
    }

    /* renamed from: a */
    public abstract void mo29414a(C18752c cVar, AbstractC18373a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f43952a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f43953b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18752c> mo29415d() {
        return C18752c.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18389a> mo29416e() {
        return C18389a.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.a.a.a$b */
    public static final class C18374b implements AbstractC18373a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18372a f43954a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f43955b;

        static {
            Covode.recordClassIndex(21046);
        }

        @Override // com.bytedance.ies.xbridge.p1286a.p1287a.AbstractC18372a.AbstractC18373a
        /* renamed from: a */
        public final void mo29418a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f43955b, 0, str, null, 8);
        }

        C18374b(AbstractC18372a aVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f43954a = aVar;
            this.f43955b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1286a.p1287a.AbstractC18372a.AbstractC18373a
        /* renamed from: a */
        public final void mo29417a(C18389a aVar, String str) {
            Boolean bool;
            C89219l.m154719c(aVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(aVar, "");
            Boolean bool2 = aVar.f43975b;
            if (bool2 != null) {
                bool2.booleanValue();
                if (aVar.f43974a != null) {
                    C18389a.C18391b bVar = aVar.f43974a;
                    if (bVar != null) {
                        if (!(bVar.f43976a == null || bVar.f43977b == null || bVar.f43978c == null || bVar.f43979d == null || (bool = bVar.f43981f) == null)) {
                            bool.booleanValue();
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Boolean bool3 = aVar.f43975b;
                    if (bool3 != null) {
                        linkedHashMap.put("hasLoggedIn", Boolean.valueOf(bool3.booleanValue()));
                    }
                    C18389a.C18391b bVar2 = aVar.f43974a;
                    if (bVar2 != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        String str2 = bVar2.f43976a;
                        if (str2 != null) {
                            linkedHashMap2.put("userID", str2);
                        }
                        String str3 = bVar2.f43977b;
                        if (str3 != null) {
                            linkedHashMap2.put("secUserID", str3);
                        }
                        String str4 = bVar2.f43978c;
                        if (str4 != null) {
                            linkedHashMap2.put("uniqueID", str4);
                        }
                        String str5 = bVar2.f43979d;
                        if (str5 != null) {
                            linkedHashMap2.put("nickname", str5);
                        }
                        String str6 = bVar2.f43980e;
                        if (str6 != null) {
                            linkedHashMap2.put("avatarURL", str6);
                        }
                        Boolean bool4 = bVar2.f43981f;
                        if (bool4 != null) {
                            linkedHashMap2.put("hasBoundPhone", Boolean.valueOf(bool4.booleanValue()));
                        }
                        linkedHashMap.put("userInfo", linkedHashMap2);
                    }
                    AbstractC18372a.m34358a(this.f43955b, linkedHashMap, str);
                    return;
                }
            }
            AbstractC18468a.m34357a(this.f43955b, -5, null, null, 12);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        mo29414a(C18752c.C18753a.m34818a(nVar), new C18374b(this, bVar), eVar);
    }
}
