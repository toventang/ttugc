package com.google.p1971b.p1972a.p1973a.p1974a;

import com.bytedance.covode.number.Covode;
import com.google.p1971b.p1972a.p1983d.AbstractC27143c;
import com.google.p1971b.p1972a.p1983d.AbstractC27147g;
import com.google.p1971b.p1972a.p1983d.AbstractC27148h;
import com.google.p1971b.p1972a.p1983d.C27137a;
import com.google.p1971b.p1972a.p1986e.AbstractC27153b;
import com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a.C27159b;
import com.google.p1971b.p1972a.p1993g.AbstractC27176e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

/* renamed from: com.google.b.a.a.a.c */
public class C27121c implements AbstractC27143c, AbstractC27147g {

    /* renamed from: a */
    static final Logger f64200a = Logger.getLogger(C27121c.class.getName());

    /* renamed from: b */
    public final AbstractC27122a f64201b;

    /* renamed from: c */
    public final AbstractC27176e f64202c;

    /* renamed from: d */
    public final AbstractC27148h f64203d;

    /* renamed from: e */
    public final AbstractC27143c f64204e;

    /* renamed from: f */
    public final AbstractC27153b f64205f;

    /* renamed from: g */
    public final String f64206g;

    /* renamed from: h */
    public final Collection<Object> f64207h;

    /* renamed from: i */
    public final AbstractC27147g f64208i;

    /* renamed from: j */
    private final Lock f64209j = new ReentrantLock();

    /* renamed from: k */
    private String f64210k;

    /* renamed from: l */
    private Long f64211l;

    /* renamed from: m */
    private String f64212m;

    /* renamed from: com.google.b.a.a.a.c$a */
    public interface AbstractC27122a {
        static {
            Covode.recordClassIndex(32702);
        }
    }

    static {
        Covode.recordClassIndex(32701);
    }

    /* renamed from: com.google.b.a.a.a.c$b */
    public static class C27123b {

        /* renamed from: a */
        public final AbstractC27122a f64213a;

        /* renamed from: b */
        public AbstractC27148h f64214b;

        /* renamed from: c */
        public AbstractC27153b f64215c;

        /* renamed from: d */
        public C27137a f64216d;

        /* renamed from: e */
        public AbstractC27176e f64217e = AbstractC27176e.f64332a;

        /* renamed from: f */
        public AbstractC27143c f64218f;

        /* renamed from: g */
        public AbstractC27147g f64219g;

        /* renamed from: h */
        public Collection<Object> f64220h = new ArrayList();

        static {
            Covode.recordClassIndex(32703);
        }

        /* renamed from: a */
        public C27123b mo45161a(AbstractC27143c cVar) {
            this.f64218f = cVar;
            return this;
        }

        /* renamed from: a */
        public C27123b mo45162a(AbstractC27148h hVar) {
            this.f64214b = hVar;
            return this;
        }

        /* renamed from: a */
        public C27123b mo45163a(AbstractC27153b bVar) {
            this.f64215c = bVar;
            return this;
        }

        public C27123b(AbstractC27122a aVar) {
            this.f64213a = (AbstractC27122a) C27159b.m53980a(aVar);
        }

        /* renamed from: a */
        public C27123b mo45164a(String str) {
            C27137a aVar;
            if (str == null) {
                aVar = null;
            } else {
                aVar = new C27137a(str);
            }
            this.f64216d = aVar;
            return this;
        }
    }

    /* renamed from: a */
    public C27121c mo45157a(Long l) {
        this.f64209j.lock();
        try {
            this.f64211l = l;
            return this;
        } finally {
            this.f64209j.unlock();
        }
    }

    /* renamed from: b */
    public C27121c mo45159b(Long l) {
        Long valueOf;
        if (l == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(this.f64202c.mo45247a() + (l.longValue() * 1000));
        }
        return mo45157a(valueOf);
    }

    /* renamed from: a */
    public C27121c mo45158a(String str) {
        this.f64209j.lock();
        try {
            this.f64210k = str;
            return this;
        } finally {
            this.f64209j.unlock();
        }
    }

    /* renamed from: b */
    public C27121c mo45160b(String str) {
        boolean z;
        this.f64209j.lock();
        if (str != null) {
            try {
                if (this.f64205f == null || this.f64203d == null || this.f64204e == null || this.f64206g == null) {
                    z = false;
                } else {
                    z = true;
                }
                C27159b.m53984a(z, "Please use the Builder and call setJsonFactory, setTransport, setClientAuthentication and setTokenServerUrl/setTokenServerEncodedUrl");
            } catch (Throwable th) {
                this.f64209j.unlock();
                throw th;
            }
        }
        this.f64212m = str;
        this.f64209j.unlock();
        return this;
    }

    public C27121c(C27123b bVar) {
        String a;
        this.f64201b = (AbstractC27122a) C27159b.m53980a(bVar.f64213a);
        this.f64203d = bVar.f64214b;
        this.f64205f = bVar.f64215c;
        if (bVar.f64216d == null) {
            a = null;
        } else {
            a = bVar.f64216d.mo45181a();
        }
        this.f64206g = a;
        this.f64204e = bVar.f64218f;
        this.f64208i = bVar.f64219g;
        this.f64207h = Collections.unmodifiableCollection(bVar.f64220h);
        this.f64202c = (AbstractC27176e) C27159b.m53980a(bVar.f64217e);
    }
}
