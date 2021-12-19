package com.p2082ss.ttvideoengine.p4430s;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import com.C1764a;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.mediakit.medialoader.AVMDLDataLoader;
import com.p2082ss.ttvideoengine.C86346ao;
import com.p2082ss.ttvideoengine.JniUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.s.h */
public final class C86640h {

    /* renamed from: a */
    private static String f195269a;

    /* renamed from: b */
    private static String f195270b = "";

    /* renamed from: c */
    private static String f195271c = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_.~#[]!\\()*%";

    /* renamed from: d */
    private static volatile long f195272d = -1;

    /* renamed from: e */
    private static volatile String f195273e;

    /* renamed from: a */
    public static byte[] m150087a(String str) {
        C86641i.m150113b("TTHelper", "base64DecodeToBytes ".concat(String.valueOf(str)));
        if (!TextUtils.isEmpty(str)) {
            try {
                return Base64.decode(str, 0);
            } catch (Throwable th) {
                C86641i.m150117e("TTHelper", "base64DecodeToBytes " + th.toString());
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final void m150086a(File file) {
        if (file != null) {
            if (file.isFile()) {
                m150093b(file);
            } else if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null || listFiles.length == 0) {
                    m150093b(file);
                    return;
                }
                for (File file2 : listFiles) {
                    m150086a(file2);
                }
                m150093b(file);
            }
        }
    }

    /* renamed from: a */
    private static final String m150085a(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m150084a(String str, String str2, String str3) {
        List<String> d = m150101d(str, str2);
        if (d == null || d.size() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str4 : d) {
            if (str4.startsWith(str2 + "=")) {
                sb.append(str2).append("=").append(str3);
            } else {
                sb.append(str4);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static Looper m150077a() {
        if (Looper.myLooper() != null) {
            return Looper.myLooper();
        }
        return Looper.getMainLooper();
    }

    /* renamed from: b */
    private static boolean m150092b() {
        return "mounted".equals(m150095c());
    }

    static {
        Covode.recordClassIndex(101868);
    }

    /* renamed from: c */
    private static String m150095c() {
        if (!TextUtils.isEmpty(f195273e) && System.currentTimeMillis() - f195272d < 5000) {
            return f195273e;
        }
        try {
            f195272d = System.currentTimeMillis();
            String externalStorageState = Environment.getExternalStorageState();
            f195273e = externalStorageState;
            return externalStorageState;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static final long m150094c(Context context) {
        if (context != null && m150092b()) {
            return m150102e(context);
        }
        return -1;
    }

    /* renamed from: h */
    public static final String m150106h(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static float m150088b(Context context) {
        int i;
        if (context == null) {
            return 0.0f;
        }
        int i2 = 0;
        try {
            AudioManager audioManager = (AudioManager) m150089b(context, DataType.AUDIO);
            if (audioManager != null) {
                i = audioManager.getStreamVolume(3);
                if (i < 0) {
                    return (float) i2;
                }
            } else {
                i = 0;
            }
            i2 = i;
        } catch (Exception unused) {
        }
        return (float) i2;
    }

    /* renamed from: d */
    private static File m150099d(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: e */
    private static long m150102e(Context context) {
        if (context == null || Environment.getDataDirectory() == null) {
            return -1;
        }
        return m150108j(m150099d(context).getParent());
    }

    /* renamed from: j */
    private static long m150108j(String str) {
        try {
            StatFs statFs = new StatFs(str);
            int i = Build.VERSION.SDK_INT;
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static int m150076a(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.parseInt((String) obj);
        }
        throw new NumberFormatException("Can't format " + obj.getClass() + " to int");
    }

    /* renamed from: b */
    public static final String m150090b(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.replace("_", "$").replace("/", "@").replace(".", "#");
    }

    /* renamed from: d */
    public static final String m150100d(String str) {
        if (TextUtils.isEmpty(str) || str.contains("http://127.0.0.1")) {
            return str;
        }
        return str.replaceAll("http:", "https:");
    }

    /* renamed from: e */
    public static final String m150103e(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("https")) {
            return str;
        }
        return str.replace("https", "http");
    }

    /* renamed from: i */
    public static final String m150107i(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        C86641i.m150113b("TTHelperEncode", "before encode:".concat(String.valueOf(str)));
        try {
            String queryComponentEncode = AVMDLDataLoader.queryComponentEncode(str);
            if (TextUtils.isEmpty(queryComponentEncode)) {
                C86641i.m150113b("TTHelperEncode", "call native encode fail,try java");
                queryComponentEncode = URLEncoder.encode(str, "UTF-8");
            }
            C86641i.m150113b("TTHelperEncode", "after encode:".concat(String.valueOf(queryComponentEncode)));
            return queryComponentEncode;
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final C86633c m150078a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C86633c(jSONObject.optString("domain"), jSONObject.optInt("code"), jSONObject.optInt("innerCode"), jSONObject.optString("des"));
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: c */
    public static final String m150096c(File file) {
        MethodCollector.m26663i(2041);
        if (!file.isFile()) {
            MethodCollector.m26664o(2041);
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    String a = m150085a(instance.digest());
                    MethodCollector.m26664o(2041);
                    return a;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(2041);
            return null;
        }
    }

    /* renamed from: f */
    public static final boolean m150104f(String str) {
        if (str != null) {
            String str2 = "";
            if (!str.equals(str2)) {
                try {
                    str2 = new URL(str).getHost();
                } catch (Exception unused) {
                }
                if (Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str2).find()) {
                    return true;
                }
                int indexOf = str.indexOf("[");
                int indexOf2 = str.indexOf("]");
                if (indexOf <= 0 || indexOf2 <= indexOf || str.substring(indexOf, indexOf2).indexOf(":") <= 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static final String m150105g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0".concat(String.valueOf(hexString));
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static final String m150097c(String str) {
        if (str == null) {
            return null;
        }
        if (TextUtils.isEmpty(f195270b)) {
            return str;
        }
        boolean contains = str.contains(f195270b);
        boolean f = m150104f(str);
        if (str.startsWith("https")) {
            str = str.replace("https", "http");
        }
        if (f || str.indexOf("http") != 0 || contains) {
            return str;
        }
        try {
            String host = new URL(str).getHost();
            StringBuilder sb = new StringBuilder();
            sb.append(host);
            sb.append(C1764a.m5928a(".%s", new Object[]{f195270b}));
            return str.replace(host, sb);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static final String m150080a(Context context) {
        String str = f195269a;
        if (str != null) {
            return str;
        }
        if (context == null) {
            return null;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            String absolutePath = m150099d(applicationContext).getAbsolutePath();
            f195269a = absolutePath;
            return absolutePath;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m150093b(File file) {
        MethodCollector.m26663i(6557);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(6557);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(6557);
        return delete;
    }

    /* renamed from: a */
    public static String m150081a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (context != null) {
            String a = m150080a(context);
            if (!TextUtils.isEmpty(a)) {
                str.replace(a, "");
            }
        }
        return m150105g(str);
    }

    /* renamed from: b */
    private static Object m150089b(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2117);
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
                    MethodCollector.m26664o(2117);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: d */
    private static List<String> m150101d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("[?]");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[0];
        String str4 = split[1];
        int indexOf = str4.indexOf(str2 + "=");
        if (indexOf == -1) {
            return null;
        }
        arrayList.add(str3);
        arrayList.add("?");
        arrayList.add(str4.substring(0, indexOf));
        int indexOf2 = str4.indexOf("&", indexOf);
        if (indexOf2 == -1) {
            arrayList.add(str4.substring(indexOf));
            return arrayList;
        }
        arrayList.add(str4.substring(indexOf, indexOf2));
        arrayList.add(str4.substring(indexOf2));
        return arrayList;
    }

    /* renamed from: a */
    public static Class<?> m150079a(int i, String str) {
        if (i < 0 || TextUtils.isEmpty(str)) {
            throw new Exception("pluginName or/and className is empty");
        }
        ClassLoader a = C86346ao.m148881a(i);
        if (a == null) {
            return Class.forName(str);
        }
        return Class.forName(str, true, a);
    }

    /* renamed from: b */
    public static final String m150091b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.indexOf(str2) != -1) {
            return str;
        }
        if (str.indexOf("?") == -1) {
            return str + "?" + str2;
        }
        return str + "&" + str2;
    }

    /* renamed from: c */
    public static String m150098c(String str, String str2) {
        List<String> d = m150101d(str, str2);
        if (!(d == null || d.size() == 0)) {
            for (String str3 : d) {
                if (str3.startsWith(str2 + "=")) {
                    return str3.substring(str2.length() + 1);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m150082a(String str, long j) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append("T");
        }
        sb.append(Long.toString(j));
        sb.append("T");
        sb.append(Integer.toString((int) (Math.random() * 65535.0d)));
        return sb.toString();
    }

    /* renamed from: a */
    public static String m150083a(String str, String str2) {
        if (TextUtils.isEmpty(str) || !Pattern.matches("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$", str)) {
            return str;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            if (TextUtils.isEmpty(str2)) {
                return new String(decode, "utf-8");
            }
            return JniUtils.m148582a(decode, Base64.decode(str2, 0));
        } catch (Throwable th) {
            C86641i.m150113b("TTHelper", th.toString());
            return "";
        }
    }
}
