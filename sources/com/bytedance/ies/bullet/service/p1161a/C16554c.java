package com.bytedance.ies.bullet.service.p1161a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.p1161a.AbstractC16552b;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.a.c */
public final class C16554c extends AbstractC16552b.C16553a {

    /* renamed from: a */
    public Context f39674a;

    /* renamed from: b */
    public final String f39675b;

    /* renamed from: c */
    private final ConcurrentHashMap<Class<?>, C16555a<?>> f39676c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private AbstractC16559e<String, Object> f39677d;

    /* renamed from: e */
    private AbstractC16559e<String, Object> f39678e;

    /* renamed from: com.bytedance.ies.bullet.service.a.c$a */
    public static final class C16555a<R> {

        /* renamed from: a */
        public R f39679a;

        static {
            Covode.recordClassIndex(18991);
        }
    }

    static {
        Covode.recordClassIndex(18990);
    }

    @Override // com.bytedance.ies.bullet.service.p1161a.AbstractC16552b.C16553a, com.bytedance.ies.bullet.service.p1161a.AbstractC16552b
    /* renamed from: a */
    public final void mo26316a() {
        super.mo26316a();
        Collection<C16555a<?>> values = this.f39676c.values();
        C89219l.m154709a((Object) values, "");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            it.next().f39679a = null;
        }
        this.f39676c.clear();
    }

    @Override // com.bytedance.ies.bullet.service.p1161a.AbstractC16552b.C16553a
    /* renamed from: b */
    public final AbstractC16559e<String, Object> mo26317b() {
        MethodCollector.m26663i(2601);
        if (this.f39677d == null) {
            synchronized (this) {
                try {
                    if (this.f39677d == null) {
                        this.f39677d = new C16551a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2601);
                    throw th;
                }
            }
        }
        AbstractC16559e<String, Object> eVar = this.f39677d;
        MethodCollector.m26664o(2601);
        return eVar;
    }

    @Override // com.bytedance.ies.bullet.service.p1161a.AbstractC16552b.C16553a
    /* renamed from: c */
    public final AbstractC16559e<String, Object> mo26318c() {
        MethodCollector.m26663i(2605);
        if (this.f39678e == null) {
            synchronized (this) {
                try {
                    if (this.f39678e == null) {
                        this.f39678e = new C16551a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2605);
                    throw th;
                }
            }
        }
        AbstractC16559e<String, Object> eVar = this.f39678e;
        MethodCollector.m26664o(2605);
        return eVar;
    }

    public C16554c(String str) {
        C89219l.m154719c(str, "");
        this.f39675b = str;
    }
}
