package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SoLoader {

    /* renamed from: a */
    static final boolean f59315a;

    /* renamed from: b */
    static AbstractC25016h f59316b;

    /* renamed from: c */
    private static final ReentrantReadWriteLock f59317c = new ReentrantReadWriteLock();

    /* renamed from: d */
    private static AbstractC25017i[] f59318d = null;

    /* renamed from: e */
    private static int f59319e = 0;

    /* renamed from: f */
    private static AbstractC25021l f59320f;

    /* renamed from: g */
    private static C25007b f59321g;

    /* renamed from: h */
    private static final HashSet<String> f59322h = new HashSet<>();

    /* renamed from: i */
    private static final Map<String, Object> f59323i = new HashMap();

    /* renamed from: j */
    private static final Set<String> f59324j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k */
    private static AbstractC25020k f59325k = null;

    /* renamed from: l */
    private static int f59326l;

    /* access modifiers changed from: package-private */
    public static class Api14Utils {
        static {
            Covode.recordClassIndex(30334);
        }

        private Api14Utils() {
        }

        /* renamed from: a */
        public static String m47939a() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e);
                }
            } else {
                throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
            }
        }
    }

    static {
        Covode.recordClassIndex(30332);
        boolean z = false;
        try {
            int i = Build.VERSION.SDK_INT;
            z = true;
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        f59315a = z;
    }

    /* renamed from: a */
    private static int m47928a() {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = f59317c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if ((f59326l & 2) != 0) {
                i = 1;
            } else {
                i = 0;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return i;
        } catch (Throwable th) {
            f59317c.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: c */
    private static Method m47935c() {
        Method method;
        if (Build.VERSION.SDK_INT < 23) {
            return null;
        }
        if (Build.VERSION.SDK_INT <= 27) {
            try {
                method = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
            } catch (NoSuchMethodException | SecurityException unused) {
                return null;
            }
        } else {
            method = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class);
        }
        method.setAccessible(true);
        return method;
    }

    /* renamed from: b */
    private static synchronized void m47934b() {
        final boolean z;
        final String str;
        synchronized (SoLoader.class) {
            MethodCollector.m26663i(9599);
            final Runtime runtime = Runtime.getRuntime();
            final Method c = m47935c();
            if (c != null) {
                z = true;
            } else {
                z = false;
            }
            final String str2 = null;
            if (z) {
                str = Api14Utils.m47939a();
                if (str != null) {
                    String[] split = str.split(":");
                    ArrayList arrayList = new ArrayList(split.length);
                    for (String str3 : split) {
                        if (!str3.contains("!")) {
                            arrayList.add(str3);
                        }
                    }
                    str2 = TextUtils.join(":", arrayList);
                }
            } else {
                str = null;
            }
            f59316b = new AbstractC25016h() {
                /* class com.facebook.soloader.SoLoader.C250031 */

                static {
                    Covode.recordClassIndex(30333);
                }

                /* renamed from: a */
                private static Object m47936a(Method method, Object obj, Object[] objArr) {
                    Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_facebook_soloader_SoLoader$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a.first).booleanValue()) {
                        return a.second;
                    }
                    Object invoke = method.invoke(obj, objArr);
                    C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_facebook_soloader_SoLoader$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    return invoke;
                }

                /* renamed from: a */
                private static String m47937a(String str) {
                    String str2;
                    MethodCollector.m26663i(8981);
                    try {
                        File file = new File(str);
                        MessageDigest instance = MessageDigest.getInstance("MD5");
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                instance.update(bArr, 0, read);
                            }
                            str2 = C1764a.m5928a("%32x", new Object[]{new BigInteger(1, instance.digest())});
                            fileInputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            MethodCollector.m26664o(8981);
                            throw th;
                        }
                    } catch (IOException e) {
                        str2 = e.toString();
                    } catch (NoSuchAlgorithmException e2) {
                        str2 = e2.toString();
                    }
                    MethodCollector.m26664o(8981);
                    return str2;
                }

                @Override // com.facebook.soloader.AbstractC25016h
                /* renamed from: a */
                public final void mo40895a(String str, int i) {
                    String str2;
                    Throwable th;
                    String str3;
                    MethodCollector.m26663i(8979);
                    if (z) {
                        if ((i & 4) == 4) {
                            str2 = str;
                        } else {
                            str2 = str2;
                        }
                        try {
                            synchronized (runtime) {
                                try {
                                    if (Build.VERSION.SDK_INT <= 27) {
                                        str3 = (String) m47936a(c, runtime, new Object[]{str, SoLoader.class.getClassLoader(), str2});
                                    } else {
                                        str3 = (String) m47936a(c, runtime, new Object[]{str, SoLoader.class.getClassLoader()});
                                    }
                                    if (str3 == null) {
                                        try {
                                            MethodCollector.m26664o(8979);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            MethodCollector.m26664o(8979);
                                            throw th;
                                        }
                                    } else {
                                        UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(str3);
                                        MethodCollector.m26664o(8979);
                                        throw unsatisfiedLinkError;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    MethodCollector.m26664o(8979);
                                    throw th;
                                }
                            }
                        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                            RuntimeException runtimeException = new RuntimeException("Error: Cannot load ".concat(String.valueOf(str)), e);
                            MethodCollector.m26664o(8979);
                            throw runtimeException;
                        } catch (Throwable th4) {
                            if (0 != 0) {
                                m47937a(str);
                            }
                            MethodCollector.m26664o(8979);
                            throw th4;
                        }
                    } else {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        System.load(str);
                        C58032m.m104852a(uptimeMillis, str);
                        MethodCollector.m26664o(8979);
                    }
                }
            };
            MethodCollector.m26664o(9599);
        }
    }

    /* renamed from: com.facebook.soloader.SoLoader$a */
    public static final class C25004a extends UnsatisfiedLinkError {
        static {
            Covode.recordClassIndex(30335);
        }

        C25004a(Throwable th) {
            super("APK was built for a different platform");
            initCause(th);
        }
    }

    /* renamed from: a */
    public static void m47929a(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            m47934b();
            m47930a(context, 0);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    /* renamed from: a */
    public static boolean m47932a(String str) {
        boolean z;
        MethodCollector.m26663i(9601);
        ReentrantReadWriteLock reentrantReadWriteLock = f59317c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f59318d == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    reentrantReadWriteLock.readLock().lock();
                    try {
                        if (f59318d != null) {
                            reentrantReadWriteLock.readLock().unlock();
                        } else {
                            RuntimeException runtimeException = new RuntimeException("SoLoader.init() not yet called");
                            MethodCollector.m26664o(9601);
                            throw runtimeException;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    synchronized (SoLoader.class) {
                        try {
                            z = !f59322h.contains(str);
                            if (z && f59325k == null) {
                                long uptimeMillis = SystemClock.uptimeMillis();
                                Librarian.m38964a(str, false, (Context) null);
                                C58032m.m104852a(uptimeMillis, str);
                            }
                        } catch (Throwable th2) {
                            MethodCollector.m26664o(9601);
                            throw th2;
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    MethodCollector.m26664o(9601);
                    return z;
                }
            }
            reentrantReadWriteLock.readLock().unlock();
            boolean a = m47933a(System.mapLibraryName(str), str, 0, null);
            MethodCollector.m26664o(9601);
            return a;
        } finally {
            f59317c.readLock().unlock();
            MethodCollector.m26664o(9601);
        }
    }

    /* renamed from: a */
    private static void m47930a(Context context, int i) {
        String[] split;
        int i2;
        f59317c.writeLock().lock();
        try {
            if (f59318d == null) {
                f59326l = 0;
                ArrayList arrayList = new ArrayList();
                String str = System.getenv("LD_LIBRARY_PATH");
                if (str == null) {
                    str = "/vendor/lib:/system/lib";
                }
                for (String str2 : str.split(":")) {
                    arrayList.add(new C25008c(new File(str2), 2));
                }
                if (context != null) {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    if ((applicationInfo.flags & 1) == 0 || (applicationInfo.flags & 128) != 0) {
                        int i3 = Build.VERSION.SDK_INT;
                        C25007b bVar = new C25007b(context, 0);
                        f59321g = bVar;
                        arrayList.add(0, bVar);
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    C25005a aVar = new C25005a(context, "lib-main", i2);
                    f59320f = aVar;
                    arrayList.add(0, aVar);
                }
                AbstractC25017i[] iVarArr = (AbstractC25017i[]) arrayList.toArray(new AbstractC25017i[arrayList.size()]);
                int a = m47928a();
                int length = iVarArr.length;
                while (true) {
                    int i4 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    iVarArr[i4].mo40900a(a);
                    length = i4;
                }
                f59318d = iVarArr;
                f59319e++;
            }
        } finally {
            f59317c.writeLock().unlock();
        }
    }

    /* renamed from: a */
    private static void m47931a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        ReentrantReadWriteLock reentrantReadWriteLock;
        boolean z;
        boolean z2;
        ReentrantReadWriteLock reentrantReadWriteLock2 = f59317c;
        reentrantReadWriteLock2.readLock().lock();
        try {
            if (f59318d != null) {
                reentrantReadWriteLock2.readLock().unlock();
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z = true;
                } else {
                    z = false;
                }
                if (f59315a) {
                    Trace.beginSection("SoLoader.loadLibrary[" + str + "]");
                }
                int i2 = 0;
                do {
                    try {
                        f59317c.readLock().lock();
                        int i3 = f59319e;
                        int i4 = 0;
                        while (true) {
                            if (i2 != 0) {
                                break;
                            }
                            try {
                                AbstractC25017i[] iVarArr = f59318d;
                                if (i4 >= iVarArr.length) {
                                    break;
                                }
                                i2 = iVarArr[i4].mo40899a(str, i, threadPolicy);
                                if (i2 == 3) {
                                    AbstractC25021l lVar = f59320f;
                                    if (lVar != null) {
                                        lVar.mo40912a(str);
                                        i2 = f59320f.mo40899a(str, i, threadPolicy);
                                    }
                                } else {
                                    i4++;
                                }
                            } catch (Throwable th) {
                                f59317c.readLock().unlock();
                                throw th;
                            }
                        }
                        if (i2 != 0) {
                            break;
                        }
                        reentrantReadWriteLock.writeLock().lock();
                        try {
                            C25007b bVar = f59321g;
                            if (bVar != null && bVar.mo40901a()) {
                                f59319e++;
                            }
                            if (f59319e != i3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            reentrantReadWriteLock.writeLock().unlock();
                        } catch (Throwable th2) {
                            f59317c.writeLock().unlock();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        if (f59315a) {
                            Trace.endSection();
                        }
                        if (z) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                        if (i2 == 0 || i2 == 3) {
                            String concat = "couldn't find DSO to load: ".concat(String.valueOf(str));
                            String message = th3.getMessage();
                            if (message == null) {
                                message = th3.toString();
                            }
                            throw new UnsatisfiedLinkError(concat + " caused by: " + message);
                        }
                        return;
                    }
                } while (z2);
                if (f59315a) {
                    Trace.endSection();
                }
                if (z) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                if (i2 == 0 || i2 == 3) {
                    throw new UnsatisfiedLinkError("couldn't find DSO to load: ".concat(String.valueOf(str)));
                }
                return;
            }
            throw new UnsatisfiedLinkError("couldn't find DSO to load: ".concat(String.valueOf(str)));
        } finally {
            f59317c.readLock().unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        monitor-enter(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r2.contains(r7) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        monitor-exit(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        monitor-exit(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        m47931a(r7, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0051, code lost:
        monitor-enter(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r2.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0055, code lost:
        monitor-exit(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005a, code lost:
        if (android.text.TextUtils.isEmpty(r8) != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005c, code lost:
        com.facebook.soloader.SoLoader.f59324j.contains(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0061, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0062, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9604);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0066, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0069, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9604);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006e, code lost:
        r1 = r2.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0072, code lost:
        if (r1 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007c, code lost:
        r0 = new com.facebook.soloader.SoLoader.C25004a(r2);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9604);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0084, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0085, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9604);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0088, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0089, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008a, code lost:
        r0 = new java.lang.RuntimeException(r1);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9604);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0092, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0093, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0095, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9604);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0098, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x009b, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9604);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x009e, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m47933a(java.lang.String r7, java.lang.String r8, int r9, android.os.StrictMode.ThreadPolicy r10) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.m47933a(java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }
}
