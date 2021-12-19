package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;

/* renamed from: com.bytedance.crash.util.i */
public final class C14055i {
    static {
        Covode.recordClassIndex(16122);
    }

    /* renamed from: b */
    private static String m25551b(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            int i2 = 6;
            do {
                int i3 = i + i2;
                sb.append(str.substring(i3, i3 + 2));
                i2 -= 2;
            } while (i2 >= 0);
            sb.append(':');
            i += 8;
        } while (i <= 16);
        return sb.toString();
    }

    /* renamed from: c */
    private static String m25553c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 6; i >= 0; i -= 2) {
            try {
                sb.append(Integer.parseInt(str.substring(i, i + 2), 16));
                if (i != 0) {
                    sb.append('.');
                }
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m25547a(String str) {
        String c;
        String[] split = str.split(":");
        if (split.length != 2) {
            return null;
        }
        try {
            long parseLong = Long.parseLong(split[1], 16);
            String str2 = split[0];
            if (str2.length() == 8) {
                String c2 = m25553c(str2);
                if (c2 == null) {
                    return null;
                }
                return c2 + ":" + parseLong;
            } else if (str2.length() != 32 || (c = m25553c(str2.substring(24))) == null) {
                return null;
            } else {
                return m25551b(str2.substring(0, 24)) + c + ":" + parseLong;
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m25550a(File file) {
        MethodCollector.m26663i(1713);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(1713);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(1713);
        return delete;
    }

    /* renamed from: a */
    public static void m25548a(File file, File file2) {
        try {
            m25552b(file, file2);
        } catch (Throwable th) {
            C13849d.m25014a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    private static void m25549a(File file, Map<Long, String> map) {
        Throwable th;
        int i;
        String a;
        MethodCollector.m26663i(1598);
        if (!file.exists()) {
            MethodCollector.m26664o(1598);
            return;
        }
        int[] iArr = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        String[] strArr = {"sl", "local_address", "st", "tx_queue", "rx_queue", "tr", "tm->when", "retrnsmt", "uid", "timeout", "inode"};
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                String readLine = bufferedReader2.readLine();
                if (readLine == null) {
                    C14061m.m25588a(bufferedReader2);
                    MethodCollector.m26664o(1598);
                    return;
                }
                String[] split = readLine.split("\\s+");
                if (split.length <= iArr[10]) {
                    C14061m.m25588a(bufferedReader2);
                    MethodCollector.m26664o(1598);
                    return;
                }
                int i2 = 0;
                while (split[iArr[i2]].equals(strArr[i2])) {
                    i2++;
                    if (i2 >= 11) {
                        while (true) {
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 != null) {
                                String[] split2 = readLine2.split("\\s+");
                                if (split2.length != 0) {
                                    if (split2[0].length() != 0) {
                                        i = -1;
                                    } else {
                                        i = 0;
                                    }
                                    int i3 = i + 10;
                                    if (split2.length > i3) {
                                        try {
                                            Long valueOf = Long.valueOf(Long.parseLong(split2[i3]));
                                            if (!(valueOf.longValue() == 0 || (a = m25547a(split2[i + 3])) == null)) {
                                                map.put(valueOf, a);
                                            }
                                        } catch (NumberFormatException unused) {
                                        }
                                    }
                                }
                            } else {
                                C14061m.m25588a(bufferedReader2);
                                MethodCollector.m26664o(1598);
                                return;
                            }
                        }
                    }
                }
                C14061m.m25588a(bufferedReader2);
                MethodCollector.m26664o(1598);
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                try {
                    C13849d.m25014a("NPTH_CATCH", th);
                } finally {
                    C14061m.m25588a(bufferedReader);
                    MethodCollector.m26664o(1598);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            C13849d.m25014a("NPTH_CATCH", th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f6 A[SYNTHETIC, Splitter:B:44:0x00f6] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m25552b(java.io.File r17, java.io.File r18) {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.C14055i.m25552b(java.io.File, java.io.File):void");
    }
}
