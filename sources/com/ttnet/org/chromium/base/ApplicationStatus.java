package com.ttnet.org.chromium.base;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ApplicationStatus {

    /* renamed from: a */
    public static final Map<Activity, C87426a> f198217a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    public static int f198218b = 0;

    /* renamed from: c */
    public static Activity f198219c;

    /* renamed from: d */
    public static AbstractC87427b f198220d;

    /* renamed from: e */
    public static final C87459h<AbstractC87427b> f198221e = new C87459h<>();

    /* renamed from: f */
    public static final C87459h<Object> f198222f = new C87459h<>();

    /* renamed from: g */
    public static final /* synthetic */ boolean f198223g = true;

    /* renamed from: h */
    private static final C87459h<Object> f198224h = new C87459h<>();

    /* renamed from: com.ttnet.org.chromium.base.ApplicationStatus$b */
    public interface AbstractC87427b {
        static {
            Covode.recordClassIndex(103330);
        }

        /* renamed from: a */
        void mo141480a(int i);
    }

    public static native void nativeOnApplicationStateChange(int i);

    private ApplicationStatus() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ttnet.org.chromium.base.ApplicationStatus$a */
    public static class C87426a {

        /* renamed from: a */
        public int f198226a;

        /* renamed from: b */
        public C87459h<Object> f198227b;

        static {
            Covode.recordClassIndex(103329);
        }

        private C87426a() {
            this.f198226a = 6;
            this.f198227b = new C87459h<>();
        }

        /* synthetic */ C87426a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static boolean m151715a() {
        boolean z;
        MethodCollector.m26663i(5616);
        synchronized (f198217a) {
            try {
                if (f198218b != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.m26664o(5616);
            }
        }
        return z;
    }

    public static int getStateForApplication() {
        int i;
        MethodCollector.m26663i(5751);
        synchronized (f198217a) {
            try {
                i = f198218b;
            } finally {
                MethodCollector.m26664o(5751);
            }
        }
        return i;
    }

    private static void registerThreadSafeNativeApplicationStateListener() {
        RunnableC874243 r1 = new Runnable() {
            /* class com.ttnet.org.chromium.base.ApplicationStatus.RunnableC874243 */

            static {
                Covode.recordClassIndex(103327);
            }

            public final void run() {
                if (ApplicationStatus.f198220d == null) {
                    C874251 r0 = new AbstractC87427b() {
                        /* class com.ttnet.org.chromium.base.ApplicationStatus.RunnableC874243.C874251 */

                        static {
                            Covode.recordClassIndex(103328);
                        }

                        @Override // com.ttnet.org.chromium.base.ApplicationStatus.AbstractC87427b
                        /* renamed from: a */
                        public final void mo141480a(int i) {
                            MethodCollector.m26663i(5356);
                            ApplicationStatus.nativeOnApplicationStateChange(i);
                            MethodCollector.m26664o(5356);
                        }
                    };
                    ApplicationStatus.f198220d = r0;
                    ApplicationStatus.m151714a(r0);
                }
            }
        };
        if (ThreadUtils.m151759b()) {
            r1.run();
        } else {
            ThreadUtils.m151755a().post(r1);
        }
    }

    static {
        Covode.recordClassIndex(103324);
    }

    /* renamed from: b */
    private static int m151716b() {
        boolean z = false;
        boolean z2 = false;
        for (C87426a aVar : f198217a.values()) {
            int i = aVar.f198226a;
            if (i == 4) {
                z = true;
            } else if (i == 5) {
                z2 = true;
            } else if (i != 6) {
                return 1;
            }
        }
        if (z) {
            return 2;
        }
        if (z2) {
            return 3;
        }
        return 4;
    }

    /* renamed from: a */
    public static void m151714a(AbstractC87427b bVar) {
        f198221e.mo141517a(bVar);
    }

    /* renamed from: a */
    public static void m151713a(Activity activity, int i) {
        C87426a aVar;
        MethodCollector.m26663i(5619);
        if (activity != null) {
            if (f198219c == null || i == 1 || i == 3 || i == 2) {
                f198219c = activity;
            }
            int stateForApplication = getStateForApplication();
            Map<Activity, C87426a> map = f198217a;
            synchronized (map) {
                try {
                    if (!map.containsKey(activity)) {
                        map.put(activity, new C87426a((byte) 0));
                    }
                    aVar = map.get(activity);
                    aVar.f198226a = i;
                    if (i == 6) {
                        map.remove(activity);
                        if (activity == f198219c) {
                            f198219c = null;
                        }
                    }
                    f198218b = m151716b();
                } finally {
                    MethodCollector.m26664o(5619);
                }
            }
            Iterator<Object> it = aVar.f198227b.iterator();
            while (it.hasNext()) {
                it.next();
            }
            Iterator<Object> it2 = f198224h.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            int stateForApplication2 = getStateForApplication();
            if (stateForApplication2 != stateForApplication) {
                Iterator<AbstractC87427b> it3 = f198221e.iterator();
                while (it3.hasNext()) {
                    it3.next().mo141480a(stateForApplication2);
                }
            }
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("null activity is not supported");
        MethodCollector.m26664o(5619);
        throw illegalArgumentException;
    }
}
