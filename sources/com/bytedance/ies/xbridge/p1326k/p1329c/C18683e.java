package com.bytedance.ies.xbridge.p1326k.p1329c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.bytedance.ies.xbridge.k.c.e */
public final class C18683e extends AbstractC18749a {

    /* renamed from: d */
    public static final C18684a f44463d = new C18684a((byte) 0);

    /* renamed from: a */
    public String f44464a;

    /* renamed from: b */
    public String f44465b;

    /* renamed from: c */
    public boolean f44466c;

    static {
        Covode.recordClassIndex(21377);
    }

    /* renamed from: com.bytedance.ies.xbridge.k.c.e$a */
    public static final class C18684a {
        static {
            Covode.recordClassIndex(21378);
        }

        private C18684a() {
        }

        public /* synthetic */ C18684a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154522b("channel", "accessKey", "enableDownloadAutoRetry");
    }
}
