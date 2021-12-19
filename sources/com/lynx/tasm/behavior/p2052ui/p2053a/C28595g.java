package com.lynx.tasm.behavior.p2052ui.p2053a;

import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.LLog;

/* renamed from: com.lynx.tasm.behavior.ui.a.g */
public final class C28595g extends AbstractC28588a {

    /* renamed from: h */
    private int f67323h;

    /* renamed from: i */
    private PointF f67324i = new PointF(0.5f, 0.5f);

    static {
        Covode.recordClassIndex(34630);
    }

    public C28595g(ReadableArray readableArray) {
        if (readableArray == null) {
            LLog.m56862d("RadialGradient", "native parser error, array is null");
            return;
        }
        if (readableArray.size() != 3) {
            LLog.m56862d("RadialGradient", "native parser error, array.size must be 3");
        }
        this.f67323h = readableArray.getArray(0).getInt(1);
        mo49402a(readableArray.getArray(1), readableArray.getArray(2));
    }

    public final void setBounds(Rect rect) {
        float f;
        float f2;
        double sqrt;
        float f3;
        this.f67302b = rect.width();
        this.f67303c = rect.height();
        if (this.f67324i.x < 1.0f) {
            f = this.f67324i.x * ((float) rect.width());
        } else {
            f = this.f67324i.x;
        }
        if (this.f67324i.y < 1.0f) {
            f2 = this.f67324i.y * ((float) rect.height());
        } else {
            f2 = this.f67324i.y;
        }
        int i = this.f67323h;
        if (i != 0) {
            if (i == 1) {
                f3 = Math.max(Math.max(f, ((float) this.f67302b) - f), Math.max(f2, ((float) this.f67303c) - f2));
            } else if (i == 2) {
                float min = Math.min(f, ((float) this.f67302b) - f);
                float min2 = Math.min(f2, ((float) this.f67303c) - f2);
                sqrt = Math.sqrt((double) ((min * min) + (min2 * min2)));
            } else if (i != 3) {
                sqrt = 0.0d;
            } else {
                f3 = Math.min(Math.min(f, ((float) this.f67302b) - f), Math.min(f2, ((float) this.f67303c) - f2));
            }
            sqrt = (double) f3;
        } else {
            float max = Math.max(f, ((float) this.f67302b) - f);
            float max2 = Math.max(f2, ((float) this.f67303c) - f2);
            sqrt = Math.sqrt((double) ((max * max) + (max2 * max2)));
        }
        if (this.f67304d == null || this.f67304d.length < 2 || this.f67305e == null || this.f67305e.length < 2) {
            this.f67301a = null;
        } else {
            try {
                this.f67301a = new RadialGradient(f, f2, (float) sqrt, this.f67304d, this.f67305e, Shader.TileMode.CLAMP);
            } catch (Exception e) {
                this.f67301a = null;
                e.printStackTrace();
                LLog.m56861c("BackgroundRadialGradientLayer", "exception:\n" + e.toString());
            }
        }
        super.setBounds(rect);
    }
}
