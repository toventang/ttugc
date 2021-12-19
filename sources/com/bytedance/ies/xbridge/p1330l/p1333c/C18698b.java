package com.bytedance.ies.xbridge.p1330l.p1333c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.bytedance.ies.xbridge.l.c.b */
public final class C18698b extends AbstractC18749a {

    /* renamed from: d */
    public static final C18699a f44479d = new C18699a((byte) 0);

    /* renamed from: a */
    public String f44480a;

    /* renamed from: b */
    public boolean f44481b;

    /* renamed from: c */
    public boolean f44482c;

    static {
        Covode.recordClassIndex(21392);
    }

    /* renamed from: com.bytedance.ies.xbridge.l.c.b$a */
    public static final class C18699a {
        static {
            Covode.recordClassIndex(21393);
        }

        private C18699a() {
        }

        public /* synthetic */ C18699a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154522b("schema", "replace", "useSysBrowser");
    }
}
