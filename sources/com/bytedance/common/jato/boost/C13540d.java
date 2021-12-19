package com.bytedance.common.jato.boost;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import com.bytedance.common.jato.p904c.C13555a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.common.jato.boost.d */
public final class C13540d implements AbstractC13542e {

    /* renamed from: a */
    public static Class f32946a;

    /* renamed from: b */
    public static Method f32947b;

    /* renamed from: c */
    public static Object f32948c;

    /* renamed from: d */
    public static volatile boolean f32949d;

    static {
        Covode.recordClassIndex(15553);
    }

    /* renamed from: a */
    private static Object m24321a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_common_jato_boost_HisiCpuBoost_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_common_jato_boost_HisiCpuBoost_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // com.bytedance.common.jato.boost.AbstractC13542e
    /* renamed from: a */
    public final void mo21810a() {
    }

    @Override // com.bytedance.common.jato.boost.AbstractC13542e
    /* renamed from: b */
    public final boolean mo21813b(long j) {
        return false;
    }

    @Override // com.bytedance.common.jato.boost.AbstractC13542e
    /* renamed from: a */
    public final void mo21811a(Context context) {
        C13538b.f32938b.execute(new Runnable() {
            /* class com.bytedance.common.jato.boost.C13540d.RunnableC135411 */

            static {
                Covode.recordClassIndex(15554);
            }

            /* renamed from: a */
            private static Object m24326a(Method method, Object obj, Object[] objArr) {
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_common_jato_boost_HisiCpuBoost$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    return a.second;
                }
                Object invoke = method.invoke(obj, objArr);
                C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_common_jato_boost_HisiCpuBoost$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                return invoke;
            }

            public final void run() {
                boolean z;
                boolean z2;
                boolean z3;
                MethodCollector.m26663i(1273);
                synchronized (C13538b.class) {
                    try {
                        if (!C13540d.f32949d) {
                            try {
                                if (Build.VERSION.SDK_INT == 29) {
                                    Class<?> a = C13555a.m24352a("android.scrollerboostmanager.ScrollerBoostManager");
                                    C13540d.f32948c = m24326a(C13555a.m24355a(a, "getInstance", (Class<?>[]) null), a, null);
                                    C13540d.f32947b = C13555a.m24355a(a, "listFling", Integer.TYPE);
                                    a.getDeclaredMethod("init", null).invoke(C13540d.f32948c, null);
                                    C13540d.f32949d = true;
                                } else {
                                    if (Build.VERSION.SDK_INT == 28) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (Build.VERSION.SDK_INT == 27) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    boolean z4 = z | z2;
                                    if (Build.VERSION.SDK_INT == 26) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z4 || z3) {
                                        Class<?> a2 = C13555a.m24352a("android.iawareperf.UniPerf");
                                        C13540d.f32946a = a2;
                                        C13540d.f32947b = C13555a.m24355a(a2, "uniPerfEvent", Integer.TYPE, String.class, int[].class);
                                        C13540d.f32948c = m24326a(C13555a.m24355a(C13540d.f32946a, "getInstance", new Class[0]), null, new Object[0]);
                                        C13540d.f32949d = true;
                                    }
                                }
                            } catch (Throwable th) {
                                C13538b.m24317a("cpuboost init fail", th);
                            }
                            MethodCollector.m26664o(1273);
                        }
                    } finally {
                        MethodCollector.m26664o(1273);
                    }
                }
            }
        });
    }

    @Override // com.bytedance.common.jato.boost.AbstractC13542e
    /* renamed from: a */
    public final boolean mo21812a(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        if (j <= 0 || !f32949d) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT == 29) {
                m24321a(f32947b, f32948c, new Object[]{Integer.valueOf((int) j)});
            } else {
                if (Build.VERSION.SDK_INT == 28) {
                    z = true;
                } else {
                    z = false;
                }
                if (Build.VERSION.SDK_INT == 27) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = z | z2;
                if (Build.VERSION.SDK_INT == 26) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z4 || z3) {
                    ((Integer) m24321a(f32947b, f32948c, new Object[]{4099, "canBoost=true|screenOn=1", new int[0]})).intValue();
                }
            }
            return true;
        } catch (Throwable th) {
            C13538b.m24317a("cpuboost boost fail", th);
            return false;
        }
    }
}
