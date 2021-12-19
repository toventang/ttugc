package com.bytedance.common.p894a.p898d;

import android.os.Build;
import com.bytedance.common.p894a.C13477a;
import com.bytedance.common.p894a.C13481b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dalvik.system.BaseDexClassLoader;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

/* renamed from: com.bytedance.common.a.d.b */
public final class C13495b {

    /* renamed from: a */
    private static byte[] f32872a = {80, 75, 3, 4};

    /* renamed from: b */
    private static byte[] f32873b = {80, 75, 5, 6};

    static {
        Covode.recordClassIndex(15503);
    }

    /* renamed from: c */
    public static boolean m24273c(File file) {
        if (file == null || !file.exists() || file.length() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m24274d(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            file.getParentFile().mkdirs();
            return file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static long m24269a(String str) {
        File file = new File(str);
        long j = 0;
        if (!file.exists() || Build.VERSION.SDK_INT < 26) {
            return 0;
        }
        try {
            j = Files.readAttributes(file.toPath(), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis();
            return j;
        } catch (IOException e) {
            e.printStackTrace();
            return j;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        if (r1 == null) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m24270a(java.io.File r6) {
        /*
            r5 = 820(0x334, float:1.149E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
            boolean r0 = r6.isDirectory()
            r4 = 0
            if (r0 == 0) goto L_0x0010
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r4
        L_0x0010:
            r1 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x003b }
            r3.<init>(r6)     // Catch:{ IOException -> 0x003b }
            r2 = 4
            byte[] r1 = new byte[r2]     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            int r0 = r3.read(r1, r4, r2)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            if (r0 != r2) goto L_0x0031
            byte[] r0 = com.bytedance.common.p894a.p898d.C13495b.f32872a     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            if (r0 != 0) goto L_0x002f
            byte[] r0 = com.bytedance.common.p894a.p898d.C13495b.f32873b     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
        L_0x002f:
            r0 = 1
            r4 = 1
        L_0x0031:
            r3.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x004f
        L_0x0035:
            r0 = move-exception
            r1 = r3
            goto L_0x0043
        L_0x0038:
            r0 = move-exception
            r1 = r3
            goto L_0x003c
        L_0x003b:
            r0 = move-exception
        L_0x003c:
            r0.printStackTrace()     // Catch:{ all -> 0x0040 }
            goto L_0x004a
        L_0x0040:
            r0 = move-exception
            if (r1 == 0) goto L_0x0046
        L_0x0043:
            r1.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            throw r0
        L_0x004a:
            if (r1 == 0) goto L_0x004f
            r1.close()
        L_0x004f:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.p894a.p898d.C13495b.m24270a(java.io.File):boolean");
    }

    /* renamed from: b */
    public static byte[] m24272b(File file) {
        MethodCollector.m26663i(830);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            byte[] bArr = new byte[512];
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, 512);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    bufferedInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    MethodCollector.m26664o(830);
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            MethodCollector.m26664o(830);
            throw th;
        }
    }

    /* renamed from: b */
    public static File m24271b(String str) {
        File file = new File(C13477a.m24233a().getApplicationInfo().nativeLibraryDir + File.separator + System.mapLibraryName(str));
        if (file.exists()) {
            return file;
        }
        try {
            ClassLoader classLoader = C13481b.class.getClassLoader();
            while (!(classLoader instanceof BaseDexClassLoader) && classLoader.getParent() != null) {
                classLoader = classLoader.getParent();
            }
            if (!(classLoader instanceof BaseDexClassLoader)) {
                return file;
            }
            Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(classLoader);
            Field declaredField2 = obj.getClass().getDeclaredField("nativeLibraryDirectories");
            declaredField2.setAccessible(true);
            for (File file2 : (List) declaredField2.get(obj)) {
                File file3 = new File(file2, System.mapLibraryName(str));
                try {
                    if (file3.exists()) {
                        return file3;
                    }
                    file = file3;
                } catch (Throwable unused) {
                    return file3;
                }
            }
            return file;
        } catch (Throwable unused2) {
            return file;
        }
    }
}
