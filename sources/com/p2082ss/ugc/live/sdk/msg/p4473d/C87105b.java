package com.p2082ss.ugc.live.sdk.msg.p4473d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;

/* renamed from: com.ss.ugc.live.sdk.msg.d.b */
public final class C87105b {
    static {
        Covode.recordClassIndex(102901);
    }

    /* renamed from: a */
    public static byte[] m150853a(Map<String, String> map) {
        MethodCollector.m26663i(10174);
        if (map == null || map.isEmpty()) {
            byte[] bArr = new byte[0];
            MethodCollector.m26664o(10174);
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (!(str == null || str2 == null)) {
                if (byteArrayOutputStream.size() > 0) {
                    byteArrayOutputStream.write(38);
                }
                try {
                    String encode = URLEncoder.encode(str, "UTF-8");
                    String encode2 = URLEncoder.encode(str2, "UTF-8");
                    byteArrayOutputStream.write(encode.getBytes("UTF-8"));
                    byteArrayOutputStream.write(61);
                    byteArrayOutputStream.write(encode2.getBytes("UTF-8"));
                } catch (IOException e) {
                    RuntimeException runtimeException = new RuntimeException(e);
                    MethodCollector.m26664o(10174);
                    throw runtimeException;
                }
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        MethodCollector.m26664o(10174);
        return byteArray;
    }
}
