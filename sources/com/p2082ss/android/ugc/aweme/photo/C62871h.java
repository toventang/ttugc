package com.p2082ss.android.ugc.aweme.photo;

import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tools.utils.C84902i;

/* renamed from: com.ss.android.ugc.aweme.photo.h */
public final class C62871h {
    static {
        Covode.recordClassIndex(73702);
    }

    /* renamed from: a */
    public static int[] m113285a(String str) {
        MethodCollector.m26663i(10734);
        if (!C84902i.m145892a(str)) {
            int[] iArr = {0, 0};
            MethodCollector.m26664o(10734);
            return iArr;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int[] iArr2 = {options.outWidth, options.outHeight};
        MethodCollector.m26664o(10734);
        return iArr2;
    }
}
