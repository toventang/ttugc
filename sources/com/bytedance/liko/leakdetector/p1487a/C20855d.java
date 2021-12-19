package com.bytedance.liko.leakdetector.p1487a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: com.bytedance.liko.leakdetector.a.d */
public final class C20855d {
    static {
        Covode.recordClassIndex(24434);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m39208a(java.lang.String r7, java.lang.String r8, java.util.List<java.lang.String> r9) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.liko.leakdetector.p1487a.C20855d.m39208a(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    /* renamed from: a */
    private static void m39209a(ZipOutputStream zipOutputStream, File file, String str) {
        MethodCollector.m26663i(14292);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        str = file.getName() + File.separator + file2.getName() + File.separator;
                    }
                    m39209a(zipOutputStream, file2, str);
                }
            }
            MethodCollector.m26664o(14292);
            return;
        }
        byte[] bArr = new byte[2048];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        zipOutputStream.putNextEntry(new ZipEntry(str + file.getName()));
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                zipOutputStream.write(bArr, 0, read);
            } else {
                bufferedInputStream.close();
                MethodCollector.m26664o(14292);
                return;
            }
        }
    }
}
