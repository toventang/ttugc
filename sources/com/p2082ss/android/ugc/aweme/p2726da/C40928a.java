package com.p2082ss.android.ugc.aweme.p2726da;

import android.util.Pair;
import android.view.Choreographer;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.android.ugc.aweme.experiment.C46805cu;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.da.a */
public final class C40928a {

    /* renamed from: a */
    public static final C40928a f95750a = new C40928a();

    /* renamed from: b */
    private static int f95751b = 4;

    /* renamed from: c */
    private static Choreographer f95752c;

    /* renamed from: d */
    private static Method f95753d;

    /* renamed from: e */
    private static final Runnable f95754e = RunnableC40929a.f95759a;

    /* renamed from: f */
    private static Field f95755f;

    /* renamed from: g */
    private static Method f95756g;

    /* renamed from: h */
    private static Method f95757h;

    /* renamed from: i */
    private static boolean f95758i;

    /* renamed from: com.ss.android.ugc.aweme.da.a$a */
    static final class RunnableC40929a implements Runnable {

        /* renamed from: a */
        public static final RunnableC40929a f95759a = new RunnableC40929a();

        static {
            Covode.recordClassIndex(48781);
        }

        RunnableC40929a() {
        }

        public final void run() {
        }
    }

    /* renamed from: a */
    private static Object m82417a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_ui_ChoreographerOptService_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_ui_ChoreographerOptService_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    private C40928a() {
    }

    static {
        Covode.recordClassIndex(48780);
    }

    /* renamed from: b */
    public static boolean m82419b() {
        Field field;
        Choreographer choreographer = f95752c;
        if (choreographer == null || (field = f95755f) == null) {
            return false;
        }
        try {
            Object obj = field.get(choreographer);
            if (obj != null) {
                return ((Boolean) obj).booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static void m82420c() {
        if (C46805cu.f109046c) {
            Field d = m82421d();
            if (d == null) {
                d = m82422e();
            }
            f95755f = d;
        }
    }

    /* renamed from: d */
    private static Field m82421d() {
        try {
            Field field = Choreographer.class.getField("mCallbacksRunning");
            C89219l.m154716b(field, "");
            field.setAccessible(true);
            return field;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static Method m82423f() {
        try {
            Method declaredMethod = Class.forName("android.view.Choreographer").getDeclaredMethod("postCallbackDelayed", Integer.TYPE, Runnable.class, Object.class, Long.TYPE);
            C89219l.m154716b(declaredMethod, "");
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Field m82422e() {
        try {
            if (f95756g == null) {
                f95756g = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            }
            Method method = f95756g;
            if (method == null) {
                return null;
            }
            Object a = m82417a(method, Choreographer.class, new Object[]{"mCallbacksRunning"});
            if (a != null) {
                Field field = (Field) a;
                if (f95757h == null) {
                    f95757h = AccessibleObject.class.getDeclaredMethod("setAccessible", Boolean.TYPE);
                }
                Method method2 = f95757h;
                if (method2 == null) {
                    return null;
                }
                m82417a(method2, field, new Object[]{true});
                return field;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.Field");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo70123a() {
        if (!f95758i) {
            f95758i = true;
            f95752c = Choreographer.getInstance();
            f95753d = m82423f();
            while (true) {
                if (f95751b < 0) {
                    break;
                }
                try {
                    Method method = f95753d;
                    if (method == null) {
                        C89219l.m154715b();
                    }
                    m82417a(method, f95752c, new Object[]{Integer.valueOf(f95751b), f95754e, null, 0});
                } catch (Exception unused) {
                    int i = f95751b;
                    if (i == 0) {
                        f95753d = null;
                    }
                    f95751b = i - 1;
                }
            }
            m82420c();
        }
    }

    /* renamed from: a */
    public static boolean m82418a(Runnable runnable) {
        Method method;
        C89219l.m154721d(runnable, "");
        boolean z = false;
        if (!f95758i || (method = f95753d) == null) {
            return false;
        }
        try {
            m82417a(method, f95752c, new Object[]{Integer.valueOf(f95751b), runnable, null, 0});
            z = true;
            return true;
        } catch (Throwable unused) {
            return z;
        }
    }
}
