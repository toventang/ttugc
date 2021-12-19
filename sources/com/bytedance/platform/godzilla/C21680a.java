package com.bytedance.platform.godzilla;

import android.app.Application;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1574a.AbstractC21687e;
import com.bytedance.platform.godzilla.p1574a.AbstractC21688f;
import com.bytedance.platform.godzilla.p1574a.C21689g;
import com.bytedance.platform.godzilla.p1585c.AbstractC21717a;
import com.bytedance.platform.godzilla.p1585c.AbstractC21718b;
import com.bytedance.platform.godzilla.p1585c.EnumC21720d;
import com.bytedance.platform.godzilla.p1586d.C21724c;
import java.util.HashMap;

/* renamed from: com.bytedance.platform.godzilla.a */
public final class C21680a {

    /* renamed from: a */
    public static volatile C21680a f51447a;

    /* renamed from: b */
    private final Application f51448b;

    /* renamed from: c */
    private final HashMap<String, AbstractC21717a> f51449c;

    static {
        Covode.recordClassIndex(25321);
    }

    /* renamed from: com.bytedance.platform.godzilla.a$a */
    public static class C21681a {

        /* renamed from: a */
        public C21689g.EnumC21691a f51450a;

        /* renamed from: b */
        private final Application f51451b;

        /* renamed from: c */
        private final HashMap<String, AbstractC21717a> f51452c = new HashMap<>();

        /* renamed from: d */
        private AbstractC21687e f51453d;

        /* renamed from: e */
        private AbstractC21688f f51454e;

        static {
            Covode.recordClassIndex(25322);
        }

        /* renamed from: a */
        public final C21680a mo35338a() {
            return new C21680a(this.f51451b, this.f51452c, this.f51453d, this.f51450a, this.f51454e, (byte) 0);
        }

        public C21681a(Application application) {
            if (application != null) {
                this.f51451b = application;
                return;
            }
            throw new RuntimeException("Godzilla init, application is null");
        }

        /* renamed from: a */
        public final C21681a mo35337a(AbstractC21717a aVar) {
            String b = aVar.mo35351b();
            if (TextUtils.isEmpty(b)) {
                throw new RuntimeException(C1764a.m5928a("%s plugin name is null", new Object[]{aVar.getClass().getName()}));
            } else if (this.f51452c.get(b) == null) {
                this.f51452c.put(b, aVar);
                return this;
            } else {
                throw new RuntimeException(C1764a.m5928a("%s plugin is already exist", new Object[]{b}));
            }
        }
    }

    /* renamed from: a */
    public static C21680a m40621a(C21680a aVar) {
        MethodCollector.m26663i(5614);
        if (aVar != null) {
            synchronized (C21680a.class) {
                try {
                    if (f51447a == null) {
                        f51447a = aVar;
                    } else {
                        C21689g.m40635a(C21689g.EnumC21691a.ERROR);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5614);
                    throw th;
                }
            }
            C21680a aVar2 = f51447a;
            MethodCollector.m26664o(5614);
            return aVar2;
        }
        RuntimeException runtimeException = new RuntimeException("Godzilla should not be null.");
        MethodCollector.m26664o(5614);
        throw runtimeException;
    }

    /* renamed from: a */
    public final void mo35336a(EnumC21720d dVar) {
        for (AbstractC21717a aVar : this.f51449c.values()) {
            if (aVar instanceof AbstractC21718b) {
                for (AbstractC21717a aVar2 : ((AbstractC21718b) aVar).f51488b) {
                    if (aVar2.mo35374d() == dVar) {
                        aVar2.mo35350a();
                    }
                }
            } else if (aVar.mo35374d() == dVar) {
                aVar.mo35350a();
            }
        }
    }

    private C21680a(Application application, HashMap<String, AbstractC21717a> hashMap, AbstractC21687e eVar, C21689g.EnumC21691a aVar, AbstractC21688f fVar) {
        this.f51448b = application;
        this.f51449c = hashMap;
        EnumC21693b.INSTANCE.init(application, eVar, aVar);
        for (AbstractC21717a aVar2 : hashMap.values()) {
            aVar2.mo35359a(this.f51448b);
        }
        C21724c.f51495a = fVar;
    }

    /* synthetic */ C21680a(Application application, HashMap hashMap, AbstractC21687e eVar, C21689g.EnumC21691a aVar, AbstractC21688f fVar, byte b) {
        this(application, hashMap, eVar, aVar, fVar);
    }
}
