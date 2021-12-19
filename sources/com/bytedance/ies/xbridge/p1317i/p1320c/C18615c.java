package com.bytedance.ies.xbridge.p1317i.p1320c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.i.c.c */
public final class C18615c extends AbstractC18749a {

    /* renamed from: e */
    public static final C18616a f44340e = new C18616a((byte) 0);

    /* renamed from: a */
    public String f44341a;

    /* renamed from: b */
    public String f44342b;

    /* renamed from: c */
    public AbstractC18754n f44343c;

    /* renamed from: d */
    public AbstractC18754n f44344d;

    static {
        Covode.recordClassIndex(21309);
    }

    /* renamed from: com.bytedance.ies.xbridge.i.c.c$a */
    public static final class C18616a {
        static {
            Covode.recordClassIndex(21310);
        }

        private C18616a() {
        }

        public /* synthetic */ C18616a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo29687a() {
        String str = this.f44341a;
        if (str == null) {
            C89219l.m154710a("url");
        }
        return str;
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154522b("url", "extension", "params", "header");
    }
}
