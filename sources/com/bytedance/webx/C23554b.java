package com.bytedance.webx;

import com.bytedance.covode.number.Covode;
import com.bytedance.webx.C23612h;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.bytedance.webx.b */
public final class C23554b {

    /* renamed from: a */
    public Set<Class<? extends AbstractC23547a>> f55797a;

    /* renamed from: b */
    public Set<C23612h.AbstractC23616c> f55798b;

    /* renamed from: c */
    public HashMap<Class<? extends AbstractC23547a>, C23612h.AbstractC23616c> f55799c;

    /* renamed from: d */
    public AbstractC23564d f55800d;

    /* renamed from: e */
    public Class<? extends AbstractC23564d> f55801e;

    static {
        Covode.recordClassIndex(27652);
    }

    private C23554b() {
        this.f55797a = new LinkedHashSet();
    }

    /* synthetic */ C23554b(byte b) {
        this();
    }

    /* renamed from: com.bytedance.webx.b$a */
    public static class C23555a {

        /* renamed from: a */
        public C23554b f55802a = new C23554b((byte) 0);

        static {
            Covode.recordClassIndex(27653);
        }

        /* renamed from: a */
        public final C23555a mo38637a(AbstractC23564d dVar) {
            this.f55802a.f55800d = dVar;
            return this;
        }

        /* renamed from: a */
        public final C23555a mo38638a(Class<? extends AbstractC23547a> cls) {
            this.f55802a.f55797a.add(cls);
            return this;
        }

        /* renamed from: a */
        public final C23555a mo38639a(Class<? extends AbstractC23547a> cls, C23612h.AbstractC23616c cVar) {
            this.f55802a.f55797a.add(cls);
            if (this.f55802a.f55799c == null) {
                this.f55802a.f55799c = new HashMap<>();
            }
            this.f55802a.f55799c.put(cls, cVar);
            return this;
        }
    }
}
