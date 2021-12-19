package com.bytedance.ies.xbridge.p1317i.p1320c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.i.c.e */
public final class C18619e extends AbstractC18749a {

    /* renamed from: f */
    public static final C18620a f44349f = new C18620a((byte) 0);

    /* renamed from: a */
    public String f44350a;

    /* renamed from: b */
    public String f44351b;

    /* renamed from: c */
    public AbstractC18754n f44352c;

    /* renamed from: d */
    public AbstractC18754n f44353d;

    /* renamed from: e */
    public List<C18621b> f44354e;

    static {
        Covode.recordClassIndex(21313);
    }

    /* renamed from: com.bytedance.ies.xbridge.i.c.e$a */
    public static final class C18620a {
        static {
            Covode.recordClassIndex(21314);
        }

        private C18620a() {
        }

        public /* synthetic */ C18620a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo29688a() {
        String str = this.f44351b;
        if (str == null) {
            C89219l.m154710a("filePath");
        }
        return str;
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154522b("url", "filePath", "params", "header", "formDataBody");
    }

    /* renamed from: com.bytedance.ies.xbridge.i.c.e$b */
    public static final class C18621b {

        /* renamed from: a */
        public final String f44355a;

        /* renamed from: b */
        public final String f44356b;

        static {
            Covode.recordClassIndex(21315);
        }

        public C18621b(String str, String str2) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(str2, "");
            this.f44355a = str;
            this.f44356b = str2;
        }
    }
}
