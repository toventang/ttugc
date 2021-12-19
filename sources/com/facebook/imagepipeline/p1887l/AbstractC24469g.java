package com.facebook.imagepipeline.p1887l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.C24456e;

/* renamed from: com.facebook.imagepipeline.l.g */
public interface AbstractC24469g {
    static {
        Covode.recordClassIndex(28612);
    }

    C24117a<Bitmap> decodeFromEncodedImageWithColorSpace(C24456e eVar, Bitmap.Config config, Rect rect, boolean z);

    C24117a<Bitmap> decodeJPEGFromEncodedImage(C24456e eVar, Bitmap.Config config, Rect rect, int i);

    C24117a<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(C24456e eVar, Bitmap.Config config, Rect rect, int i, boolean z);
}
