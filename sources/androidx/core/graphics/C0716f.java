package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.core.content.p032a.C0629c;
import androidx.core.p034e.C0657b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.f */
public class C0716f extends C0721k {

    /* renamed from: a */
    private static Class<?> f2809a;

    /* renamed from: b */
    private static Constructor<?> f2810b;

    /* renamed from: c */
    private static Method f2811c;

    /* renamed from: d */
    private static Method f2812d;

    /* renamed from: e */
    private static boolean f2813e;

    static {
        Covode.recordClassIndex(797);
    }

    C0716f() {
    }

    @Override // androidx.core.graphics.C0721k
    /* renamed from: a */
    public Typeface mo2797a(Context context, C0629c.C0631b bVar, Resources resources, int i) {
        Object b = m2533b();
        C0629c.C0632c[] cVarArr = bVar.f2625a;
        for (C0629c.C0632c cVar : cVarArr) {
            File a = C0725l.m2574a(context);
            if (a == null) {
                return null;
            }
            try {
                if (!C0725l.m2579a(a, resources, cVar.f2631f)) {
                    m2531a(a);
                    return null;
                } else if (!m2532a(b, a.getPath(), cVar.f2627b, cVar.f2628c)) {
                    return null;
                } else {
                    m2531a(a);
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                m2531a(a);
            }
        }
        return mo2799a(b);
    }

    /* renamed from: b */
    private static Object m2533b() {
        m2530a();
        try {
            return f2810b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Class<?>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m2530a() {
        /*
            boolean r0 = androidx.core.graphics.C0716f.f2813e
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r8 = 1
            androidx.core.graphics.C0716f.f2813e = r8
            r9 = 0
            java.lang.String r0 = "android.graphics.FontFamily"
            java.lang.Class r6 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            r7 = 0
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            java.lang.reflect.Constructor r5 = r6.getConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            java.lang.String r3 = "addFontWeightStyle"
            r0 = 3
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2[r7] = r0     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            r2[r8] = r0     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            r1 = 2
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            r2[r1] = r0     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            java.lang.reflect.Method r4 = r6.getMethod(r3, r2)     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r6, r8)     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            java.lang.Class<android.graphics.Typeface> r3 = android.graphics.Typeface.class
            java.lang.String r2 = "createFromFamiliesWithDefault"
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            r1[r7] = r0     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            java.lang.reflect.Method r0 = r3.getMethod(r2, r1)     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            r9 = r5
            goto L_0x004f
        L_0x0042:
            r0 = move-exception
            goto L_0x0045
        L_0x0044:
            r0 = move-exception
        L_0x0045:
            java.lang.Class r0 = r0.getClass()
            r0.getName()
            r0 = r9
            r6 = r0
            r4 = r6
        L_0x004f:
            androidx.core.graphics.C0716f.f2810b = r9
            androidx.core.graphics.C0716f.f2809a = r6
            androidx.core.graphics.C0716f.f2811c = r4
            androidx.core.graphics.C0716f.f2812d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C0716f.m2530a():void");
    }

    /* renamed from: a */
    private static Typeface mo2799a(Object obj) {
        m2530a();
        try {
            Object newInstance = Array.newInstance(f2809a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2812d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static File m2529a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m2531a(File file) {
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    /* renamed from: a */
    private static boolean m2532a(Object obj, String str, int i, boolean z) {
        m2530a();
        try {
            return ((Boolean) f2811c.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.core.graphics.C0721k
    /* renamed from: a */
    public Typeface mo2796a(Context context, CancellationSignal cancellationSignal, C0657b.C0663b[] bVarArr, int i) {
        Typeface typeface;
        String path;
        if (bVarArr.length <= 0) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo2802a(bVarArr, i).f2674a, "r", null);
            if (openFileDescriptor == null) {
                return null;
            }
            try {
                File a = m2529a(openFileDescriptor);
                if (a == null || !a.canRead()) {
                    FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    try {
                        Typeface a2 = super.mo2801a(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return a2;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    if (TypeFaceOptimizer.getSwitch() && (path = a.getPath()) != null) {
                        if (TypeFaceLancet.cache.contains(path)) {
                            typeface = (Typeface) TypeFaceLancet.cache.get(path);
                        } else {
                            typeface = Typeface.createFromFile(a);
                            if (typeface != null) {
                                TypeFaceLancet.cache.put(path, typeface);
                            }
                        }
                        openFileDescriptor.close();
                        return typeface;
                    }
                    typeface = Typeface.createFromFile(a);
                    openFileDescriptor.close();
                    return typeface;
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } catch (IOException unused) {
            return null;
        }
        throw th;
        throw th;
    }
}
