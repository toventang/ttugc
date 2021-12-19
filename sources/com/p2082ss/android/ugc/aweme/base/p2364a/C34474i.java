package com.p2082ss.android.ugc.aweme.base.p2364a;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.ss.android.ugc.aweme.base.a.i */
public final class C34474i {

    /* renamed from: com.ss.android.ugc.aweme.base.a.i$b */
    public interface AbstractC34476b {
        static {
            Covode.recordClassIndex(41429);
        }
    }

    static {
        Covode.recordClassIndex(41427);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.base.a.i$a */
    public static class C34475a implements InvocationHandler {

        /* renamed from: a */
        private WeakReference<AbstractC34476b> f81462a;

        static {
            Covode.recordClassIndex(41428);
        }

        C34475a(WeakReference<AbstractC34476b> weakReference) {
            this.f81462a = weakReference;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                if (!((Boolean) objArr[0]).booleanValue() || this.f81462a.get() == null) {
                    return null;
                }
                this.f81462a.get();
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    /* renamed from: a */
    public static void m70452a(Activity activity) {
        AbstractC34476b bVar = C34477j.f81463a;
        if (Build.VERSION.SDK_INT < 21) {
            try {
                Class<?>[] declaredClasses = Activity.class.getDeclaredClasses();
                for (Class<?> cls : declaredClasses) {
                    if (cls.getSimpleName().equals("TranslucentConversionListener")) {
                        Method declaredMethod = Activity.class.getDeclaredMethod("convertToTranslucent", cls);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(activity, null);
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        } else {
            try {
                Method declaredMethod2 = Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]);
                declaredMethod2.setAccessible(true);
                Object invoke = declaredMethod2.invoke(activity, new Object[0]);
                Class<?>[] declaredClasses2 = Activity.class.getDeclaredClasses();
                for (Class<?> cls2 : declaredClasses2) {
                    if (cls2.getSimpleName().equals("TranslucentConversionListener")) {
                        Object newProxyInstance = Proxy.newProxyInstance(Activity.class.getClassLoader(), new Class[]{cls2}, new C34475a(new WeakReference(bVar)));
                        Method declaredMethod3 = Activity.class.getDeclaredMethod("convertToTranslucent", cls2, ActivityOptions.class);
                        declaredMethod3.setAccessible(true);
                        declaredMethod3.invoke(activity, newProxyInstance, invoke);
                        return;
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }
}
