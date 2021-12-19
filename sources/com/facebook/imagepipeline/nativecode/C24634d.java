package com.facebook.imagepipeline.nativecode;

import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.imagepipeline.nativecode.d */
public final class C24634d {

    /* renamed from: a */
    public static AbstractC24633c f58545a;

    /* renamed from: b */
    public static boolean f58546b;

    static {
        Covode.recordClassIndex(28784);
        try {
            f58545a = (AbstractC24633c) Class.forName("com.facebook.imagepipeline.nativecode.WebpTranscoderImpl").newInstance();
            f58546b = true;
        } catch (Throwable unused) {
            f58546b = false;
        }
    }
}
