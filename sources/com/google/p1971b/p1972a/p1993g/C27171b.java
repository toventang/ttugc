package com.google.p1971b.p1972a.p1993g;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.b.a.g.b */
public final class C27171b {

    /* renamed from: a */
    public final Map<Field, C27172a> f64318a = new C27161a();

    /* renamed from: b */
    private final Map<String, C27172a> f64319b = new C27161a();

    /* renamed from: c */
    private final Object f64320c;

    static {
        Covode.recordClassIndex(32751);
    }

    /* renamed from: com.google.b.a.g.b$a */
    public static class C27172a {

        /* renamed from: a */
        public final Class<?> f64321a;

        /* renamed from: b */
        public final ArrayList<Object> f64322b = new ArrayList<>();

        static {
            Covode.recordClassIndex(32752);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Object mo45244a() {
            return C27192n.m54039a((Collection<?>) this.f64322b, this.f64321a);
        }

        public C27172a(Class<?> cls) {
            this.f64321a = cls;
        }
    }

    /* renamed from: a */
    public final void mo45243a() {
        for (Map.Entry<String, C27172a> entry : this.f64319b.entrySet()) {
            ((Map) this.f64320c).put(entry.getKey(), entry.getValue().mo45244a());
        }
        for (Map.Entry<Field, C27172a> entry2 : this.f64318a.entrySet()) {
            C27184i.m54025a(entry2.getKey(), this.f64320c, entry2.getValue().mo45244a());
        }
    }

    public C27171b(Object obj) {
        this.f64320c = obj;
    }
}
