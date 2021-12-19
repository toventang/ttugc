package com.facebook.drawee.p1854e;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.drawee.e.e */
public class C24215e {
    static {
        Covode.recordClassIndex(28346);
    }

    /* renamed from: a */
    public static int m45945a(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    /* renamed from: a */
    public static void m45947a(Drawable drawable, Drawable drawable2) {
        if (drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    /* renamed from: a */
    public static void m45948a(Drawable drawable, C24214d dVar) {
        if (drawable != null && dVar != null) {
            dVar.mo39871a(drawable);
        }
    }

    /* renamed from: a */
    public static void m45946a(Drawable drawable, Drawable.Callback callback, AbstractC24243s sVar) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof AbstractC24242r) {
                ((AbstractC24242r) drawable).setTransformCallback(sVar);
            }
        }
    }
}
