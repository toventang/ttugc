package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: com.facebook.soloader.j */
public final class C25018j {
    static {
        Covode.recordClassIndex(30350);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.soloader.j$a */
    public static final class C25019a {
        static {
            Covode.recordClassIndex(30351);
        }

        public static String[] getSupportedAbis() {
            return Build.SUPPORTED_ABIS;
        }

        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) {
            try {
                Os.posix_fallocate(fileDescriptor, 0, j);
            } catch (ErrnoException e) {
                if (e.errno != OsConstants.EOPNOTSUPP && e.errno != OsConstants.ENOSYS && e.errno != OsConstants.EINVAL) {
                    throw new IOException(e.toString(), e);
                }
            }
        }
    }

    /* renamed from: a */
    public static String[] m47971a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return C25019a.getSupportedAbis();
        }
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    /* renamed from: a */
    public static int m47967a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        throw r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m47972b(java.io.File r4) {
        /*
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L_0x0029
            java.io.File[] r2 = r4.listFiles()
            if (r2 == 0) goto L_0x0019
            r1 = 0
        L_0x000d:
            int r0 = r2.length
            if (r1 >= r0) goto L_0x0018
            r0 = r2[r1]
            m47972b(r0)
            int r1 = r1 + 1
            goto L_0x000d
        L_0x0018:
            return
        L_0x0019:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "cannot list directory "
            java.lang.String r0 = r0.concat(r1)
            r2.<init>(r0)
            throw r2
        L_0x0029:
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = "_lock"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L_0x0053
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile
            java.lang.String r0 = "r"
            r3.<init>(r4, r0)
            java.io.FileDescriptor r0 = r3.getFD()     // Catch:{ all -> 0x0047 }
            r0.sync()     // Catch:{ all -> 0x0047 }
            r3.close()
            return
        L_0x0047:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r0 = move-exception
            r2.addSuppressed(r0)
        L_0x0052:
            throw r1
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C25018j.m47972b(java.io.File):void");
    }

    /* renamed from: c */
    private static boolean m47973c(File file) {
        MethodCollector.m26663i(7051);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(7051);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(7051);
        return delete;
    }

    /* renamed from: a */
    public static void m47970a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    m47970a(file2);
                }
            } else {
                return;
            }
        }
        if (!m47973c(file) && file.exists()) {
            throw new IOException("could not delete: ".concat(String.valueOf(file)));
        }
    }

    /* renamed from: a */
    public static int m47969a(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    static int m47968a(RandomAccessFile randomAccessFile, InputStream inputStream, byte[] bArr) {
        int read;
        MethodCollector.m26663i(7054);
        int i = 0;
        while (i < Integer.MAX_VALUE && (read = inputStream.read(bArr, 0, Math.min(32768, Integer.MAX_VALUE - i))) != -1) {
            randomAccessFile.write(bArr, 0, read);
            i += read;
        }
        MethodCollector.m26664o(7054);
        return i;
    }
}
