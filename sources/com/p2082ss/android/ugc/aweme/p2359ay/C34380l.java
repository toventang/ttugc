package com.p2082ss.android.ugc.aweme.p2359ay;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ay.l */
final class C34380l {

    /* renamed from: a */
    private Map<String, String> f81283a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(41324);
    }

    C34380l() {
    }

    /* renamed from: b */
    private static byte[] m70359b(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo60814a(String str) {
        String str2;
        boolean z = true;
        if (str.contains("%%secretKey=")) {
            str2 = str.substring(0, str.indexOf("%%secretKey="));
            String substring = str.substring(str.lastIndexOf("=") + 1, str.length());
            if (!TextUtils.isEmpty(substring)) {
                this.f81283a.put(str2, substring);
            }
        } else {
            str2 = str;
            z = false;
        }
        if ((z || str.contains("secretKey")) && (str.length() == str2.length() || str2.contains("secretKey"))) {
            m70358a(str, str2, Boolean.valueOf(z));
        }
        return str2;
    }

    /* renamed from: a */
    private static void m70358a(String str, String str2, Boolean bool) {
        int i;
        C51423a.m95787a("ImageEncryptUtils parse failed: rawUrl=" + str + ", parseUrl=" + str2 + ", contain=" + bool);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("service", "secret_key_parse_error");
            jSONObject.put("raw_url", str);
            jSONObject.put("parse_url", str2);
            if (bool.booleanValue()) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_contain", i);
            C12290b.m22064a("im_error_event", jSONObject);
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Pair<InputStream, Long> mo60813a(InputStream inputStream, String str, long j) {
        MethodCollector.m26663i(2268);
        if (this.f81283a.containsKey(str)) {
            String str2 = this.f81283a.get(str);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                this.f81283a.remove(str);
                if (byteArray != null) {
                    byte[] b = m70359b(str2);
                    byte[] copyOfRange = Arrays.copyOfRange(byteArray, 12, byteArray.length);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(Arrays.copyOfRange(byteArray, 0, 12));
                    SecretKeySpec secretKeySpec = new SecretKeySpec(b, "AES");
                    Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                    instance.init(2, secretKeySpec, ivParameterSpec);
                    byte[] doFinal = instance.doFinal(copyOfRange);
                    Pair pair = new Pair(doFinal, Integer.valueOf(doFinal.length));
                    inputStream = new ByteArrayInputStream((byte[]) pair.first);
                    j = (long) ((Integer) pair.second).intValue();
                }
            } catch (Throwable th) {
                this.f81283a.remove(str);
                MethodCollector.m26664o(2268);
                throw th;
            }
        }
        Pair<InputStream, Long> pair2 = new Pair<>(inputStream, Long.valueOf(j));
        MethodCollector.m26664o(2268);
        return pair2;
    }
}
