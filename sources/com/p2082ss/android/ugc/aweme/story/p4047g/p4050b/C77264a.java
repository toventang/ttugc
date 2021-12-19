package com.p2082ss.android.ugc.aweme.story.p4047g.p4050b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.aweme.story.g.b.a */
public final class C77264a {
    static {
        Covode.recordClassIndex(90281);
    }

    /* renamed from: a */
    public static FileInputStream m135060a(File file) {
        FileInputStream fileInputStream;
        MethodCollector.m26663i(5674);
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException unused) {
            fileInputStream = null;
        }
        MethodCollector.m26664o(5674);
        return fileInputStream;
    }

    /* renamed from: a */
    private static boolean m135061a(Closeable closeable) {
        if (closeable == null) {
            return false;
        }
        try {
            closeable.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static byte[] m135062a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        MethodCollector.m26663i(5799);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (inputStream != null) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(524288);
                try {
                    byte[] bArr = new byte[524288];
                    if (!(inputStream instanceof BufferedInputStream)) {
                        inputStream = new BufferedInputStream(inputStream, 524288);
                    }
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream, 524288);
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        bufferedOutputStream.write(bArr, 0, read);
                        bufferedOutputStream.flush();
                    }
                } catch (IOException e) {
                    MethodCollector.m26664o(5799);
                    throw e;
                } catch (Throwable th2) {
                    m135061a((Closeable) inputStream);
                    MethodCollector.m26664o(5799);
                    throw th2;
                }
                try {
                    m135061a((Closeable) inputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    m135061a(byteArrayOutputStream);
                    MethodCollector.m26664o(5799);
                    return byteArray;
                } catch (IOException unused) {
                    m135061a(byteArrayOutputStream);
                    MethodCollector.m26664o(5799);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    m135061a(byteArrayOutputStream2);
                    MethodCollector.m26664o(5799);
                    throw th;
                }
            } catch (IOException unused2) {
                byteArrayOutputStream = null;
                m135061a(byteArrayOutputStream);
                MethodCollector.m26664o(5799);
                return null;
            } catch (Throwable th4) {
                th = th4;
                m135061a(byteArrayOutputStream2);
                MethodCollector.m26664o(5799);
                throw th;
            }
        }
        MethodCollector.m26664o(5799);
        return null;
    }
}
