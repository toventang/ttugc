package com.bytedance.p1782z.p1783a.p1791d;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: com.bytedance.z.a.d.b */
public final class C23751b {

    /* renamed from: com.bytedance.z.a.d.b$a */
    public interface AbstractC23752a {
        static {
            Covode.recordClassIndex(27857);
        }

        /* renamed from: a */
        boolean mo39196a(String str);
    }

    static {
        Covode.recordClassIndex(27856);
    }

    /* renamed from: a */
    public static void m44897a(BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                Log.getStackTraceString(e);
            }
        }
    }

    /* renamed from: a */
    public static BufferedReader m44896a(File file) {
        BufferedReader bufferedReader = null;
        if (file == null || !file.exists() || !file.canRead()) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file), 10000);
            return bufferedReader;
        } catch (Exception e) {
            Log.getStackTraceString(e);
            return bufferedReader;
        }
    }

    /* renamed from: a */
    public static void m44899a(String str, AbstractC23752a aVar) {
        if (str != null) {
            m44898a(new File(str), aVar);
        }
    }

    /* renamed from: a */
    private static void m44898a(File file, AbstractC23752a aVar) {
        MethodCollector.m26663i(769);
        if (aVar == null) {
            MethodCollector.m26664o(769);
            return;
        }
        BufferedReader a = m44896a(file);
        if (a == null) {
            MethodCollector.m26664o(769);
            return;
        }
        while (true) {
            try {
                String readLine = a.readLine();
                if (readLine == null || !aVar.mo39196a(readLine)) {
                    break;
                }
            } catch (IOException e) {
                Log.getStackTraceString(e);
            }
        }
        m44897a(a);
        MethodCollector.m26664o(769);
    }
}
