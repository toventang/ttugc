package androidx.p060l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.l.w */
final class C1155w implements AbstractC1156x {

    /* renamed from: a */
    private final ViewGroupOverlay f3915a;

    static {
        Covode.recordClassIndex(1248);
    }

    @Override // androidx.p060l.AbstractC1081ad
    /* renamed from: a */
    public final void mo3835a(Drawable drawable) {
        this.f3915a.add(drawable);
    }

    @Override // androidx.p060l.AbstractC1081ad
    /* renamed from: b */
    public final void mo3836b(Drawable drawable) {
        this.f3915a.remove(drawable);
    }

    C1155w(ViewGroup viewGroup) {
        this.f3915a = viewGroup.getOverlay();
    }

    @Override // androidx.p060l.AbstractC1156x
    /* renamed from: a */
    public final void mo3953a(View view) {
        this.f3915a.add(view);
    }

    @Override // androidx.p060l.AbstractC1156x
    /* renamed from: b */
    public final void mo3954b(View view) {
        this.f3915a.remove(view);
    }
}
