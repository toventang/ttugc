package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Method;

/* renamed from: org.greenrobot.eventbus.g */
public final class RunnableC90250g extends C90266t implements Runnable {

    /* renamed from: a */
    final Class<?> f205015a;

    /* renamed from: b */
    final String f205016b;

    /* renamed from: i */
    private final Object f205017i = new Object();

    /* renamed from: j */
    private volatile Method f205018j;

    static {
        Covode.recordClassIndex(106521);
    }

    public final void run() {
        mo145413b();
        EventBus.m156973c((Class<?>) this.f205039e);
    }

    @Override // org.greenrobot.eventbus.C90266t
    public final int hashCode() {
        return this.f205015a.getName().hashCode() ^ this.f205016b.hashCode();
    }

    /* access modifiers changed from: protected */
    @Override // org.greenrobot.eventbus.C90266t
    /* renamed from: a */
    public final synchronized void mo145412a() {
        MethodCollector.m26663i(13498);
        if (this.f205042h == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f205015a.getName());
            sb.append('#').append(this.f205016b);
            sb.append('(').append(this.f205039e.getName());
            this.f205042h = sb.toString();
        }
        MethodCollector.m26664o(13498);
    }

    @Override // org.greenrobot.eventbus.C90266t
    /* renamed from: b */
    public final Method mo145413b() {
        MethodCollector.m26663i(13559);
        Method method = this.f205037c;
        if (method == null) {
            Method method2 = this.f205018j;
            if (method2 != null) {
                this.f205037c = method2;
                MethodCollector.m26664o(13559);
                return method2;
            }
            synchronized (this.f205017i) {
                try {
                    Method method3 = this.f205018j;
                    if (method3 != null) {
                        this.f205037c = method3;
                        return method3;
                    }
                    try {
                        this.f205018j = this.f205015a.getDeclaredMethod(this.f205016b, this.f205039e);
                        method = this.f205018j;
                        this.f205037c = method;
                    } catch (NoSuchMethodException e) {
                        C90247d dVar = new C90247d("Could not find subscriber method in " + this.f205015a + ". Maybe a missing ProGuard rule?", e);
                        MethodCollector.m26664o(13559);
                        throw dVar;
                    }
                } finally {
                    MethodCollector.m26664o(13559);
                }
            }
        }
        MethodCollector.m26664o(13559);
        return method;
    }

    public RunnableC90250g(Class<?> cls, String str, Class<?> cls2, ThreadMode threadMode, int i, boolean z) {
        super(null, cls2, threadMode, i, z);
        this.f205015a = cls;
        this.f205016b = str;
    }
}
