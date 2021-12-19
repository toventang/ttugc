package androidx.p060l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.l.ac */
final class C1080ac implements AbstractC1081ad {

    /* renamed from: a */
    private final ViewOverlay f3725a;

    static {
        Covode.recordClassIndex(1173);
    }

    @Override // androidx.p060l.AbstractC1081ad
    /* renamed from: a */
    public final void mo3835a(Drawable drawable) {
        this.f3725a.add(drawable);
    }

    @Override // androidx.p060l.AbstractC1081ad
    /* renamed from: b */
    public final void mo3836b(Drawable drawable) {
        this.f3725a.remove(drawable);
    }

    C1080ac(View view) {
        this.f3725a = view.getOverlay();
    }
}
