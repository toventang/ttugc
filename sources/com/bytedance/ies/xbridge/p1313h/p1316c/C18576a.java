package com.bytedance.ies.xbridge.p1313h.p1316c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.bytedance.ies.xbridge.h.c.a */
public final class C18576a extends AbstractC18749a {

    /* renamed from: h */
    public static final C18577a f44255h = new C18577a((byte) 0);

    /* renamed from: a */
    public String f44256a;

    /* renamed from: b */
    public String f44257b;

    /* renamed from: c */
    public String f44258c;

    /* renamed from: d */
    public String f44259d;

    /* renamed from: e */
    public String f44260e;

    /* renamed from: f */
    public String f44261f;

    /* renamed from: g */
    public AbstractC18754n f44262g;

    static {
        Covode.recordClassIndex(21270);
    }

    /* renamed from: com.bytedance.ies.xbridge.h.c.a$a */
    public static final class C18577a {
        static {
            Covode.recordClassIndex(21271);
        }

        private C18577a() {
        }

        public /* synthetic */ C18577a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154522b("label", "tag", "refer", "groupID", "creativeID", "logExtra", "extraParams");
    }
}
