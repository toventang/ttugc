package com.bytedance.p1542m.p1543a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* renamed from: com.bytedance.m.a.c */
public final class C21405c {
    static {
        Covode.recordClassIndex(25025);
    }

    /* renamed from: a */
    public static String m40179a(Context context, String str) {
        MethodCollector.m26663i(9501);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open(str)));
        String str2 = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                str2 = str2 + readLine;
            } else {
                MethodCollector.m26664o(9501);
                return str2;
            }
        }
    }
}
