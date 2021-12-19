package com.bytedance.common.jato.boost;

import android.content.Context;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.common.jato.p904c.C13555a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.common.jato.boost.i */
public final class C13552i implements AbstractC13542e {

    /* renamed from: a */
    public static Object f32971a;

    /* renamed from: b */
    public static Method f32972b;

    /* renamed from: c */
    public static Method f32973c;

    /* renamed from: d */
    public static volatile boolean f32974d;

    /* renamed from: e */
    private static int[] f32975e = {1082146816, 4095, 1082147072, 4095, 1082130432, 4095, 1082130688, 4095, 1077936128, 1};

    /* renamed from: f */
    private static int[] f32976f = {1115701248, 1, 1115734016, LiveNetAdaptiveHurryTimeSetting.DEFAULT};

    /* renamed from: g */
    private static int[] f32977g = {1077936128, 1};

    /* renamed from: h */
    private static int[] f32978h = {1119944704, 1};

    /* renamed from: i */
    private static CopyOnWriteArrayList<Integer> f32979i = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    private static Object m24344a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_common_jato_boost_QcmCpuBoost_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_common_jato_boost_QcmCpuBoost_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(15565);
    }

    @Override // com.bytedance.common.jato.boost.AbstractC13542e
    /* renamed from: a */
    public final void mo21810a() {
        if (!(f32973c == null || !f32974d || f32971a == null)) {
            for (int i = 0; i < f32979i.size(); i++) {
                try {
                    m24344a(f32973c, f32971a, new Object[]{f32979i.get(i)});
                } catch (Throwable th) {
                    C13538b.m24317a("cpuboost release fail", th);
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.common.jato.boost.AbstractC13542e
    /* renamed from: b */
    public final boolean mo21813b(long j) {
        return m24345a(j, f32976f);
    }

    @Override // com.bytedance.common.jato.boost.AbstractC13542e
    /* renamed from: a */
    public final void mo21811a(final Context context) {
        C13538b.f32938b.execute(new Runnable() {
            /* class com.bytedance.common.jato.boost.C13552i.RunnableC135531 */

            static {
                Covode.recordClassIndex(15566);
            }

            public final void run() {
                MethodCollector.m26663i(1188);
                synchronized (C13538b.class) {
                    try {
                        if (!C13552i.f32974d) {
                            if (C13552i.f32971a == null || C13552i.f32972b == null) {
                                try {
                                    Class<?> a = C13555a.m24352a("android.util.BoostFramework");
                                    try {
                                        C13552i.f32971a = C13555a.m24354a(a, Context.class).newInstance(context);
                                    } catch (Throwable unused) {
                                        C13552i.f32971a = C13555a.m24354a(a, new Class[0]).newInstance(new Object[0]);
                                    }
                                    C13552i.f32972b = C13555a.m24355a(a, "perfLockAcquire", Integer.TYPE, int[].class);
                                    C13552i.f32974d = true;
                                    C13552i.f32973c = C13555a.m24355a(a, "perfLockReleaseHandler", Integer.TYPE);
                                } catch (Throwable th) {
                                    C13538b.m24317a("cpuboost init fail", th);
                                }
                                MethodCollector.m26664o(1188);
                                return;
                            }
                            MethodCollector.m26664o(1188);
                        }
                    } finally {
                        MethodCollector.m26664o(1188);
                    }
                }
            }
        });
    }

    @Override // com.bytedance.common.jato.boost.AbstractC13542e
    /* renamed from: a */
    public final boolean mo21812a(long j) {
        m24345a(j, f32977g);
        return m24345a(j, f32975e);
    }

    /* renamed from: a */
    private static boolean m24345a(long j, int[] iArr) {
        if (j <= 0 || !f32974d) {
            return false;
        }
        try {
            if (!(f32971a == null || f32972b == null)) {
                int intValue = ((Integer) m24344a(f32972b, f32971a, new Object[]{Integer.valueOf((int) j), iArr})).intValue();
                if (intValue != 0) {
                    f32979i.add(Integer.valueOf(intValue));
                }
            }
            return true;
        } catch (Throwable th) {
            C13538b.m24317a("cpuboost boost fail", th);
            return false;
        }
    }
}
