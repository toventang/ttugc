package com.bytedance.monitor.p1546a.p1547a;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.librarian.Librarian;
import com.bytedance.monitor.p1546a.C21454c;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.bytedance.monitor.a.a.b */
public final class C21433b {

    /* renamed from: a */
    private static List<String> f50820a = new ArrayList();

    static {
        Covode.recordClassIndex(25056);
    }

    /* renamed from: a */
    private static File m40235a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: a */
    private static boolean m40238a(File file) {
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
    public static synchronized boolean m40237a(Context context, String str) {
        synchronized (C21433b.class) {
            if (f50820a.contains(str)) {
                return true;
            }
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.m38962a(str);
                C58032m.m104852a(uptimeMillis, str);
                f50820a.add(str);
            } catch (UnsatisfiedLinkError e) {
                String mapLibraryName = System.mapLibraryName(str);
                if (context == null || m40235a(context) == null) {
                    return false;
                }
                File file = new File(m40235a(context), "libso");
                if (!file.exists()) {
                    new File(file.getAbsolutePath()).mkdirs();
                }
                File file2 = new File(file, mapLibraryName);
                if (file2.exists()) {
                    m40238a(file2);
                }
                if (m40236a(context, str, file2) != null) {
                    e.getMessage();
                    return false;
                }
                String absolutePath = file2.getAbsolutePath();
                long uptimeMillis2 = SystemClock.uptimeMillis();
                System.load(absolutePath);
                C58032m.m104852a(uptimeMillis2, absolutePath);
                f50820a.add(str);
            } catch (Throwable unused) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    private static String m40236a(Context context, String str, File file) {
        ZipFile zipFile;
        String str2;
        InputStream inputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
            try {
                ZipEntry entry = zipFile.getEntry("lib/" + Build.CPU_ABI + "/" + System.mapLibraryName(str));
                if (entry == null) {
                    int indexOf = Build.CPU_ABI.indexOf(45);
                    StringBuilder sb = new StringBuilder("lib/");
                    String str3 = Build.CPU_ABI;
                    if (indexOf <= 0) {
                        indexOf = Build.CPU_ABI.length();
                    }
                    String sb2 = sb.append(str3.substring(0, indexOf)).append("/").append(System.mapLibraryName(str)).toString();
                    entry = zipFile.getEntry(sb2);
                    if (entry == null) {
                        str2 = "Library entry not found:".concat(String.valueOf(sb2));
                        C21454c.m40295a((Closeable) null);
                        C21454c.m40295a((Closeable) null);
                        C21454c.m40296a(zipFile);
                        return str2;
                    }
                }
                file.createNewFile();
                inputStream = zipFile.getInputStream(entry);
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        str2 = th.getMessage();
                        C21454c.m40295a(fileOutputStream2);
                        C21454c.m40295a(inputStream);
                        C21454c.m40296a(zipFile);
                        return str2;
                    } catch (Throwable th3) {
                        C21454c.m40295a(fileOutputStream2);
                        C21454c.m40295a(inputStream);
                        C21454c.m40296a(zipFile);
                        throw th3;
                    }
                }
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            C21431a.m40234a("android.os.FileUtils", "setPermissions", file.getAbsolutePath(), 493, -1, -1);
                            C21454c.m40295a(fileOutputStream);
                            C21454c.m40295a(inputStream);
                            C21454c.m40296a(zipFile);
                            return null;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream2 = fileOutputStream;
                    str2 = th.getMessage();
                    C21454c.m40295a(fileOutputStream2);
                    C21454c.m40295a(inputStream);
                    C21454c.m40296a(zipFile);
                    return str2;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStream = null;
                str2 = th.getMessage();
                C21454c.m40295a(fileOutputStream2);
                C21454c.m40295a(inputStream);
                C21454c.m40296a(zipFile);
                return str2;
            }
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
            zipFile = null;
            str2 = th.getMessage();
            C21454c.m40295a(fileOutputStream2);
            C21454c.m40295a(inputStream);
            C21454c.m40296a(zipFile);
            return str2;
        }
    }
}
