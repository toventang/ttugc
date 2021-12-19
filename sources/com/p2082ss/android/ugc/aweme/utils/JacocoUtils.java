package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.utils.JacocoUtils */
public class JacocoUtils {
    private static boolean ReleaseMode = true;
    public static int TimeInterval = 60;
    public static Object coverageMonitor;
    public static Method dataUploadMethod;
    public static Method dataWriteNowMethod;
    public static Method getDeviceIDMethod;
    public static Method getInstrumentStatusMethod;
    private static int sHasJacocoUtilsInited;
    private static boolean sUploadCoverageDataTaskInited;
    private static Method setAppVersionMethod;
    public static Method setDeviceIDMethod;

    /* renamed from: com_ss_android_ugc_aweme_utils_JacocoUtils_java_lang_reflect_Method_invoke */
    private static Object m138954x2c22743e(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_utils_JacocoUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_utils_JacocoUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(93425);
    }

    public static void uploadCoverageFileNow() {
        if (sHasJacocoUtilsInited == 0) {
            jacocoInit();
        }
        uploadCoverageDataCore(true);
    }

    private static boolean isLocalTest() {
        String str = C17867d.f42595s;
        if (TextUtils.equals(str, "local_test") || TextUtils.equals(str, "daily_monkey_test") || TextUtils.equals(str, "monkey")) {
            return true;
        }
        return false;
    }

    public static void uploadCoverageFileTask() {
        if (sHasJacocoUtilsInited == 0) {
            jacocoInit();
        }
        if (!sUploadCoverageDataTaskInited) {
            sUploadCoverageDataTaskInited = true;
            uploadCoverageDataCore(false);
        }
    }

    private static String getLogFilePath() {
        Context a = C17867d.m33078a();
        File b = C80720e.m139924b(a);
        if (!C80720e.m139939e()) {
            b = m138953xae650a19(a);
        }
        if (b == null) {
            return null;
        }
        File file = new File(b, "jacoco");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0047 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void writeCoverageData() {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.utils.JacocoUtils.writeCoverageData():void");
    }

    private static void jacocoInit() {
        if (!isLocalTest()) {
            sHasJacocoUtilsInited = 2;
        }
        if (sHasJacocoUtilsInited == 0) {
            C17867d.m33078a();
            try {
                Class<?> cls = Class.forName("com.bytedance.test.codecoverage.CodeCoverageMonitor");
                coverageMonitor = cls.getConstructor(String.class, Boolean.TYPE, Context.class, Boolean.TYPE).newInstance(getLogFilePath(), Boolean.valueOf(ReleaseMode), C17867d.m33078a(), false);
                Method declaredMethod = cls.getDeclaredMethod("setAppVersion", String.class);
                setAppVersionMethod = declaredMethod;
                declaredMethod.setAccessible(true);
                setAppVersionMethod.invoke(coverageMonitor, String.valueOf(C17867d.m33084e()));
                Method declaredMethod2 = cls.getDeclaredMethod("setDeviceID", String.class);
                setDeviceIDMethod = declaredMethod2;
                declaredMethod2.setAccessible(true);
                setDeviceIDMethod.invoke(coverageMonitor, String.valueOf(AppLog.getServerDeviceId()));
                Method declaredMethod3 = cls.getDeclaredMethod("getInstrumentStatus", new Class[0]);
                getInstrumentStatusMethod = declaredMethod3;
                declaredMethod3.setAccessible(true);
                Method declaredMethod4 = cls.getDeclaredMethod("getDeviceID", new Class[0]);
                getDeviceIDMethod = declaredMethod4;
                declaredMethod4.setAccessible(true);
                Method declaredMethod5 = cls.getDeclaredMethod("dataWriteNow", new Class[0]);
                dataWriteNowMethod = declaredMethod5;
                declaredMethod5.setAccessible(true);
                Method declaredMethod6 = cls.getDeclaredMethod("dataUpload", new Class[0]);
                dataUploadMethod = declaredMethod6;
                declaredMethod6.setAccessible(true);
                sHasJacocoUtilsInited = 1;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_utils_JacocoUtils_com_ss_android_ugc_aweme_lancet_ContextLancet_getCacheDir */
    public static File m138953xae650a19(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    private static void uploadCoverageDataCore(final boolean z) {
        if (coverageMonitor != null && isLocalTest()) {
            try {
                if (sHasJacocoUtilsInited == 1) {
                    Method method = getInstrumentStatusMethod;
                    if (method != null && !((Boolean) m138954x2c22743e(method, coverageMonitor, new Object[0])).booleanValue()) {
                        return;
                    }
                    new RunnableC13596e() {
                        /* class com.p2082ss.android.ugc.aweme.utils.JacocoUtils.C801731 */

                        static {
                            Covode.recordClassIndex(93426);
                        }

                        /* renamed from: a */
                        private static Object m138955a(Method method, Object obj, Object[] objArr) {
                            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_utils_JacocoUtils$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                            if (((Boolean) a.first).booleanValue()) {
                                return a.second;
                            }
                            Object invoke = method.invoke(obj, objArr);
                            C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_utils_JacocoUtils$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                            return invoke;
                        }

                        @Override // com.bytedance.common.utility.p907b.RunnableC13596e
                        public final void run() {
                            MethodCollector.m26663i(11855);
                            try {
                                if (!z) {
                                    while (true) {
                                        if (!(JacocoUtils.getDeviceIDMethod == null || !TextUtils.isEmpty((String) m138955a(JacocoUtils.getDeviceIDMethod, JacocoUtils.coverageMonitor, new Object[0])) || JacocoUtils.setDeviceIDMethod == null)) {
                                            m138955a(JacocoUtils.setDeviceIDMethod, JacocoUtils.coverageMonitor, new Object[]{AppLog.getServerDeviceId()});
                                        }
                                        if (JacocoUtils.dataWriteNowMethod != null) {
                                            m138955a(JacocoUtils.dataWriteNowMethod, JacocoUtils.coverageMonitor, new Object[0]);
                                        }
                                        if (JacocoUtils.dataUploadMethod != null) {
                                            m138955a(JacocoUtils.dataUploadMethod, JacocoUtils.coverageMonitor, new Object[0]);
                                        }
                                        if (JacocoUtils.getInstrumentStatusMethod != null && !((Boolean) m138955a(JacocoUtils.getInstrumentStatusMethod, JacocoUtils.coverageMonitor, new Object[0])).booleanValue()) {
                                            break;
                                        }
                                        try {
                                            Thread.sleep((long) (JacocoUtils.TimeInterval * 1000));
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                } else {
                                    if (!(JacocoUtils.getDeviceIDMethod == null || !TextUtils.isEmpty((String) m138955a(JacocoUtils.getDeviceIDMethod, JacocoUtils.coverageMonitor, new Object[0])) || JacocoUtils.setDeviceIDMethod == null)) {
                                        m138955a(JacocoUtils.setDeviceIDMethod, JacocoUtils.coverageMonitor, new Object[]{AppLog.getServerDeviceId()});
                                    }
                                    if (JacocoUtils.dataWriteNowMethod != null) {
                                        m138955a(JacocoUtils.dataWriteNowMethod, JacocoUtils.coverageMonitor, new Object[0]);
                                    }
                                    if (JacocoUtils.dataUploadMethod != null) {
                                        m138955a(JacocoUtils.dataUploadMethod, JacocoUtils.coverageMonitor, new Object[0]);
                                        MethodCollector.m26664o(11855);
                                        return;
                                    }
                                }
                                MethodCollector.m26664o(11855);
                            } catch (Throwable unused) {
                                MethodCollector.m26664o(11855);
                            }
                        }
                    }.mo21860a();
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }
}
