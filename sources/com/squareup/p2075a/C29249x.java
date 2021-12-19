package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import com.squareup.p2075a.C29235p;
import com.squareup.p2075a.p2076a.p2078b.C29158d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.squareup.a.x */
public final class C29249x {

    /* renamed from: a */
    public final C29246v f69350a;

    /* renamed from: b */
    public final EnumC29245u f69351b;

    /* renamed from: c */
    public final int f69352c;

    /* renamed from: d */
    public final String f69353d;

    /* renamed from: e */
    public final C29234o f69354e;

    /* renamed from: f */
    public final C29235p f69355f;

    /* renamed from: g */
    public final AbstractC29251y f69356g;

    /* renamed from: h */
    public C29249x f69357h;

    /* renamed from: i */
    public C29249x f69358i;

    /* renamed from: j */
    public final C29249x f69359j;

    /* renamed from: k */
    private volatile C29217d f69360k;

    static {
        Covode.recordClassIndex(35598);
    }

    /* renamed from: a */
    public final C29250a mo51030a() {
        return new C29250a(this, (byte) 0);
    }

    /* renamed from: com.squareup.a.x$a */
    public static class C29250a {

        /* renamed from: a */
        public C29246v f69361a;

        /* renamed from: b */
        public EnumC29245u f69362b;

        /* renamed from: c */
        public int f69363c;

        /* renamed from: d */
        public String f69364d;

        /* renamed from: e */
        public C29234o f69365e;

        /* renamed from: f */
        public C29235p.C29236a f69366f;

        /* renamed from: g */
        public AbstractC29251y f69367g;

        /* renamed from: h */
        public C29249x f69368h;

        /* renamed from: i */
        public C29249x f69369i;

        /* renamed from: j */
        public C29249x f69370j;

        static {
            Covode.recordClassIndex(35599);
        }

        public C29250a() {
            this.f69363c = -1;
            this.f69366f = new C29235p.C29236a();
        }

        /* renamed from: a */
        public final C29249x mo51038a() {
            if (this.f69361a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f69362b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f69363c >= 0) {
                return new C29249x(this, (byte) 0);
            } else {
                throw new IllegalStateException("code < 0: " + this.f69363c);
            }
        }

        /* renamed from: a */
        public final C29250a mo51035a(C29235p pVar) {
            this.f69366f = pVar.mo50976a();
            return this;
        }

        /* renamed from: c */
        public final C29250a mo51041c(C29249x xVar) {
            if (xVar != null) {
                m58579d(xVar);
            }
            this.f69370j = xVar;
            return this;
        }

        /* renamed from: d */
        private static void m58579d(C29249x xVar) {
            if (xVar.f69356g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: a */
        public final C29250a mo51036a(C29249x xVar) {
            if (xVar != null) {
                m58578a("networkResponse", xVar);
            }
            this.f69368h = xVar;
            return this;
        }

        /* renamed from: b */
        public final C29250a mo51039b(C29249x xVar) {
            if (xVar != null) {
                m58578a("cacheResponse", xVar);
            }
            this.f69369i = xVar;
            return this;
        }

        private C29250a(C29249x xVar) {
            this.f69363c = -1;
            this.f69361a = xVar.f69350a;
            this.f69362b = xVar.f69351b;
            this.f69363c = xVar.f69352c;
            this.f69364d = xVar.f69353d;
            this.f69365e = xVar.f69354e;
            this.f69366f = xVar.f69355f.mo50976a();
            this.f69367g = xVar.f69356g;
            this.f69368h = xVar.f69357h;
            this.f69369i = xVar.f69358i;
            this.f69370j = xVar.f69359j;
        }

        /* synthetic */ C29250a(C29249x xVar, byte b) {
            this(xVar);
        }

        /* renamed from: b */
        public final C29250a mo51040b(String str, String str2) {
            this.f69366f.mo50984a(str, str2);
            return this;
        }

        /* renamed from: a */
        public final C29250a mo51037a(String str, String str2) {
            this.f69366f.mo50987b(str, str2);
            return this;
        }

        /* renamed from: a */
        private static void m58578a(String str, C29249x xVar) {
            if (xVar.f69356g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (xVar.f69357h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (xVar.f69358i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (xVar.f69359j != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }
    }

    /* renamed from: c */
    public final C29217d mo51033c() {
        C29217d dVar = this.f69360k;
        if (dVar != null) {
            return dVar;
        }
        C29217d a = C29217d.m58471a(this.f69355f);
        this.f69360k = a;
        return a;
    }

    /* renamed from: b */
    public final List<C29223g> mo51032b() {
        String str;
        int i = this.f69352c;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        C29235p pVar = this.f69355f;
        ArrayList arrayList = new ArrayList();
        int length = pVar.f69280a.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equalsIgnoreCase(pVar.mo50977a(i2))) {
                String b = pVar.mo50979b(i2);
                int i3 = 0;
                while (i3 < b.length()) {
                    int a = C29158d.m58269a(b, i3, " ");
                    String trim = b.substring(i3, a).trim();
                    int a2 = C29158d.m58268a(b, a);
                    if (!b.regionMatches(true, a2, "realm=\"", 0, 7)) {
                        break;
                    }
                    int i4 = a2 + 7;
                    int a3 = C29158d.m58269a(b, i4, "\"");
                    String substring = b.substring(i4, a3);
                    i3 = C29158d.m58268a(b, C29158d.m58269a(b, a3 + 1, ",") + 1);
                    arrayList.add(new C29223g(trim, substring));
                }
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "Response{protocol=" + this.f69351b + ", code=" + this.f69352c + ", message=" + this.f69353d + ", url=" + this.f69350a.f69338a.toString() + '}';
    }

    /* renamed from: a */
    public final String mo51031a(String str) {
        String a = this.f69355f.mo50978a(str);
        if (a != null) {
            return a;
        }
        return null;
    }

    private C29249x(C29250a aVar) {
        this.f69350a = aVar.f69361a;
        this.f69351b = aVar.f69362b;
        this.f69352c = aVar.f69363c;
        this.f69353d = aVar.f69364d;
        this.f69354e = aVar.f69365e;
        this.f69355f = aVar.f69366f.mo50985a();
        this.f69356g = aVar.f69367g;
        this.f69357h = aVar.f69368h;
        this.f69358i = aVar.f69369i;
        this.f69359j = aVar.f69370j;
    }

    /* synthetic */ C29249x(C29250a aVar, byte b) {
        this(aVar);
    }
}
