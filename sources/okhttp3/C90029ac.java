package okhttp3;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.util.List;
import okhttp3.C90198s;

/* renamed from: okhttp3.ac */
public final class C90029ac implements Closeable {

    /* renamed from: a */
    public final Request f204105a;

    /* renamed from: b */
    public final EnumC90211z f204106b;

    /* renamed from: c */
    public final int f204107c;

    /* renamed from: d */
    public final String f204108d;

    /* renamed from: e */
    public final C90197r f204109e;

    /* renamed from: f */
    public final C90198s f204110f;

    /* renamed from: g */
    public final AbstractC90031ad f204111g;

    /* renamed from: h */
    public final C90029ac f204112h;

    /* renamed from: i */
    public final C90029ac f204113i;

    /* renamed from: j */
    public final C90029ac f204114j;

    /* renamed from: k */
    public final long f204115k;

    /* renamed from: l */
    public final long f204116l;

    /* renamed from: m */
    private volatile C90047d f204117m;

    static {
        Covode.recordClassIndex(106201);
    }

    /* renamed from: okhttp3.ac$a */
    public static class C90030a {

        /* renamed from: a */
        public Request f204118a;

        /* renamed from: b */
        public EnumC90211z f204119b;

        /* renamed from: c */
        public int f204120c;

        /* renamed from: d */
        public String f204121d;

        /* renamed from: e */
        public C90197r f204122e;

        /* renamed from: f */
        public C90198s.C90199a f204123f;

        /* renamed from: g */
        public AbstractC90031ad f204124g;

        /* renamed from: h */
        C90029ac f204125h;

        /* renamed from: i */
        C90029ac f204126i;

        /* renamed from: j */
        public C90029ac f204127j;

        /* renamed from: k */
        public long f204128k;

        /* renamed from: l */
        public long f204129l;

        static {
            Covode.recordClassIndex(106202);
        }

        public C90030a() {
            this.f204120c = -1;
            this.f204123f = new C90198s.C90199a();
        }

        /* renamed from: a */
        public final C90029ac mo144729a() {
            if (this.f204118a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f204119b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f204120c < 0) {
                throw new IllegalStateException("code < 0: " + this.f204120c);
            } else if (this.f204121d != null) {
                return new C90029ac(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        /* renamed from: a */
        public final C90030a mo144727a(C90029ac acVar) {
            if (acVar != null) {
                m156255a("networkResponse", acVar);
            }
            this.f204125h = acVar;
            return this;
        }

        /* renamed from: b */
        public final C90030a mo144730b(C90029ac acVar) {
            if (acVar != null) {
                m156255a("cacheResponse", acVar);
            }
            this.f204126i = acVar;
            return this;
        }

        /* renamed from: a */
        public final C90030a mo144728a(C90198s sVar) {
            this.f204123f = sVar.mo145033c();
            return this;
        }

        C90030a(C90029ac acVar) {
            this.f204120c = -1;
            this.f204118a = acVar.f204105a;
            this.f204119b = acVar.f204106b;
            this.f204120c = acVar.f204107c;
            this.f204121d = acVar.f204108d;
            this.f204122e = acVar.f204109e;
            this.f204123f = acVar.f204110f.mo145033c();
            this.f204124g = acVar.f204111g;
            this.f204125h = acVar.f204112h;
            this.f204126i = acVar.f204113i;
            this.f204127j = acVar.f204114j;
            this.f204128k = acVar.f204115k;
            this.f204129l = acVar.f204116l;
        }

        /* renamed from: a */
        public final C90030a mo144726a(String str, String str2) {
            this.f204123f.mo145039a(str, str2);
            return this;
        }

        /* renamed from: a */
        private static void m156255a(String str, C90029ac acVar) {
            if (acVar.f204111g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (acVar.f204112h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (acVar.f204113i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (acVar.f204114j != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }
    }

    /* renamed from: b */
    public final C90030a mo144722b() {
        return new C90030a(this);
    }

    /* renamed from: c */
    public final C90047d mo144723c() {
        C90047d dVar = this.f204117m;
        if (dVar != null) {
            return dVar;
        }
        C90047d a = C90047d.m156288a(this.f204110f);
        this.f204117m = a;
        return a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC90031ad adVar = this.f204111g;
        if (adVar != null) {
            adVar.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    /* renamed from: a */
    public final boolean mo144720a() {
        int i = this.f204107c;
        if (i < 200 || i >= 300) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "Response{protocol=" + this.f204106b + ", code=" + this.f204107c + ", message=" + this.f204108d + ", url=" + this.f204105a.url() + '}';
    }

    /* renamed from: a */
    public final List<String> mo144719a(String str) {
        return this.f204110f.mo145032b(str);
    }

    /* renamed from: b */
    public final String mo144721b(String str) {
        return mo144718a(str, null);
    }

    C90029ac(C90030a aVar) {
        this.f204105a = aVar.f204118a;
        this.f204106b = aVar.f204119b;
        this.f204107c = aVar.f204120c;
        this.f204108d = aVar.f204121d;
        this.f204109e = aVar.f204122e;
        this.f204110f = aVar.f204123f.mo145040a();
        this.f204111g = aVar.f204124g;
        this.f204112h = aVar.f204125h;
        this.f204113i = aVar.f204126i;
        this.f204114j = aVar.f204127j;
        this.f204115k = aVar.f204128k;
        this.f204116l = aVar.f204129l;
    }

    /* renamed from: a */
    public final String mo144718a(String str, String str2) {
        String a = this.f204110f.mo145028a(str);
        if (a != null) {
            return a;
        }
        return str2;
    }
}
