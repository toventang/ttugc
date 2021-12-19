package com.facebook.imagepipeline.p1890o;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.p1826c.p1827a.AbstractC24026e;

/* renamed from: com.facebook.imagepipeline.o.d */
public interface AbstractC24641d {
    static {
        Covode.recordClassIndex(28791);
    }

    String getName();

    AbstractC24026e getPostprocessorCacheKey();

    C24117a<Bitmap> process(Bitmap bitmap, AbstractC24357f fVar);
}
