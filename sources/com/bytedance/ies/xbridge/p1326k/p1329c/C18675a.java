package com.bytedance.ies.xbridge.p1326k.p1329c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.bytedance.ies.xbridge.k.c.a */
public final class C18675a extends AbstractC18749a {

    /* renamed from: c */
    public static final C18676a f44452c = new C18676a((byte) 0);

    /* renamed from: a */
    public String f44453a;

    /* renamed from: b */
    public String f44454b;

    static {
        Covode.recordClassIndex(21369);
    }

    /* renamed from: com.bytedance.ies.xbridge.k.c.a$a */
    public static final class C18676a {
        static {
            Covode.recordClassIndex(21370);
        }

        private C18676a() {
        }

        public /* synthetic */ C18676a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154522b("accessKey", "channel");
    }
}
