package com.facebook.imagepipeline.p1871a.p1873b;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1882g.AbstractC24442c;
import com.facebook.imagepipeline.p1883h.AbstractC24450a;

/* renamed from: com.facebook.imagepipeline.a.b.a */
public interface AbstractC24327a {
    static {
        Covode.recordClassIndex(28469);
    }

    AbstractC24450a getAnimatedDrawableFactory(Context context);

    AbstractC24442c getGifDecoder(Bitmap.Config config);

    AbstractC24442c getWebPDecoder(Bitmap.Config config);
}
