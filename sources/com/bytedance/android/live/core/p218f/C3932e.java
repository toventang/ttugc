package com.bytedance.android.live.core.p218f;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.bytedance.android.live.core.f.e */
public final class C3932e {
    static {
        Covode.recordClassIndex(4461);
    }

    /* renamed from: b */
    public static boolean m9580b() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m9576a() {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception unused) {
            str = null;
        }
        if ("mounted".equals(str) || "mounted_ro".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m9577a(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.exists();
    }

    /* renamed from: b */
    private static File m9579b(Context context) {
        if (C58016d.f132220a != null && C58016d.f132224e) {
            return C58016d.f132220a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        C58016d.f132220a = externalCacheDir;
        return externalCacheDir;
    }

    /* renamed from: a */
    public static File m9574a(Context context) {
        if (!m9576a() || !m9580b() || m9579b(context) == null) {
            return null;
        }
        File file = new File(m9579b(context).getPath());
        m9577a(file);
        C3854a.m9453a(3, "file_path", "cache path:" + file.getAbsolutePath());
        return file;
    }

    /* renamed from: a */
    public static boolean m9578a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: b */
    private static boolean m9581b(File file) {
        MethodCollector.m26663i(13260);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(13260);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(13260);
        return delete;
    }

    /* renamed from: a */
    public static void m9575a(String str, String str2) {
        MethodCollector.m26663i(13262);
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
        String str3 = ".." + File.separator;
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (!C13627m.m24498a(name) && name.contains(str3)) {
                    IOException iOException = new IOException("Unzip maybe be unsafe.");
                    MethodCollector.m26664o(13262);
                    throw iOException;
                } else if (nextEntry.isDirectory()) {
                    new File(str2 + File.separator + name).mkdirs();
                } else {
                    File file = new File(str2 + File.separator + name);
                    if (file.exists()) {
                        m9581b(file);
                    } else {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                }
            } else {
                zipInputStream.close();
                MethodCollector.m26664o(13262);
                return;
            }
        }
    }
}
