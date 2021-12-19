package com.bytedance.ies.xelement.alphavideo.p1363a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.bytedance.ies.xelement.alphavideo.a.e */
public final class C18978e {
    static {
        Covode.recordClassIndex(21727);
    }

    /* renamed from: a */
    private static void m35190a(ZipInputStream zipInputStream, String str) {
        MethodCollector.m26663i(9770);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
        byte[] bArr = new byte[4096];
        while (true) {
            int read = zipInputStream.read(bArr);
            if (read != -1) {
                bufferedOutputStream.write(bArr, 0, read);
            } else {
                bufferedOutputStream.close();
                MethodCollector.m26664o(9770);
                return;
            }
        }
    }

    /* renamed from: a */
    public static String m35189a(File file, String str) {
        MethodCollector.m26663i(9629);
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.mkdir();
        }
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
        Boolean bool = false;
        String str2 = "";
        for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
            String str3 = str + File.separator + nextEntry.getName();
            if (!nextEntry.getName().contains("__MACOSX") && !nextEntry.getName().contains(".DS_Store") && !nextEntry.getName().contains("../")) {
                if (!nextEntry.isDirectory()) {
                    m35190a(zipInputStream, str3);
                } else {
                    File file3 = new File(str3);
                    if (!bool.booleanValue()) {
                        bool = true;
                        str2 = nextEntry.getName();
                    }
                    file3.mkdirs();
                }
            }
            zipInputStream.closeEntry();
        }
        zipInputStream.close();
        MethodCollector.m26664o(9629);
        return str2;
    }
}
