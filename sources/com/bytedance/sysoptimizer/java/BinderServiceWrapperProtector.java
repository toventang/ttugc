package com.bytedance.sysoptimizer.java;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

public final class BinderServiceWrapperProtector {
    public static final AdminResult VOID_ADMIN_RESULT = new VoidAdminResult();
    public static boolean sDebug;

    public interface AdminResult {
        static {
            Covode.recordClassIndex(26600);
        }

        Object getDefaultResult(Object obj, Method method, Object[] objArr);
    }

    /* renamed from: com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m42857xef62ea46(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42858xef62ea47(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(26598);
    }

    public static void setDebug(boolean z) {
        sDebug = z;
    }

    /* renamed from: com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m42856x32bd4c6a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7685);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(7685);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static final class VoidAdminResult implements AdminResult {
        static {
            Covode.recordClassIndex(26601);
        }

        @Override // com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector.AdminResult
        public final Object getDefaultResult(Object obj, Method method, Object[] objArr) {
            return 1;
        }
    }

    private static void setProxy(Object obj, Object obj2, Field field, String str) {
        try {
            field.set(obj2, obj);
        } catch (Throwable th) {
            m42858xef62ea47(str, "setProxy error: " + Log.getStackTraceString(th));
        }
    }

    public static boolean install(Context context, String str, final List<String> list, final String str2, final AdminResult adminResult) {
        try {
            Object com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService = m42856x32bd4c6a(context, str);
            if (com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService == null) {
                return false;
            }
            Field declaredField = com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService.getClass().getDeclaredField("mService");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService);
            if (obj == null) {
                return false;
            }
            m42857xef62ea46(str2, "before ".concat(String.valueOf(obj)));
            setProxy(Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
                /* class com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector.C227201 */

                static {
                    Covode.recordClassIndex(26599);
                }

                /* renamed from: com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector$1_com_ss_android_ugc_aweme_lancet_LogLancet_d */
                public static int m42859x6a726ad3(String str, String str2) {
                    return 0;
                }

                /* renamed from: com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector$1_com_ss_android_ugc_aweme_lancet_LogLancet_e */
                public static int m42860x6a726ad4(String str, String str2) {
                    return 0;
                }

                /* renamed from: com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector$1_java_lang_reflect_Method_invoke */
                private static Object m42861xfe860ca0(Method method, Object obj, Object[] objArr) {
                    Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a.first).booleanValue()) {
                        return a.second;
                    }
                    Object invoke = method.invoke(obj, objArr);
                    C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    return invoke;
                }

                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) {
                    String name = method.getName();
                    if (list.contains(name)) {
                        try {
                            if (BinderServiceWrapperProtector.sDebug) {
                                m42859x6a726ad3(str2, "protect ".concat(String.valueOf(name)));
                            }
                            return m42861xfe860ca0(method, obj, objArr);
                        } catch (Throwable th) {
                            m42860x6a726ad4(str2, "get result failed: " + Log.getStackTraceString(th));
                            AdminResult adminResult = adminResult;
                            if (adminResult != null) {
                                return adminResult.getDefaultResult(obj, method, objArr);
                            }
                        }
                    }
                    return m42861xfe860ca0(method, obj, objArr);
                }
            }), com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService, declaredField, str2);
            m42857xef62ea46(str2, "install done " + declaredField.get(com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService));
            return true;
        } catch (Throwable th) {
            m42858xef62ea47(str2, "install error: " + Log.getStackTraceString(th));
            return false;
        }
    }
}
