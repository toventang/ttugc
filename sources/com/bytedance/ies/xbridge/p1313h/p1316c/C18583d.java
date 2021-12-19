package com.bytedance.ies.xbridge.p1313h.p1316c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.bytedance.ies.xbridge.h.c.d */
public final class C18583d extends AbstractC18749a {

    /* renamed from: e */
    public static final C18584a f44274e = new C18584a((byte) 0);

    /* renamed from: a */
    public String f44275a;

    /* renamed from: b */
    public String f44276b;

    /* renamed from: c */
    public int f44277c;

    /* renamed from: d */
    public AbstractC18754n f44278d;

    static {
        Covode.recordClassIndex(21277);
    }

    /* renamed from: com.bytedance.ies.xbridge.h.c.d$a */
    public static final class C18584a {
        static {
            Covode.recordClassIndex(21278);
        }

        private C18584a() {
        }

        public /* synthetic */ C18584a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154522b("logType", "service", "status", "value");
    }
}
