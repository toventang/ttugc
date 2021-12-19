package com.facebook.imageutils;

import android.media.ExifInterface;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1833e.C24099a;
import java.io.IOException;
import java.io.InputStream;

public final class HeifExifUtil {
    static {
        Covode.recordClassIndex(28806);
    }

    /* access modifiers changed from: package-private */
    public static class HeifExifUtilAndroidN {
        static {
            Covode.recordClassIndex(28807);
        }

        private HeifExifUtilAndroidN() {
        }

        static int getOrientation(InputStream inputStream) {
            try {
                return new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
            } catch (IOException e) {
                C24099a.m45643a("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e);
                return 0;
            }
        }
    }

    /* renamed from: a */
    public static int m47168a(InputStream inputStream) {
        if (Build.VERSION.SDK_INT >= 24) {
            return HeifExifUtilAndroidN.getOrientation(inputStream);
        }
        C24099a.m45642a("HeifExifUtil", "Trying to read Heif Exif information before Android N -> ignoring");
        return 0;
    }
}
