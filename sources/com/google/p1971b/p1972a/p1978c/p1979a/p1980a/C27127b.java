package com.google.p1971b.p1972a.p1978c.p1979a.p1980a;

import com.bytedance.covode.number.Covode;
import com.google.p1971b.p1972a.p1973a.p1974a.C27118a;
import com.google.p1971b.p1972a.p1973a.p1974a.C27120b;
import com.google.p1971b.p1972a.p1973a.p1974a.C27121c;
import com.google.p1971b.p1972a.p1983d.AbstractC27143c;
import com.google.p1971b.p1972a.p1983d.AbstractC27148h;
import com.google.p1971b.p1972a.p1986e.AbstractC27153b;
import com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a.C27159b;
import java.security.PrivateKey;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.google.b.a.c.a.a.b */
public final class C27127b extends C27121c {

    /* renamed from: p */
    private static C27126a f64225p = new C27126a();

    /* renamed from: j */
    public String f64226j;

    /* renamed from: k */
    public String f64227k;

    /* renamed from: l */
    public Collection<String> f64228l;

    /* renamed from: m */
    public PrivateKey f64229m;

    /* renamed from: n */
    public String f64230n;

    /* renamed from: o */
    public String f64231o;

    /* renamed from: com.google.b.a.c.a.a.b$a */
    public static class C27128a extends C27121c.C27123b {

        /* renamed from: i */
        public String f64232i;

        /* renamed from: j */
        public Collection<String> f64233j;

        /* renamed from: k */
        public PrivateKey f64234k;

        /* renamed from: l */
        public String f64235l;

        /* renamed from: m */
        public String f64236m;

        /* renamed from: n */
        public String f64237n;

        static {
            Covode.recordClassIndex(32708);
        }

        public C27128a() {
            super(new C27118a.C27119a());
            mo45164a("https://accounts.google.com/o/oauth2/token");
        }

        /* renamed from: a */
        public final C27127b mo45168a() {
            return new C27127b(this);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C27128a mo45161a(AbstractC27143c cVar) {
            return (C27128a) super.mo45161a(cVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C27128a mo45164a(String str) {
            return (C27128a) super.mo45164a(str);
        }

        /* renamed from: b */
        public final C27128a mo45162a(AbstractC27148h hVar) {
            return (C27128a) super.mo45162a(hVar);
        }

        /* renamed from: b */
        public final C27128a mo45163a(AbstractC27153b bVar) {
            return (C27128a) super.mo45163a(bVar);
        }

        /* renamed from: b */
        public final C27128a mo45171b(String str) {
            mo45161a(new C27120b(str));
            return this;
        }
    }

    static {
        Covode.recordClassIndex(32707);
    }

    public C27127b() {
        this(new C27128a());
    }

    @Override // com.google.p1971b.p1972a.p1973a.p1974a.C27121c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C27121c mo45157a(Long l) {
        return super.mo45157a(l);
    }

    /* renamed from: c */
    public final C27127b mo45159b(Long l) {
        return (C27127b) super.mo45159b(l);
    }

    /* renamed from: c */
    public final C27127b mo45158a(String str) {
        return (C27127b) super.mo45158a(str);
    }

    /* renamed from: d */
    public final C27127b mo45160b(String str) {
        boolean z;
        if (str != null) {
            if (this.f64205f == null || this.f64203d == null || this.f64204e == null) {
                z = false;
            } else {
                z = true;
            }
            C27159b.m53984a(z, "Please use the Builder and call setJsonFactory, setTransport and setClientSecrets");
        }
        return (C27127b) super.mo45160b(str);
    }

    protected C27127b(C27128a aVar) {
        super(aVar);
        Collection<String> unmodifiableCollection;
        boolean z;
        if (aVar.f64234k == null) {
            if (aVar.f64232i == null && aVar.f64233j == null && aVar.f64237n == null) {
                z = true;
            } else {
                z = false;
            }
            C27159b.m53983a(z);
            return;
        }
        this.f64226j = (String) C27159b.m53980a(aVar.f64232i);
        this.f64227k = aVar.f64236m;
        if (aVar.f64233j == null) {
            unmodifiableCollection = Collections.emptyList();
        } else {
            unmodifiableCollection = Collections.unmodifiableCollection(aVar.f64233j);
        }
        this.f64228l = unmodifiableCollection;
        this.f64229m = aVar.f64234k;
        this.f64230n = aVar.f64235l;
        this.f64231o = aVar.f64237n;
    }
}
