package android.p003ss.com.vboost.p005b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;

/* renamed from: android.ss.com.vboost.b.g */
public class C0018g {

    /* renamed from: a */
    static boolean f62a;

    /* renamed from: b */
    private static Class<?> f63b;

    /* renamed from: c */
    private static Method f64c;

    /* renamed from: d */
    private static Method f65d;

    /* renamed from: e */
    private static Method f66e;

    /* renamed from: f */
    private static Method f67f;

    /* renamed from: g */
    private static Method f68g;

    /* renamed from: h */
    private static Method f69h;

    /* renamed from: i */
    private Object f70i;

    static {
        Covode.recordClassIndex(21);
    }

    /* renamed from: a */
    private static Object m40a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "android_ss_com_vboost_hardware_MTKPerfService_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "android_ss_com_vboost_hardware_MTKPerfService_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo16a() {
        try {
            Method method = f65d;
            if (method != null) {
                return ((Integer) m40a(method, this.f70i, new Object[0])).intValue();
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo20b(int i) {
        try {
            Method method = f69h;
            if (method != null) {
                m40a(method, this.f70i, new Object[]{Integer.valueOf(i)});
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo17a(int i) {
        try {
            Method method = f64c;
            if (method == null) {
                return -1;
            }
            return ((Integer) m40a(method, this.f70i, new Object[]{Integer.valueOf(i)})).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r7.f70i = android.p003ss.com.vboost.p008e.C0061b.m100a(android.p003ss.com.vboost.p005b.C0018g.f63b, new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x00ac */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0018g(android.content.Context r8) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: android.p003ss.com.vboost.p005b.C0018g.<init>(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18a(int i, int i2) {
        try {
            Method method = f68g;
            if (method != null) {
                m40a(method, this.f70i, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19a(int i, int i2, int i3, int i4) {
        try {
            Method method = f66e;
            if (method != null) {
                m40a(method, this.f70i, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), -1, -1});
            }
        } catch (Exception unused) {
        }
    }
}
