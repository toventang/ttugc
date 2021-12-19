package com.bytedance.router.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ClassUtils {
    private static final String SECONDARY_FOLDER_NAME = ("code_cache" + File.separator + "secondary-dexes");

    /* renamed from: com_bytedance_router_util_ClassUtils_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m41568x14341146(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_router_util_ClassUtils_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m41569x1434114b(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(25909);
    }

    private static boolean isYunOS() {
        try {
            String property = System.getProperty("ro.yunos.version");
            String property2 = System.getProperty("java.vm.name");
            if ((property2 == null || !property2.toLowerCase().contains("lemur")) && (property == null || property.trim().length() <= 0)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r0 <= 0) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (java.lang.Integer.valueOf(java.lang.System.getProperty("ro.build.version.sdk")).intValue() >= 21) goto L_0x0051;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isVMMultidexCapable() {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.util.ClassUtils.isVMMultidexCapable():boolean");
    }

    private static SharedPreferences getMultiDexPreferences(Context context) {
        int i = Build.VERSION.SDK_INT;
        return C34822d.m71158a(context, "multidex.version", 4);
    }

    public static List<String> getSourcePaths(Context context) {
        ApplicationInfo com_bytedance_router_util_ClassUtils_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo = m41570x8968de64(context.getPackageManager(), context.getPackageName(), 0);
        File file = new File(com_bytedance_router_util_ClassUtils_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo.sourceDir);
        ArrayList arrayList = new ArrayList();
        arrayList.add(com_bytedance_router_util_ClassUtils_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo.sourceDir);
        String str = file.getName() + ".classes";
        if (!isVMMultidexCapable()) {
            int i = getMultiDexPreferences(context).getInt("dex.number", 1);
            File file2 = new File(com_bytedance_router_util_ClassUtils_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo.dataDir, SECONDARY_FOLDER_NAME);
            for (int i2 = 2; i2 <= i; i2++) {
                File file3 = new File(file2, str + i2 + ".zip");
                if (file3.isFile()) {
                    arrayList.add(file3.getAbsolutePath());
                } else {
                    throw new IOException("Missing extracted secondary dex file '" + file3.getPath() + "'");
                }
            }
        }
        return arrayList;
    }

    public static List<String> getFileNameByPackageName(Context context, String str) {
        DexFile dexFile;
        MethodCollector.m26663i(10494);
        ArrayList arrayList = new ArrayList();
        for (String str2 : getSourcePaths(context)) {
            if (str2.endsWith(".zip")) {
                dexFile = DexFile.loadDex(str2, str2 + ".tmp", 0);
            } else {
                dexFile = new DexFile(str2);
            }
            Enumeration<String> entries = dexFile.entries();
            while (entries.hasMoreElements()) {
                String nextElement = entries.nextElement();
                if (nextElement.contains(str)) {
                    arrayList.add(nextElement);
                }
            }
        }
        m41568x14341146("galaxy", "Filter " + arrayList.size() + " classes by packageName <" + str + ">");
        MethodCollector.m26664o(10494);
        return arrayList;
    }

    /* renamed from: com_bytedance_router_util_ClassUtils_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo */
    public static ApplicationInfo m41570x8968de64(PackageManager packageManager, String str, int i) {
        if (!TextUtils.equals(str, C17867d.m33078a().getPackageName()) || i != 128) {
            return packageManager.getApplicationInfo(str, i);
        }
        if (C58014b.f132218a == null) {
            C58014b.f132218a = packageManager.getApplicationInfo(str, i);
        }
        return C58014b.f132218a;
    }
}
