package com.lynx.tasm.p2062ui.image;

import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1854e.C24229q;

/* renamed from: com.lynx.tasm.ui.image.g */
public class C28894g {
    static {
        Covode.recordClassIndex(35017);
    }

    /* renamed from: a */
    public static C24229q.AbstractC24231b m57881a(String str) {
        if ("aspectFit".equals(str)) {
            return C24229q.AbstractC24231b.f57454d;
        }
        if ("aspectFill".equals(str)) {
            return C24229q.AbstractC24231b.f57458h;
        }
        if ("scaleToFill".equals(str)) {
            return C24229q.AbstractC24231b.f57452b;
        }
        if ("center".equals(str)) {
            return C24229q.AbstractC24231b.f57456f;
        }
        if (str == null || str.equals("none") || str.length() == 0) {
            return C24229q.AbstractC24231b.f57452b;
        }
        throw new RuntimeException("Invalid resize mode: '" + str + "'");
    }
}
