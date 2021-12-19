package com.bytedance.ies.xbridge.p1305f.p1308c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.f.c.a */
public final class C18530a extends AbstractC18749a {

    /* renamed from: c */
    public static final C18532b f44189c = new C18532b((byte) 0);

    /* renamed from: a */
    public String f44190a;

    /* renamed from: b */
    public List<C18531a> f44191b;

    static {
        Covode.recordClassIndex(21224);
    }

    /* renamed from: com.bytedance.ies.xbridge.f.c.a$b */
    public static final class C18532b {
        static {
            Covode.recordClassIndex(21226);
        }

        private C18532b() {
        }

        public /* synthetic */ C18532b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154516a("actionList");
    }

    /* renamed from: com.bytedance.ies.xbridge.f.c.a$a */
    public static final class C18531a {

        /* renamed from: a */
        public final String f44192a;

        /* renamed from: b */
        public final JSONObject f44193b;

        static {
            Covode.recordClassIndex(21225);
        }

        public C18531a(String str, JSONObject jSONObject) {
            C89219l.m154719c(str, "");
            this.f44192a = str;
            this.f44193b = jSONObject;
        }
    }
}
