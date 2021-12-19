package com.bytedance.android.live.broadcast.preview;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.broadcast.preview.C3561v;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.preview.ab */
public final /* synthetic */ class C3369ab implements AbstractC1214u {

    /* renamed from: a */
    private final C3561v.C3562a f9586a;

    /* renamed from: b */
    private final IIconSlot.SlotViewModel f9587b;

    static {
        Covode.recordClassIndex(3853);
    }

    C3369ab(C3561v.C3562a aVar, IIconSlot.SlotViewModel slotViewModel) {
        this.f9586a = aVar;
        this.f9587b = slotViewModel;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C3561v.C3562a aVar = this.f9586a;
        Drawable drawable = (Drawable) obj;
        if (Boolean.TRUE.equals(this.f9587b.f15350a.getValue())) {
            aVar.f9880c.mo9139b();
            aVar.f9880c.getAlertImageView().setVisibility(drawable == null ? 8 : 0);
            aVar.f9880c.getAlertImageView().setImageDrawable(drawable);
        }
    }
}
