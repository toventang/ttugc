package com.bytedance.android.live.broadcast.preview;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.broadcast.preview.C3561v;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.preview.ae */
public final /* synthetic */ class C3372ae implements AbstractC1214u {

    /* renamed from: a */
    private final C3561v.C3562a f9592a;

    /* renamed from: b */
    private final IIconSlot.SlotViewModel f9593b;

    static {
        Covode.recordClassIndex(3856);
    }

    C3372ae(C3561v.C3562a aVar, IIconSlot.SlotViewModel slotViewModel) {
        this.f9592a = aVar;
        this.f9593b = slotViewModel;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C3561v.C3562a aVar = this.f9592a;
        Drawable drawable = (Drawable) obj;
        if (Boolean.TRUE.equals(this.f9593b.f15350a.getValue())) {
            aVar.f9880c.getIconView().setImageDrawable(drawable);
        }
    }
}
