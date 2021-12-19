package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FileInputStream;
import java.util.Properties;

/* renamed from: com.bytedance.crash.util.t */
public final class C14072t {
    static {
        Covode.recordClassIndex(16139);
    }

    /* renamed from: a */
    public static Properties m25644a(String str) {
        MethodCollector.m26663i(1024);
        String str2 = str + "/map_size.txt";
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(str2));
            MethodCollector.m26664o(1024);
            return properties;
        } catch (Throwable unused) {
            MethodCollector.m26664o(1024);
            return null;
        }
    }
}
