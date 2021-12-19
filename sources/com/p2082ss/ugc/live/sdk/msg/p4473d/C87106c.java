package com.p2082ss.ugc.live.sdk.msg.p4473d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: com.ss.ugc.live.sdk.msg.d.c */
public final class C87106c {
    static {
        Covode.recordClassIndex(102902);
    }

    /* renamed from: a */
    public static byte[] m150855a(byte[] bArr) {
        MethodCollector.m26663i(8913);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m150854a(byteArrayInputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        byteArrayInputStream.close();
        MethodCollector.m26664o(8913);
        return byteArray;
    }

    /* renamed from: a */
    private static void m150854a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.m26663i(9066);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = gZIPInputStream.read(bArr, 0, 4096);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                gZIPInputStream.close();
                MethodCollector.m26664o(9066);
                return;
            }
        }
    }
}
