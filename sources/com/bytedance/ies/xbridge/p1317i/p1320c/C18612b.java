package com.bytedance.ies.xbridge.p1317i.p1320c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.p1342c.AbstractC18744a;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.i.c.b */
public final class C18612b extends AbstractC18744a {

    /* renamed from: b */
    public static final C18613a f44333b = new C18613a((byte) 0);

    /* renamed from: a */
    public List<C18614b> f44334a;

    static {
        Covode.recordClassIndex(21306);
    }

    /* renamed from: com.bytedance.ies.xbridge.i.c.b$a */
    public static final class C18613a {
        static {
            Covode.recordClassIndex(21307);
        }

        private C18613a() {
        }

        public /* synthetic */ C18613a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.p1342c.AbstractC18744a
    /* renamed from: a */
    public final List<String> mo29428a() {
        return C89070n.m154516a("tempFiles");
    }

    /* renamed from: com.bytedance.ies.xbridge.i.c.b$b */
    public static final class C18614b {

        /* renamed from: a */
        public String f44335a;

        /* renamed from: b */
        public final String f44336b;

        /* renamed from: c */
        public final long f44337c;

        /* renamed from: d */
        public final String f44338d;

        /* renamed from: e */
        public final byte[] f44339e;

        static {
            Covode.recordClassIndex(21308);
        }

        public C18614b(String str, long j, String str2, byte[] bArr) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(str2, "");
            this.f44336b = str;
            this.f44337c = j;
            this.f44338d = str2;
            this.f44339e = bArr;
        }
    }
}
