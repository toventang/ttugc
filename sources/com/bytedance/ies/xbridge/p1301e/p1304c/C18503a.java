package com.bytedance.ies.xbridge.p1301e.p1304c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.bytedance.ies.xbridge.e.c.a */
public final class C18503a extends AbstractC18749a {

    /* renamed from: d */
    public static final C18504a f44155d = new C18504a((byte) 0);

    /* renamed from: a */
    public String f44156a;

    /* renamed from: b */
    public long f44157b;

    /* renamed from: c */
    public AbstractC18754n f44158c;

    static {
        Covode.recordClassIndex(21197);
    }

    /* renamed from: com.bytedance.ies.xbridge.e.c.a$a */
    public static final class C18504a {
        static {
            Covode.recordClassIndex(21198);
        }

        private C18504a() {
        }

        public /* synthetic */ C18504a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154522b("eventName", "timestamp", "params");
    }
}
