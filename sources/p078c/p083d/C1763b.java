package p078c.p083d;

import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: c.d.b */
public final class C1763b {
    static {
        Covode.recordClassIndex(1933);
    }

    /* renamed from: b */
    public static boolean m5925b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m5926c() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m5924a() {
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: a */
    public static void m5922a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m5923a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static String m5921a(String str) {
        int length = str.length();
        char[] charArray = str.toCharArray();
        int i = 0;
        char c = 0;
        int i2 = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '/' || c != '/') {
                charArray[i2] = c2;
                i2++;
            }
            i++;
            c = c2;
        }
        if (c == '/' && length > 1) {
            i2--;
        }
        if (i2 != length) {
            return new String(charArray, 0, i2);
        }
        return str;
    }

    /* renamed from: a */
    public static Bundle m5920a(String str, String[] strArr, int i, int i2) {
        Bundle bundle = new Bundle();
        if (m5925b()) {
            bundle.putString("android:query-arg-sql-selection", str);
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
            bundle.putString("android:query-arg-sql-sort-order", "_id DESC");
            if (m5925b() && i > 0) {
                bundle.putString("android:query-arg-sql-limit", i + " offset " + i2);
            }
        }
        return bundle;
    }
}
