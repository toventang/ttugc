package com.p2082ss.ttffmpeg;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;

/* renamed from: com.ss.ttffmpeg.CustomVerify */
public class CustomVerify {

    /* renamed from: a */
    public static String f192427a = "custom_verify_ffmpeg";

    /* renamed from: b */
    private static Method f192428b;

    /* renamed from: c */
    private static boolean f192429c = true;

    /* renamed from: d */
    private static Class<?> f192430d;

    /* renamed from: e */
    private static Method f192431e;

    static final native void _init();

    /* renamed from: a */
    private static Object m148176a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_ttffmpeg_CustomVerify_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_ttffmpeg_CustomVerify_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(101360);
        try {
            f192428b = Class.forName("com.ttnet.org.chromium.net.X509Util").getMethod("a", byte[][].class, String.class, String.class);
            Class<?> cls = Class.forName("com.ttnet.org.chromium.net.AndroidCertVerifyResult");
            f192430d = cls;
            f192431e = cls.getMethod("getStatus", new Class[0]);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static int doVerify(byte[][] bArr, String str, String str2) {
        Method method = f192428b;
        if (method == null || f192430d == null || f192431e == null) {
            return -99995;
        }
        try {
            return ((Integer) m148176a(f192431e, m148176a(method, null, new Object[]{bArr, str, str2}), new Object[0])).intValue();
        } catch (Throwable th) {
            th.getMessage();
            return -99996;
        }
    }
}
