package com.bytedance.ies.xbridge.p1309g.p1312c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.g.c.b */
public final class C18551b extends AbstractC18749a {

    /* renamed from: b */
    public static final C18552a f44229b = new C18552a((byte) 0);

    /* renamed from: a */
    public List<C18553b> f44230a;

    static {
        Covode.recordClassIndex(21245);
    }

    /* renamed from: com.bytedance.ies.xbridge.g.c.b$a */
    public static final class C18552a {
        static {
            Covode.recordClassIndex(21246);
        }

        private C18552a() {
        }

        public /* synthetic */ C18552a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154516a("keys");
    }

    /* renamed from: com.bytedance.ies.xbridge.g.c.b$b */
    public static final class C18553b {

        /* renamed from: a */
        public String f44231a = "";

        /* renamed from: b */
        public final String f44232b;

        /* renamed from: c */
        public final String f44233c;

        static {
            Covode.recordClassIndex(21247);
        }

        public C18553b(String str, String str2) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(str2, "");
            this.f44232b = str;
            this.f44233c = str2;
        }
    }
}
