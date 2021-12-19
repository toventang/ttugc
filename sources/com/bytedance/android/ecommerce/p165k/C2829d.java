package com.bytedance.android.ecommerce.p165k;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;

/* renamed from: com.bytedance.android.ecommerce.k.d */
public class C2829d {

    /* renamed from: a */
    private static final String f8433a = C2829d.class.getName();

    static {
        Covode.recordClassIndex(3255);
    }

    /* renamed from: a */
    public static byte[] m8100a(Bitmap bitmap) {
        MethodCollector.m26663i(2831);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        MethodCollector.m26664o(2831);
        return byteArray;
    }

    /* renamed from: a */
    public static Bitmap m8098a(Bitmap bitmap, float f) {
        MethodCollector.m26663i(2829);
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        MethodCollector.m26664o(2829);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m8099a(Bitmap bitmap, int i) {
        Bitmap bitmap2 = bitmap;
        MethodCollector.m26663i(2836);
        while (true) {
            int byteCount = bitmap2.getByteCount();
            if (i >= byteCount) {
                break;
            }
            double d = (double) i;
            Double.isNaN(d);
            double d2 = (double) byteCount;
            Double.isNaN(d2);
            float sqrt = (float) Math.sqrt((d + 0.0d) / d2);
            Matrix matrix = new Matrix();
            matrix.setScale(sqrt, sqrt);
            bitmap2 = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
            if (bitmap2.getByteCount() <= i) {
                break;
            }
            i -= 2;
        }
        MethodCollector.m26664o(2836);
        return bitmap2;
    }
}
