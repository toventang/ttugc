package com.bytedance.common.p894a.p898d;

import android.os.SystemClock;
import com.bytedance.common.p894a.p896b.C13483a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/* renamed from: com.bytedance.common.a.d.a */
public final class C13493a {
    static {
        Covode.recordClassIndex(15501);
    }

    /* renamed from: a */
    private static void m24267a(final InputStream inputStream) {
        C13483a.f32830b.execute(new Runnable() {
            /* class com.bytedance.common.p894a.p898d.C13493a.RunnableC134941 */

            static {
                Covode.recordClassIndex(15502);
            }

            public final void run() {
                MethodCollector.m26663i(2907);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                do {
                    try {
                    } catch (IOException unused) {
                        bufferedReader.close();
                        MethodCollector.m26664o(2907);
                        return;
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        MethodCollector.m26664o(2907);
                        throw th;
                    }
                } while (bufferedReader.readLine() != null);
                try {
                    bufferedReader.close();
                    MethodCollector.m26664o(2907);
                } catch (IOException e2) {
                    e2.printStackTrace();
                    MethodCollector.m26664o(2907);
                }
            }
        });
    }

    /* renamed from: a */
    public static boolean m24268a(String[] strArr) {
        if (strArr.length <= 0) {
            return false;
        }
        SystemClock.uptimeMillis();
        try {
            Process exec = Runtime.getRuntime().exec(strArr);
            InputStream errorStream = exec.getErrorStream();
            InputStream inputStream = exec.getInputStream();
            m24267a(errorStream);
            m24267a(inputStream);
            if (exec.waitFor() != 0) {
                Arrays.toString(strArr);
                return false;
            }
            SystemClock.uptimeMillis();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (InterruptedException e2) {
            e2.printStackTrace();
            return false;
        } finally {
            SystemClock.uptimeMillis();
        }
    }
}
