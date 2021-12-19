package com.lynx.tasm.p2043a.p2045b;

import android.graphics.Rect;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.p2052ui.LynxUI;

/* renamed from: com.lynx.tasm.a.b.g */
public class C28416g extends AbstractC28408a {
    static {
        Covode.recordClassIndex(34406);
    }

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.p2043a.p2045b.AbstractC28408a
    /* renamed from: a */
    public final Animation mo48838a(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect, float f) {
        boolean z;
        boolean z2 = false;
        if (lynxUI.getOriginLeft() == i && lynxUI.getOriginTop() == i2) {
            z = false;
        } else {
            z = true;
        }
        if (!(lynxUI.getWidth() == i3 && lynxUI.getHeight() == i4)) {
            z2 = true;
        }
        if (!z) {
            if (!z2) {
                return null;
            }
        } else if (!z2) {
            return new TranslateAnimation((float) (lynxUI.getOriginLeft() - i), 0.0f, (float) (lynxUI.getOriginTop() - i2), 0.0f);
        }
        return new C28418i(lynxUI, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
