package com.bytedance.disk.p966h;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.p958c.p959a.C14430a;
import com.bytedance.p1746v.p1747a.C23535b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: com.bytedance.disk.h.c */
public final class C14473c {
    static {
        Covode.recordClassIndex(16552);
    }

    /* renamed from: a */
    public static void m26444a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static String m26448c(String str) {
        if (TextUtils.equals(str, "valid_path")) {
            return str;
        }
        return m26451f(str);
    }

    /* renamed from: a */
    public static int m26441a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            File file = new File(str);
            if (file.isDirectory()) {
                return 2;
            }
            if (file.isFile()) {
                return 1;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: d */
    public static long m26449d(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.getUsableSpace();
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: f */
    private static String m26451f(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return new File(str).getCanonicalPath();
        } catch (IOException unused) {
            return str;
        }
    }

    /* renamed from: a */
    private static long m26442a(File file) {
        long length;
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles == null) {
            return 0;
        }
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].isDirectory()) {
                length = m26442a(listFiles[i]);
            } else {
                length = listFiles[i].length();
            }
            j += length;
        }
        return j;
    }

    /* renamed from: b */
    public static long m26447b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                return 0;
            }
            if (file.isDirectory()) {
                return m26442a(file);
            }
            return file.length();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: e */
    public static String m26450e(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Iterator<String> it = C23535b.m44236b(null).iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (str.startsWith(next)) {
                String c = C23535b.m44237c();
                if (str.startsWith(c)) {
                    return str;
                }
                return c + str.substring(next.length());
            }
        }
        Iterator<String> it2 = C23535b.m44238c(null).iterator();
        while (it2.hasNext()) {
            String next2 = it2.next();
            if (str.startsWith(next2)) {
                String a = C23535b.m44232a();
                if (str.startsWith(a)) {
                    return str;
                }
                return a + str.substring(next2.length());
            }
        }
        return str;
    }

    /* renamed from: a */
    public static String m26443a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (i != 0 && i != 1) {
            return str;
        }
        if (i == 0) {
            C14430a aVar = new C14430a("path");
            byte[] a = aVar.mo23256a(Base64.decode(str, 0));
            aVar.mo23255a();
            return new String(a).trim();
        }
        C14430a aVar2 = new C14430a("path");
        byte[] a2 = aVar2.mo23256a(str.getBytes());
        aVar2.mo23255a();
        return Base64.encodeToString(a2, 0).trim();
    }

    /* renamed from: a */
    public static boolean m26445a(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return false;
        }
        int length = str.length();
        int length2 = str2.length();
        if (length - length2 < 0) {
            return false;
        }
        int i = length2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i--;
            if (i >= 0) {
                int i4 = i2 + 1;
                int i5 = i3 + 1;
                if (str.charAt(i2) != str2.charAt(i3)) {
                    return false;
                }
                i2 = i4;
                i3 = i5;
            } else if (length == length2 || str.charAt(i2) == '/') {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: a */
    public static boolean m26446a(String str, boolean z) {
        if ((!z || new File(str).exists()) && !TextUtils.isEmpty(str) && str.startsWith("/")) {
            Iterator<String> it = C23535b.m44236b(null).iterator();
            while (it.hasNext()) {
                if (str.startsWith(it.next())) {
                    return true;
                }
            }
            Iterator<String> it2 = C23535b.m44238c(null).iterator();
            while (it2.hasNext()) {
                if (str.startsWith(it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
