package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.graphics.drawable.c */
final class C0707c extends AbstractC0706b {
    static {
        Covode.recordClassIndex(788);
    }

    public final void getOutline(Outline outline) {
        mo2737a();
        outline.setRoundRect(this.f2787f, this.f2786e);
    }

    protected C0707c(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.core.graphics.drawable.AbstractC0706b
    /* renamed from: a */
    public final void mo2739a(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }
}
