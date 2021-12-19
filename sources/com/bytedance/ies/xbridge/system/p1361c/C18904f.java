package com.bytedance.ies.xbridge.system.p1361c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.bytedance.ies.xbridge.system.c.f */
public final class C18904f extends AbstractC18749a {

    /* renamed from: c */
    public static final C18905a f44741c = new C18905a((byte) 0);

    /* renamed from: a */
    public String f44742a;

    /* renamed from: b */
    public String f44743b;

    static {
        Covode.recordClassIndex(21614);
    }

    /* renamed from: com.bytedance.ies.xbridge.system.c.f$a */
    public static final class C18905a {
        static {
            Covode.recordClassIndex(21615);
        }

        private C18905a() {
        }

        public /* synthetic */ C18905a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154522b("phoneNumber", "content");
    }
}
