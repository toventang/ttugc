package com.bytedance.push.p1589b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: com.bytedance.push.b.d */
public final class C21765d implements AbstractC21762a {
    static {
        Covode.recordClassIndex(25414);
    }

    @Override // com.bytedance.push.p1589b.AbstractC21762a
    /* renamed from: a */
    public final Bitmap mo35399a(C21764c cVar) {
        try {
            return m40740b(cVar);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0160  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m40740b(com.bytedance.push.p1589b.C21764c r15) {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.p1589b.C21765d.m40740b(com.bytedance.push.b.c):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static void m40739a(int i, int i2, BitmapFactory.Options options) {
        m40738a(i, i2, options.outWidth, options.outHeight, options);
    }

    /* renamed from: a */
    private static void m40738a(int i, int i2, int i3, int i4, BitmapFactory.Options options) {
        int i5;
        if (i4 > i2 || i3 > i) {
            int floor = (int) Math.floor((double) (((float) i4) / ((float) i2)));
            i5 = (int) Math.floor((double) (((float) i3) / ((float) i)));
            if (floor < i5) {
                i5 = floor;
            }
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }
}
