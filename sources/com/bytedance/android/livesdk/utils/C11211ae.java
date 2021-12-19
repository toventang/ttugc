package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.android.livesdk.utils.ae */
public final class C11211ae {

    /* renamed from: a */
    public static final int f26852a = 2131234408;

    /* renamed from: b */
    public static final int f26853b = 2131234895;

    /* renamed from: c */
    private static WeakHashMap<Integer, Bitmap> f26854c = new WeakHashMap<>();

    static {
        Covode.recordClassIndex(12839);
    }

    /* renamed from: a */
    public static Bitmap m19868a(Context context, int i, int i2, int i3) {
        MethodCollector.m26663i(12164);
        Bitmap bitmap = f26854c.get(Integer.valueOf(i));
        if (bitmap == null || bitmap.isRecycled()) {
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i);
            if (decodeResource == null) {
                MethodCollector.m26664o(12164);
                return null;
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, i2, i3, false);
            if (createScaledBitmap == null) {
                MethodCollector.m26664o(12164);
                return null;
            }
            f26854c.put(Integer.valueOf(i), createScaledBitmap);
            MethodCollector.m26664o(12164);
            return createScaledBitmap;
        }
        MethodCollector.m26664o(12164);
        return bitmap;
    }
}
