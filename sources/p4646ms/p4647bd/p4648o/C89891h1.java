package p4646ms.p4647bd.p4648o;

import android.content.Context;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;
import p4646ms.p4647bd.p4648o.C89868b;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.h1 */
public final class C89891h1 extends C89868b.AbstractC89869a {
    static {
        Covode.recordClassIndex(105988);
    }

    C89891h1() {
    }

    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35029a(long j, String str, Object obj) {
        double d;
        Object invoke;
        MethodCollector.m26663i(1075);
        Context context = C89865a.f203764a.f203765b;
        try {
            Class<?> cls = Class.forName(new String(C89873c0.m155948a((String) C89889h.m155966a(16777217, 0, 0, "e79380", new byte[]{34, 102, 28, 65, 81, 35, 52, 19, 62, 50, 34, 48, 28, 19, 80, 117, 48, 16, 62, 58, 34, 97, 24, 66, 81, 126, 48, 19, 63, 55, 34, 96, 29, 21, 81, 34, 48, 71, 62, 96, 38, 48, 28, 65, 80, 116, 52, 19, 61, 51, 34, 51, 29, 16, 81, 114, 49, 68, 61, 51, 35, 103, 28, 65, 81, 113, 48, 79, 62, 96, 34, 96}))));
            Object newInstance = cls.getConstructor(Context.class).newInstance(context);
            Method declaredMethod = cls.getDeclaredMethod(new String(C89873c0.m155948a((String) C89889h.m155966a(16777217, 0, 0, "39cd03", new byte[]{116, 108, 70, 69, 88, 112, 100, 73, 101, 98, 116, 110, 71, 66, 89, 117, 102, 79, 100, 97, 119, 107, 70, 22, 88, 115, 102, 77, 101, 102}))), String.class);
            declaredMethod.setAccessible(true);
            Object[] objArr = {new String(C89873c0.m155948a((String) C89889h.m155966a(16777217, 0, 0, "7963a5", new byte[]{112, 105, 19, 22, 9, 118, 99, 76, 49, 54, 113, 105, 18, 30, 12, 39, 98, 75, 49, 50, 113, 107, 19, 22, 8, 113, 98, 65, 48, 55, 113, 98})))};
            Pair<Boolean, Object> a = C15346a.m28238a(declaredMethod, new Object[]{newInstance, objArr}, 110000, "java.lang.Object", true, "ms_bd_o_h1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                invoke = a.second;
            } else {
                invoke = declaredMethod.invoke(newInstance, objArr);
                C15346a.m28242a(invoke, declaredMethod, new Object[]{newInstance, objArr}, "ms_bd_o_h1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            }
            d = ((Double) invoke).doubleValue();
        } catch (Throwable unused) {
            d = 0.0d;
        }
        String num = Integer.toString((int) d);
        MethodCollector.m26664o(1075);
        return num;
    }
}
