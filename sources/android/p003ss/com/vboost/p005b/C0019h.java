package android.p003ss.com.vboost.p005b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: android.ss.com.vboost.b.h */
class C0019h {

    /* renamed from: a */
    static boolean f71a;

    /* renamed from: b */
    private static Class<?> f72b;

    /* renamed from: c */
    private static Method f73c;

    /* renamed from: d */
    private static Method f74d;

    /* renamed from: e */
    private Object f75e;

    static {
        Covode.recordClassIndex(22);
    }

    /* renamed from: a */
    private static Object m46a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "android_ss_com_vboost_hardware_QcomBoostFramework_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "android_ss_com_vboost_hardware_QcomBoostFramework_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo21a() {
        try {
            Method method = f74d;
            if (method != null) {
                return ((Integer) m46a(method, this.f75e, new Object[0])).intValue();
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r6.f75e = android.p003ss.com.vboost.p008e.C0061b.m100a(android.p003ss.com.vboost.p005b.C0019h.f72b, new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0019h(android.content.Context r7) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: android.p003ss.com.vboost.p005b.C0019h.<init>(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo22a(int i, int... iArr) {
        try {
            Method method = f73c;
            if (method == null) {
                return -1;
            }
            int intValue = ((Integer) m46a(method, this.f75e, new Object[]{Integer.valueOf(i), iArr})).intValue();
            Arrays.toString(iArr);
            return intValue;
        } catch (Exception unused) {
            return -1;
        }
    }
}
