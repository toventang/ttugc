package p4646ms.p4647bd.p4648o;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p4646ms.p4647bd.p4648o.C89868b;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.z0 */
public final class C89958z0 extends C89868b.AbstractC89869a {
    static {
        Covode.recordClassIndex(106055);
    }

    C89958z0() {
    }

    /* renamed from: a */
    private static Object m156085a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "ms_bd_o_z0_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "ms_bd_o_z0_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: a */
    private static Object m156084a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(636);
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
                    MethodCollector.m26664o(636);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35029a(long j, String str, Object obj) {
        Boolean bool;
        MethodCollector.m26663i(583);
        Context context = C89865a.f203764a.f203765b;
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) m156084a(context, (String) C89889h.m155966a(16777217, 0, 0, "8eac93", new byte[]{42, 104, 28, 25, 3, 39, 47, 77, 38, 58, 61, 126}));
                Method declaredMethod = connectivityManager.getClass().getDeclaredMethod((String) C89889h.m155966a(16777217, 0, 0, "5f1994", new byte[]{35, 97, 86, 108, 5, 55, 63, 81, 101, 71, 33, 112, 85, 66, 20, 40, 31, 73, 102, 102}), new Class[0]);
                declaredMethod.setAccessible(true);
                NetworkInfo networkInfo = (NetworkInfo) m156085a(declaredMethod, connectivityManager, new Object[0]);
                if (networkInfo != null) {
                    Method declaredMethod2 = networkInfo.getClass().getDeclaredMethod((String) C89889h.m155966a(16777217, 0, 0, "726998", new byte[]{47, 35, 100, 91, 7, 38, 56, 18, 101, 101, 35}), new Class[0]);
                    declaredMethod2.setAccessible(true);
                    bool = Boolean.valueOf(((Boolean) m156085a(declaredMethod2, networkInfo, new Object[0])).booleanValue());
                    MethodCollector.m26664o(583);
                    return bool;
                }
            } catch (Throwable unused) {
            }
        }
        bool = Boolean.FALSE;
        MethodCollector.m26664o(583);
        return bool;
    }
}
