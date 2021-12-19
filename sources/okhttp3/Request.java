package okhttp3;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.C90198s;
import okhttp3.internal.p4655c.C90094f;

public final class Request {
    final AbstractC90025ab body;
    private volatile C90047d cacheControl;
    final C90198s headers;
    final String method;
    final Map<Class<?>, Object> tags;
    final C90200t url;

    static {
        Covode.recordClassIndex(106187);
    }

    public final AbstractC90025ab body() {
        return this.body;
    }

    public final C90198s headers() {
        return this.headers;
    }

    public final String method() {
        return this.method;
    }

    public final C90200t url() {
        return this.url;
    }

    public final boolean isHttps() {
        return this.url.mo145049c();
    }

    public final C90016a newBuilder() {
        return new C90016a(this);
    }

    public final Object tag() {
        return tag(Object.class);
    }

    public final C90047d cacheControl() {
        C90047d dVar = this.cacheControl;
        if (dVar != null) {
            return dVar;
        }
        C90047d a = C90047d.m156288a(this.headers);
        this.cacheControl = a;
        return a;
    }

    /* renamed from: okhttp3.Request$a */
    public static class C90016a {

        /* renamed from: a */
        C90200t f204064a;

        /* renamed from: b */
        String f204065b;

        /* renamed from: c */
        C90198s.C90199a f204066c;

        /* renamed from: d */
        AbstractC90025ab f204067d;

        /* renamed from: e */
        Map<Class<?>, Object> f204068e;

        static {
            Covode.recordClassIndex(106188);
        }

        public C90016a() {
            this.f204068e = Collections.emptyMap();
            this.f204065b = "GET";
            this.f204066c = new C90198s.C90199a();
        }

        /* renamed from: a */
        public final Request mo144698a() {
            if (this.f204064a != null) {
                return new Request(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: b */
        public final C90016a mo144699b(String str) {
            this.f204066c.mo145041b(str);
            return this;
        }

        /* renamed from: a */
        public final C90016a mo144694a(AbstractC90025ab abVar) {
            return mo144693a("POST", abVar);
        }

        /* renamed from: a */
        public final C90016a mo144695a(C90047d dVar) {
            String dVar2 = dVar.toString();
            if (dVar2.isEmpty()) {
                return mo144699b("Cache-Control");
            }
            return mo144692a("Cache-Control", dVar2);
        }

        C90016a(Request request) {
            Map<Class<?>, Object> linkedHashMap;
            this.f204068e = Collections.emptyMap();
            this.f204064a = request.url;
            this.f204065b = request.method;
            this.f204067d = request.body;
            if (request.tags.isEmpty()) {
                linkedHashMap = Collections.emptyMap();
            } else {
                linkedHashMap = new LinkedHashMap<>(request.tags);
            }
            this.f204068e = linkedHashMap;
            this.f204066c = request.headers.mo145033c();
        }

        /* renamed from: a */
        public final C90016a mo144691a(String str) {
            String str2 = str;
            Objects.requireNonNull(str2, "url == null");
            if (str2.regionMatches(true, 0, "ws:", 0, 3)) {
                str2 = "http:" + str2.substring(3);
            } else if (str2.regionMatches(true, 0, "wss:", 0, 4)) {
                str2 = "https:" + str2.substring(4);
            }
            return mo144697a(C90200t.m156803g(str2));
        }

        /* renamed from: a */
        public final C90016a mo144696a(C90198s sVar) {
            this.f204066c = sVar.mo145033c();
            return this;
        }

        /* renamed from: a */
        public final C90016a mo144697a(C90200t tVar) {
            Objects.requireNonNull(tVar, "url == null");
            this.f204064a = tVar;
            return this;
        }

        /* renamed from: a */
        public final C90016a mo144692a(String str, String str2) {
            this.f204066c.mo145045d(str, str2);
            return this;
        }

        /* renamed from: b */
        public final C90016a mo144700b(String str, String str2) {
            this.f204066c.mo145039a(str, str2);
            return this;
        }

        /* renamed from: a */
        public final <T> C90016a mo144690a(Class<? super T> cls, T t) {
            if (t == null) {
                this.f204068e.remove(cls);
            } else {
                if (this.f204068e.isEmpty()) {
                    this.f204068e = new LinkedHashMap();
                }
                this.f204068e.put(cls, cls.cast(t));
            }
            return this;
        }

        /* renamed from: a */
        public final C90016a mo144693a(String str, AbstractC90025ab abVar) {
            Objects.requireNonNull(str, "method == null");
            if (str.length() != 0) {
                if (abVar != null) {
                    if (!C90094f.m156450c(str)) {
                        throw new IllegalArgumentException("method " + str + " must not have a request body.");
                    }
                } else if (C90094f.m156449b(str)) {
                    throw new IllegalArgumentException("method " + str + " must have a request body.");
                }
                this.f204065b = str;
                this.f204067d = abVar;
                return this;
            }
            throw new IllegalArgumentException("method.length() == 0");
        }
    }

    public final String toString() {
        return "Request{method=" + this.method + ", url=" + this.url + ", tags=" + this.tags + '}';
    }

    public final String header(String str) {
        return this.headers.mo145028a(str);
    }

    public final List<String> headers(String str) {
        return this.headers.mo145032b(str);
    }

    public final <T> T tag(Class<? extends T> cls) {
        return (T) cls.cast(this.tags.get(cls));
    }

    Request(C90016a aVar) {
        Map<Class<?>, Object> unmodifiableMap;
        this.url = aVar.f204064a;
        this.method = aVar.f204065b;
        this.headers = aVar.f204066c.mo145040a();
        this.body = aVar.f204067d;
        Map<Class<?>, Object> map = aVar.f204068e;
        if (map.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        this.tags = unmodifiableMap;
    }
}
