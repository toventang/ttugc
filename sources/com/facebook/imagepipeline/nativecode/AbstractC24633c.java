package com.facebook.imagepipeline.nativecode;

import com.bytedance.covode.number.Covode;
import com.facebook.p1870h.C24314c;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.facebook.imagepipeline.nativecode.c */
public interface AbstractC24633c {
    static {
        Covode.recordClassIndex(28783);
    }

    boolean isWebpNativelySupported(C24314c cVar);

    void transcodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i);

    void transcodeWebpToPng(InputStream inputStream, OutputStream outputStream);
}
