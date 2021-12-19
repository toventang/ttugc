package com.p2082ss.android.ugc.aweme.net;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.net.a */
public class C61303a {

    /* renamed from: a */
    private static volatile String f139217a = m110977b();

    /* renamed from: b */
    private static Map<String, Integer> f139218b = new HashMap();

    /* renamed from: c */
    private static Map<String, Field> f139219c = new HashMap();

    /* renamed from: d */
    private static volatile String f139220d = null;

    /* renamed from: c */
    private static int m110979c() {
        try {
            if (Process.is64Bit()) {
                return 64;
            }
            return 32;
        } catch (Exception | NoSuchMethodError unused) {
            return 0;
        }
    }

    /* renamed from: e */
    private static boolean m110981e() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static String m110977b() {
        JSONObject d = m110980d();
        String a = m110973a(d);
        if (a != null) {
            C12290b.m22066a("mira_infer_host_abi", d, (JSONObject) null, (JSONObject) null);
            return a;
        }
        String b = m110978b(d);
        C12290b.m22066a("mira_infer_host_abi", d, (JSONObject) null, (JSONObject) null);
        return b;
    }

    /* renamed from: a */
    public static String m110972a() {
        MethodCollector.m26663i(1491);
        if (f139217a == null) {
            synchronized (C61303a.class) {
                try {
                    if (f139217a == null) {
                        f139217a = m110977b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1491);
                    throw th;
                }
            }
        }
        String str = f139217a;
        MethodCollector.m26664o(1491);
        return str;
    }

    /* renamed from: d */
    private static JSONObject m110980d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("primaryCpuAbi", "0");
            jSONObject.put("processMode", "0");
            jSONObject.put("supportedABI0", "0");
            jSONObject.put("matchCpuAbi", "0");
            jSONObject.put("defaultABI0", "0");
            jSONObject.put("defaultABI", "0");
            jSONObject.put("autoError", "0");
            jSONObject.put("manualError", "0");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    static {
        Covode.recordClassIndex(71933);
        f139218b.put("armeabi", 32);
        f139218b.put("armeabi-v7a", 32);
        f139218b.put("arm64-v8a", 64);
        f139218b.put("x86", 32);
        f139218b.put("x86_64", 64);
        f139218b.put("mips", 32);
        f139218b.put("mips64", 64);
    }

    /* renamed from: a */
    private static String m110973a(JSONObject jSONObject) {
        Object obj;
        if (m110981e()) {
            try {
                Object a = m110971a(C17867d.m33078a().getApplicationInfo(), "target object must not be null");
                Field a2 = m110974a(a.getClass(), "primaryCpuAbi");
                boolean z = true;
                int i = 0;
                if (a2 != null) {
                    if (!a2.isAccessible()) {
                        a2.setAccessible(true);
                    }
                    obj = a2.get(a);
                } else {
                    obj = null;
                }
                String str = (String) obj;
                m110976a(jSONObject, "primaryCpuAbi", str);
                if (str != null) {
                    if (Build.VERSION.SDK_INT < 23) {
                        z = false;
                    }
                    if (z) {
                        i = m110979c();
                    }
                    m110976a(jSONObject, "processMode", String.valueOf(i));
                    if (i == 0 || f139218b.get(str).intValue() == i) {
                        return str;
                    }
                }
            } catch (Throwable unused) {
                m110976a(jSONObject, "autoError", "1");
            }
        }
        return null;
    }

    /* renamed from: b */
    private static String m110978b(JSONObject jSONObject) {
        String str;
        MethodCollector.m26663i(1561);
        try {
            str = C17867d.m33078a().getPackageManager().getPackageInfo(C17867d.m33078a().getPackageName(), 0).applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        try {
            ZipFile zipFile = new ZipFile(new File(str));
            HashSet hashSet = new HashSet(m110975a(zipFile).keySet());
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
            String[] strArr = m110981e() ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
            if (hashSet.isEmpty()) {
                m110976a(jSONObject, "supportedABI0", strArr[0]);
                String str2 = strArr[0];
                MethodCollector.m26664o(1561);
                return str2;
            }
            for (String str3 : strArr) {
                if (hashSet.contains(str3)) {
                    m110976a(jSONObject, "matchCpuAbi", str3);
                    MethodCollector.m26664o(1561);
                    return str3;
                }
            }
            if (m110981e()) {
                m110976a(jSONObject, "defaultABI0", Build.SUPPORTED_ABIS[0]);
                String str4 = Build.SUPPORTED_ABIS[0];
                MethodCollector.m26664o(1561);
                return str4;
            }
            m110976a(jSONObject, "defaultABI", Build.CPU_ABI);
            String str5 = Build.CPU_ABI;
            MethodCollector.m26664o(1561);
            return str5;
        } catch (Throwable unused3) {
            m110976a(jSONObject, "manualError", "1");
        }
    }

    /* renamed from: a */
    private static Map<String, List<ZipEntry>> m110975a(ZipFile zipFile) {
        String[] split;
        HashMap hashMap = new HashMap();
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        Pattern compile = Pattern.compile("^lib/[^/]+/lib[^/]+.so$");
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (!zipEntry.isDirectory() && compile.matcher(zipEntry.getName()).matches() && (split = zipEntry.getName().split(File.separator)) != null && split.length >= 2) {
                String str = split[split.length - 2];
                if (f139218b.containsKey(str)) {
                    if (hashMap.get(str) == null) {
                        hashMap.put(str, new LinkedList());
                    }
                    ((List) hashMap.get(str)).add(zipEntry);
                }
            }
        }
        zipFile.getName();
        return hashMap;
    }

    /* renamed from: a */
    private static <T> T m110971a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: a */
    private static Field m110974a(Class<?> cls, String str) {
        Field field;
        MethodCollector.m26663i(2150);
        Class cls2 = (Class) m110971a((Object) cls, "The class must not be null");
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls2.toString()).append("#").append(str);
            String sb2 = sb.toString();
            synchronized (f139219c) {
                try {
                    field = f139219c.get(sb2);
                } finally {
                    MethodCollector.m26664o(2150);
                }
            }
            if (field != null) {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                return field;
            }
            while (cls2 != null) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    synchronized (f139219c) {
                        try {
                            f139219c.put(sb2, declaredField);
                        } finally {
                            MethodCollector.m26664o(2150);
                        }
                    }
                    return declaredField;
                } catch (NoSuchFieldException unused) {
                    cls2 = cls2.getSuperclass();
                }
            }
            MethodCollector.m26664o(2150);
            return null;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The field name must not be blank");
        MethodCollector.m26664o(2150);
        throw illegalArgumentException;
    }

    /* renamed from: a */
    private static void m110976a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
