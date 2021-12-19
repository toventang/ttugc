package com.bytedance.scene;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.scene.t */
public final class C22268t {

    /* renamed from: a */
    public static final AbstractC22270a f52675a = new AbstractC22270a() {
        /* class com.bytedance.scene.C22268t.C222691 */

        static {
            Covode.recordClassIndex(26081);
        }

        @Override // com.bytedance.scene.C22268t.AbstractC22270a
        /* renamed from: a */
        public final C22268t mo36467a() {
            return new C22268t(C22268t.m41935a());
        }
    };

    /* renamed from: f */
    private static final AtomicInteger f52676f = new AtomicInteger(0);

    /* renamed from: b */
    final String f52677b;

    /* renamed from: c */
    final Map<String, C22268t> f52678c;

    /* renamed from: d */
    final Map<Object, Object> f52679d;

    /* renamed from: e */
    private final C22268t f52680e;

    /* renamed from: com.bytedance.scene.t$a */
    public interface AbstractC22270a {
        static {
            Covode.recordClassIndex(26082);
        }

        /* renamed from: a */
        C22268t mo36467a();
    }

    /* renamed from: com.bytedance.scene.t$b */
    public interface AbstractC22271b {
        static {
            Covode.recordClassIndex(26083);
        }

        /* renamed from: a */
        void mo36494a();
    }

    static {
        Covode.recordClassIndex(26080);
    }

    /* renamed from: a */
    public static String m41935a() {
        return "Scene #" + f52676f.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo36581b() {
        C22268t tVar = this.f52680e;
        if (tVar != null) {
            tVar.f52678c.remove(this.f52677b);
        }
        for (Object obj : this.f52679d.values()) {
            if (obj instanceof AbstractC22271b) {
                ((AbstractC22271b) obj).mo36494a();
            }
        }
        this.f52679d.clear();
        this.f52678c.clear();
    }

    /* synthetic */ C22268t(String str) {
        this(null, str);
    }

    /* renamed from: a */
    public final <T> T mo36579a(Object obj) {
        C22268t tVar = this;
        do {
            T t = (T) tVar.f52679d.get(obj);
            if (t != null) {
                return t;
            }
            tVar = tVar.f52680e;
        } while (tVar != null);
        return null;
    }

    /* renamed from: a */
    public final void mo36580a(Object obj, Object obj2) {
        this.f52679d.put(obj, obj2);
    }

    C22268t(C22268t tVar, String str) {
        this.f52678c = new HashMap();
        this.f52679d = new HashMap();
        this.f52680e = tVar;
        this.f52677b = str;
    }
}
