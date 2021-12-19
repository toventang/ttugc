package com.bytedance.ies.xbridge.p1343n.p1348d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.p1342c.AbstractC18744a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.n.d.e */
public final class C18800e extends AbstractC18744a {

    /* renamed from: b */
    public static final C18802b f44586b = new C18802b((byte) 0);

    /* renamed from: a */
    public String f44587a;

    /* renamed from: com.bytedance.ies.xbridge.n.d.e$a */
    public enum EnumC18801a {
        CONFIRM,
        CANCEL,
        MASK;

        static {
            Covode.recordClassIndex(21497);
        }
    }

    static {
        Covode.recordClassIndex(21496);
    }

    /* renamed from: com.bytedance.ies.xbridge.n.d.e$b */
    public static final class C18802b {
        static {
            Covode.recordClassIndex(21498);
        }

        private C18802b() {
        }

        public /* synthetic */ C18802b(byte b) {
            this();
        }

        /* renamed from: a */
        public static Map<String, Object> m34901a(C18800e eVar) {
            C89219l.m154719c(eVar, "");
            if (eVar.f44587a == null) {
                return null;
            }
            try {
                String str = eVar.f44587a;
                if (str == null) {
                    C89219l.m154707a();
                }
                if (str != null) {
                    String upperCase = str.toUpperCase();
                    C89219l.m154709a((Object) upperCase, "");
                    EnumC18801a.valueOf(upperCase);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String str2 = eVar.f44587a;
                    if (str2 == null) {
                        C89219l.m154707a();
                    }
                    linkedHashMap.put("action", str2);
                    return linkedHashMap;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Override // com.bytedance.ies.xbridge.model.p1342c.AbstractC18744a
    /* renamed from: a */
    public final List<String> mo29428a() {
        return C89070n.m154516a("action");
    }
}
