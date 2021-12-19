package com.bytedance.p890c.p891a.p892a.p893a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.bytedance.c.a.a.a.f */
public final class C13473f {
    static {
        Covode.recordClassIndex(15481);
    }

    /* renamed from: com.bytedance.c.a.a.a.f$a */
    public enum EnumC13474a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        

        /* renamed from: a */
        final int f32816a;

        static {
            Covode.recordClassIndex(15482);
        }

        private EnumC13474a(int i) {
            this.f32816a = i;
        }
    }

    /* renamed from: a */
    private static byte[] m24227a(InputStream inputStream) {
        MethodCollector.m26663i(11250);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                MethodCollector.m26664o(11250);
                return byteArray;
            }
        }
    }

    /* renamed from: a */
    public static byte[] m24228a(String str, byte[] bArr, EnumC13474a aVar, String str2) {
        MethodCollector.m26663i(12052);
        String str3 = null;
        if (str == null) {
            MethodCollector.m26664o(12052);
            return null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (EnumC13474a.GZIP == aVar && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                str3 = "gzip";
            } catch (Throwable unused) {
                gZIPOutputStream.close();
                MethodCollector.m26664o(12052);
                return null;
            }
        } else if (EnumC13474a.DEFLATER == aVar && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr2 = new byte[8192];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr2, 0, deflater.deflate(bArr2));
            }
            deflater.end();
            bArr = byteArrayOutputStream2.toByteArray();
            str3 = "deflate";
        }
        byte[] a = EncryptorUtil.m27092a(bArr, bArr.length);
        if (a != null) {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str + "?";
                }
            } else if (!str.endsWith("&")) {
                str = str + "&";
            }
            str = str + "tt_data=a";
            str2 = "application/octet-stream;tt-data=a";
            bArr = a;
        }
        byte[] a2 = m24229a(str, bArr, str2, str3, "POST");
        MethodCollector.m26664o(12052);
        return a2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:45|(1:50)(1:49)|(2:52|53)|54|55|56|58) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00ff */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077 A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009b A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2 A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d5 A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0106  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m24229a(java.lang.String r8, byte[] r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 304
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p890c.p891a.p892a.p893a.C13473f.m24229a(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String):byte[]");
    }
}
