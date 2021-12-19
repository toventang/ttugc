package com.lynx.tasm.p2043a.p2045b;

import android.graphics.Rect;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.p2052ui.LynxUI;

/* renamed from: com.lynx.tasm.a.b.b */
public abstract class AbstractC28409b extends AbstractC28408a {
    static {
        Covode.recordClassIndex(34399);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo48846b();

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.p2043a.p2045b.AbstractC28408a
    /* renamed from: a */
    public final Animation mo48838a(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        T t = lynxUI.mView;
        int i17 = this.f66771a.f66759d;
        float f6 = 1.0f;
        float f7 = 0.0f;
        if (i17 == 2) {
            if (mo48846b()) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            if (mo48846b()) {
                f6 = 0.0f;
            }
            return new ScaleAnimation(f2, f6, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
        } else if (i17 == 4) {
            if (mo48846b()) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            if (mo48846b()) {
                f6 = 0.0f;
            }
            return new ScaleAnimation(1.0f, 1.0f, f3, f6, 1, 0.0f, 1, 0.5f);
        } else if (i17 != 8) {
            if (mo48846b()) {
                f5 = f;
            } else {
                f5 = 0.0f;
            }
            if (!mo48846b()) {
                f7 = f;
            }
            return new C28417h(t, f5, f7);
        } else {
            if (mo48846b()) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            if (mo48846b()) {
                f6 = 0.0f;
            }
            return new ScaleAnimation(f4, f6, f4, f6, 1, 0.5f, 1, 0.5f);
        }
    }
}
