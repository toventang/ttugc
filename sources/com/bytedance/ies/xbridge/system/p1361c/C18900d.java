package com.bytedance.ies.xbridge.system.p1361c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.bytedance.ies.xbridge.system.c.d */
public final class C18900d extends AbstractC18749a {

    /* renamed from: b */
    public static final C18901a f44737b = new C18901a((byte) 0);

    /* renamed from: a */
    public String f44738a;

    static {
        Covode.recordClassIndex(21610);
    }

    /* renamed from: com.bytedance.ies.xbridge.system.c.d$a */
    public static final class C18901a {
        static {
            Covode.recordClassIndex(21611);
        }

        private C18901a() {
        }

        public /* synthetic */ C18901a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154516a("phoneNumber");
    }
}
