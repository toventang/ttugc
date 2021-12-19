package com.bytedance.ies.xbridge.p1322j.p1325c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.j.c.b */
public final class C18655b extends AbstractC18749a {

    /* renamed from: g */
    public static final C18656a f44424g = new C18656a((byte) 0);

    /* renamed from: a */
    public String f44425a;

    /* renamed from: b */
    public String f44426b;

    /* renamed from: c */
    public Object f44427c;

    /* renamed from: d */
    public String f44428d;

    /* renamed from: e */
    public AbstractC18754n f44429e;

    /* renamed from: f */
    public AbstractC18754n f44430f;

    static {
        Covode.recordClassIndex(21349);
    }

    /* renamed from: com.bytedance.ies.xbridge.j.c.b$a */
    public static final class C18656a {
        static {
            Covode.recordClassIndex(21350);
        }

        private C18656a() {
        }

        public /* synthetic */ C18656a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo29705a() {
        String str = this.f44425a;
        if (str == null) {
            C89219l.m154710a("url");
        }
        return str;
    }

    /* renamed from: b */
    public final String mo29706b() {
        String str = this.f44426b;
        if (str == null) {
            C89219l.m154710a("method");
        }
        return str;
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154522b("url", "method", "body", "params", "header", "bodyType");
    }
}
