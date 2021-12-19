package com.bytedance.ies.xbridge.p1313h.p1316c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.h.c.b */
public final class C18578b extends AbstractC18749a {

    /* renamed from: e */
    public static final C18580b f44263e = new C18580b((byte) 0);

    /* renamed from: a */
    public String f44264a;

    /* renamed from: b */
    public String f44265b;

    /* renamed from: c */
    public String f44266c;

    /* renamed from: d */
    public C18579a f44267d;

    static {
        Covode.recordClassIndex(21272);
    }

    /* renamed from: com.bytedance.ies.xbridge.h.c.b$b */
    public static final class C18580b {
        static {
            Covode.recordClassIndex(21274);
        }

        private C18580b() {
        }

        public /* synthetic */ C18580b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154522b("level", "message", "tag", "codePosition");
    }

    /* renamed from: com.bytedance.ies.xbridge.h.c.b$a */
    public static final class C18579a {

        /* renamed from: a */
        public final String f44268a;

        /* renamed from: b */
        public final String f44269b;

        /* renamed from: c */
        public final int f44270c;

        static {
            Covode.recordClassIndex(21273);
        }

        public C18579a(String str, String str2, int i) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(str2, "");
            this.f44268a = str;
            this.f44269b = str2;
            this.f44270c = i;
        }
    }
}
