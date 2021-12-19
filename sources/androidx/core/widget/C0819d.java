package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.widget.d */
public final class C0819d {

    /* renamed from: a */
    public EdgeEffect f3048a;

    static {
        Covode.recordClassIndex(902);
    }

    /* renamed from: a */
    public final boolean mo3010a() {
        this.f3048a.onRelease();
        return this.f3048a.isFinished();
    }

    public C0819d(Context context) {
        this.f3048a = new EdgeEffect(context);
    }

    /* renamed from: a */
    public final boolean mo3011a(float f) {
        this.f3048a.onPull(f);
        return true;
    }

    /* renamed from: a */
    public final boolean mo3012a(Canvas canvas) {
        return this.f3048a.draw(canvas);
    }

    /* renamed from: a */
    public final void mo3009a(int i, int i2) {
        this.f3048a.setSize(i, i2);
    }

    /* renamed from: a */
    public static void m2889a(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }
}
