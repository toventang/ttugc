package com.google.p1971b.p1995b.p1996a;

import com.bytedance.covode.number.Covode;
import com.google.p1971b.p1972a.p1978c.C27125a;
import com.google.p1971b.p1972a.p1978c.p1981b.p1982a.AbstractC27132a;
import com.google.p1971b.p1972a.p1983d.AbstractC27147g;
import com.google.p1971b.p1972a.p1983d.AbstractC27148h;
import com.google.p1971b.p1972a.p1986e.AbstractC27153b;
import com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a.C27159b;
import com.google.p1971b.p1972a.p1993g.AbstractC27189k;
import com.google.p1971b.p1995b.p1996a.p1997a.C27208h;

/* renamed from: com.google.b.b.a.a */
public final class C27196a extends AbstractC27132a {
    /* renamed from: a */
    public final C27198b mo45294a() {
        return new C27198b();
    }

    /* renamed from: com.google.b.b.a.a$a */
    public static final class C27197a extends AbstractC27132a.AbstractC27133a {
        static {
            Covode.recordClassIndex(32777);
        }

        /* renamed from: a */
        public final C27196a mo45295a() {
            return new C27196a(this);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public C27197a mo45175d(String str) {
            return (C27197a) super.mo45172a(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public C27197a mo45176e(String str) {
            return (C27197a) super.mo45173b(str);
        }

        /* renamed from: g */
        public final C27197a mo45177f(String str) {
            return (C27197a) super.mo45174c(str);
        }

        public C27197a(AbstractC27148h hVar, AbstractC27153b bVar, AbstractC27147g gVar) {
            super(hVar, bVar, "https://www.googleapis.com/", "youtube/v3/", gVar);
        }
    }

    static {
        boolean z;
        Covode.recordClassIndex(32776);
        if (C27125a.f64221a.intValue() != 1 || C27125a.f64222b.intValue() < 15) {
            z = false;
        } else {
            z = true;
        }
        Object[] objArr = {C27125a.f64224d};
        if (!z) {
            throw new IllegalStateException(C27159b.m53982a("You are currently running with version %s of google-api-client. You need at least version 1.15 of google-api-client to run version 1.19.0 of the YouTube Data API library.", objArr));
        }
    }

    C27196a(C27197a aVar) {
        super(aVar);
    }

    /* renamed from: com.google.b.b.a.a$b */
    public class C27198b {
        static {
            Covode.recordClassIndex(32778);
        }

        public C27198b() {
        }

        /* renamed from: a */
        public final C27199a mo45297a(String str) {
            return new C27199a(str);
        }

        /* renamed from: com.google.b.b.a.a$b$a */
        public class C27199a extends AbstractC27225b<C27208h> {
            @AbstractC27189k
            public String categoryId;
            @AbstractC27189k
            public String forUsername;
            @AbstractC27189k

            /* renamed from: id */
            public String f64382id;
            @AbstractC27189k
            public Boolean managedByMe;
            @AbstractC27189k
            public Long maxResults;
            @AbstractC27189k
            public Boolean mine;
            @AbstractC27189k
            public Boolean mySubscribers;
            @AbstractC27189k
            public String onBehalfOfContentOwner;
            @AbstractC27189k
            public String pageToken;
            @AbstractC27189k
            public String part;

            static {
                Covode.recordClassIndex(32779);
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public C27199a mo45298d(String str, Object obj) {
                return (C27199a) super.mo45180c(str, obj);
            }

            protected C27199a(String str) {
                super(C27196a.this, "GET", "channels", C27208h.class);
                this.part = (String) C27159b.m53981a(str, "Required parameter part must be specified.");
            }
        }
    }
}
