package com.p2082ss.android.ugc.aweme.tools;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.d */
public final class C78103d {
    static {
        Covode.recordClassIndex(91202);
    }

    /* renamed from: a */
    public static final C89378p<Integer, Integer> m136527a(String str) {
        boolean z = false;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (z) {
            return new C89378p<>(0, 0);
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            C84896h.m145856a(str, options);
            ExifInterface c = C84896h.m145870c(str);
            int i = -1;
            if (c != null) {
                i = c.getAttributeInt("Orientation", -1);
            }
            if (i == 6 || i == 8) {
                return new C89378p<>(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
            }
            return new C89378p<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
        } catch (Exception unused) {
            return new C89378p<>(0, 0);
        }
    }

    /* renamed from: a */
    private static int m136525a(BitmapFactory.Options options, int i, int i2) {
        C89219l.m154721d(options, "");
        C89378p a = C89387v.m154943a(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int intValue = ((Number) a.component1()).intValue();
        int intValue2 = ((Number) a.component2()).intValue();
        int i3 = 1;
        if (intValue > i2 || intValue2 > i) {
            int i4 = intValue / 2;
            int i5 = intValue2 / 2;
            while (i4 / i3 >= i2 && i5 / i3 >= i) {
                i3 *= 2;
            }
        }
        return i3;
    }

    /* renamed from: a */
    public static final Bitmap m136526a(String str, int i, int i2) {
        Bitmap bitmap;
        MethodCollector.m26663i(10189);
        C89219l.m154721d(str, "");
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = m136525a(options, i, i2);
            options.inJustDecodeBounds = false;
            bitmap = BitmapFactory.decodeFile(str, options);
        } catch (Exception unused) {
            bitmap = null;
        }
        MethodCollector.m26664o(10189);
        return bitmap;
    }
}
