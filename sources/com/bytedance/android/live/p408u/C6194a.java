package com.bytedance.android.live.p408u;

import android.util.Pair;
import android.view.Choreographer;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: com.bytedance.android.live.u.a */
public final class C6194a {

    /* renamed from: a */
    Method f15433a;

    /* renamed from: b */
    Method f15434b;

    /* renamed from: c */
    Field f15435c;

    /* renamed from: d */
    private Method f15436d;

    /* renamed from: e */
    private Method f15437e;

    /* renamed from: f */
    private Method f15438f;

    /* renamed from: g */
    private Method f15439g;

    /* renamed from: h */
    private Field f15440h;

    static {
        Covode.recordClassIndex(6900);
    }

    /* renamed from: a */
    private static Object m13437a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_live_watchdog_DoubleReflectHelper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_android_live_watchdog_DoubleReflectHelper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: c */
    private Method m13440c() {
        try {
            if (this.f15437e == null) {
                this.f15437e = Class.class.getDeclaredMethod("getDeclaredMethods", new Class[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.f15437e;
    }

    /* renamed from: d */
    private Method m13441d() {
        try {
            if (this.f15438f == null) {
                this.f15438f = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.f15438f;
    }

    /* renamed from: e */
    private Method m13442e() {
        try {
            if (this.f15439g == null) {
                this.f15439g = Class.class.getDeclaredMethod("getDeclaredFields", new Class[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.f15439g;
    }

    /* renamed from: b */
    private Method m13439b() {
        try {
            if (this.f15436d == null) {
                this.f15436d = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.f15436d;
    }

    /* renamed from: a */
    public final Field mo12102a() {
        if (this.f15440h == null) {
            try {
                this.f15440h = mo12103a(Reflect.m24529on(Choreographer.getInstance()).field("mDisplayEventReceiver", new Class[0]).get().getClass(), "mHavePendingVsync", Boolean.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.f15440h;
    }

    /* renamed from: a */
    private static <T extends AccessibleObject> T m13438a(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e A[SYNTHETIC, Splitter:B:14:0x002e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Field mo12103a(java.lang.Class<?> r8, java.lang.String r9, java.lang.Class<?> r10) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.p408u.C6194a.mo12103a(java.lang.Class, java.lang.String, java.lang.Class):java.lang.reflect.Field");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[SYNTHETIC, Splitter:B:14:0x0031] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method mo12104a(java.lang.Class<?> r8, java.lang.String r9, java.lang.Class<?>... r10) {
        /*
            r7 = this;
            java.lang.reflect.Method r2 = r7.m13439b()
            r6 = 0
            if (r2 != 0) goto L_0x0008
            return r6
        L_0x0008:
            r1 = r8
        L_0x0009:
            r0 = 2
            r5 = 1
            r4 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x001f }
            r0[r4] = r9     // Catch:{ Exception -> 0x001f }
            r0[r5] = r10     // Catch:{ Exception -> 0x001f }
            java.lang.Object r0 = m13437a(r2, r1, r0)     // Catch:{ Exception -> 0x001f }
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch:{ Exception -> 0x001f }
            java.lang.reflect.AccessibleObject r0 = m13438a(r0)     // Catch:{ Exception -> 0x001f }
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch:{ Exception -> 0x001f }
            goto L_0x0030
        L_0x001f:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.Class r1 = r1.getSuperclass()
            if (r1 != 0) goto L_0x0009
            java.lang.reflect.Method r1 = r7.m13440c()
            if (r1 != 0) goto L_0x0031
            return r6
        L_0x0030:
            return r0
        L_0x0031:
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x005c }
            java.lang.Object r3 = m13437a(r1, r8, r0)     // Catch:{ Exception -> 0x005c }
            java.lang.reflect.Method[] r3 = (java.lang.reflect.Method[]) r3     // Catch:{ Exception -> 0x005c }
            int r2 = r3.length     // Catch:{ Exception -> 0x005c }
        L_0x003a:
            if (r4 >= r2) goto L_0x0060
            r1 = r3[r4]     // Catch:{ Exception -> 0x005c }
            java.lang.String r0 = r1.getName()     // Catch:{ Exception -> 0x005c }
            boolean r0 = r0.equals(r9)     // Catch:{ Exception -> 0x005c }
            if (r0 == 0) goto L_0x0058
            java.lang.Class[] r0 = r1.getParameterTypes()     // Catch:{ Exception -> 0x005c }
            if (r0 == 0) goto L_0x0058
            int r0 = r0.length     // Catch:{ Exception -> 0x005c }
            if (r0 != r5) goto L_0x0058
            java.lang.reflect.AccessibleObject r0 = m13438a(r1)     // Catch:{ Exception -> 0x005c }
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch:{ Exception -> 0x005c }
            goto L_0x005b
        L_0x0058:
            int r4 = r4 + 1
            goto L_0x003a
        L_0x005b:
            return r0
        L_0x005c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0060:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.p408u.C6194a.mo12104a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }
}
