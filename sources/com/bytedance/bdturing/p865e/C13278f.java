package com.bytedance.bdturing.p865e;

import com.bytedance.bdturing.p864d.AbstractC13269a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p4600h.p4610e.C89145b;
import p4600h.p4610e.C89146c;
import p4600h.p4610e.C89167q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bdturing.e.f */
public final class C13278f {

    /* renamed from: a */
    private final String f32465a;

    /* renamed from: b */
    private final Map<String, String> f32466b;

    /* renamed from: c */
    private final AbstractC13279a f32467c;

    /* renamed from: d */
    private final AbstractC13269a f32468d;

    /* renamed from: com.bytedance.bdturing.e.f$a */
    public interface AbstractC13279a {
        static {
            Covode.recordClassIndex(15241);
        }

        /* renamed from: a */
        void mo21399a(int i, String str, long j);
    }

    static {
        Covode.recordClassIndex(15240);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0101, code lost:
        r11.f32467c.mo21399a(500, r4, java.lang.System.currentTimeMillis() - r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0111, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0112, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00fd A[ExcHandler: Exception (r0v13 'e' java.lang.Exception A[CUSTOM_DECLARE]), PHI: r4 
      PHI: (r4v3 java.lang.String) = (r4v1 java.lang.String), (r4v1 java.lang.String), (r4v6 java.lang.String) binds: [B:15:0x009d, B:23:0x00d9, B:24:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:15:0x009d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21445a() {
        /*
        // Method dump skipped, instructions count: 307
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.p865e.C13278f.mo21445a():void");
    }

    /* renamed from: a */
    private static String m23875a(byte[] bArr, byte[] bArr2, InputStream inputStream) {
        MethodCollector.m26663i(2614);
        if (bArr == null || bArr2 == null) {
            String a = C89167q.m154662a(new InputStreamReader(inputStream));
            MethodCollector.m26664o(2614);
            return a;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
        instance.init(2, secretKeySpec, ivParameterSpec);
        C89219l.m154721d(inputStream, "");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        C89145b.m154634a(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C89219l.m154716b(byteArray, "");
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(instance.doFinal(byteArray)));
        try {
            String a2 = C89167q.m154662a(new InputStreamReader(gZIPInputStream));
            C89146c.m154636a(gZIPInputStream, null);
            MethodCollector.m26664o(2614);
            return a2;
        } catch (Throwable th) {
            C89146c.m154636a(gZIPInputStream, th);
            MethodCollector.m26664o(2614);
            throw th;
        }
    }

    public C13278f(String str, Map<String, String> map, AbstractC13279a aVar, AbstractC13269a aVar2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(map, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        this.f32465a = str;
        this.f32466b = map;
        this.f32467c = aVar;
        this.f32468d = aVar2;
    }
}
