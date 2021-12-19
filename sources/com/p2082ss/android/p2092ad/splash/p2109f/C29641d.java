package com.p2082ss.android.p2092ad.splash.p2109f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: com.ss.android.ad.splash.f.d */
public final class C29641d {
    static {
        Covode.recordClassIndex(36037);
    }

    /* renamed from: a */
    private static void m59679a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static long m59677a(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return 0;
        }
        return file.length() / 1024;
    }

    /* renamed from: c */
    public static boolean m59682c(String str) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static long m59676a(File file) {
        long j = 0;
        if (file == null) {
            return 0;
        }
        if (!file.isDirectory() || file.listFiles() == null) {
            return file.length() / 1024;
        }
        for (File file2 : file.listFiles()) {
            j += m59676a(file2);
        }
        return j;
    }

    /* renamed from: b */
    public static String m59681b(String str) {
        FileInputStream fileInputStream;
        Throwable th;
        MethodCollector.m26663i(10411);
        File file = new File(str);
        String str2 = null;
        str2 = null;
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            MethodCollector.m26664o(10411);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                str2 = m59678a((InputStream) fileInputStream);
            } catch (Exception unused) {
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                m59679a((Closeable) fileInputStream2);
                MethodCollector.m26664o(10411);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            m59679a((Closeable) fileInputStream2);
            MethodCollector.m26664o(10411);
            throw th;
        }
        m59679a((Closeable) fileInputStream);
        MethodCollector.m26664o(10411);
        return str2;
    }

    /* renamed from: a */
    private static String m59678a(InputStream inputStream) {
        MethodCollector.m26663i(10256);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine).append("\n");
            } catch (Exception e) {
                C29644g.m59691e("Exception:".concat(String.valueOf(e)));
            } catch (Throwable th) {
                m59679a(bufferedReader);
                MethodCollector.m26664o(10256);
                throw th;
            }
        }
        m59679a(bufferedReader);
        String sb2 = sb.toString();
        MethodCollector.m26664o(10256);
        return sb2;
    }

    /* renamed from: a */
    public static void m59680a(String str, String str2, String str3) {
        Throwable th;
        Exception e;
        MethodCollector.m26663i(10094);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            MethodCollector.m26664o(10094);
            return;
        }
        File file = new File(str2);
        if (file.exists() || file.mkdir()) {
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(str2 + str3, false);
                try {
                    fileOutputStream2.write(str.getBytes());
                    fileOutputStream2.flush();
                    m59679a(fileOutputStream2);
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        C29644g.m59691e("Exception:".concat(String.valueOf(e)));
                        m59679a(fileOutputStream);
                        MethodCollector.m26664o(10094);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        m59679a(fileOutputStream);
                        MethodCollector.m26664o(10094);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    m59679a(fileOutputStream);
                    MethodCollector.m26664o(10094);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                C29644g.m59691e("Exception:".concat(String.valueOf(e)));
                m59679a(fileOutputStream);
                MethodCollector.m26664o(10094);
                return;
            }
            MethodCollector.m26664o(10094);
            return;
        }
        MethodCollector.m26664o(10094);
    }
}
