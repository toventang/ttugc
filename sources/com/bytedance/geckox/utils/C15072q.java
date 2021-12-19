package com.bytedance.geckox.utils;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.buffer.AbstractC14888a;
import com.bytedance.geckox.buffer.p1014a.C14889a;
import com.bytedance.geckox.p1012b.C14884b;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.statistic.C15035c;
import com.bytedance.p1603q.p1604a.C21926a;
import com.bytedance.zoin.zstd.ZstdInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.bytedance.geckox.utils.q */
public final class C15072q {
    static {
        Covode.recordClassIndex(17240);
    }

    /* renamed from: a */
    public static void m27749a(AbstractC14888a aVar, AbstractC14888a aVar2) {
        ZstdInputStream zstdInputStream;
        Throwable th;
        C14889a aVar3 = new C14889a(aVar);
        try {
            zstdInputStream = new ZstdInputStream(aVar3);
            try {
                byte[] bArr = new byte[32768];
                while (true) {
                    int read = zstdInputStream.read(bArr);
                    if (read != -1) {
                        aVar2.mo23968a(bArr, 0, read);
                    } else {
                        C15050c.m27709a(aVar3);
                        C15050c.m27709a(zstdInputStream);
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                C15050c.m27709a(aVar3);
                C15050c.m27709a(zstdInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            zstdInputStream = null;
            C15050c.m27709a(aVar3);
            C15050c.m27709a(zstdInputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m27750a(InputStream inputStream, String str, String str2, int i) {
        ZipInputStream zipInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        long j;
        String str3;
        int i2 = 5133;
        MethodCollector.m26663i(5133);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            zipInputStream = new ZipInputStream(inputStream);
            boolean z = false;
            boolean z2 = true;
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        String name = nextEntry.getName();
                        if (!name.startsWith("__MACOSX/")) {
                            try {
                                if (!name.equals(".DS_Store")) {
                                    if (!name.startsWith(str2 + File.separator)) {
                                        C14884b.m27326a(new File(canonicalPath));
                                        RuntimeException runtimeException = new RuntimeException("the zip package outermost folder is not named by channel:" + str2 + ",name:" + name);
                                        MethodCollector.m26664o(5133);
                                        throw runtimeException;
                                    } else if (nextEntry.isDirectory()) {
                                        File file = new File(canonicalPath, name);
                                        if (file.getCanonicalPath().startsWith(canonicalPath)) {
                                            file.mkdirs();
                                        } else {
                                            RuntimeException runtimeException2 = new RuntimeException("directory traversal, dir:" + name + ", channel:" + str2);
                                            MethodCollector.m26664o(i2);
                                            throw runtimeException2;
                                        }
                                    } else {
                                        String canonicalPath2 = new File(canonicalPath, name).getCanonicalPath();
                                        if (canonicalPath2.startsWith(canonicalPath)) {
                                            File file2 = new File(canonicalPath2);
                                            file2.getParentFile().mkdirs();
                                            try {
                                                fileOutputStream = new FileOutputStream(file2);
                                                try {
                                                    long a = C15052e.m27711a(zipInputStream, fileOutputStream);
                                                    long size = nextEntry.getSize();
                                                    if (file2.exists()) {
                                                        try {
                                                            j = file2.length();
                                                        } catch (Throwable th3) {
                                                            th2 = th3;
                                                            C15050c.m27709a(fileOutputStream);
                                                            MethodCollector.m26664o(5133);
                                                            throw th2;
                                                        }
                                                    } else {
                                                        j = -1;
                                                    }
                                                    if (size != 0 && j <= 0) {
                                                        try {
                                                            C14957a.m27543a("mmap+ZipInputStream unzip,dir:" + canonicalPath + ",channel:" + str2 + ",file[" + file2.getPath() + "] is size 0/retry count:" + i);
                                                            str3 = "size 0";
                                                        } catch (Throwable th4) {
                                                            th2 = th4;
                                                            C15050c.m27709a(fileOutputStream);
                                                            MethodCollector.m26664o(5133);
                                                            throw th2;
                                                        }
                                                    } else if (C15052e.m27717f(file2)) {
                                                        C14957a.m27543a("mmap+ZipInputStream unzip,dir:" + canonicalPath + ",channel:" + str2 + ",file[" + file2.getPath() + "] is tasm broken(content 0)/retry count:" + i);
                                                        str3 = "tasm broken";
                                                    } else {
                                                        str3 = null;
                                                    }
                                                    if (!TextUtils.isEmpty(str3)) {
                                                        if (z2) {
                                                            String str4 = "channel:" + str2 + ",file :" + name + ",entry size:" + size + ",local file size:" + j + ",stream size:" + a + ",pid:" + Process.myPid() + ",thread id:" + Thread.currentThread().getId();
                                                            C14957a.m27543a("mmap+ZipInputStream unzip ".concat(String.valueOf(str3)), str4);
                                                            C15035c.m27678a(3, 31, str3 + "," + str4, "retry count:".concat(String.valueOf(i)));
                                                            z2 = false;
                                                        }
                                                        if (!str3.contains("tasm")) {
                                                            C21926a aVar = new C21926a("unzip file ".concat(String.valueOf(str3)));
                                                            MethodCollector.m26664o(5133);
                                                            throw aVar;
                                                        }
                                                    }
                                                    try {
                                                        C15050c.m27709a(fileOutputStream);
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        C15050c.m27709a(zipInputStream);
                                                        MethodCollector.m26664o(5133);
                                                        throw th;
                                                    }
                                                } catch (Throwable th6) {
                                                    th2 = th6;
                                                    C15050c.m27709a(fileOutputStream);
                                                    MethodCollector.m26664o(5133);
                                                    throw th2;
                                                }
                                            } catch (Throwable th7) {
                                                th2 = th7;
                                                fileOutputStream = null;
                                                C15050c.m27709a(fileOutputStream);
                                                MethodCollector.m26664o(5133);
                                                throw th2;
                                            }
                                        } else {
                                            RuntimeException runtimeException3 = new RuntimeException("directory traversal, file name:".concat(String.valueOf(name)));
                                            MethodCollector.m26664o(5133);
                                            throw runtimeException3;
                                        }
                                    }
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                C15050c.m27709a(zipInputStream);
                                MethodCollector.m26664o(5133);
                                throw th;
                            }
                        }
                        i2 = 5133;
                        z = true;
                    } else if (z) {
                        C15050c.m27709a(zipInputStream);
                        C14957a.m27543a("unzip success,channel:".concat(String.valueOf(str2)), "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        MethodCollector.m26664o(5133);
                        return;
                    } else {
                        inputStream.reset();
                        RuntimeException runtimeException4 = new RuntimeException("not zip file  channel:".concat(String.valueOf(str2)));
                        MethodCollector.m26664o(5133);
                        throw runtimeException4;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    C15050c.m27709a(zipInputStream);
                    MethodCollector.m26664o(5133);
                    throw th;
                }
            }
        } catch (Throwable th10) {
            th = th10;
            zipInputStream = null;
            C15050c.m27709a(zipInputStream);
            MethodCollector.m26664o(5133);
            throw th;
        }
    }
}
