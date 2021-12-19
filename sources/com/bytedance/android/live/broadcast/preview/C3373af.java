package com.bytedance.android.live.broadcast.preview;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.broadcast.preview.C3561v;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.preview.af */
public final /* synthetic */ class C3373af implements AbstractC1214u {

    /* renamed from: a */
    private final C3561v.C3562a f9594a;

    /* renamed from: b */
    private final IIconSlot.SlotViewModel f9595b;

    static {
        Covode.recordClassIndex(3857);
    }

    C3373af(C3561v.C3562a aVar, IIconSlot.SlotViewModel slotViewModel) {
        this.f9594a = aVar;
        this.f9595b = slotViewModel;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C3561v.C3562a aVar = this.f9594a;
        String str = (String) obj;
        if (Boolean.TRUE.equals(this.f9595b.f15350a.getValue())) {
            aVar.f9880c.getTextView().setText(str);
        }
    }
}
