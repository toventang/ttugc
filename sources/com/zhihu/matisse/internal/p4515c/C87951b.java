package com.zhihu.matisse.internal.p4515c;

import android.content.ContentResolver;
import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import p078c.p083d.C1762a;

/* renamed from: com.zhihu.matisse.internal.c.b */
public final class C87951b {

    /* renamed from: a */
    private static final String f199730a = C87951b.class.getSimpleName();

    static {
        Covode.recordClassIndex(103966);
    }

    private C87951b() {
        throw new AssertionError("oops! the utility class is about to be instantiated...");
    }

    /* renamed from: a */
    public static float m152996a(long j) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        decimalFormat.applyPattern("0.0");
        return Float.valueOf(decimalFormat.format((double) ((((float) j) / 1024.0f) / 1024.0f)).replaceAll(",", ".")).floatValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041 A[SYNTHETIC, Splitter:B:22:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0058 A[SYNTHETIC, Splitter:B:31:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0067 A[SYNTHETIC, Splitter:B:39:0x0067] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point m152997a(android.content.ContentResolver r6, android.net.Uri r7) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zhihu.matisse.internal.p4515c.C87951b.m152997a(android.content.ContentResolver, android.net.Uri):android.graphics.Point");
    }

    /* renamed from: a */
    public static boolean m152998a(Context context, ContentResolver contentResolver, Uri uri) {
        ExifInterface exifInterface;
        MethodCollector.m26663i(13880);
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                InputStream openInputStream = contentResolver.openInputStream(uri);
                if (openInputStream != null) {
                    exifInterface = new ExifInterface(openInputStream);
                } else {
                    MethodCollector.m26664o(13880);
                    return false;
                }
            } else {
                String a = C1762a.m5918a(context, uri);
                if (a != null) {
                    exifInterface = new ExifInterface(a);
                } else {
                    NullPointerException nullPointerException = new NullPointerException("filename should not be null");
                    MethodCollector.m26664o(13880);
                    throw nullPointerException;
                }
            }
            int attributeInt = exifInterface.getAttributeInt("Orientation", -1);
            if (attributeInt == 6 || attributeInt == 8) {
                MethodCollector.m26664o(13880);
                return true;
            }
            MethodCollector.m26664o(13880);
            return false;
        } catch (IOException unused) {
            MethodCollector.m26664o(13880);
            return false;
        } catch (NullPointerException unused2) {
            MethodCollector.m26664o(13880);
            return false;
        }
    }
}
