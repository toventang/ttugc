package com.bytedance.ies.xbridge.p1343n.p1348d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.bytedance.ies.xbridge.n.d.f */
public final class C18803f extends AbstractC18749a {

    /* renamed from: d */
    public static final C18804a f44589d = new C18804a((byte) 0);

    /* renamed from: a */
    public String f44590a;

    /* renamed from: b */
    public String f44591b;

    /* renamed from: c */
    public Integer f44592c;

    static {
        Covode.recordClassIndex(21499);
    }

    /* renamed from: com.bytedance.ies.xbridge.n.d.f$a */
    public static final class C18804a {
        static {
            Covode.recordClassIndex(21500);
        }

        private C18804a() {
        }

        public /* synthetic */ C18804a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154522b("message", StringSet.type, "duration");
    }
}
