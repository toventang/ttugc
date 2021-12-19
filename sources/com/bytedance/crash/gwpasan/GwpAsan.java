package com.bytedance.crash.gwpasan;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14069r;
import com.bytedance.librarian.Librarian;
import java.io.File;
import org.json.JSONArray;

public class GwpAsan {

    /* renamed from: g */
    public static String f33791g;

    /* renamed from: h */
    public static boolean f33792h;

    /* renamed from: i */
    public static boolean f33793i;

    /* renamed from: j */
    public static boolean f33794j;

    /* renamed from: k */
    public static File f33795k;

    /* renamed from: l */
    public static Context f33796l;

    /* renamed from: m */
    static String f33797m;

    /* renamed from: o */
    private static File f33798o;

    /* renamed from: a */
    public int f33799a;

    /* renamed from: b */
    public int f33800b;

    /* renamed from: c */
    public int f33801c;

    /* renamed from: d */
    public int f33802d;

    /* renamed from: e */
    public int f33803e;

    /* renamed from: f */
    public int f33804f;

    /* renamed from: n */
    private boolean f33805n;

    static {
        Covode.recordClassIndex(15936);
    }

    public static native void GwpAsanSetParams(int i, int i2, String str, String str2, String str3);

    public static native int gwpAsanNativeInit(int i, int i2, int i3, int i4, int i5);

    /* renamed from: a */
    public final boolean mo22357a() {
        C13933m.f33942g.isDebugMode();
        if (!this.f33805n) {
            try {
                Librarian.m38965b("npth_xasan", true, f33796l);
                this.f33805n = true;
            } catch (Throwable unused) {
            }
        }
        return this.f33805n;
    }

    /* renamed from: b */
    public static boolean m25105b() {
        File b = C14069r.m25624b(C13933m.f33936a);
        if (!b.exists() || !b.isDirectory()) {
            b.mkdirs();
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (m25104a(b, "gwpfile")) {
            try {
                long parseLong = Long.parseLong(C14056j.m25557a(f33798o, "\n"));
                if (currentTimeMillis >= parseLong && currentTimeMillis - parseLong < 259200) {
                    C13849d.m25013a("XAsanCheckTime Less than 3 day lastTime:" + parseLong + " currentTime:" + currentTimeMillis, "EnsureNotReachHere", null);
                    return false;
                } else if (currentTimeMillis >= parseLong && currentTimeMillis - parseLong >= 259200) {
                    C14056j.m25574a(f33798o);
                    return true;
                } else if (parseLong > currentTimeMillis) {
                    C13849d.m25013a("XAsanCheckTime lastTime:" + parseLong + " currentTime:" + currentTimeMillis, "EnsureNotReachHere", null);
                    return false;
                }
            } catch (Throwable th) {
                C13849d.m25014a("NPTH_CATCH", th);
            }
        }
        return true;
    }

    /* renamed from: a */
    public static String m25103a(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append((CharSequence) str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable unused) {
        }
        return sb.toString().toUpperCase();
    }

    /* renamed from: a */
    private static boolean m25104a(File file, String str) {
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            try {
                if (!file2.getName().isEmpty() && !file2.isDirectory() && file2.getName().equals(str) && file2.length() > 0) {
                    f33798o = file2.getAbsoluteFile();
                    return true;
                }
            } catch (Throwable th) {
                C13849d.m25014a("NPTH_CATCH", th);
            }
        }
        return false;
    }

    /* renamed from: a */
    public static int m25102a(JSONArray jSONArray, int i, String str) {
        while (i < jSONArray.length()) {
            String optString = jSONArray.optString(i, null);
            if (optString != null && optString.startsWith(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public GwpAsan(Context context, File file, int i, int i2, int i3, int i4, int i5, int i6) {
        f33796l = context == null ? C13933m.f33936a : context;
        f33795k = file;
        this.f33800b = i2;
        this.f33801c = i3;
        this.f33802d = i4;
        this.f33799a = i5;
        this.f33804f = i6;
        this.f33803e = i;
        f33793i = false;
        f33794j = false;
    }
}
