package com.p2082ss.android.p2203ug.bus;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ug.bus.c */
public final class C30981c {

    /* renamed from: a */
    public static final ConcurrentHashMap<Type, ConcurrentHashMap<AbstractC30984a, Object>> f74262a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static final Object f74263b = new Object();

    /* renamed from: c */
    private static final Handler f74264c = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.ug.bus.c$a */
    public interface AbstractC30984a<T> {
        static {
            Covode.recordClassIndex(37611);
        }

        /* renamed from: a */
        void mo35526a();
    }

    static {
        Covode.recordClassIndex(37608);
    }

    /* renamed from: a */
    public static <Event> void m63697a(final Event event) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            f74264c.post(new Runnable() {
                /* class com.p2082ss.android.p2203ug.bus.C30981c.RunnableC309832 */

                static {
                    Covode.recordClassIndex(37610);
                }

                public final void run() {
                    C30981c.m63697a(event);
                }
            });
            return;
        }
        ConcurrentHashMap<AbstractC30984a, Object> concurrentHashMap = f74262a.get(event.getClass());
        if (concurrentHashMap != null) {
            for (AbstractC30984a aVar : concurrentHashMap.keySet()) {
                if (aVar != null) {
                    aVar.mo35526a();
                }
            }
        }
    }

    /* renamed from: a */
    public static <EVENT> void m63696a(final AbstractC1204m mVar, final AbstractC30984a<EVENT> aVar) {
        if (aVar != null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                f74264c.post(new Runnable() {
                    /* class com.p2082ss.android.p2203ug.bus.C30981c.RunnableC309821 */

                    static {
                        Covode.recordClassIndex(37609);
                    }

                    public final void run() {
                        C30981c.m63696a(mVar, aVar);
                    }
                });
                return;
            }
            Type type = ((ParameterizedType) aVar.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
            ConcurrentHashMap<Type, ConcurrentHashMap<AbstractC30984a, Object>> concurrentHashMap = f74262a;
            ConcurrentHashMap<AbstractC30984a, Object> concurrentHashMap2 = concurrentHashMap.get(type);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap<>();
                concurrentHashMap.put(type, concurrentHashMap2);
            }
            concurrentHashMap2.put(aVar, f74263b);
            if (mVar != null) {
                mVar.getLifecycle().mo4012a(new UgCallbackCenter$2(concurrentHashMap2, aVar, type));
            }
        }
    }
}
