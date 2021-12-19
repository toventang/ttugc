package com.p2082ss.android.ttve.common;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ttve.common.a */
public final class C30640a {

    /* renamed from: a */
    private static Map<String, Integer> f73247a;

    static {
        Covode.recordClassIndex(37182);
        HashMap hashMap = new HashMap();
        f73247a = hashMap;
        hashMap.put("sdm660", 120);
        f73247a.put("msm8994", 120);
        f73247a.put("sdm845", 240);
        f73247a.put("sm8150", 480);
    }

    /* renamed from: a */
    public static String m62975a() {
        MethodCollector.m26663i(4654);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            String str = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                str = readLine;
            }
            if (str.contains("Hardware")) {
                String str2 = str.split(":\\s+", 2)[1];
                MethodCollector.m26664o(4654);
                return str2;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        String str3 = Build.HARDWARE;
        MethodCollector.m26664o(4654);
        return str3;
    }

    /* renamed from: a */
    public static int m62974a(String str) {
        if (f73247a.containsKey(str)) {
            return f73247a.get(str).intValue();
        }
        return 0;
    }
}
