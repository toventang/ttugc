package com.facebook.drawee.p1851c;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.drawee.c.d */
public interface AbstractC24203d<INFO> {
    static {
        Covode.recordClassIndex(28334);
    }

    void onFailure(String str, Throwable th);

    void onFinalImageSet(String str, INFO info, Animatable animatable);

    void onIntermediateImageFailed(String str, Throwable th);

    void onIntermediateImageSet(String str, INFO info);

    void onRelease(String str);

    void onSubmit(String str, Object obj);
}
