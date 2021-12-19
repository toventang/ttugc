package com.bytedance.helios.api.p1087a;

import android.app.Activity;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Constructor;
import java.util.Map;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.a.b */
public class C15298b {
    public static final C15299a Companion = new C15299a((byte) 0);
    public static C15298b INSTANCE;
    public final Map<String, AbstractC15300c> mCheckerMap = new C0484a();

    static {
        Covode.recordClassIndex(17528);
    }

    /* renamed from: com_bytedance_helios_api_anchor_AnchorManager_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m28207xeb146256(String str, String str2) {
        return 0;
    }

    public static final C15298b get() {
        return C15299a.m28208a();
    }

    public String getAnchorTaskName() {
        return "";
    }

    public void startCheck(Activity activity, int i) {
    }

    public void stopCheck(Activity activity) {
    }

    /* renamed from: com.bytedance.helios.api.a.b$a */
    public static final class C15299a {
        static {
            Covode.recordClassIndex(17529);
        }

        private C15299a() {
        }

        /* renamed from: a */
        public static C15298b m28208a() {
            C15298b bVar;
            MethodCollector.m26663i(4568);
            if (C15298b.INSTANCE == null) {
                synchronized (C15298b.class) {
                    try {
                        if (C15298b.INSTANCE == null) {
                            try {
                                Constructor<?> declaredConstructor = Class.forName("com.bytedance.helios.sdk.anchor.AnchorManagerImpl").getDeclaredConstructor(new Class[0]);
                                C89219l.m154709a((Object) declaredConstructor, "");
                                declaredConstructor.setAccessible(true);
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                if (newInstance != null) {
                                    bVar = (C15298b) newInstance;
                                    C15298b.INSTANCE = bVar;
                                } else {
                                    C89388w wVar = new C89388w("null cannot be cast to non-null type");
                                    MethodCollector.m26664o(4568);
                                    throw wVar;
                                }
                            } catch (Exception unused) {
                                bVar = new C15298b();
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(4568);
                        throw th;
                    }
                }
            }
            C15298b bVar2 = C15298b.INSTANCE;
            if (bVar2 == null) {
                C89219l.m154707a();
            }
            MethodCollector.m26664o(4568);
            return bVar2;
        }

        public /* synthetic */ C15299a(byte b) {
            this();
        }
    }

    public final void removeResourceChecker(String str) {
        MethodCollector.m26663i(3738);
        C89219l.m154719c(str, "");
        m28207xeb146256("AnchorManager", "removeResourceChecker: ".concat(String.valueOf(str)));
        synchronized (this) {
            try {
                this.mCheckerMap.remove(str);
            } finally {
                MethodCollector.m26664o(3738);
            }
        }
    }

    public final void addResourceChecker(String str, AbstractC15300c cVar) {
        MethodCollector.m26663i(3676);
        C89219l.m154719c(str, "");
        C89219l.m154719c(cVar, "");
        m28207xeb146256("AnchorManager", "addResourceChecker: " + str + '/' + cVar);
        synchronized (this) {
            try {
                this.mCheckerMap.put(str, cVar);
            } finally {
                MethodCollector.m26664o(3676);
            }
        }
    }
}
