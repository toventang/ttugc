package com.bytedance.helios.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.api.config.AbstractC15331b;
import com.bytedance.helios.api.config.C15330a;
import com.bytedance.helios.api.config.RuleInfo;
import java.util.Map;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.a */
public abstract class AbstractC15295a {
    public static final C15296a Companion = new C15296a((byte) 0);
    public static AbstractC15295a INSTANCE;

    static {
        Covode.recordClassIndex(17525);
    }

    public static final AbstractC15295a get() {
        return C15296a.m28204a();
    }

    public abstract void init(AbstractC15331b bVar, C15330a aVar);

    public abstract boolean isEnabled();

    public abstract void recordRegionEvent(Map<String, Object> map);

    public abstract void ruleChangeNotify(RuleInfo ruleInfo);

    public abstract void ruleChangeNotify(String str, boolean z);

    /* renamed from: com.bytedance.helios.api.a$a */
    public static final class C15296a {
        static {
            Covode.recordClassIndex(17526);
        }

        private C15296a() {
        }

        /* renamed from: a */
        public static AbstractC15295a m28204a() {
            AbstractC15295a aVar;
            MethodCollector.m26663i(4610);
            if (AbstractC15295a.INSTANCE == null) {
                synchronized (AbstractC15295a.class) {
                    try {
                        if (AbstractC15295a.INSTANCE != null) {
                            AbstractC15295a aVar2 = AbstractC15295a.INSTANCE;
                            if (aVar2 == null) {
                                C89219l.m154707a();
                            }
                            return aVar2;
                        }
                        try {
                            Class<?> cls = Class.forName("com.bytedance.helios.sdk.HeliosEnvImpl");
                            Object obj = cls.getField("INSTANCE").get(cls);
                            if (obj != null) {
                                aVar = (AbstractC15295a) obj;
                                AbstractC15295a.INSTANCE = aVar;
                            } else {
                                C89388w wVar = new C89388w("null cannot be cast to non-null type");
                                MethodCollector.m26664o(4610);
                                throw wVar;
                            }
                        } catch (Throwable unused) {
                            aVar = new C15301b();
                        }
                    } finally {
                        MethodCollector.m26664o(4610);
                    }
                }
            }
            AbstractC15295a aVar3 = AbstractC15295a.INSTANCE;
            if (aVar3 == null) {
                C89219l.m154707a();
            }
            MethodCollector.m26664o(4610);
            return aVar3;
        }

        public /* synthetic */ C15296a(byte b) {
            this();
        }
    }
}
