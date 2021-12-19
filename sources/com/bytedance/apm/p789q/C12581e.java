package com.bytedance.apm.p789q;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.p1546a.C21454c;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: com.bytedance.apm.q.e */
public class C12581e {

    /* renamed from: a */
    public static final String f30615a = C12581e.class.getSimpleName();

    static {
        Covode.recordClassIndex(14398);
    }

    /* renamed from: a */
    public static long m22658a(File file) {
        if (!file.exists()) {
            return -1;
        }
        if (file.isFile()) {
            return file.length();
        }
        long j = 0;
        if (!file.isDirectory()) {
            return -1;
        }
        for (File file2 : file.listFiles()) {
            j += m22658a(file2);
        }
        return j;
    }

    /* renamed from: a */
    public static File m22659a(Context context) {
        File file = null;
        if (context == null) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty(null)) {
                file = context.getExternalFilesDir(null);
            } else {
                if (C58016d.f132223d == null || !C58016d.f132224e) {
                    C58016d.f132223d = context.getExternalFilesDir(null);
                }
                file = C58016d.f132223d;
            }
            do {
                file = file.getParentFile();
            } while (file.getAbsolutePath().contains("/Android"));
        } catch (Throwable unused) {
        }
        return file;
    }

    /* renamed from: a */
    public static void m22661a(String str, String... strArr) {
        FileOutputStream fileOutputStream;
        CheckedOutputStream checkedOutputStream;
        ZipOutputStream zipOutputStream;
        Throwable th;
        Exception e;
        try {
            fileOutputStream = new FileOutputStream(new File(str));
            try {
                checkedOutputStream = new CheckedOutputStream(fileOutputStream, new CRC32());
                try {
                    zipOutputStream = new ZipOutputStream(checkedOutputStream);
                    int i = 0;
                    while (true) {
                        try {
                            String str2 = strArr[0];
                            File file = new File(str2);
                            if (file.exists()) {
                                m22660a(file, zipOutputStream, "");
                                i++;
                                if (i > 0) {
                                    C21454c.m40295a(zipOutputStream);
                                    C21454c.m40295a(checkedOutputStream);
                                    C21454c.m40295a(fileOutputStream);
                                    return;
                                }
                            } else {
                                throw new RuntimeException(str2 + "not exist！");
                            }
                        } catch (Exception e2) {
                            e = e2;
                            try {
                                throw new RuntimeException(e);
                            } catch (Throwable th2) {
                                th = th2;
                                C21454c.m40295a(zipOutputStream);
                                C21454c.m40295a(checkedOutputStream);
                                C21454c.m40295a(fileOutputStream);
                                throw th;
                            }
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    zipOutputStream = null;
                    throw new RuntimeException(e);
                } catch (Throwable th3) {
                    th = th3;
                    zipOutputStream = null;
                    C21454c.m40295a(zipOutputStream);
                    C21454c.m40295a(checkedOutputStream);
                    C21454c.m40295a(fileOutputStream);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                checkedOutputStream = null;
                zipOutputStream = null;
                throw new RuntimeException(e);
            } catch (Throwable th4) {
                th = th4;
                checkedOutputStream = null;
                zipOutputStream = null;
                C21454c.m40295a(zipOutputStream);
                C21454c.m40295a(checkedOutputStream);
                C21454c.m40295a(fileOutputStream);
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            checkedOutputStream = null;
            fileOutputStream = null;
            zipOutputStream = null;
            throw new RuntimeException(e);
        } catch (Throwable th5) {
            th = th5;
            checkedOutputStream = null;
            fileOutputStream = null;
            zipOutputStream = null;
            C21454c.m40295a(zipOutputStream);
            C21454c.m40295a(checkedOutputStream);
            C21454c.m40295a(fileOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m22662a(List<String> list, String str) {
        Throwable th;
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str));
            try {
                for (String str2 : list) {
                    File file = new File(str2);
                    m22663a(zipOutputStream2, file, file.getName());
                }
                C21454c.m40295a(zipOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                zipOutputStream = zipOutputStream2;
                C21454c.m40295a(zipOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            C21454c.m40295a(zipOutputStream);
            throw th;
        }
    }

    /* renamed from: b */
    private static void m22664b(File file, ZipOutputStream zipOutputStream, String str) {
        File[] listFiles;
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                m22660a(file2, zipOutputStream, str);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: java.io.BufferedInputStream */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private static void m22665c(File file, ZipOutputStream zipOutputStream, String str) {
        FileInputStream fileInputStream;
        Throwable th;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        Exception e;
        FileInputStream fileInputStream4;
        BufferedInputStream bufferedInputStream;
        if (file.exists()) {
            FileInputStream fileInputStream5 = null;
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                } catch (Exception e2) {
                    e = e2;
                    fileInputStream4 = null;
                    fileInputStream5 = fileInputStream;
                    fileInputStream3 = fileInputStream4;
                    try {
                        throw new RuntimeException(e);
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream5;
                        fileInputStream2 = fileInputStream3;
                        fileInputStream5 = fileInputStream2;
                        C21454c.m40295a(fileInputStream5);
                        C21454c.m40295a(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    C21454c.m40295a(fileInputStream5);
                    C21454c.m40295a(fileInputStream);
                    throw th;
                }
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(str + file.getName()));
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 8192);
                        if (read != -1) {
                            zipOutputStream.write(bArr, 0, read);
                        } else {
                            C21454c.m40295a(bufferedInputStream);
                            C21454c.m40295a(fileInputStream);
                            return;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    fileInputStream4 = bufferedInputStream;
                    fileInputStream5 = fileInputStream;
                    fileInputStream3 = fileInputStream4;
                    throw new RuntimeException(e);
                } catch (Throwable th4) {
                    th = th4;
                    fileInputStream2 = bufferedInputStream;
                    fileInputStream5 = fileInputStream2;
                    C21454c.m40295a(fileInputStream5);
                    C21454c.m40295a(fileInputStream);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                fileInputStream3 = null;
                throw new RuntimeException(e);
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = null;
                C21454c.m40295a(fileInputStream5);
                C21454c.m40295a(fileInputStream);
                throw th;
            }
        }
    }

    /* renamed from: a */
    private static void m22660a(File file, ZipOutputStream zipOutputStream, String str) {
        if (file.isDirectory()) {
            m22664b(file, zipOutputStream, str + file.getName() + File.separator);
            return;
        }
        System.out.println("compress：" + str + file.getName());
        m22665c(file, zipOutputStream, str);
    }

    /* renamed from: a */
    private static void m22663a(ZipOutputStream zipOutputStream, File file, String str) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            zipOutputStream.putNextEntry(new ZipEntry(str + "/"));
            String str2 = str.length() == 0 ? "" : str + "/";
            for (int i = 0; i < listFiles.length; i++) {
                m22663a(zipOutputStream, listFiles[i], str2 + listFiles[i].getName());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            int read = fileInputStream.read();
            if (read != -1) {
                zipOutputStream.write(read);
            } else {
                return;
            }
        }
    }
}
