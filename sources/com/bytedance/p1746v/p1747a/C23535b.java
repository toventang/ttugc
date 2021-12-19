package com.bytedance.p1746v.p1747a;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1746v.p1747a.C23536c;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.v.a.b */
public class C23535b {

    /* renamed from: a */
    public static final String f55746a = new String(C23534a.f55740a);

    /* renamed from: b */
    public static final String f55747b = new String(C23534a.f55741b);

    /* renamed from: c */
    public static final String f55748c = new String(C23534a.f55742c);

    /* renamed from: d */
    public static final String f55749d = new String(C23534a.f55743d);

    /* renamed from: e */
    public static final String f55750e = new String(C23534a.f55744e);

    /* renamed from: f */
    public static final String f55751f = new String(C23534a.f55745f);

    /* renamed from: g */
    public static HashSet<String> f55752g = new HashSet<>();

    /* renamed from: h */
    public static HashSet<String> f55753h = new HashSet<>();

    /* renamed from: i */
    private static HashSet<String> f55754i = new HashSet<>();

    /* renamed from: j */
    private static String f55755j = null;

    /* renamed from: k */
    private static int f55756k = 0;

    /* renamed from: l */
    private static String f55757l = null;

    /* renamed from: m */
    private static String f55758m = null;

    /* renamed from: n */
    private static String f55759n = null;

    /* renamed from: o */
    private static boolean f55760o = false;

    /* renamed from: p */
    private static C23536c.C23537a<Integer> f55761p = new C23536c.C23537a<>("android.os.UserHandle", "myUserId", new Class[0]);

    /* renamed from: d */
    private static int m44239d() {
        Integer a;
        if (!f55760o && f55756k == 0 && (a = f55761p.mo38338a(new Object[0])) != null) {
            f55756k = a.intValue();
        }
        return f55756k;
    }

    /* renamed from: a */
    public static String m44232a() {
        String str = f55757l;
        if (str != null) {
            return str;
        }
        String str2 = f55746a;
        if (f55753h.isEmpty() || f55753h.contains(str2)) {
            f55757l = str2;
            return str2;
        }
        String str3 = null;
        Iterator<String> it = f55753h.iterator();
        while (it.hasNext()) {
            str3 = it.next();
            if (str3.startsWith(str2)) {
                f55757l = str3;
                return str3;
            }
        }
        f55757l = str3;
        return str3;
    }

    /* renamed from: b */
    public static String m44235b() {
        String str = f55759n;
        if (str != null) {
            return str;
        }
        if (!TextUtils.isEmpty(f55755j)) {
            f55759n = m44232a() + f55747b + "/" + f55755j;
        }
        return f55759n;
    }

    static {
        Covode.recordClassIndex(27571);
    }

    /* renamed from: c */
    public static String m44237c() {
        String str = f55758m;
        if (str != null) {
            return str;
        }
        if (!f55752g.isEmpty()) {
            Iterator<String> it = f55752g.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.startsWith("/data")) {
                    f55758m = next;
                    return next;
                }
            }
        } else if (!TextUtils.isEmpty(f55755j)) {
            String str2 = f55749d + "/" + f55755j;
            f55758m = str2;
            return str2;
        }
        return f55758m;
    }

    /* renamed from: a */
    private static String m44233a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return new File(str).getCanonicalPath();
        } catch (IOException unused) {
            return str;
        }
    }

    /* renamed from: e */
    private static File m44241e(Context context) {
        if (C58016d.f132220a != null && C58016d.f132224e) {
            return C58016d.f132220a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        C58016d.f132220a = externalCacheDir;
        return externalCacheDir;
    }

    /* renamed from: f */
    private static void m44242f(Context context) {
        f55758m = context.getApplicationInfo().dataDir;
        try {
            File e = m44241e(context);
            if (e != null) {
                String parent = e.getParent();
                f55759n = parent;
                if (parent != null) {
                    Iterator<String> it = m44238c(context).iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (f55759n.startsWith(next)) {
                            f55757l = next;
                            return;
                        }
                    }
                    f55759n = null;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    private static List<String> m44243g(Context context) {
        HashSet hashSet = new HashSet();
        int i = Build.VERSION.SDK_INT;
        try {
            Method declaredMethod = StorageManager.class.getDeclaredMethod(f55751f, new Class[0]);
            declaredMethod.setAccessible(true);
            String[] strArr = (String[]) declaredMethod.invoke((StorageManager) m44231a(context, "storage"), new Object[0]);
            if (strArr != null && strArr.length > 0) {
                for (String str : strArr) {
                    hashSet.add(str);
                }
            }
        } catch (Exception unused) {
        }
        return new ArrayList(hashSet);
    }

    /* renamed from: d */
    public static HashSet<String> m44240d(Context context) {
        MethodCollector.m26663i(9069);
        if (!f55760o) {
            synchronized (f55754i) {
                try {
                    Iterator<String> it = f55753h.iterator();
                    while (it.hasNext()) {
                        f55754i.add(it.next() + f55747b + "/" + context.getPackageName());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9069);
                    throw th;
                }
            }
        }
        HashSet<String> hashSet = f55754i;
        MethodCollector.m26664o(9069);
        return hashSet;
    }

    /* renamed from: a */
    public static void m44234a(Context context) {
        MethodCollector.m26663i(9059);
        synchronized (C23535b.class) {
            try {
                if (!f55760o) {
                    m44239d();
                    try {
                        m44241e(context);
                    } catch (Exception unused) {
                    }
                    m44236b(context);
                    m44238c(context);
                    m44240d(context);
                    m44242f(context);
                    f55755j = context.getPackageName();
                    f55760o = true;
                    MethodCollector.m26664o(9059);
                }
            } finally {
                MethodCollector.m26664o(9059);
            }
        }
    }

    /* renamed from: b */
    public static HashSet<String> m44236b(Context context) {
        MethodCollector.m26663i(9061);
        if (!f55760o) {
            synchronized (f55752g) {
                try {
                    if (f55752g.isEmpty() && context != null) {
                        String str = context.getApplicationInfo().dataDir;
                        String a = m44233a(str);
                        f55752g.add(str);
                        f55752g.add(a);
                        if (a != null) {
                            String str2 = f55749d;
                            if (!a.startsWith(str2)) {
                                String str3 = str2 + "/" + context.getPackageName();
                                if (a.startsWith(str2 + "/")) {
                                    a = f55750e + "/" + f55756k + a.substring(str2.length());
                                }
                                f55752g.add(str3);
                                f55752g.add(a);
                            }
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9061);
                    throw th;
                }
            }
        }
        HashSet<String> hashSet = f55752g;
        MethodCollector.m26664o(9061);
        return hashSet;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:8|9|(1:11)|12|13|(1:15)|16|17|18|(1:21)|22|(4:25|(2:27|39)(1:38)|36|23)|37|28) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0053 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e A[Catch:{ Exception -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashSet<java.lang.String> m44238c(android.content.Context r5) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1746v.p1747a.C23535b.m44238c(android.content.Context):java.util.HashSet");
    }

    /* renamed from: a */
    private static Object m44231a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9220);
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
                    MethodCollector.m26664o(9220);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
