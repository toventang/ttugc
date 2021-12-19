package com.bytedance.common.jato.boost;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.common.jato.boost.f */
public final class C13543f implements AbstractC13542e {

    /* renamed from: a */
    public static boolean f32951a;

    /* renamed from: b */
    public static Object f32952b;

    /* renamed from: c */
    public static Method f32953c;

    /* renamed from: d */
    public static Method f32954d;

    /* renamed from: e */
    public static Method f32955e;

    /* renamed from: f */
    public static Method f32956f;

    static {
        Covode.recordClassIndex(15556);
    }

    /* renamed from: a */
    private static Object m24331a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_common_jato_boost_MtkCpuBoost_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_common_jato_boost_MtkCpuBoost_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // com.bytedance.common.jato.boost.AbstractC13542e
    /* renamed from: a */
    public final void mo21810a() {
        try {
            m24331a(f32956f, f32952b, new Object[0]);
        } catch (Throwable th) {
            C13538b.m24317a("cpuboost release fail", th);
        }
    }

    @Override // com.bytedance.common.jato.boost.AbstractC13542e
    /* renamed from: b */
    public final boolean mo21813b(long j) {
        return m24332a(j, 8);
    }

    @Override // com.bytedance.common.jato.boost.AbstractC13542e
    /* renamed from: a */
    public final void mo21811a(final Context context) {
        C13538b.f32938b.execute(new Runnable() {
            /* class com.bytedance.common.jato.boost.C13543f.RunnableC135441 */

            static {
                Covode.recordClassIndex(15557);
            }

            public final void run() {
                try {
                    Class<?> cls = Class.forName("com.mediatek.perfservice.PerfServiceWrapper");
                    try {
                        C13543f.f32952b = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Throwable unused) {
                        C13543f.f32952b = cls.getConstructor(Context.class).newInstance(context);
                    }
                    C13543f.f32953c = cls.getDeclaredMethod("userRegScn", new Class[0]);
                    C13543f.f32954d = cls.getDeclaredMethod("userRegScnConfig", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                    C13543f.f32955e = cls.getDeclaredMethod("userEnable", Integer.TYPE);
                    C13543f.f32956f = cls.getDeclaredMethod("userResetAll", new Class[0]);
                    C13543f.f32951a = true;
                } catch (Throwable th) {
                    C13538b.m24317a("cpuboost init fail", th);
                }
            }
        });
    }

    @Override // com.bytedance.common.jato.boost.AbstractC13542e
    /* renamed from: a */
    public final boolean mo21812a(long j) {
        if (m24332a(j, 23) || m24332a(j, 4)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m24332a(long j, int i) {
        boolean z = false;
        if (j <= 0 || !f32951a) {
            return false;
        }
        try {
            int intValue = ((Integer) m24331a(f32953c, f32952b, new Object[0])).intValue();
            m24331a(f32954d, f32952b, new Object[]{Integer.valueOf(intValue), Integer.valueOf(i), 1000, 0, 0, 0});
            m24331a(f32955e, f32952b, new Object[]{Integer.valueOf(intValue)});
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                /* class com.bytedance.common.jato.boost.C13543f.RunnableC135452 */

                static {
                    Covode.recordClassIndex(15558);
                }

                public final void run() {
                    try {
                        Method method = C13543f.f32956f;
                        Object obj = C13543f.f32952b;
                        Object[] objArr = new Object[0];
                        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_common_jato_boost_MtkCpuBoost$2_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                        if (((Boolean) a.first).booleanValue()) {
                            Object obj2 = a.second;
                            return;
                        }
                        C15346a.m28242a(method.invoke(obj, objArr), method, new Object[]{obj, objArr}, "com_bytedance_common_jato_boost_MtkCpuBoost$2_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    } catch (Throwable th) {
                        C13538b.m24317a("cpuboost boost fail", th);
                    }
                }
            }, j);
            z = true;
            return true;
        } catch (Throwable th) {
            C13538b.m24317a("cpuboost boost fail", th);
            return z;
        }
    }
}
