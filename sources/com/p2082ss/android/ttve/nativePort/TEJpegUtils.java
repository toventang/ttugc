package com.p2082ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.camera.ImageFrame;

/* renamed from: com.ss.android.ttve.nativePort.TEJpegUtils */
public class TEJpegUtils {
    public static native void compressToJPEG(Bitmap bitmap, int i, String str);

    public static native void compressToJPEG2(byte[] bArr, int i, int i2, int i3, String str);

    public static native ImageFrame decompressJPEG(String str, int i);

    static {
        Covode.recordClassIndex(37301);
        C30731d.m63114a();
    }

    public static int calBestSampleSize(int i, int i2, int i3, int i4) {
        if (i <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0) {
            return -1;
        }
        if (i3 > i4) {
            i4 = i3;
            i3 = i4;
        }
        if (i > i2) {
            i4 = i3;
            i3 = i4;
        }
        return Math.max((int) Math.ceil((double) (((float) i) / ((float) i3))), (int) Math.ceil((double) (((float) i2) / ((float) i4))));
    }
}
