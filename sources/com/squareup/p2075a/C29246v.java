package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import com.squareup.p2075a.C29235p;
import com.squareup.p2075a.p2076a.p2078b.C29174i;
import java.io.IOException;
import java.net.URI;

/* renamed from: com.squareup.a.v */
public final class C29246v {

    /* renamed from: a */
    public final C29237q f69338a;

    /* renamed from: b */
    public final String f69339b;

    /* renamed from: c */
    public final C29235p f69340c;

    /* renamed from: d */
    public final AbstractC29248w f69341d;

    /* renamed from: e */
    public final Object f69342e;

    /* renamed from: f */
    private volatile URI f69343f;

    /* renamed from: g */
    private volatile C29217d f69344g;

    static {
        Covode.recordClassIndex(35595);
    }

    /* renamed from: b */
    public final C29247a mo51018b() {
        return new C29247a(this, (byte) 0);
    }

    /* renamed from: com.squareup.a.v$a */
    public static class C29247a {

        /* renamed from: a */
        public C29237q f69345a;

        /* renamed from: b */
        public String f69346b;

        /* renamed from: c */
        public C29235p.C29236a f69347c;

        /* renamed from: d */
        public AbstractC29248w f69348d;

        /* renamed from: e */
        public Object f69349e;

        static {
            Covode.recordClassIndex(35596);
        }

        public C29247a() {
            this.f69346b = "GET";
            this.f69347c = new C29235p.C29236a();
        }

        /* renamed from: a */
        public final C29246v mo51025a() {
            if (this.f69345a != null) {
                return new C29246v(this, (byte) 0);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: b */
        public final C29247a mo51026b(String str) {
            this.f69347c.mo50986b(str);
            return this;
        }

        /* renamed from: a */
        public final C29247a mo51022a(C29237q qVar) {
            if (qVar != null) {
                this.f69345a = qVar;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }

        private C29247a(C29246v vVar) {
            this.f69345a = vVar.f69338a;
            this.f69346b = vVar.f69339b;
            this.f69348d = vVar.f69341d;
            this.f69349e = vVar.f69342e;
            this.f69347c = vVar.f69340c.mo50976a();
        }

        /* renamed from: a */
        public final C29247a mo51021a(C29217d dVar) {
            String dVar2 = dVar.toString();
            if (dVar2.isEmpty()) {
                return mo51026b("Cache-Control");
            }
            return mo51024a("Cache-Control", dVar2);
        }

        /* renamed from: c */
        public final C29247a mo51028c(String str) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            } else if (!C29174i.m58311b(str)) {
                this.f69346b = str;
                this.f69348d = null;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        /* renamed from: a */
        public final C29247a mo51023a(String str) {
            String str2 = str;
            if (str2 != null) {
                if (str2.regionMatches(true, 0, "ws:", 0, 3)) {
                    str2 = "http:" + str2.substring(3);
                } else if (str2.regionMatches(true, 0, "wss:", 0, 4)) {
                    str2 = "https:" + str2.substring(4);
                }
                C29237q c = C29237q.m58522c(str2);
                if (c != null) {
                    return mo51022a(c);
                }
                throw new IllegalArgumentException("unexpected url: ".concat(String.valueOf(str2)));
            }
            throw new IllegalArgumentException("url == null");
        }

        /* synthetic */ C29247a(C29246v vVar, byte b) {
            this(vVar);
        }

        /* renamed from: a */
        public final C29247a mo51024a(String str, String str2) {
            this.f69347c.mo50987b(str, str2);
            return this;
        }

        /* renamed from: b */
        public final C29247a mo51027b(String str, String str2) {
            this.f69347c.mo50984a(str, str2);
            return this;
        }
    }

    /* renamed from: c */
    public final C29217d mo51019c() {
        C29217d dVar = this.f69344g;
        if (dVar != null) {
            return dVar;
        }
        C29217d a = C29217d.m58471a(this.f69340c);
        this.f69344g = a;
        return a;
    }

    /* renamed from: a */
    public final URI mo51017a() {
        try {
            URI uri = this.f69343f;
            if (uri != null) {
                return uri;
            }
            URI b = this.f69338a.mo50989b();
            this.f69343f = b;
            return b;
        } catch (IllegalStateException e) {
            throw new IOException(e.getMessage());
        }
    }

    public final String toString() {
        StringBuilder append = new StringBuilder("Request{method=").append(this.f69339b).append(", url=").append(this.f69338a).append(", tag=");
        Object obj = this.f69342e;
        if (obj == this) {
            obj = null;
        }
        return append.append(obj).append('}').toString();
    }

    /* renamed from: a */
    public final String mo51016a(String str) {
        return this.f69340c.mo50978a(str);
    }

    private C29246v(C29247a aVar) {
        Object obj;
        this.f69338a = aVar.f69345a;
        this.f69339b = aVar.f69346b;
        this.f69340c = aVar.f69347c.mo50985a();
        this.f69341d = aVar.f69348d;
        if (aVar.f69349e != null) {
            obj = aVar.f69349e;
        } else {
            obj = this;
        }
        this.f69342e = obj;
    }

    /* synthetic */ C29246v(C29247a aVar, byte b) {
        this(aVar);
    }
}
