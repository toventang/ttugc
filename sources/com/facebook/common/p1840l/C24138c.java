package com.facebook.common.p1840l;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.UnsupportedEncodingException;

/* renamed from: com.facebook.common.l.c */
public final class C24138c {

    /* renamed from: a */
    public static final boolean f57082a = false;

    /* renamed from: b */
    public static final boolean f57083b = true;

    /* renamed from: c */
    public static final boolean f57084c;

    /* renamed from: d */
    public static AbstractC24136b f57085d = null;

    /* renamed from: e */
    public static final byte[] f57086e = m45748a("VP8 ");

    /* renamed from: f */
    public static final byte[] f57087f = m45748a("VP8L");

    /* renamed from: g */
    public static final byte[] f57088g = m45748a("VP8X");

    /* renamed from: h */
    private static boolean f57089h = false;

    /* renamed from: i */
    private static final byte[] f57090i = m45748a("RIFF");

    /* renamed from: j */
    private static final byte[] f57091j = m45748a("WEBP");

    /* renamed from: a */
    public static AbstractC24136b m45745a() {
        if (f57089h) {
            return f57085d;
        }
        AbstractC24136b bVar = null;
        try {
            bVar = (AbstractC24136b) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
        }
        f57089h = true;
        return bVar;
    }

    static {
        MethodCollector.m26663i(12872);
        Covode.recordClassIndex(28266);
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT == 17) {
            byte[] decode = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            if (!(options.outHeight == 1 && options.outWidth == 1)) {
                z = false;
            }
        }
        f57084c = z;
        MethodCollector.m26664o(12872);
    }

    /* renamed from: a */
    private static byte[] m45748a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    /* renamed from: a */
    public static boolean m45746a(byte[] bArr, int i, int i2) {
        if (i2 < 20 || !m45747a(bArr, i, f57090i) || !m45747a(bArr, i + 8, f57091j)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m45747a(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
