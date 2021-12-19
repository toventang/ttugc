package com.bytedance.ies.xbridge.system.p1361c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.bytedance.ies.xbridge.system.c.i */
public final class C18910i extends AbstractC18749a {

    /* renamed from: c */
    public static final C18911a f44756c = new C18911a((byte) 0);

    /* renamed from: a */
    public int f44757a = 300;

    /* renamed from: b */
    public String f44758b = "medium";

    static {
        Covode.recordClassIndex(21620);
    }

    /* renamed from: com.bytedance.ies.xbridge.system.c.i$a */
    public static final class C18911a {
        static {
            Covode.recordClassIndex(21621);
        }

        private C18911a() {
        }

        public /* synthetic */ C18911a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154522b("duration", "style");
    }
}
