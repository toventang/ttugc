package com.toutiao.proxyserver.net;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.toutiao.proxyserver.net.d */
public final class C87361d {

    /* renamed from: a */
    public final String f198016a;

    /* renamed from: b */
    public final String f198017b;

    /* renamed from: c */
    public final List<C87360c> f198018c;

    /* renamed from: d */
    public final long f198019d;

    /* renamed from: e */
    public final long f198020e;

    /* renamed from: f */
    public final long f198021f;

    static {
        Covode.recordClassIndex(103258);
    }

    public final String toString() {
        return "HttpRequest{url='" + this.f198016a + '\'' + ", method='" + this.f198017b + '\'' + ", headers=" + this.f198018c + ", connectTimeout=" + this.f198019d + ", readTimeout=" + this.f198020e + ", writeTimeout=" + this.f198021f + '}';
    }

    /* renamed from: a */
    public final String mo141398a(String str) {
        return mo141399b(str);
    }

    private C87361d(C87362a aVar) {
        this.f198016a = aVar.f198022a;
        this.f198017b = aVar.f198023b;
        this.f198018c = aVar.f198024c;
        this.f198019d = aVar.f198025d;
        this.f198020e = aVar.f198026e;
        this.f198021f = aVar.f198027f;
    }

    /* renamed from: b */
    public final String mo141399b(String str) {
        for (C87360c cVar : this.f198018c) {
            if (cVar.f198014a.equalsIgnoreCase(str)) {
                return cVar.f198015b;
            }
        }
        return null;
    }

    public /* synthetic */ C87361d(C87362a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: com.toutiao.proxyserver.net.d$a */
    public static final class C87362a {

        /* renamed from: a */
        public String f198022a;

        /* renamed from: b */
        public String f198023b;

        /* renamed from: c */
        public final List<C87360c> f198024c = new ArrayList();

        /* renamed from: d */
        public long f198025d;

        /* renamed from: e */
        public long f198026e;

        /* renamed from: f */
        public long f198027f;

        static {
            Covode.recordClassIndex(103259);
        }

        /* renamed from: a */
        public final C87362a mo141401a(String str, String str2) {
            if (!(str == null || str2 == null)) {
                this.f198024c.add(new C87360c(str, str2));
            }
            return this;
        }
    }
}
