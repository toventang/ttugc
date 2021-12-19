package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.utils.PreventServerSideCrashes */
public class PreventServerSideCrashes implements AbstractC58264w {

    /* renamed from: a */
    public static Activity f179618a;

    /* renamed from: b */
    static Field f179619b;

    /* renamed from: c */
    static Object f179620c;

    /* renamed from: d */
    static Object f179621d;

    /* renamed from: e */
    private static boolean f179622e;

    /* renamed from: f */
    private static CopyOnWriteArrayList<AbstractC80303cl> f179623f = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    private static Object m138964a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_utils_PreventServerSideCrashes_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_utils_PreventServerSideCrashes_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    static {
        Covode.recordClassIndex(93435);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: c */
    public static synchronized void m138966c() {
        Field declaredField;
        synchronized (PreventServerSideCrashes.class) {
            MethodCollector.m26663i(2561);
            if (f179622e) {
                MethodCollector.m26664o(2561);
                return;
            }
            f179622e = true;
            if (!C80343dh.f179873a) {
                try {
                    C80343dh.m139304a((Object) C80344di.class, "target object must not be null");
                    Field a = C80343dh.m139303a(C80344di.class.getClass(), "classLoader");
                    if (a != null) {
                        C80343dh.m139304a(a, "The field must not be null");
                        if (!a.isAccessible()) {
                            a.setAccessible(true);
                        }
                        a.set(C80344di.class, null);
                    }
                } catch (Exception unused) {
                }
                C80343dh.f179873a = true;
            }
            if (Build.VERSION.SDK_INT > 28) {
                MethodCollector.m26664o(2561);
                return;
            }
            try {
                if (Build.VERSION.SDK_INT < 26) {
                    declaredField = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
                } else {
                    declaredField = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
                }
                declaredField.setAccessible(true);
                f179620c = declaredField.get(null);
                Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
                f179619b = declaredField2;
                declaredField2.setAccessible(true);
                Object obj = f179619b.get(f179620c);
                if (obj == null) {
                    MethodCollector.m26664o(2561);
                    return;
                }
                Class<?> cls = Class.forName("android.app.IActivityManager");
                if (cls == null) {
                    MethodCollector.m26664o(2561);
                    return;
                }
                f179621d = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, new C80470ga(obj));
                MethodCollector.m26664o(2561);
            } catch (ClassNotFoundException unused2) {
                MethodCollector.m26664o(2561);
            } catch (NoSuchFieldException unused3) {
                MethodCollector.m26664o(2561);
            } catch (IllegalAccessException unused4) {
                MethodCollector.m26664o(2561);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.PreventServerSideCrashes$a */
    public static class C80176a implements Application.ActivityLifecycleCallbacks {
        static {
            Covode.recordClassIndex(93436);
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        public final void onActivityDestroyed(Activity activity) {
            if (Build.VERSION.SDK_INT <= 28) {
                PreventServerSideCrashes.f179618a = null;
            }
        }

        public final void onActivityPaused(Activity activity) {
            if (Build.VERSION.SDK_INT <= 28) {
                PreventServerSideCrashes.f179618a = null;
            }
        }

        public final void onActivityResumed(Activity activity) {
            if (Build.VERSION.SDK_INT <= 28) {
                PreventServerSideCrashes.f179618a = activity;
                if (!(activity == null || TextUtils.isEmpty("mStartedActivity"))) {
                    for (Class<?> cls = activity.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
                        Field a = C80343dh.m139303a(cls, "mStartedActivity");
                        if (a != null) {
                            try {
                                a.setAccessible(true);
                                a.set(activity, true);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                    }
                }
            }
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT <= 28) {
                C58945a.C58947b.f134185a.mo96425a("method_hook_ams_duration", false);
                PreventServerSideCrashes.f179618a = activity;
                PreventServerSideCrashes.m138966c();
                if (PreventServerSideCrashes.f179619b != null) {
                    try {
                        PreventServerSideCrashes.f179619b.set(PreventServerSideCrashes.f179620c, PreventServerSideCrashes.f179621d);
                        PreventServerSideCrashes.f179619b = null;
                        PreventServerSideCrashes.f179620c = null;
                        PreventServerSideCrashes.f179621d = null;
                    } catch (IllegalAccessException unused) {
                    }
                }
                C58945a.C58947b.f134185a.mo96429b("method_hook_ams_duration", false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (Build.VERSION.SDK_INT <= 28) {
            m138966c();
        }
    }

    /* renamed from: a */
    private static Throwable m138965a(Throwable th) {
        RuntimeException runtimeException;
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (th instanceof InvocationTargetException) {
                InvocationTargetException invocationTargetException = (InvocationTargetException) th;
                if (invocationTargetException.getTargetException() != null) {
                    th = invocationTargetException.getTargetException();
                    stackTrace = th.getStackTrace();
                } else {
                    runtimeException = new RuntimeException();
                    th = runtimeException;
                }
            } else if (th instanceof UndeclaredThrowableException) {
                UndeclaredThrowableException undeclaredThrowableException = (UndeclaredThrowableException) th;
                if (undeclaredThrowableException.getUndeclaredThrowable() != null) {
                    th = undeclaredThrowableException.getUndeclaredThrowable();
                    stackTrace = th.getStackTrace();
                } else {
                    runtimeException = new RuntimeException();
                    th = runtimeException;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (TextUtils.isEmpty(className) || (!className.contains("com.ss.android.ugc.aweme.utils.PreventServerSideCrashes") && !className.equals(Proxy.class.getName()) && !className.equals(Method.class.getName()))) {
                        arrayList.add(stackTraceElement);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return th;
            }
            int size = arrayList.size();
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
            for (int i = 0; i < size; i++) {
                stackTraceElementArr[i] = (StackTraceElement) arrayList.get(i);
            }
            th.setStackTrace(stackTraceElementArr);
            return th;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x005f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.lang.Object m138963a(java.lang.Object r4, java.lang.reflect.Method r5, java.lang.Object[] r6) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.utils.PreventServerSideCrashes.m138963a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
