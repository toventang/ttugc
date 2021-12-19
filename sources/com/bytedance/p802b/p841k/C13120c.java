package com.bytedance.p802b.p841k;

import android.os.Build;
import android.os.StatFs;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bytedance.b.k.c */
public final class C13120c {
    static {
        Covode.recordClassIndex(14956);
    }

    /* renamed from: a */
    public static long m23590a(String str) {
        StatFs statFs = new StatFs(str);
        int i = Build.VERSION.SDK_INT;
        return statFs.getTotalBytes();
    }

    /* renamed from: b */
    public static void m23592b(File file) {
        if (file != null && file.exists()) {
            try {
                m23593c(file);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static byte[] m23591a(File file) {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        FileNotFoundException e;
        IOException e2;
        BufferedInputStream bufferedInputStream2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                bufferedInputStream.read(bArr, 0, length);
                bufferedInputStream.close();
                C13122d.m23595a(bufferedInputStream);
                return bArr;
            } catch (FileNotFoundException e3) {
                e = e3;
                e.printStackTrace();
                C13122d.m23595a(bufferedInputStream);
                return null;
            } catch (IOException e4) {
                e2 = e4;
                try {
                    e2.printStackTrace();
                    C13122d.m23595a(bufferedInputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream2 = bufferedInputStream;
                }
            }
        } catch (FileNotFoundException e5) {
            e = e5;
            bufferedInputStream = null;
            e.printStackTrace();
            C13122d.m23595a(bufferedInputStream);
            return null;
        } catch (IOException e6) {
            e2 = e6;
            bufferedInputStream = null;
            e2.printStackTrace();
            C13122d.m23595a(bufferedInputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C13122d.m23595a(bufferedInputStream2);
            throw th;
        }
    }

    /* renamed from: c */
    private static boolean m23593c(File file) {
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
}
