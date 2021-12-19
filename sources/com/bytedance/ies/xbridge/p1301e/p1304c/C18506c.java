package com.bytedance.ies.xbridge.p1301e.p1304c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.bytedance.ies.xbridge.e.c.c */
public final class C18506c extends AbstractC18749a {

    /* renamed from: c */
    public static final C18507a f44160c = new C18507a((byte) 0);

    /* renamed from: a */
    public String f44161a;

    /* renamed from: b */
    public long f44162b;

    static {
        Covode.recordClassIndex(21200);
    }

    /* renamed from: com.bytedance.ies.xbridge.e.c.c$a */
    public static final class C18507a {
        static {
            Covode.recordClassIndex(21201);
        }

        private C18507a() {
        }

        public /* synthetic */ C18507a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154522b("eventName", "timestamp");
    }
}
