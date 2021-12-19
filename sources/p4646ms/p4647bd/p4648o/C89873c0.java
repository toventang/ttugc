package p4646ms.p4647bd.p4648o;

import android.app.Activity;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: ms.bd.o.c0 */
public final class C89873c0 {
    static {
        Covode.recordClassIndex(105970);
    }

    /* renamed from: a */
    public static byte[] m155948a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
        }
        return bArr;
    }

    /* renamed from: a */
    public static Activity m155947a() {
        Object obj;
        MethodCollector.m26663i(9);
        try {
            Class<?> cls = Class.forName((String) C89889h.m155966a(16777217, 0, 0, "3fe245", new byte[]{35, 106, 18, 84, 4, 43, 52, 9, 53, 114, 50, 42, 55, 69, 31, 43, 38, 78, 32, 123, 22, 108, 4, 67, 10, 38}));
            Method method = cls.getMethod((String) C89889h.m155966a(16777217, 0, 0, "16f8f9", new byte[]{35, 33, 7, 94, 92, 32, 38, 54, 52, 124, 41, 34, 28, 88, 64, 26, 58, 5, 50, 105, 36}), new Class[0]);
            Object[] objArr = new Object[0];
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{null, objArr}, 110000, "java.lang.Object", true, "ms_bd_o_c0_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                obj = a.second;
            } else {
                obj = method.invoke(null, objArr);
                C15346a.m28242a(obj, method, new Object[]{null, objArr}, "ms_bd_o_c0_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            }
            Field declaredField = cls.getDeclaredField((String) C89889h.m155966a(16777217, 0, 0, "302ee4", new byte[]{47, 19, 66, 5, 83, 53, 57, 5, 106, 48, 49}));
            declaredField.setAccessible(true);
            int i = Build.VERSION.SDK_INT;
            ArrayMap arrayMap = (ArrayMap) declaredField.get(obj);
            if (arrayMap.size() > 0) {
                for (Object obj2 : arrayMap.values()) {
                    Class<?> cls2 = obj2.getClass();
                    Field declaredField2 = cls2.getDeclaredField((String) C89889h.m155966a(16777217, 0, 0, "efbd31", new byte[]{100, 101, 4, 3, 9, 34}));
                    declaredField2.setAccessible(true);
                    if (!declaredField2.getBoolean(obj2)) {
                        Field declaredField3 = cls2.getDeclaredField((String) C89889h.m155966a(16777217, 0, 0, "1cb97d", new byte[]{33, 98, 5, 68, 30, 122, 38, 91}));
                        declaredField3.setAccessible(true);
                        Activity activity = (Activity) declaredField3.get(obj2);
                        MethodCollector.m26664o(9);
                        return activity;
                    }
                }
            }
        } catch (Exception unused) {
            C89889h.m155966a(16777217, 0, 0, "a89902", new byte[]{113, 51, 117, 74});
        }
        MethodCollector.m26664o(9);
        return null;
    }
}
