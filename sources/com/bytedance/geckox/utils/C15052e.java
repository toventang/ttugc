package com.bytedance.geckox.utils;

import android.os.Build;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.geckox.utils.e */
public final class C15052e {
    static {
        Covode.recordClassIndex(17220);
    }

    /* renamed from: c */
    public static boolean m27714c(File file) {
        String[] list;
        if (file.isDirectory()) {
            for (String str : file.list()) {
                if (!m27714c(new File(file, str))) {
                    return false;
                }
            }
        }
        return m27719h(file);
    }

    /* renamed from: d */
    public static long m27715d(File file) {
        if (file.isFile()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += m27715d(file2);
            }
        }
        return j;
    }

    /* renamed from: e */
    public static void m27716e(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                throw new RuntimeException("create dir failed: path is a file");
            }
        } else if (!file.mkdirs()) {
            throw new RuntimeException("create dir failed: " + file.getPath());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        if (r1 != false) goto L_0x002e;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m27718g(java.io.File r7) {
        /*
            r6 = 1
            if (r7 == 0) goto L_0x0009
            boolean r0 = r7.exists()
            if (r0 != 0) goto L_0x000a
        L_0x0009:
            return r6
        L_0x000a:
            boolean r0 = r7.isDirectory()
            r5 = 0
            if (r0 == 0) goto L_0x002e
            java.io.File[] r4 = r7.listFiles()
            if (r4 == 0) goto L_0x002e
            int r3 = r4.length
            r2 = 0
            r1 = 1
        L_0x001a:
            if (r2 >= r3) goto L_0x002c
            r0 = r4[r2]
            if (r1 == 0) goto L_0x002a
            boolean r0 = m27718g(r0)
            if (r0 == 0) goto L_0x002a
            r1 = 1
        L_0x0027:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002a:
            r1 = 0
            goto L_0x0027
        L_0x002c:
            if (r1 == 0) goto L_0x0035
        L_0x002e:
            boolean r0 = m27719h(r7)
            if (r0 == 0) goto L_0x0035
            return r6
        L_0x0035:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.utils.C15052e.m27718g(java.io.File):boolean");
    }

    /* renamed from: a */
    public static boolean m27712a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        C14957a.m27543a("delete file，pid:", Integer.valueOf(Process.myPid()), ", thread:", Thread.currentThread().toString(), ", file:" + file.getAbsolutePath());
        return m27718g(file);
    }

    /* renamed from: b */
    public static List<File> m27713b(File file) {
        File[] listFiles;
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return null;
        }
        List<File> asList = Arrays.asList(listFiles);
        final HashMap hashMap = new HashMap();
        for (File file2 : asList) {
            hashMap.put(file2, Long.valueOf(file2.lastModified()));
        }
        Collections.sort(asList, new Comparator<File>() {
            /* class com.bytedance.geckox.utils.C15052e.C150531 */

            static {
                Covode.recordClassIndex(17221);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(File file, File file2) {
                if (file == null) {
                    if (file2 == null) {
                        return 0;
                    }
                    return 1;
                } else if (file2 == null) {
                    return -1;
                } else {
                    int i = Build.VERSION.SDK_INT;
                    return Long.compare(((Long) hashMap.get(file)).longValue(), ((Long) hashMap.get(file2)).longValue());
                }
            }
        });
        return asList;
    }

    /* renamed from: h */
    private static boolean m27719h(File file) {
        MethodCollector.m26663i(5461);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(5461);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(5461);
        return delete;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0113, code lost:
        if (r11 == null) goto L_0x0130;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e4 A[SYNTHETIC, Splitter:B:59:0x00e4] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m27717f(java.io.File r20) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.utils.C15052e.m27717f(java.io.File):boolean");
    }

    /* renamed from: a */
    public static long m27711a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.m26663i(5564);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        byte[] bArr = new byte[1024];
        int i = 0;
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                i += read;
                bufferedOutputStream.write(bArr, 0, read);
            } else {
                bufferedOutputStream.flush();
                long j = (long) i;
                MethodCollector.m26664o(5564);
                return j;
            }
        }
    }
}
