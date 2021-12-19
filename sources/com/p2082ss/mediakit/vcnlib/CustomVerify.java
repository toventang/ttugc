package com.p2082ss.mediakit.vcnlib;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;

/* renamed from: com.ss.mediakit.vcnlib.CustomVerify */
public class CustomVerify {
    private static Method getVerifyStatusMethod;
    private static boolean hasInited = true;
    private static Method verifyMethod;
    private static Class<?> verifyResultClass;

    private static final native void _init();

    /* renamed from: com_ss_mediakit_vcnlib_CustomVerify_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m147915xbad3cece(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_mediakit_vcnlib_CustomVerify_java_lang_reflect_Method_invoke */
    private static Object m147916x26b2179a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_mediakit_vcnlib_CustomVerify_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_mediakit_vcnlib_CustomVerify_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public static void init() {
        MethodCollector.m26663i(4040);
        m147915xbad3cece("custom_verify", "start init native");
        _init();
        m147915xbad3cece("custom_verify", "end init native");
        MethodCollector.m26664o(4040);
    }

    static {
        Covode.recordClassIndex(101262);
        try {
            verifyMethod = Class.forName("com.ttnet.org.chromium.net.X509Util").getMethod("a", byte[][].class, String.class, String.class);
            Class<?> cls = Class.forName("com.ttnet.org.chromium.net.AndroidCertVerifyResult");
            verifyResultClass = cls;
            getVerifyStatusMethod = cls.getMethod("getStatus", new Class[0]);
        } catch (Exception e) {
            m147915xbad3cece("custom_verify", "found verify class or method exception:" + e.getMessage());
        }
        if (verifyMethod != null && verifyResultClass != null) {
            m147915xbad3cece("custom_verify", "get verify method or verify result class suc");
        }
    }

    public static int doVerify(byte[][] bArr, String str, String str2) {
        if (verifyMethod == null || verifyResultClass == null || getVerifyStatusMethod == null) {
            m147915xbad3cece("custom_verify", "verify method is null ecception");
            return -99995;
        }
        try {
            m147915xbad3cece("custom_verify", "host: " + str2 + "  authType: " + str);
            Object com_ss_mediakit_vcnlib_CustomVerify_java_lang_reflect_Method_invoke = m147916x26b2179a(verifyMethod, null, new Object[]{bArr, str, str2});
            m147915xbad3cece("custom_verify", "get status end");
            int intValue = ((Integer) m147916x26b2179a(getVerifyStatusMethod, com_ss_mediakit_vcnlib_CustomVerify_java_lang_reflect_Method_invoke, new Object[0])).intValue();
            m147915xbad3cece("custom_verify", "verify result status: ".concat(String.valueOf(intValue)));
            return intValue;
        } catch (Throwable th) {
            m147915xbad3cece("custom_verify", "verify exception stacktrace:" + th.getMessage());
            return -99996;
        }
    }
}
