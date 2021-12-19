package com.bytedance.p1734ug.sdk.region.data.network;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1734ug.sdk.region.data.p1738c.AbstractC23469c;
import com.bytedance.p1734ug.sdk.region.data.p1739d.C23471a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ug.sdk.region.data.network.a */
public final class C23484a {
    static {
        Covode.recordClassIndex(27486);
    }

    /* renamed from: a */
    public static String m44177a() {
        String str = C23471a.f55654b;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return "https://".concat(String.valueOf(str));
    }

    /* renamed from: a */
    private static String m44178a(InputStream inputStream) {
        MethodCollector.m26663i(11228);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read();
            if (read != -1) {
                byteArrayOutputStream.write(read);
            } else {
                String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                MethodCollector.m26664o(11228);
                return byteArrayOutputStream2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094 A[Catch:{ Exception -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e8 A[Catch:{ Exception -> 0x00fa }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m44180a(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, byte[] r8) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1734ug.sdk.region.data.network.C23484a.m44180a(java.lang.String, java.util.Map, byte[]):java.lang.String");
    }

    /* renamed from: a */
    public static String m44179a(String str, String str2, Map<String, String> map, byte[] bArr) {
        AbstractC23469c cVar;
        if (C23471a.f55653a == null) {
            cVar = null;
        } else {
            cVar = C23471a.f55653a.f55638d;
        }
        String str3 = str + str2;
        try {
            Uri.Builder buildUpon = Uri.parse(str3).buildUpon();
            if (buildUpon != null) {
                buildUpon.appendQueryParameter("sdk_version", "1.1.0-alpha.15");
                str3 = buildUpon.toString();
            }
        } catch (Throwable unused) {
        }
        if (cVar == null) {
            return m44180a(str3, map, bArr);
        }
        return cVar.mo38226a(str3, new HashMap(), map, bArr);
    }
}
