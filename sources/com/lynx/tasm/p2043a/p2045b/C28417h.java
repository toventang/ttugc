package com.lynx.tasm.p2043a.p2045b;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.a.b.h */
final class C28417h extends Animation {

    /* renamed from: a */
    private final View f66799a;

    /* renamed from: b */
    private final float f66800b;

    /* renamed from: c */
    private final float f66801c;

    static {
        Covode.recordClassIndex(34407);
    }

    public final boolean willChangeBounds() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void applyTransformation(float f, Transformation transformation) {
        this.f66799a.setAlpha(this.f66800b + (this.f66801c * f));
    }

    protected C28417h(View view, float f, float f2) {
        this.f66799a = view;
        this.f66800b = f;
        this.f66801c = f2 - f;
    }
}
