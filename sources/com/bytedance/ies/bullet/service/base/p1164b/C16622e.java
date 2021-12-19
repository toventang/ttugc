package com.bytedance.ies.bullet.service.base.p1164b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16568c;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16580l;
import com.bytedance.ies.bullet.service.base.p1164b.C16624f;
import com.bytedance.ies.bullet.service.p1161a.AbstractC16552b;
import com.bytedance.ies.bullet.service.p1161a.AbstractC16559e;
import com.bytedance.ies.bullet.service.p1161a.C16554c;
import com.bytedance.ies.bullet.service.p1161a.C16556d;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.b.e */
public final class C16622e implements AbstractC16580l {

    /* renamed from: a */
    public static volatile AbstractC16580l f39778a = new C16621d();

    /* renamed from: b */
    public static final C16623a f39779b = new C16623a((byte) 0);

    /* renamed from: c */
    private final ConcurrentHashMap<String, C16624f> f39780c;

    /* renamed from: com.bytedance.ies.bullet.service.base.b.e$a */
    public static final class C16623a {
        static {
            Covode.recordClassIndex(19060);
        }

        private C16623a() {
        }

        /* renamed from: a */
        public static AbstractC16580l m30858a() {
            AbstractC16580l lVar;
            MethodCollector.m26663i(8758);
            synchronized (C16622e.f39778a) {
                try {
                    lVar = C16622e.f39778a;
                    if (lVar instanceof C16621d) {
                        lVar = new C16622e((byte) 0);
                        C16622e.f39778a = lVar;
                    }
                } finally {
                    MethodCollector.m26664o(8758);
                }
            }
            return lVar;
        }

        public /* synthetic */ C16623a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C16624f m30859a(String str, ConcurrentHashMap<String, C16624f> concurrentHashMap) {
            C16624f fVar = concurrentHashMap.get(str);
            if (fVar != null) {
                return fVar;
            }
            C16624f a = new C16624f.C16625a().mo26384a(str).mo26385a();
            concurrentHashMap.put(str, a);
            return a;
        }
    }

    private C16622e() {
        this.f39780c = new ConcurrentHashMap<>();
    }

    static {
        Covode.recordClassIndex(19059);
    }

    public /* synthetic */ C16622e(byte b) {
        this();
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16580l
    /* renamed from: a */
    public final <T extends AbstractC16568c> T mo26346a(Class<T> cls) {
        C89219l.m154719c(cls, "");
        return (T) AbstractC16580l.C16581a.m30786a(this, cls);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16573g
    /* renamed from: a */
    public final AbstractC16559e<String, Object> mo26339a(String str) {
        C89219l.m154719c(str, "");
        C16554c d = m30848d(str);
        if (d != null) {
            return d.mo26317b();
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16573g
    /* renamed from: b */
    public final AbstractC16559e<String, Object> mo26341b(String str) {
        C89219l.m154719c(str, "");
        C16554c d = m30848d(str);
        if (d != null) {
            return d.mo26318c();
        }
        return null;
    }

    /* renamed from: d */
    private static C16554c m30848d(String str) {
        AbstractC16552b bVar;
        String str2;
        C89219l.m154719c(str, "");
        C16556d dVar = C16556d.f39680b;
        C89219l.m154719c(str, "");
        SoftReference<AbstractC16552b> softReference = dVar.f39683a.get(str);
        if (softReference == null || (bVar = softReference.get()) == null) {
            if (str.length() == 0) {
                str2 = C16556d.f39681c.invoke();
            } else {
                str2 = str;
            }
            SoftReference<AbstractC16552b> softReference2 = new SoftReference<>(new C16554c(str2));
            dVar.f39683a.put(str, softReference2);
            bVar = softReference2.get();
        }
        if (!(bVar instanceof C16554c)) {
            bVar = null;
        }
        return (C16554c) bVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16573g
    /* renamed from: c */
    public final void mo26342c(String str) {
        AbstractC16552b bVar;
        C89219l.m154719c(str, "");
        C16556d dVar = C16556d.f39680b;
        C89219l.m154719c(str, "");
        if (str.length() == 0) {
            Iterator<T> it = dVar.f39683a.values().iterator();
            while (it.hasNext()) {
                AbstractC16552b bVar2 = (AbstractC16552b) it.next().get();
                if (bVar2 != null) {
                    bVar2.mo26316a();
                }
            }
            dVar.f39683a.clear();
            return;
        }
        SoftReference<AbstractC16552b> softReference = dVar.f39683a.get(str);
        if (!(softReference == null || (bVar = softReference.get()) == null)) {
            bVar.mo26316a();
        }
        dVar.f39683a.remove(str);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16580l
    /* renamed from: a */
    public final <T extends AbstractC16568c> T mo26347a(String str, Class<T> cls) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(cls, "");
        C16624f a = C16623a.m30859a(str, this.f39780c);
        String name = cls.getName();
        C89219l.m154709a((Object) name, "");
        T t = (T) a.mo26381a(name);
        if (t != null) {
            return t;
        }
        C16624f a2 = C16623a.m30859a("default_bid", this.f39780c);
        String name2 = cls.getName();
        C89219l.m154709a((Object) name2, "");
        T t2 = (T) a2.mo26381a(name2);
        if (!(t2 instanceof AbstractC16568c)) {
            return null;
        }
        return t2;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16580l
    /* renamed from: a */
    public final <T extends AbstractC16568c> AbstractC16580l mo26348a(Class<T> cls, T t) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(t, "");
        return AbstractC16580l.C16581a.m30787a(this, cls, t);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16580l
    /* renamed from: a */
    public final AbstractC16580l mo26349a(String str, C16624f fVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(fVar, "");
        C16624f a = C16623a.m30859a(str, this.f39780c);
        C89219l.m154719c(fVar, "");
        for (Map.Entry<String, AbstractC16568c> entry : fVar.f39781a.entrySet()) {
            a.mo26382a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16573g
    /* renamed from: a */
    public final void mo26340a(String str, Context context) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(context, "");
        C16554c d = m30848d(str);
        if (d != null) {
            C89219l.m154719c(context, "");
            if (d.f39674a == null) {
                d.f39674a = context;
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16580l
    /* renamed from: a */
    public final <T extends AbstractC16568c> AbstractC16580l mo26350a(String str, Class<T> cls, T t) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(cls, "");
        C89219l.m154719c(t, "");
        C16624f a = C16623a.m30859a(str, this.f39780c);
        String name = cls.getName();
        C89219l.m154709a((Object) name, "");
        a.mo26382a(name, t);
        return this;
    }
}
