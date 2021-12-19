package com.p2082ss.android.medialib.jni;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.nativePort.C30731d;

/* renamed from: com.ss.android.medialib.jni.BitmapJni */
public class BitmapJni {
    private static native int nativeCompressBitmap(Bitmap bitmap, String str, int i);

    static {
        Covode.recordClassIndex(36463);
        C30731d.m63118c();
    }

    public static int compressBitmap(Bitmap bitmap, String str, int i) {
        MethodCollector.m26663i(2280);
        int nativeCompressBitmap = nativeCompressBitmap(bitmap, str, i);
        MethodCollector.m26664o(2280);
        return nativeCompressBitmap;
    }
}
