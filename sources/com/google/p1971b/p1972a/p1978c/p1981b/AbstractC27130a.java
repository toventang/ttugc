package com.google.p1971b.p1972a.p1978c.p1981b;

import com.bytedance.covode.number.Covode;
import com.google.p1971b.p1972a.p1983d.AbstractC27147g;
import com.google.p1971b.p1972a.p1983d.AbstractC27148h;
import com.google.p1971b.p1972a.p1983d.C27146f;
import com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a.C27159b;
import com.google.p1971b.p1972a.p1993g.AbstractC27191m;
import java.util.logging.Logger;

/* renamed from: com.google.b.a.c.b.a */
public abstract class AbstractC27130a {

    /* renamed from: a */
    static final Logger f64239a = Logger.getLogger(AbstractC27130a.class.getName());

    /* renamed from: b */
    public final C27146f f64240b;

    /* renamed from: c */
    public final AbstractC27136c f64241c;

    /* renamed from: d */
    public final String f64242d;

    /* renamed from: e */
    public final String f64243e;

    /* renamed from: f */
    public final String f64244f;

    /* renamed from: g */
    public final boolean f64245g;

    /* renamed from: h */
    public final boolean f64246h;

    /* renamed from: i */
    private final String f64247i;

    /* renamed from: j */
    private final AbstractC27191m f64248j;

    static {
        Covode.recordClassIndex(32710);
    }

    /* renamed from: com.google.b.a.c.b.a$a */
    public static abstract class AbstractC27131a {

        /* renamed from: a */
        public final AbstractC27148h f64249a;

        /* renamed from: b */
        public AbstractC27136c f64250b;

        /* renamed from: c */
        public AbstractC27147g f64251c;

        /* renamed from: d */
        final AbstractC27191m f64252d;

        /* renamed from: e */
        public String f64253e;

        /* renamed from: f */
        public String f64254f;

        /* renamed from: g */
        String f64255g;

        /* renamed from: h */
        public String f64256h;

        /* renamed from: i */
        public boolean f64257i;

        /* renamed from: j */
        public boolean f64258j;

        static {
            Covode.recordClassIndex(32711);
        }

        /* renamed from: c */
        public AbstractC27131a mo45174c(String str) {
            this.f64256h = str;
            return this;
        }

        /* renamed from: a */
        public AbstractC27131a mo45172a(String str) {
            this.f64253e = AbstractC27130a.m53903a(str);
            return this;
        }

        /* renamed from: b */
        public AbstractC27131a mo45173b(String str) {
            this.f64254f = AbstractC27130a.m53904b(str);
            return this;
        }

        public AbstractC27131a(AbstractC27148h hVar, String str, String str2, AbstractC27191m mVar, AbstractC27147g gVar) {
            this.f64249a = (AbstractC27148h) C27159b.m53980a(hVar);
            this.f64252d = mVar;
            mo45172a(str);
            mo45173b(str2);
            this.f64251c = gVar;
        }
    }

    /* renamed from: a */
    static String m53903a(String str) {
        C27159b.m53981a(str, "root URL cannot be null.");
        if (!str.endsWith("/")) {
            return String.valueOf(str).concat("/");
        }
        return str;
    }

    /* renamed from: b */
    static String m53904b(String str) {
        C27159b.m53981a(str, "service path cannot be null");
        if (str.length() == 1) {
            C27159b.m53984a("/".equals(str), "service path must equal \"/\" if it is of length 1.");
            return "";
        } else if (str.length() <= 0) {
            return str;
        } else {
            if (!str.endsWith("/")) {
                str = String.valueOf(str).concat("/");
            }
            if (str.startsWith("/")) {
                return str.substring(1);
            }
            return str;
        }
    }

    public AbstractC27130a(AbstractC27131a aVar) {
        C27146f a;
        this.f64241c = aVar.f64250b;
        this.f64242d = m53903a(aVar.f64253e);
        this.f64243e = m53904b(aVar.f64254f);
        this.f64247i = aVar.f64255g;
        String str = aVar.f64256h;
        if (str == null || str.length() == 0) {
            f64239a.warning("Application name is not set. Call Builder#setApplicationName.");
        }
        this.f64244f = aVar.f64256h;
        if (aVar.f64251c == null) {
            a = aVar.f64249a.mo45194a(null);
        } else {
            a = aVar.f64249a.mo45194a(aVar.f64251c);
        }
        this.f64240b = a;
        this.f64248j = aVar.f64252d;
        this.f64245g = aVar.f64257i;
        this.f64246h = aVar.f64258j;
    }
}
