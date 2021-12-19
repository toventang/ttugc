package com.squareup.p2081b;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.b.ae */
public final class C29262ae {

    /* renamed from: a */
    static final StringBuilder f69422a = new StringBuilder();

    /* renamed from: com.squareup.b.ae$b */
    static class ThreadFactoryC29265b implements ThreadFactory {
        static {
            Covode.recordClassIndex(35614);
        }

        ThreadFactoryC29265b() {
        }

        public final Thread newThread(Runnable runnable) {
            return new C29264a(runnable);
        }
    }

    /* renamed from: a */
    static void m58610a() {
        if (!m58617b()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* renamed from: a */
    static void m58613a(String str, String str2, String str3) {
        m58614a(str, str2, str3, "");
    }

    /* renamed from: a */
    static void m58614a(String str, String str2, String str3, String str4) {
        C1764a.m5928a("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4});
    }

    /* renamed from: a */
    private static String m58609a(C29312w wVar, StringBuilder sb) {
        if (wVar.f69564f != null) {
            sb.ensureCapacity(wVar.f69564f.length() + 50);
            sb.append(wVar.f69564f);
        } else if (wVar.f69562d != null) {
            String uri = wVar.f69562d.toString();
            sb.ensureCapacity(uri.length() + 50);
            sb.append(uri);
        } else {
            sb.ensureCapacity(50);
            sb.append(wVar.f69563e);
        }
        sb.append('\n');
        if (wVar.f69571m != 0.0f) {
            sb.append("rotation:").append(wVar.f69571m);
            if (wVar.f69574p) {
                sb.append('@').append(wVar.f69572n).append('x').append(wVar.f69573o);
            }
            sb.append('\n');
        }
        if (wVar.mo51126c()) {
            sb.append("resize:").append(wVar.f69566h).append('x').append(wVar.f69567i);
            sb.append('\n');
        }
        if (wVar.f69568j) {
            sb.append("centerCrop\n");
        } else if (wVar.f69569k) {
            sb.append("centerInside\n");
        }
        if (wVar.f69565g != null) {
            int size = wVar.f69565g.size();
            for (int i = 0; i < size; i++) {
                sb.append(wVar.f69565g.get(i).mo51056b());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    static void m58612a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    static boolean m58615a(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split(" ", 2);
        if ("CACHE".equals(split[0])) {
            return true;
        }
        if (split.length == 1) {
            return false;
        }
        try {
            if (!"CONDITIONAL_CACHE".equals(split[0]) || Integer.parseInt(split[1]) != 304) {
                return false;
            }
            return true;
        } catch (NumberFormatException unused) {
        }
    }

    /* renamed from: a */
    static void m58611a(Looper looper) {
        HandlerC292631 r3 = new Handler(looper) {
            /* class com.squareup.p2081b.C29262ae.HandlerC292631 */

            static {
                Covode.recordClassIndex(35612);
            }

            public final void handleMessage(Message message) {
                sendMessageDelayed(obtainMessage(), 1000);
            }
        };
        r3.sendMessageDelayed(r3.obtainMessage(), 1000);
    }

    /* renamed from: com.squareup.b.ae$a */
    static class C29264a extends Thread {
        static {
            Covode.recordClassIndex(35613);
        }

        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }

        public C29264a(Runnable runnable) {
            super(runnable);
        }
    }

    static {
        Covode.recordClassIndex(35611);
    }

    /* renamed from: b */
    private static boolean m58617b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static String m58606a(RunnableC29267c cVar) {
        return m58607a(cVar, "");
    }

    /* renamed from: a */
    static String m58608a(C29312w wVar) {
        StringBuilder sb = f69422a;
        String a = m58609a(wVar, sb);
        sb.setLength(0);
        return a;
    }

    /* renamed from: c */
    static boolean m58619c(Context context) {
        try {
            if (Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                return true;
            }
            return false;
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: d */
    private static Context m58620d(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    static int m58600a(Bitmap bitmap) {
        int i = Build.VERSION.SDK_INT;
        int byteCount = bitmap.getByteCount();
        if (byteCount >= 0) {
            return byteCount;
        }
        throw new IllegalStateException("Negative size: ".concat(String.valueOf(bitmap)));
    }

    /* renamed from: b */
    static File m58616b(Context context) {
        File file = new File(m58621e(m58620d(context)), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: e */
    private static File m58621e(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    /* renamed from: a */
    static long m58601a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800L), 5242880L);
    }

    /* renamed from: b */
    static byte[] m58618b(InputStream inputStream) {
        MethodCollector.m26663i(9387);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                MethodCollector.m26664o(9387);
                return byteArray;
            }
        }
    }

    /* renamed from: a */
    static AbstractC29285j m58603a(Context context) {
        try {
            Class.forName("com.squareup.a.t");
            return new C29298s(context);
        } catch (ClassNotFoundException unused) {
            return new C29260ad(context);
        }
    }

    /* renamed from: a */
    static <T> T m58605a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: a */
    static Resources m58602a(Context context, C29312w wVar) {
        if (wVar.f69563e != 0 || wVar.f69562d == null) {
            return context.getResources();
        }
        String authority = wVar.f69562d.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new FileNotFoundException("Unable to obtain resources for package: " + wVar.f69562d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + wVar.f69562d);
        }
    }

    /* renamed from: a */
    static int m58599a(Resources resources, C29312w wVar) {
        if (wVar.f69563e != 0 || wVar.f69562d == null) {
            return wVar.f69563e;
        }
        String authority = wVar.f69562d.getAuthority();
        if (authority != null) {
            List<String> pathSegments = wVar.f69562d.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                throw new FileNotFoundException("No path segments: " + wVar.f69562d);
            } else if (pathSegments.size() == 1) {
                try {
                    return Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Last path segment is not a resource ID: " + wVar.f69562d);
                }
            } else if (pathSegments.size() == 2) {
                return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + wVar.f69562d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + wVar.f69562d);
        }
    }

    /* renamed from: a */
    public static Object m58604a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9238);
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
                            C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(9238);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    static String m58607a(RunnableC29267c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        AbstractC29253a aVar = cVar.f69439k;
        if (aVar != null) {
            sb.append(aVar.f69375b.mo51124a());
        }
        List<AbstractC29253a> list = cVar.f69440l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || aVar != null) {
                    sb.append(", ");
                }
                sb.append(list.get(i).f69375b.mo51124a());
            }
        }
        return sb.toString();
    }
}
