package com.p2082ss.android.ugc.aweme.shortvideo.p3795ag;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ag.a */
public final class C69826a {
    static {
        Covode.recordClassIndex(82232);
    }

    /* renamed from: a */
    private static void m123392a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static boolean m123394a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.m26663i(8738);
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    m123392a(inputStream);
                    m123392a(outputStream);
                    MethodCollector.m26664o(8738);
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                m123392a(inputStream);
                m123392a(outputStream);
                MethodCollector.m26664o(8738);
                return false;
            } catch (Throwable th) {
                m123392a(inputStream);
                m123392a(outputStream);
                MethodCollector.m26664o(8738);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static boolean m123393a(Context context, String str, File file) {
        MethodCollector.m26663i(8590);
        try {
            boolean a = m123394a(context.getAssets().open(str), new FileOutputStream(file));
            MethodCollector.m26664o(8590);
            return a;
        } catch (IOException e) {
            e.printStackTrace();
            MethodCollector.m26664o(8590);
            return false;
        }
    }
}
