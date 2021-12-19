package com.facebook.imagepipeline.p1882g;

import com.bytedance.covode.number.Covode;
import com.facebook.p1870h.C24314c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.g.d */
public final class C24443d {

    /* renamed from: a */
    public final Map<C24314c, AbstractC24442c> f58074a;

    /* renamed from: b */
    public final List<C24314c.AbstractC24315a> f58075b;

    static {
        Covode.recordClassIndex(28586);
    }

    /* renamed from: com.facebook.imagepipeline.g.d$a */
    public static class C24444a {

        /* renamed from: a */
        public Map<C24314c, AbstractC24442c> f58076a;

        /* renamed from: b */
        public List<C24314c.AbstractC24315a> f58077b;

        static {
            Covode.recordClassIndex(28587);
        }

        /* renamed from: a */
        public final C24443d mo40284a() {
            return new C24443d(this, (byte) 0);
        }

        /* renamed from: a */
        private C24444a m46647a(C24314c cVar, AbstractC24442c cVar2) {
            if (this.f58076a == null) {
                this.f58076a = new HashMap();
            }
            this.f58076a.put(cVar, cVar2);
            return this;
        }

        /* renamed from: a */
        public final C24444a mo40283a(C24314c cVar, C24314c.AbstractC24315a aVar, AbstractC24442c cVar2) {
            if (this.f58077b == null) {
                this.f58077b = new ArrayList();
            }
            this.f58077b.add(aVar);
            m46647a(cVar, cVar2);
            return this;
        }
    }

    private C24443d(C24444a aVar) {
        this.f58074a = aVar.f58076a;
        this.f58075b = aVar.f58077b;
    }

    /* synthetic */ C24443d(C24444a aVar, byte b) {
        this(aVar);
    }
}
