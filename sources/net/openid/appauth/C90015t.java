package net.openid.appauth;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* access modifiers changed from: package-private */
/* renamed from: net.openid.appauth.t */
public final class C90015t {
    static {
        Covode.recordClassIndex(106186);
    }

    /* renamed from: b */
    public static void m156216b(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static String m156215a(InputStream inputStream) {
        MethodCollector.m26663i(12587);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        char[] cArr = new char[1024];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                String sb2 = sb.toString();
                MethodCollector.m26664o(12587);
                return sb2;
            }
        }
    }
}
