package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.ss.android.ugc.aweme.utils.cq */
public final class C80311cq {
    static {
        Covode.recordClassIndex(93579);
    }

    /* renamed from: a */
    private static void m139221a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static boolean m139223a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.m26663i(14163);
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    m139221a(inputStream);
                    m139221a(outputStream);
                    MethodCollector.m26664o(14163);
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                m139221a(inputStream);
                m139221a(outputStream);
                MethodCollector.m26664o(14163);
                return false;
            } catch (Throwable th) {
                m139221a(inputStream);
                m139221a(outputStream);
                MethodCollector.m26664o(14163);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static boolean m139222a(Context context, String str, File file) {
        MethodCollector.m26663i(14132);
        try {
            boolean a = m139223a(context.getAssets().open(str), new FileOutputStream(file));
            MethodCollector.m26664o(14132);
            return a;
        } catch (IOException e) {
            e.printStackTrace();
            MethodCollector.m26664o(14132);
            return false;
        }
    }
}
