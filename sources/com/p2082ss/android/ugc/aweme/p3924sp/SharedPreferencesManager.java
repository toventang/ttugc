package com.p2082ss.android.ugc.aweme.p3924sp;

import android.app.Instrumentation;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.reflect.C13635a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.sp.SharedPreferencesManager */
public class SharedPreferencesManager {
    private Constructor constructor;
    private boolean hasObtained;
    private HashMap lockMap;
    private Map<String, File> mOrignalSharedPrefsPaths;
    private File mPreferencesDir;
    private Map<String, File> mSharedPrefsPaths;
    private Map<File, SharedPreferences> sSharedPrefsCache;
    private Class<?> sharedPreferencesImplClass;

    /* renamed from: com.ss.android.ugc.aweme.sp.SharedPreferencesManager$1 */
    static /* synthetic */ class C749051 {
        static {
            Covode.recordClassIndex(87770);
        }
    }

    static {
        Covode.recordClassIndex(87769);
    }

    /* renamed from: com_ss_android_ugc_aweme_sp_SharedPreferencesManager_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m131466xf0a1c11a(String str, String str2) {
        return 0;
    }

    public static SharedPreferencesManager getInstance() {
        return C74906a.f168384a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sp.SharedPreferencesManager$a */
    public static class C74906a {

        /* renamed from: a */
        public static SharedPreferencesManager f168384a = new SharedPreferencesManager(null);

        static {
            Covode.recordClassIndex(87771);
        }
    }

    private SharedPreferencesManager() {
        this.sSharedPrefsCache = Collections.synchronizedMap(new HashMap());
        this.mSharedPrefsPaths = Collections.synchronizedMap(new HashMap());
        this.lockMap = new HashMap();
    }

    public static void hookInstrumentation() {
        Field declaredField;
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke != null && (declaredField = invoke.getClass().getDeclaredField("mInstrumentation")) != null) {
                    declaredField.setAccessible(true);
                    Instrumentation instrumentation = (Instrumentation) declaredField.get(invoke);
                    if (instrumentation != null && !(instrumentation instanceof InstrumentationC74926i)) {
                        declaredField.set(invoke, new InstrumentationC74926i(instrumentation));
                    }
                }
            }
        } catch (Exception unused) {
            m131466xf0a1c11a("SharedPreferencesManage", "Hook Method Instrumentation Failed!!!");
        }
    }

    /* synthetic */ SharedPreferencesManager(C749051 r1) {
        this();
    }

    private File getDataDirAbove24(Context context) {
        return context.getDataDir();
    }

    private static File ensurePrivateDirExists(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: com_ss_android_ugc_aweme_sp_SharedPreferencesManager_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir */
    public static File m131465x4bb004ac(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    private File getDataDir(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return getDataDirAbove24(context);
        }
        return m131465x4bb004ac(context).getParentFile();
    }

    private File getPreferencesDir(Context context) {
        if (this.mPreferencesDir == null) {
            this.mPreferencesDir = new File(getDataDir(context), "shared_prefs");
        }
        return ensurePrivateDirExists(this.mPreferencesDir);
    }

    private File getSharedPreferencesPath(Context context, String str) {
        return makeFilename(getPreferencesDir(context), str + ".xml");
    }

    private File makeFilename(File file, String str) {
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        throw new IllegalArgumentException("File " + str + " contains a path separator");
    }

    public SharedPreferences getSharedPreferences(Context context, String str) {
        MethodCollector.m26663i(10910);
        if (context == null || TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(10910);
            return null;
        }
        File file = this.mSharedPrefsPaths.get(str);
        long j = 0;
        if (file == null) {
            j = SystemClock.uptimeMillis();
            Object obj = this.lockMap.get(str);
            if (obj == null) {
                synchronized (this.lockMap) {
                    try {
                        obj = this.lockMap.get(str);
                        if (obj == null) {
                            obj = new Object();
                            this.lockMap.put(str, obj);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(10910);
                        throw th;
                    }
                }
            }
            synchronized (obj) {
                try {
                    file = this.mSharedPrefsPaths.get(str);
                    if (file == null) {
                        file = getSharedPreferencesPath(context, str);
                        if (!this.hasObtained && this.mOrignalSharedPrefsPaths == null) {
                            Context a = C74915e.m131475a(context);
                            if (a == null) {
                                a = (Context) C13635a.m24534a(context, "mBase");
                            }
                            if (a != null) {
                                Map<String, File> b = C74915e.m131477b(a);
                                if (b == null) {
                                    b = (Map) C13635a.m24534a(a, "mSharedPrefsPaths");
                                }
                                this.mOrignalSharedPrefsPaths = b;
                            }
                            this.hasObtained = true;
                        }
                        Map<String, File> map = this.mOrignalSharedPrefsPaths;
                        if (map != null && map.containsValue(file)) {
                            return null;
                        }
                        this.mSharedPrefsPaths.put(str, file);
                    }
                } finally {
                    MethodCollector.m26664o(10910);
                }
            }
        }
        SharedPreferences sharedPreferences = getSharedPreferences(str, file, j);
        MethodCollector.m26664o(10910);
        return sharedPreferences;
    }

    public SharedPreferences getSharedPreferences(String str, File file, long j) {
        MethodCollector.m26663i(10911);
        SharedPreferences sharedPreferences = this.sSharedPrefsCache.get(file);
        if (sharedPreferences == null) {
            if (j == 0) {
                j = SystemClock.uptimeMillis();
            }
            synchronized (file) {
                try {
                    sharedPreferences = this.sSharedPrefsCache.get(file);
                    if (sharedPreferences == null) {
                        sharedPreferences = new SharedPreferencesC74917g(str, file);
                        this.sSharedPrefsCache.put(file, sharedPreferences);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10911);
                    throw th;
                }
            }
        }
        C58945a aVar = C58945a.C58947b.f134185a;
        if (j > 0 && Looper.getMainLooper() == Looper.myLooper()) {
            aVar.f134183j.put(str, Long.valueOf(SystemClock.uptimeMillis() - j));
        }
        MethodCollector.m26664o(10911);
        return sharedPreferences;
    }
}
