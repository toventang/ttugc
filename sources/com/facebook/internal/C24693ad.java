package com.facebook.internal;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.facebook.C24006ab;
import com.facebook.C24798j;
import com.facebook.C24872m;
import com.facebook.C24915r;
import com.facebook.EnumC24916s;
import com.facebook.GraphRequest;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.C24002p;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49498ad;
import com.p2082ss.android.ugc.aweme.feed.p2945f.C49540a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.internal.ad */
public final class C24693ad {

    /* renamed from: a */
    private static int f58624a;

    /* renamed from: b */
    private static long f58625b = -1;

    /* renamed from: c */
    private static long f58626c = -1;

    /* renamed from: d */
    private static long f58627d = -1;

    /* renamed from: e */
    private static String f58628e = "";

    /* renamed from: f */
    private static String f58629f = "";

    /* renamed from: g */
    private static String f58630g = "NoCarrier";

    /* renamed from: com.facebook.internal.ad$a */
    public interface AbstractC24696a {
        static {
            Covode.recordClassIndex(28849);
        }

        /* renamed from: a */
        void mo39364a(C24798j jVar);

        /* renamed from: a */
        void mo39365a(JSONObject jSONObject);
    }

    /* renamed from: com.facebook.internal.ad$b */
    public interface AbstractC24697b<T, K> {
        static {
            Covode.recordClassIndex(28850);
        }

        /* renamed from: a */
        K mo40516a(T t);
    }

    /* renamed from: a */
    public static <T> boolean m47262a(Collection<T> collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: a */
    public static boolean m47261a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: a */
    public static String m47236a(String str, String str2) {
        return m47261a(str) ? str2 : str;
    }

    /* renamed from: a */
    static String m47237a(String str, byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b >> 4) & 15));
                sb.append(Integer.toHexString((b >> 0) & 15));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m47249a(Bundle bundle, String str, String str2) {
        if (!m47261a(str2)) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: a */
    public static void m47248a(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            m47249a(bundle, str, uri.toString());
        }
    }

    /* renamed from: a */
    public static boolean m47259a(Bundle bundle, String str, Object obj) {
        if (obj == null) {
            bundle.remove(str);
            return true;
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return true;
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return true;
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return true;
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, obj.toString());
            return true;
        } else if (!(obj instanceof JSONObject)) {
            return false;
        } else {
            bundle.putString(str, obj.toString());
            return true;
        }
    }

    /* renamed from: a */
    public static void m47251a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m47256a(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    /* renamed from: a */
    public static Map<String, String> m47246a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static List<String> m47243a(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public static String m47235a(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        InputStreamReader inputStreamReader;
        Throwable th;
        MethodCollector.m26663i(8126);
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader = null;
                m47251a((Closeable) bufferedInputStream);
                m47251a(inputStreamReader);
                MethodCollector.m26664o(8126);
                throw th;
            }
            try {
                StringBuilder sb = new StringBuilder();
                char[] cArr = new char[2048];
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read != -1) {
                        sb.append(cArr, 0, read);
                    } else {
                        String sb2 = sb.toString();
                        m47251a((Closeable) bufferedInputStream);
                        m47251a(inputStreamReader);
                        MethodCollector.m26664o(8126);
                        return sb2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                m47251a((Closeable) bufferedInputStream);
                m47251a(inputStreamReader);
                MethodCollector.m26664o(8126);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedInputStream = null;
            inputStreamReader = null;
            m47251a((Closeable) bufferedInputStream);
            m47251a(inputStreamReader);
            MethodCollector.m26664o(8126);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m47247a(Context context, String str) {
        String cookie;
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie2 = instance.getCookie(str);
        if (cookie2 != null) {
            for (String str2 : cookie2.split(";")) {
                String[] split = str2.split("=");
                if (split.length > 0) {
                    instance.setCookie(str, split[0].trim() + "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                    if (C29843f.m60129a(C17879g.m33104a()) && C49498ad.m92737a() && (cookie = CookieManager.getInstance().getCookie(C49540a.m92781a())) != null && !TextUtils.equals(cookie, C49540a.m92784b())) {
                        C49540a.m92783a(C49540a.m92781a(), cookie);
                    }
                }
            }
            instance.removeExpiredCookie();
        }
    }

    /* renamed from: a */
    public static <T> boolean m47260a(T t, T t2) {
        if (t == null) {
            return t2 == null;
        }
        return t.equals(t2);
    }

    /* renamed from: a */
    public static void m47252a(File file) {
        File[] listFiles;
        if (file.exists()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    m47252a(file2);
                }
            }
            m47270b(file);
        }
    }

    /* renamed from: a */
    public static <T> List<T> m47244a(T... tArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            T t = tArr[i];
            if (t != null) {
                arrayList.add(t);
            }
            i++;
        } while (i < 2);
        return arrayList;
    }

    /* renamed from: a */
    public static String m47238a(Map<String, String> map) {
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static void m47258a(JSONObject jSONObject, C24710b bVar, String str, boolean z) {
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", !z);
        jSONObject.put("advertiser_id_collection_enabled", C24006ab.m45408c());
        if (bVar != null) {
            if (bVar.f58673a != null) {
                jSONObject.put("attribution", bVar.f58673a);
            }
            if (bVar.mo40546a() != null) {
                jSONObject.put("advertiser_id", bVar.mo40546a());
                jSONObject.put("advertiser_tracking_enabled", !bVar.f58675c);
            }
            if (!bVar.f58675c) {
                String a = C24002p.m45395a();
                if (!a.isEmpty()) {
                    jSONObject.put("ud", a);
                }
            }
            if (bVar.f58674b != null) {
                jSONObject.put("installer_package", bVar.f58674b);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c A[Catch:{ Exception -> 0x0090 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m47257a(org.json.JSONObject r6, android.content.Context r7) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C24693ad.m47257a(org.json.JSONObject, android.content.Context):void");
    }

    /* renamed from: a */
    public static Method m47239a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m47240a(String str, String str2, Class<?>... clsArr) {
        try {
            return m47239a(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <T, K> List<K> m47242a(List<T> list, AbstractC24697b<T, K> bVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            K a = bVar.mo40516a(t);
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Date m47241a(Bundle bundle, String str, Date date) {
        long parseLong;
        if (bundle == null) {
            return null;
        }
        Object a = m47229a(bundle, str);
        if (a instanceof Long) {
            parseLong = ((Long) a).longValue();
        } else if (!(a instanceof String)) {
            return null;
        } else {
            try {
                parseLong = Long.parseLong((String) a);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (parseLong == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date(date.getTime() + (parseLong * 1000));
    }

    /* renamed from: a */
    public static void m47250a(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    /* renamed from: a */
    public static Map<String, String> m47245a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m47254a(final String str, final AbstractC24696a aVar) {
        JSONObject a = C24690aa.m47223a(str);
        if (a != null) {
            aVar.mo39365a(a);
            return;
        }
        C246941 r1 = new GraphRequest.AbstractC23858b() {
            /* class com.facebook.internal.C24693ad.C246941 */

            static {
                Covode.recordClassIndex(28847);
            }

            @Override // com.facebook.GraphRequest.AbstractC23858b
            /* renamed from: a */
            public final void mo39350a(C24915r rVar) {
                if (rVar.f59155d != null) {
                    aVar.mo39364a(rVar.f59155d.f56442n);
                    return;
                }
                C24690aa.f58618a.put(str, rVar.f59153b);
                aVar.mo39365a(rVar.f59153b);
            }
        };
        GraphRequest f = m47285f(str);
        f.mo39348a((GraphRequest.AbstractC23858b) r1);
        f.mo39347a();
    }

    /* renamed from: a */
    public static void m47253a(Runnable runnable) {
        try {
            C24872m.m47689c().execute(runnable);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m47255a(String str, Exception exc) {
        if (C24872m.f59045e && str != null) {
            exc.getClass().getSimpleName();
            exc.getMessage();
        }
    }

    /* renamed from: d */
    public static Locale m47276d() {
        Locale c = m47273c();
        if (c != null) {
            return c;
        }
        return Locale.getDefault();
    }

    /* renamed from: j */
    private static boolean m47292j() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    static {
        Covode.recordClassIndex(28846);
    }

    /* renamed from: a */
    public static String m47232a() {
        C24699ae.m47299a();
        Context context = C24872m.f59047g;
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m47264b() {
        return new BigInteger(100, new Random()).toString(32);
    }

    /* renamed from: i */
    private static void m47291i() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            f58628e = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            f58629f = timeZone.getID();
        } catch (AssertionError | Exception unused) {
        }
    }

    /* renamed from: c */
    public static Locale m47273c() {
        try {
            C24699ae.m47299a();
            return C24872m.f59047g.getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static JSONObject m47286f() {
        if (C24677a.m47209a(C24693ad.class)) {
            return null;
        }
        try {
            C24699ae.m47299a();
            String string = C34822d.m71158a(C24872m.f59047g, "com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24693ad.class);
            return null;
        }
    }

    /* renamed from: h */
    private static int m47289h() {
        int i = f58624a;
        if (i > 0) {
            return i;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() {
                /* class com.facebook.internal.C24693ad.C246952 */

                static {
                    Covode.recordClassIndex(28848);
                }

                public final boolean accept(File file, String str) {
                    return Pattern.matches("cpu[0-9]+", str);
                }
            });
            if (listFiles != null) {
                f58624a = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f58624a <= 0) {
            f58624a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f58624a;
    }

    /* renamed from: k */
    private static void m47293k() {
        try {
            if (m47292j()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f58627d = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            f58627d = m47227a((double) f58627d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: l */
    private static void m47294l() {
        try {
            if (m47292j()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f58626c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            f58626c = m47227a((double) f58626c);
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public static boolean m47288g() {
        if (C24677a.m47209a(C24693ad.class)) {
            return false;
        }
        try {
            JSONObject f = m47286f();
            if (f == null) {
                return false;
            }
            try {
                JSONArray jSONArray = f.getJSONArray("data_processing_options");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (jSONArray.getString(i).toLowerCase().equals("ldu")) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24693ad.class);
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m47283e() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            C24699ae.m47299a();
            intent.setData(Uri.parse(C1764a.m5928a("fb%s://applinks", new Object[]{C24872m.f59041a})));
            C24699ae.m47299a();
            Context context = C24872m.f59047g;
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 65536)) {
                if (packageName.equals(resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    private static long m47227a(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    /* renamed from: d */
    public static void m47277d(String str) {
        if (C24872m.f59045e) {
            m47261a(str);
        }
    }

    /* renamed from: b */
    public static String m47265b(String str) {
        if (str == null) {
            return null;
        }
        return m47266b("SHA-256", str);
    }

    /* renamed from: f */
    private static Context m47284f(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: c */
    public static String m47272c(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == m47284f(context)) {
            return "unknown";
        }
        return context.getClass().getSimpleName();
    }

    /* renamed from: d */
    public static boolean m47279d(Uri uri) {
        if (uri == null || !"file".equalsIgnoreCase(uri.getScheme())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static String m47281e(Context context) {
        try {
            C24699ae.m47299a();
            String str = C24872m.f59042b;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            return context.getString(i);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: f */
    public static GraphRequest m47285f(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", str);
        return new GraphRequest(null, "me", bundle, EnumC24916s.GET, null);
    }

    /* renamed from: h */
    private static void m47290h(Context context) {
        if (f58630g.equals("NoCarrier")) {
            try {
                f58630g = ((TelephonyManager) m47263b(context, "phone")).getNetworkOperatorName();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static boolean m47278d(Context context) {
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        if (Build.DEVICE == null || !Build.DEVICE.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static long m47280e(Uri uri) {
        MethodCollector.m26663i(8576);
        Cursor cursor = null;
        try {
            C24699ae.m47299a();
            cursor = C24872m.f59047g.getContentResolver().query(uri, null, null, null, null);
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            long j = cursor.getLong(columnIndex);
            cursor.close();
            MethodCollector.m26664o(8576);
            return j;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            MethodCollector.m26664o(8576);
            throw th;
        }
    }

    /* renamed from: g */
    private static void m47287g(Context context) {
        if (f58625b == -1 || System.currentTimeMillis() - f58625b >= 1800000) {
            f58625b = System.currentTimeMillis();
            m47291i();
            m47290h(context);
            m47294l();
            m47293k();
        }
    }

    /* renamed from: c */
    public static Bundle m47271c(String str) {
        Bundle bundle = new Bundle();
        if (!m47261a(str)) {
            for (String str2 : str.split("&")) {
                String[] split = str2.split("=");
                try {
                    if (split.length == 2) {
                        bundle.putString(URLDecoder.decode(split[0], "UTF-8"), URLDecoder.decode(split[1], "UTF-8"));
                    } else if (split.length == 1) {
                        bundle.putString(URLDecoder.decode(split[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e) {
                    m47255a("FacebookSDK", (Exception) e);
                }
            }
        }
        return bundle;
    }

    /* renamed from: e */
    public static Map<String, String> m47282e(String str) {
        if (str.isEmpty()) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* renamed from: b */
    public static List<String> m47267b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static Set<String> m47274c(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    /* renamed from: b */
    public static void m47268b(Context context) {
        m47247a(context, "facebook.com");
        m47247a(context, ".facebook.com");
        m47247a(context, "https://facebook.com");
        m47247a(context, "https://.facebook.com");
    }

    /* renamed from: c */
    public static boolean m47275c(Uri uri) {
        if (uri == null || !"content".equalsIgnoreCase(uri.getScheme())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m47233a(Context context) {
        C24699ae.m47301a((Object) context, "context");
        C24872m.m47684a(context);
        C24699ae.m47299a();
        return C24872m.f59041a;
    }

    /* renamed from: b */
    public static boolean m47269b(Uri uri) {
        if (uri == null) {
            return false;
        }
        if ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m47234a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.toString();
    }

    /* renamed from: b */
    private static boolean m47270b(File file) {
        MethodCollector.m26663i(8262);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(8262);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(8262);
        return delete;
    }

    /* renamed from: a */
    private static Object m47229a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m47226a(java.io.InputStream r7, java.io.OutputStream r8) {
        /*
            r6 = 8259(0x2043, float:1.1573E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            r0 = 0
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ all -> 0x002e }
            r5.<init>(r7)     // Catch:{ all -> 0x002e }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r0]     // Catch:{ all -> 0x0029 }
            r3 = 0
            r2 = 0
        L_0x0011:
            int r1 = r5.read(r4)     // Catch:{ all -> 0x0029 }
            r0 = -1
            if (r1 == r0) goto L_0x001d
            r8.write(r4, r3, r1)     // Catch:{ all -> 0x0029 }
            int r2 = r2 + r1
            goto L_0x0011
        L_0x001d:
            r5.close()
            if (r7 == 0) goto L_0x0025
            r7.close()
        L_0x0025:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r2
        L_0x0029:
            r0 = move-exception
            r5.close()
            goto L_0x002f
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r7 == 0) goto L_0x0034
            r7.close()
        L_0x0034:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C24693ad.m47226a(java.io.InputStream, java.io.OutputStream):int");
    }

    /* renamed from: b */
    public static String m47266b(String str, String str2) {
        return m47237a(str, str2.getBytes());
    }

    /* renamed from: b */
    private static Object m47263b(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(8419);
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
                    MethodCollector.m26664o(8419);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: com.facebook.internal.ad$c */
    public static class C24698c {

        /* renamed from: a */
        public List<String> f58633a;

        /* renamed from: b */
        public List<String> f58634b;

        /* renamed from: c */
        public List<String> f58635c;

        static {
            Covode.recordClassIndex(28851);
        }

        public C24698c(List<String> list, List<String> list2, List<String> list3) {
            this.f58633a = list;
            this.f58634b = list2;
            this.f58635c = list3;
        }
    }

    /* renamed from: a */
    public static Uri m47228a(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object a = m47229a(bundle, str3);
                if (a instanceof String) {
                    builder.appendQueryParameter(str3, (String) a);
                }
            }
        }
        return builder.build();
    }

    /* renamed from: a */
    public static Object m47230a(Object obj, Method method, Object... objArr) {
        try {
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_facebook_internal_Utility_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                return a.second;
            }
            Object invoke = method.invoke(obj, objArr);
            C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_facebook_internal_Utility_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Object m47231a(JSONObject jSONObject, String str, String str2) {
        Object opt = jSONObject.opt(str);
        if (opt == null || (((opt instanceof String) && (opt = new JSONTokener((String) opt).nextValue()) == null) || (opt instanceof JSONObject) || (opt instanceof JSONArray))) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new C24798j("Got an unexpected non-JSON object.");
    }
}
